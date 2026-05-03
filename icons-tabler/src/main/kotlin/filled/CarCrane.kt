package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CarCrane: ImageVector
    get() {
        if (_carCrane != null) return _carCrane!!
        _carCrane = tablerFilledIcon(
            name = "CarCrane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.060 5.660 L 3.095 5.575 L 3.165 5.450 L 3.198 5.402 L 3.261 5.327 L 3.325 5.262 L 3.423 5.183 L 3.529 5.118 L 3.596 5.085 L 3.644 5.065 L 3.783 5.024 L 21.836 2.014 C 22.126 1.966 22.422 2.048 22.646 2.237 C 22.871 2.427 23.000 2.706 23.000 3.000 L 23.000 5.000 C 23.000 5.552 22.552 6.000 22.000 6.000 C 21.448 6.000 21.000 5.552 21.000 5.000 L 21.000 4.180 L 7.198 6.480 L 8.448 7.106 C 8.786 7.276 9.000 7.622 9.000 8.000 L 8.999 11.000 L 11.000 11.000 L 11.000 7.000 C 11.000 6.448 11.448 6.000 12.000 6.000 L 16.000 6.000 C 19.314 6.000 22.000 8.686 22.000 12.000 L 22.000 17.000 C 22.000 17.552 21.552 18.000 21.000 18.000 L 19.830 18.000 C 19.407 19.200 18.272 20.002 17.000 20.002 C 15.728 20.002 14.593 19.200 14.170 18.000 L 7.830 18.000 C 7.342 19.377 5.934 20.203 4.494 19.956 C 3.054 19.709 2.001 18.461 2.000 17.000 L 2.000 12.000 C 2.000 11.448 2.448 11.000 3.000 11.000 L 3.000 6.010 C 2.999 5.891 3.019 5.772 3.060 5.660M 5.000 16.000 C 4.448 16.000 4.000 16.448 4.000 17.000 C 4.000 17.552 4.448 18.000 5.000 18.000 C 5.552 18.000 6.000 17.552 6.000 17.000 C 6.000 16.448 5.552 16.000 5.000 16.000M 17.000 16.000 C 16.464 16.000 16.023 16.423 16.001 16.958 C 15.978 17.494 16.382 17.952 16.917 17.997 C 17.451 18.041 17.926 17.656 17.992 17.124 L 18.000 16.992 L 17.993 16.883 C 17.934 16.380 17.507 16.000 17.000 16.000M 16.348 8.015 L 17.243 11.000 L 19.873 11.000 L 19.831 10.845 C 19.386 9.368 18.132 8.279 16.608 8.045 Z"),
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
        return _carCrane!!
    }

private var _carCrane: ImageVector? = null
