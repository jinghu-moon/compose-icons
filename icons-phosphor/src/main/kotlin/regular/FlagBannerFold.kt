package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FlagBannerFold: ImageVector
    get() {
        if (_flagBannerFold != null) return _flagBannerFold!!
        _flagBannerFold = phosphorRegularIcon(
            name = "FlagBannerFold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 238.730 43.670 C 237.257 41.382 234.722 39.999 232.000 40.000 L 152.000 40.000 C 148.864 40.001 146.018 41.835 144.720 44.690 L 135.940 64.000 L 28.000 64.000 C 24.834 64.000 21.966 65.868 20.685 68.763 C 19.404 71.658 19.951 75.037 22.080 77.380 L 57.190 116.000 L 22.080 154.620 C 19.951 156.963 19.404 160.342 20.685 163.237 C 21.966 166.132 24.834 168.000 28.000 168.000 L 101.090 168.000 C 104.226 167.999 107.072 166.165 108.370 163.310 L 117.150 144.000 L 179.580 144.000 L 144.720 220.690 C 143.446 223.305 143.692 226.406 145.362 228.787 C 147.032 231.169 149.863 232.457 152.756 232.149 C 155.649 231.842 158.147 229.989 159.280 227.310 L 239.280 51.310 C 240.407 48.835 240.200 45.958 238.730 43.670 ZM 95.940 152.000 L 46.080 152.000 L 73.920 121.380 C 76.692 118.329 76.692 113.671 73.920 110.620 L 46.080 80.000 L 128.670 80.000 ZM 186.850 128.000 L 124.420 128.000 L 157.150 56.000 L 219.580 56.000 Z"),
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
