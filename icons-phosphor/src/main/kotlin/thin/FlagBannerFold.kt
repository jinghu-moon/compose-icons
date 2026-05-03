package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FlagBannerFold: ImageVector
    get() {
        if (_flagBannerFold != null) return _flagBannerFold!!
        _flagBannerFold = phosphorThinIcon(
            name = "FlagBannerFold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 235.360 45.830 C 234.623 44.689 233.358 44.000 232.000 44.000 L 152.000 44.000 C 150.433 44.000 149.010 44.914 148.360 46.340 L 138.520 68.000 L 28.000 68.000 C 26.410 67.984 24.961 68.912 24.310 70.363 C 23.660 71.814 23.930 73.513 25.000 74.690 L 62.590 116.000 L 25.000 157.310 C 23.930 158.487 23.660 160.186 24.310 161.637 C 24.961 163.088 26.410 164.016 28.000 164.000 L 101.090 164.000 C 102.659 163.998 104.083 163.080 104.730 161.650 L 114.580 140.000 L 185.790 140.000 L 148.360 222.340 C 147.921 223.308 147.885 224.411 148.260 225.405 C 148.635 226.399 149.391 227.204 150.360 227.640 C 150.876 227.873 151.434 227.995 152.000 228.000 C 153.569 227.998 154.993 227.080 155.640 225.650 L 235.640 49.650 C 236.202 48.412 236.097 46.973 235.360 45.830 ZM 98.520 156.000 L 37.000 156.000 L 71.000 118.690 C 72.386 117.165 72.386 114.835 71.000 113.310 L 37.000 76.000 L 134.840 76.000 ZM 189.420 132.000 L 118.210 132.000 L 154.580 52.000 L 225.790 52.000 Z"),
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
        return _flagBannerFold!!
    }

private var _flagBannerFold: ImageVector? = null
