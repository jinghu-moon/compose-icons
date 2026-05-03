package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandPaypal: ImageVector
    get() {
        if (_brandPaypal != null) return _brandPaypal!!
        _brandPaypal = tablerFilledIcon(
            name = "BrandPaypal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.500 2.000 C 15.613 2.000 17.809 3.785 18.363 6.565 C 20.088 7.750 21.000 9.717 21.000 12.000 C 21.000 14.933 18.252 17.384 15.217 17.496 L 15.000 17.500 L 13.246 17.500 L 12.780 20.300 C 12.601 21.182 11.855 21.836 10.957 21.897 L 10.800 21.900 L 8.120 21.900 C 7.664 21.909 7.230 21.710 6.938 21.360 C 6.687 21.062 6.562 20.678 6.590 20.290 L 6.632 20.000 L 5.000 20.000 C 3.996 20.000 3.086 19.136 3.006 18.143 L 3.000 18.000 L 3.010 17.859 L 5.003 3.905 L 5.006 3.857 C 5.078 2.963 5.821 2.175 6.701 2.025 L 6.857 2.005 L 7.000 2.000 L 12.500 2.000 ZM 18.312 9.350 L 18.288 9.437 C 17.582 11.840 15.216 13.873 12.733 13.994 L 12.500 14.000 L 9.997 14.000 L 9.997 14.050 L 9.972 14.233 L 8.772 19.233 C 8.767 19.257 8.760 19.280 8.753 19.303 L 8.665 19.900 L 10.819 19.900 L 11.414 16.336 C 11.487 15.898 11.839 15.561 12.279 15.507 L 12.400 15.500 L 15.000 15.500 C 17.073 15.500 19.000 13.830 19.000 12.000 C 19.000 10.978 18.764 10.076 18.312 9.350 Z"),
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
        return _brandPaypal!!
    }

private var _brandPaypal: ImageVector? = null
