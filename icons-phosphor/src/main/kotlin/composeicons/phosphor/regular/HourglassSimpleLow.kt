package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.HourglassSimpleLow: ImageVector
    get() {
        if (_hourglassSimpleLow != null) return _hourglassSimpleLow!!
        _hourglassSimpleLow = phosphorRegularIcon(
            name = "HourglassSimpleLow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M211.18 196.56 139.57 128 211.18 59.44c.041-.046 .084-.089 .13-.13 4.573-4.576 5.94-11.455 3.465-17.432C212.3 35.901 206.469 32.003 200 32h-144c-6.467 .007-12.294 3.907-14.767 9.883-2.473 5.976-1.105 12.853 3.467 17.427l.12 .13L116.43 128 44.82 196.56l-.12 .13c-4.572 4.575-5.94 11.451-3.467 17.427 2.473 5.976 8.3 9.876 14.767 9.883h144c6.471 .001 12.305-3.896 14.783-9.873 2.478-5.978 1.111-12.859-3.463-17.437-.049-.04-.096-.084-.14-.13ZM56 48h0 0ZM158.21 168h-60.42L128 139.08ZM200 48l-72 68.92L56 48ZM56 208 81.06 184h93.84L200 208Z"),
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
        return _hourglassSimpleLow!!
    }

private var _hourglassSimpleLow: ImageVector? = null
