package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ColorFilterFill: ImageVector
    get() {
        if (_colorFilterFill != null) return _colorFilterFill!!
        _colorFilterFill = remixIcon(
            name = "ColorFilterFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.572 8.027c.275-.62 .428-1.306 .428-2.027 0-2.761-2.239-5-5-5C9.238 1 7 3.239 7 6c0 2.583 1.958 4.708 4.471 4.972C12.686 9.24 14.576 8.208 16.572 8.027ZM13.154 17.946c.842-1.819 .893-3.972 .001-5.891 1.485-2.044 4.304-2.677 6.541-1.385l0-0c2.391 1.381 3.211 4.439 1.83 6.83-1.381 2.392-4.439 3.211-6.83 1.83-.625-.361-1.142-.836-1.541-1.384ZM6.273 10.027c1.154 1.638 2.994 2.759 5.101 2.946 1.027 2.308 .165 5.066-2.071 6.357C6.912 20.711 3.854 19.891 2.473 17.5 1.093 15.108 1.912 12.05 4.304 10.67c.625-.361 1.295-.571 1.97-.643Z"),
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
        return _colorFilterFill!!
    }

private var _colorFilterFill: ImageVector? = null
