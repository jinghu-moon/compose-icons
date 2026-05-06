package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HourglassSimple: ImageVector
    get() {
        if (_hourglassSimple != null) return _hourglassSimple!!
        _hourglassSimple = phosphorDuotoneIcon(
            name = "HourglassSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M205.64 53.66 128 128 50.36 53.66C48.072 51.374 47.385 47.936 48.619 44.947 49.853 41.958 52.766 40.006 56 40h144c3.234 .006 6.147 1.958 7.381 4.947 1.234 2.989 .547 6.428-1.741 8.713ZM128 128 50.36 202.34c-2.288 2.286-2.975 5.724-1.741 8.713 1.234 2.989 4.147 4.941 7.381 4.947h144c3.238 .003 6.158-1.947 7.397-4.938 1.239-2.991 .554-6.434-1.737-8.722Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M211.18 196.56 139.57 128 211.18 59.44c.041-.046 .084-.089 .13-.13 4.573-4.576 5.94-11.455 3.465-17.432C212.3 35.901 206.469 32.003 200 32h-144c-6.469 .003-12.3 3.901-14.775 9.878-2.475 5.977-1.108 12.856 3.465 17.432 .046 .041 .089 .084 .13 .13L116.43 128 44.82 196.56c-.041 .046-.084 .089-.13 .13-4.573 4.576-5.94 11.455-3.465 17.432 2.475 5.977 8.306 9.875 14.775 9.878h144c6.471 .001 12.305-3.896 14.783-9.873 2.478-5.978 1.111-12.859-3.463-17.437-.049-.04-.096-.084-.14-.13ZM56 48h0 0ZM200 48l-72 68.92L56 48ZM56 208l72-68.92L200 208Z"),
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
