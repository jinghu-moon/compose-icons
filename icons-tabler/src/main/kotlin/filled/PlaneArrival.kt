package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlaneArrival: ImageVector
    get() {
        if (_planeArrival != null) return _planeArrival!!
        _planeArrival = tablerFilledIcon(
            name = "PlaneArrival",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.466 2.271 L 13.364 3.048 C 13.710 3.141 13.981 3.412 14.072 3.759 L 15.976 10.994 L 20.231 12.135 C 21.276 12.402 22.097 13.209 22.382 14.249 C 22.667 15.289 22.371 16.402 21.608 17.164 C 20.845 17.926 19.732 18.220 18.692 17.934 L 4.203 14.052 C 3.838 13.954 3.559 13.658 3.483 13.287 L 2.136 6.715 C 2.066 6.375 2.177 6.024 2.430 5.786 C 2.682 5.548 3.040 5.458 3.375 5.548 L 6.273 6.324 C 6.529 6.393 6.747 6.560 6.880 6.790 L 8.087 8.881 L 9.304 9.207 L 9.206 3.253 C 9.201 2.939 9.343 2.641 9.591 2.448 C 9.838 2.255 10.162 2.190 10.465 2.271"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 22.000 21.000 C 22.000 21.552 21.552 22.000 21.000 22.000 L 3.000 22.000 C 2.448 22.000 2.000 21.552 2.000 21.000 C 2.000 20.448 2.448 20.000 3.000 20.000 L 21.000 20.000 C 21.552 20.000 22.000 20.448 22.000 21.000"),
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
        return _planeArrival!!
    }

private var _planeArrival: ImageVector? = null
