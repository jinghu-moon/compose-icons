package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Vibrate: ImageVector
    get() {
        if (_vibrate != null) return _vibrate!!
        _vibrate = phosphorThinIcon(
            name = "Vibrate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 36h-64C84.954 36 76 44.954 76 56v144c0 11.046 8.954 20 20 20h64c11.046 0 20-8.954 20-20v-144C180 44.954 171.046 36 160 36ZM172 200c0 6.627-5.373 12-12 12h-64c-6.627 0-12-5.373-12-12v-144C84 49.373 89.373 44 96 44h64c6.627 0 12 5.373 12 12ZM212 88v80c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-80c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM244 104v48c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-48c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM52 88v80c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-80c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM20 104v48c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-48c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _vibrate!!
    }

private var _vibrate: ImageVector? = null
