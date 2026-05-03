package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Click: ImageVector
    get() {
        if (_click != null) return _click!!
        _click = tablerFilledIcon(
            name = "Click",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.000 12.000 C 7.000 12.552 6.552 13.000 6.000 13.000 L 3.000 13.000 C 2.448 13.000 2.000 12.552 2.000 12.000 C 2.000 11.448 2.448 11.000 3.000 11.000 L 6.000 11.000 C 6.552 11.000 7.000 11.448 7.000 12.000M 13.000 3.000 L 13.000 6.000 C 13.000 6.552 12.552 7.000 12.000 7.000 C 11.448 7.000 11.000 6.552 11.000 6.000 L 11.000 3.000 C 11.000 2.448 11.448 2.000 12.000 2.000 C 12.552 2.000 13.000 2.448 13.000 3.000M 6.307 4.893 L 8.507 7.093 C 8.886 7.485 8.881 8.109 8.495 8.495 C 8.109 8.881 7.485 8.886 7.093 8.507 L 4.893 6.307 C 4.514 5.915 4.519 5.291 4.905 4.905 C 5.291 4.519 5.915 4.514 6.307 4.893M 19.107 4.893 C 19.497 5.283 19.497 5.917 19.107 6.307 L 16.907 8.507 C 16.515 8.886 15.891 8.881 15.505 8.495 C 15.119 8.109 15.114 7.485 15.493 7.093 L 17.693 4.893 C 18.083 4.503 18.716 4.503 19.107 4.893M 8.507 15.493 C 8.897 15.884 8.897 16.517 8.507 16.907 L 6.307 19.107 C 6.056 19.367 5.684 19.471 5.334 19.380 C 4.985 19.288 4.712 19.015 4.620 18.666 C 4.529 18.316 4.633 17.944 4.893 17.693 L 7.093 15.493 C 7.484 15.103 8.116 15.103 8.507 15.493M 11.927 11.003 L 11.976 11.000 L 12.074 11.003 L 12.171 11.015 L 12.268 11.037 L 21.316 14.051 C 22.161 14.333 22.244 15.496 21.447 15.894 L 17.745 17.745 L 15.895 21.447 C 15.496 22.244 14.333 22.161 14.051 21.317 L 11.048 12.306 L 11.015 12.171 L 11.003 12.074 L 11.003 11.926 L 11.015 11.829 L 11.037 11.732 L 11.067 11.638 L 11.107 11.548 L 11.157 11.464 L 11.243 11.347 L 11.310 11.277 L 11.347 11.243 L 11.423 11.183 L 11.504 11.131 L 11.591 11.088 L 11.694 11.048 L 11.829 11.015 Z"),
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
        return _click!!
    }

private var _click: ImageVector? = null
