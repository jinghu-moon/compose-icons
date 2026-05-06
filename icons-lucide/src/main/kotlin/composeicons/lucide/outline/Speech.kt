package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Speech: ImageVector
    get() {
        if (_speech != null) return _speech!!
        _speech = lucideOutlineIcon(
            name = "Speech",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8.8 20v-4.1l1.9 .2c1.144-.064 2.066-.959 2.164-2.1v-5.7C12.878 5.3 10.457 2.857 7.457 2.843 4.457 2.829 2.014 5.25 2 8.25c0 2.8 .656 3.054 1 4.55 .232 .903 .242 1.85 .029 2.758L2 20")
            addPathData("M19.8 17.8c2.927-2.928 2.929-7.674 .003-10.603")
            addPathData("M17 15c.661-.661 1.03-1.558 1.025-2.493-.005-.934-.383-1.828-1.05-2.482")
        }
        return _speech!!
    }

private var _speech: ImageVector? = null
