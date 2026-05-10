package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HourglassSimple: ImageVector
    get() {
        if (_hourglassSimple != null) return _hourglassSimple!!
        _hourglassSimple = phosphorFillIcon(
            name = "HourglassSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M211.31 196.69c4.573 4.576 5.94 11.455 3.465 17.432-2.475 5.977-8.306 9.875-14.775 9.878h-144c-6.471 .001-12.305-3.896-14.783-9.873-2.478-5.978-1.111-12.859 3.463-17.437 .046-.041 .089-.084 .13-.13L116.43 128 44.82 59.44c-.041-.046-.084-.089-.13-.13C40.117 54.734 38.75 47.855 41.225 41.878 43.7 35.901 49.531 32.003 56 32h144c6.471-.001 12.305 3.896 14.783 9.873 2.478 5.978 1.111 12.859-3.463 17.437-.046 .041-.089 .084-.13 .13L139.57 128l71.61 68.56c.041 .046 .084 .089 .13 .13Z"),
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
        return _hourglassSimple!!
    }

private var _hourglassSimple: ImageVector? = null
