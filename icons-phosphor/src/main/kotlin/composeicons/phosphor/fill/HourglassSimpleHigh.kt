package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HourglassSimpleHigh: ImageVector
    get() {
        if (_hourglassSimpleHigh != null) return _hourglassSimpleHigh!!
        _hourglassSimpleHigh = phosphorFillIcon(
            name = "HourglassSimpleHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M211.18 196.56 139.57 128 211.18 59.44c.041-.046 .084-.089 .13-.13 4.573-4.576 5.94-11.455 3.465-17.432C212.3 35.901 206.469 32.003 200 32h-144c-6.469 .003-12.3 3.901-14.775 9.878-2.475 5.977-1.108 12.856 3.465 17.432 .046 .041 .089 .084 .13 .13L116.43 128 44.82 196.56c-.041 .046-.084 .089-.13 .13-4.573 4.576-5.94 11.455-3.465 17.432 2.475 5.977 8.306 9.875 14.775 9.878h144c6.471 .001 12.305-3.896 14.783-9.873 2.478-5.978 1.111-12.859-3.463-17.437-.049-.04-.096-.084-.14-.13ZM56 48h0 0ZM200 48 183.3 64h-110.58L56 48ZM56 208l72-68.92L200 208Z"),
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
        return _hourglassSimpleHigh!!
    }

private var _hourglassSimpleHigh: ImageVector? = null
