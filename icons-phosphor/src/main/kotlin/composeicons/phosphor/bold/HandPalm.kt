package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HandPalm: ImageVector
    get() {
        if (_handPalm != null) return _handPalm!!
        _handPalm = phosphorBoldIcon(
            name = "HandPalm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M188 84c-2.698-.005-5.386 .331-8 1v-25c.009-10.495-5.129-20.328-13.75-26.314C157.629 27.701 146.62 26.323 136.79 30 130.278 16.579 115.356 9.437 100.818 12.785 86.281 16.133 75.986 29.082 76 44v1C66.414 42.525 56.223 44.626 48.398 50.691 40.573 56.755 35.995 66.1 36 76v76c0 50.81 41.19 92 92 92 50.81 0 92-41.19 92-92v-36C220 98.327 205.673 84 188 84ZM196 152c0 37.555-30.445 68-68 68C90.445 220 60 189.555 60 152v-76c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v40c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-72c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v64c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-48c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v65.4c-23.428 5.59-39.969 26.514-40 50.6 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-15.464 12.536-28 28-28 6.627 0 12-5.373 12-12v-20c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _handPalm!!
    }

private var _handPalm: ImageVector? = null
