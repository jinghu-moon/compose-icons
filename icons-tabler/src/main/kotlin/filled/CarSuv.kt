package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CarSuv: ImageVector
    get() {
        if (_carSuv != null) return _carSuv!!
        _carSuv = tablerFilledIcon(
            name = "CarSuv",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.000 14.000 C 8.657 14.000 10.000 15.343 10.000 17.000 C 10.000 18.657 8.657 20.000 7.000 20.000 C 5.343 20.000 4.000 18.657 4.000 17.000 L 4.005 16.824 C 4.098 15.238 5.411 14.000 7.000 14.000M 18.000 14.000 C 19.657 14.000 21.000 15.343 21.000 17.000 C 21.000 18.657 19.657 20.000 18.000 20.000 C 16.343 20.000 15.000 18.657 15.000 17.000 L 15.005 16.824 C 15.098 15.238 16.411 14.000 18.000 14.000M 7.000 16.000 C 6.448 16.000 6.000 16.448 6.000 17.000 C 6.000 17.552 6.448 18.000 7.000 18.000 C 7.552 18.000 8.000 17.552 8.000 17.000 C 8.000 16.448 7.552 16.000 7.000 16.000M 18.000 16.000 C 17.448 16.000 17.000 16.448 17.000 17.000 C 17.000 17.552 17.448 18.000 18.000 18.000 C 18.552 18.000 19.000 17.552 19.000 17.000 C 19.000 16.448 18.552 16.000 18.000 16.000M 14.438 4.000 C 15.814 4.000 17.014 4.937 17.348 6.272 L 17.781 8.000 L 20.000 8.000 C 21.589 8.000 22.902 9.238 22.995 10.824 L 23.000 11.000 L 23.000 14.020 L 22.990 14.137 C 22.960 14.355 22.860 14.557 22.704 14.712 L 22.597 14.803 L 22.527 14.852 L 22.451 14.894 L 22.345 14.940 L 22.328 14.945 L 22.281 14.961 L 22.173 14.986 L 22.055 14.999 L 21.975 15.001 L 21.853 14.989 L 21.705 14.956 L 21.642 14.934 C 21.505 14.881 21.382 14.800 21.280 14.694 L 21.200 14.600 C 20.445 13.593 19.259 13.000 18.000 13.000 C 16.741 13.000 15.555 13.593 14.800 14.600 C 14.611 14.852 14.315 15.000 14.000 15.000 L 11.000 15.000 C 10.685 15.000 10.389 14.852 10.200 14.600 C 9.445 13.591 8.258 12.998 6.998 12.998 C 5.739 12.999 4.553 13.593 3.798 14.602 C 3.467 15.044 2.840 15.135 2.398 14.804 C 1.956 14.473 1.865 13.846 2.196 13.404 C 2.689 12.744 3.306 12.204 4.000 11.802 L 4.000 9.010 C 3.999 8.891 4.019 8.772 4.060 8.660 L 4.102 8.560 L 6.106 4.553 C 6.275 4.214 6.621 4.000 7.000 4.000 ZM 2.000 6.000 C 2.552 6.000 3.000 6.448 3.000 7.000 L 3.000 11.000 C 3.000 11.552 2.552 12.000 2.000 12.000 C 1.448 12.000 1.000 11.552 1.000 11.000 L 1.000 7.000 C 1.000 6.448 1.448 6.000 2.000 6.000M 14.438 6.000 L 11.000 6.000 L 11.000 8.000 L 15.718 8.000 L 15.408 6.757 C 15.297 6.312 14.897 6.000 14.438 6.000M 9.000 6.000 L 7.618 6.000 L 6.617 8.000 L 9.000 8.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _carSuv!!
    }

private var _carSuv: ImageVector? = null
