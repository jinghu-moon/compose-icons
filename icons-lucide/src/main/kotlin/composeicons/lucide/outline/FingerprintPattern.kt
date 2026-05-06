package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FingerprintPattern: ImageVector
    get() {
        if (_fingerprintPattern != null) return _fingerprintPattern!!
        _fingerprintPattern = lucideOutlineIcon(
            name = "FingerprintPattern",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 10c-1.105 0-2 .895-2 2 0 1.02-.1 2.51-.26 4")
            addPathData("M14 13.12c0 2.38 0 6.38-1 8.88")
            addPathData("M17.29 21.02c.12-.6 .43-2.3 .5-3.02")
            addPathData("M2 12C2 7.696 4.754 3.874 8.838 2.513 12.921 1.152 17.417 2.557 20 6")
            addPathData("M2 16h.01")
            addPathData("M21.8 16c.2-2 .131-5.354 0-6")
            addPathData("M5 19.5C5.5 18 6 15 6 12c-.001-.681 .114-1.357 .34-2")
            addPathData("M8.65 22c.21-.66 .45-1.32 .57-2")
            addPathData("M9 6.8c1.857-1.072 4.145-1.072 6.002 .001C16.858 7.874 18.001 9.856 18 12v2")
        }
        return _fingerprintPattern!!
    }

private var _fingerprintPattern: ImageVector? = null
