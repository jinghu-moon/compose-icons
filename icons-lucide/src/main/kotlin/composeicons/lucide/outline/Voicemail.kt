package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Voicemail: ImageVector
    get() {
        if (_voicemail != null) return _voicemail!!
        _voicemail = lucideOutlineIcon(
            name = "Voicemail",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 12c0 2.209-1.791 4-4 4C3.791 16 2 14.209 2 12 2 9.791 3.791 8 6 8c2.209 0 4 1.791 4 4Z")
            addPathData("M22 12c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4C14 9.791 15.791 8 18 8c2.209 0 4 1.791 4 4Z")
            addPathData("M6 16h12")
        }
        return _voicemail!!
    }

private var _voicemail: ImageVector? = null
