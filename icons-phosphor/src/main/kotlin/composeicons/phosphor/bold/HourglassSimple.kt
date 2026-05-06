package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HourglassSimple: ImageVector
    get() {
        if (_hourglassSimple != null) return _hourglassSimple!!
        _hourglassSimple = phosphorBoldIcon(
            name = "HourglassSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M214 193.68 145.35 128 214 62.32l.18-.18c5.723-5.725 7.431-14.336 4.326-21.812C215.401 32.852 208.095 27.986 200 28h-144c-8.086 .006-15.373 4.88-18.465 12.352-3.092 7.471-1.381 16.07 4.335 21.788l.18 .18L110.65 128 42.05 193.68l-.18 .18c-5.717 5.719-7.428 14.317-4.335 21.788C40.627 223.12 47.914 227.994 56 228h144c8.088-.002 15.379-4.875 18.474-12.347 3.095-7.472 1.385-16.073-4.334-21.793ZM190 52l-62 59.39L66 52ZM66 204l62-59.39L190 204Z"),
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
