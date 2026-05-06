package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SmileyXEyes: ImageVector
    get() {
        if (_smileyXEyes != null) return _smileyXEyes!!
        _smileyXEyes = phosphorThinIcon(
            name = "SmileyXEyes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM128 220C77.19 220 36 178.81 36 128 36 77.19 77.19 36 128 36c50.81 0 92 41.19 92 92-.055 50.787-41.213 91.945-92 92ZM186.83 98.83 173.66 112l13.17 13.17c1.563 1.563 1.563 4.097 0 5.66-1.563 1.563-4.097 1.563-5.66 0L168 117.66l-13.17 13.17c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66L162.34 112 149.17 98.83c-1.563-1.563-1.563-4.097 0-5.66 1.563-1.563 4.097-1.563 5.66 0L168 106.34 181.17 93.17c1.563-1.563 4.097-1.563 5.66 0 1.563 1.563 1.563 4.097 0 5.66ZM106.83 98.83 93.66 112l13.17 13.17c1.563 1.563 1.563 4.097 0 5.66-1.563 1.563-4.097 1.563-5.66 0L88 117.66 74.83 130.83c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66L82.34 112 69.17 98.83c-1.563-1.563-1.563-4.097 0-5.66 1.563-1.563 4.097-1.563 5.66 0L88 106.34 101.17 93.17c1.563-1.563 4.097-1.563 5.66 0 1.563 1.563 1.563 4.097 0 5.66ZM136 180c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _smileyXEyes!!
    }

private var _smileyXEyes: ImageVector? = null
