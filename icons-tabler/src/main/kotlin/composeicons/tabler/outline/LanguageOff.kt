package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LanguageOff: ImageVector
    get() {
        if (_languageOff != null) return _languageOff!!
        _languageOff = tablerOutlineIcon(
            name = "LanguageOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 20l2.463-5.541M15.691 11.695 16 11l.8 1.8")
            addPathData("M18 18h-5.1")
            addPathData("M8.747 8.748C8.087 11.582 6.211 13 4 13")
            addPathData("M4 6.371h2.371")
            addPathData("M5 9c0 2.144 2.252 3.908 6 4")
            addPathData("M3 3 21 21")
        }
        return _languageOff!!
    }

private var _languageOff: ImageVector? = null
