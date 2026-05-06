package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SaveOff: ImageVector
    get() {
        if (_saveOff != null) return _saveOff!!
        _saveOff = lucideOutlineIcon(
            name = "SaveOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 13h-5c-.552 0-1 .448-1 1v7")
            addPathData("M14 8h1")
            addPathData("M17 21v-4")
            addPathData("M2 2 22 22")
            addPathData("M20.41 20.41c-.373 .376-.88 .588-1.41 .59h-14C3.895 21 3 20.105 3 19v-14c.002-.53 .214-1.037 .59-1.41")
            addPathData("M29.5 11.5c0 0 5 5 4 5")
            addPathData("M9 3h6.2c.528 .008 1.031 .223 1.4 .6l3.8 3.8c.377 .369 .592 .872 .6 1.4v6.2")
        }
        return _saveOff!!
    }

private var _saveOff: ImageVector? = null
