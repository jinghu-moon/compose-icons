package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MicVocal: ImageVector
    get() {
        if (_micVocal != null) return _micVocal!!
        _micVocal = lucideOutlineIcon(
            name = "MicVocal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 7.601 5.006 15.791c-.291 .398-.249 .949 .1 1.298l.817 .818c.354 .354 .916 .391 1.314 .087L15.09 12")
            addPathData("M16.5 21.174C15.5 20.5 14.372 20 13 20c-2.058 0-3.928 2.356-6 2C4.928 21.644 4.225 18.631 5.5 17.5")
            addPathData("M21 7c0 2.761-2.239 5-5 5C13.239 12 11 9.761 11 7 11 4.239 13.239 2 16 2c2.761 0 5 2.239 5 5Z")
        }
        return _micVocal!!
    }

private var _micVocal: ImageVector? = null
