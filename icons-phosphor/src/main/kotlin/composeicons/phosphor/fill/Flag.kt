package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Flag: ImageVector
    get() {
        if (_flag != null) return _flag!!
        _flag = phosphorFillIcon(
            name = "Flag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 56v120c-.013 2.304-1.019 4.491-2.76 6-15.28 13.23-29.89 18-43.82 18-18.91 0-36.57-8.74-53-16.85C105.87 170 82.79 158.61 56 179.77v44.23c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-168c.016-2.306 1.025-4.493 2.77-6h0C78.77 18.82 111.08 34.79 139.56 48.88 167 62.46 190.79 74.2 218.76 50c2.361-2.046 5.697-2.531 8.542-1.242 2.846 1.29 4.68 4.118 4.698 7.242Z"),
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
        return _flag!!
    }

private var _flag: ImageVector? = null
