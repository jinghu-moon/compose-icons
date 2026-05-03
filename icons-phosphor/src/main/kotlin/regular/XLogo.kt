package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.XLogo: ImageVector
    get() {
        if (_xLogo != null) return _xLogo!!
        _xLogo = phosphorRegularIcon(
            name = "XLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 214.750 211.710 L 152.150 113.330 L 213.920 45.380 C 216.827 42.103 216.558 37.097 213.316 34.151 C 210.074 31.204 205.065 31.413 202.080 34.620 L 143.240 99.340 L 102.750 35.710 C 101.283 33.400 98.736 32.001 96.000 32.000 L 48.000 32.000 C 45.078 31.999 42.388 33.590 40.983 36.151 C 39.577 38.712 39.680 41.836 41.250 44.300 L 103.850 142.670 L 42.080 210.670 C 40.117 212.779 39.439 215.780 40.306 218.528 C 41.173 221.275 43.450 223.344 46.267 223.945 C 49.085 224.546 52.008 223.585 53.920 221.430 L 112.760 156.710 L 153.250 220.340 C 154.729 222.631 157.273 224.010 160.000 224.000 L 208.000 224.000 C 210.918 223.999 213.605 222.409 215.010 219.851 C 216.414 217.293 216.315 214.173 214.750 211.710 ZM 164.390 208.000 L 62.570 48.000 L 91.570 48.000 L 193.430 208.000 Z"),
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
