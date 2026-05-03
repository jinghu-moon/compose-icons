package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Barn: ImageVector
    get() {
        if (_barn != null) return _barn!!
        _barn = phosphorThinIcon(
            name = "Barn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.000 196.000 L 228.000 196.000 L 228.000 118.080 L 236.740 130.330 C 237.493 131.381 238.707 132.003 240.000 132.000 C 241.496 131.997 242.865 131.159 243.549 129.829 C 244.233 128.499 244.118 126.898 243.250 125.680 L 203.250 69.680 C 202.983 69.287 202.643 68.947 202.250 68.680 L 134.660 22.000 C 130.616 19.287 125.334 19.287 121.290 22.000 L 53.730 68.710 C 53.337 68.977 52.997 69.317 52.730 69.710 L 12.730 125.710 C 11.446 127.508 11.862 130.006 13.660 131.290 C 15.458 132.574 17.956 132.158 19.240 130.360 L 28.000 118.080 L 28.000 196.000 L 16.000 196.000 C 13.791 196.000 12.000 197.791 12.000 200.000 C 12.000 202.209 13.791 204.000 16.000 204.000 L 240.000 204.000 C 242.209 204.000 244.000 202.209 244.000 200.000 C 244.000 197.791 242.209 196.000 240.000 196.000 ZM 36.000 106.880 L 58.850 74.880 L 125.780 28.650 C 127.110 27.780 128.830 27.780 130.160 28.650 L 197.160 74.910 L 220.010 106.910 L 220.010 196.000 L 188.000 196.000 L 188.000 120.000 C 188.000 117.791 186.209 116.000 184.000 116.000 L 72.000 116.000 C 69.791 116.000 68.000 117.791 68.000 120.000 L 68.000 196.000 L 36.000 196.000 ZM 128.000 155.080 L 84.480 124.000 L 171.480 124.000 ZM 180.000 127.770 L 180.000 192.230 L 134.880 160.000 ZM 121.120 160.000 L 76.000 192.230 L 76.000 127.770 ZM 128.000 164.920 L 171.520 196.000 L 84.520 196.000 ZM 108.000 88.000 C 108.000 85.791 109.791 84.000 112.000 84.000 L 144.000 84.000 C 146.209 84.000 148.000 85.791 148.000 88.000 C 148.000 90.209 146.209 92.000 144.000 92.000 L 112.000 92.000 C 109.791 92.000 108.000 90.209 108.000 88.000 Z"),
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
        return _barn!!
    }

private var _barn: ImageVector? = null
