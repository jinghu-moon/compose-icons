package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandPinterest: ImageVector
    get() {
        if (_brandPinterest != null) return _brandPinterest!!
        _brandPinterest = tablerFilledIcon(
            name = "BrandPinterest",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 3.340 C 21.506 5.942 23.263 11.565 21.041 16.270 C 18.819 20.975 13.360 23.190 8.488 21.363 L 10.852 16.048 C 11.501 16.659 12.359 17.000 13.250 17.000 C 15.958 17.000 18.000 14.911 18.000 12.000 C 18.002 9.605 16.580 7.438 14.382 6.487 C 12.184 5.536 9.630 5.984 7.887 7.626 C 6.143 9.268 5.543 11.790 6.360 14.041 C 6.479 14.381 6.771 14.630 7.125 14.694 C 7.480 14.758 7.841 14.627 8.071 14.351 C 8.302 14.075 8.366 13.696 8.240 13.359 C 7.695 11.858 8.095 10.177 9.258 9.082 C 10.420 7.987 12.123 7.689 13.588 8.323 C 15.054 8.957 16.002 10.402 16.000 11.999 C 16.000 13.817 14.844 15.000 13.250 15.000 C 12.641 15.000 12.097 14.639 11.772 13.978 L 12.914 11.406 C 13.138 10.901 12.911 10.310 12.406 10.086 C 11.901 9.862 11.310 10.089 11.086 10.594 L 6.694 20.476 C 3.774 18.648 2.000 15.445 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340"),
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
        return _brandPinterest!!
    }

private var _brandPinterest: ImageVector? = null
