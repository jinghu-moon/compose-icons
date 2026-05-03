package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.XLogo: ImageVector
    get() {
        if (_xLogo != null) return _xLogo!!
        _xLogo = phosphorThinIcon(
            name = "XLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 211.370 213.850 L 147.130 112.900 L 211.000 42.690 C 212.486 41.033 212.347 38.486 210.690 37.000 C 209.033 35.514 206.486 35.653 205.000 37.310 L 142.680 105.900 L 99.380 37.850 C 98.644 36.696 97.369 35.998 96.000 36.000 L 48.000 36.000 C 46.540 36.001 45.197 36.798 44.495 38.078 C 43.794 39.358 43.845 40.919 44.630 42.150 L 108.870 143.100 L 45.000 213.310 C 43.514 214.967 43.653 217.514 45.310 219.000 C 46.967 220.486 49.514 220.347 51.000 218.690 L 113.360 150.100 L 156.660 218.150 C 157.388 219.293 158.645 219.989 160.000 220.000 L 208.000 220.000 C 209.460 219.999 210.803 219.202 211.505 217.922 C 212.206 216.642 212.155 215.081 211.370 213.850 ZM 162.200 212.000 L 55.290 44.000 L 93.800 44.000 L 200.710 212.000 Z"),
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
        return _xLogo!!
    }

private var _xLogo: ImageVector? = null
