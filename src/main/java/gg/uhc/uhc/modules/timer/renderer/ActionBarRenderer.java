/*
 * Project: UHC
 * Class: gg.uhc.uhc.modules.timer.renderer.ActionBarRenderer
 *
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 Graham Howden <graham_howden1 at yahoo.co.uk>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package gg.uhc.uhc.modules.timer.renderer;

import gg.uhc.uhc.util.ActionBarMessenger;
import org.bukkit.Bukkit;

public class ActionBarRenderer implements TimerRenderer {

    protected final ActionBarMessenger messenger;

    public ActionBarRenderer(ActionBarMessenger messenger) {
        this.messenger = messenger;
    }

    @Override
    public void onStart(String message) {
        messenger.sendMessage(Bukkit.getOnlinePlayers(), message);
    }

    @Override
    public void onUpdate(String message, double progress) {
        // ignores the progress
        onStart(message);
    }

    @Override
    public void onStop() {
        // action bar times out automatically
    }
}
