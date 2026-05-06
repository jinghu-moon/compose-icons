package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MousePointerBan: ImageVector
    get() {
        if (_mousePointerBan != null) return _mousePointerBan!!
        _mousePointerBan = lucideOutlineIcon(
            name = "MousePointerBan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2.034 2.681c-.074-.185-.03-.396 .11-.537 .141-.141 .352-.184 .537-.11l9 3.5c.199 .077 .327 .271 .319 .484-.007 .213-.149 .397-.352 .46L8.204 7.545c-.315 .098-.562 .345-.66 .66L6.478 11.648c-.063 .203-.248 .345-.46 .352-.213 .007-.407-.121-.484-.319Z")
            addPathData("M22 16c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6Z")
            addPathData("M11.8 11.8l8.4 8.4")
        }
        return _mousePointerBan!!
    }

private var _mousePointerBan: ImageVector? = null
