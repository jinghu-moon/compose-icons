package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MoonStars: ImageVector
    get() {
        if (_moonStars != null) return _moonStars!!
        _moonStars = phosphorDuotoneIcon(
            name = "MoonStars",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 210.690 158.180 C 196.695 196.452 158.255 220.108 117.782 215.357 C 77.310 210.606 45.394 178.690 40.643 138.218 C 35.892 97.745 59.548 59.305 97.820 45.310 C 92.255 73.495 99.595 102.692 117.827 124.894 C 136.060 147.097 163.271 159.976 192.000 160.000 C 198.274 160.001 204.534 159.391 210.690 158.180 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 240.000 96.000 C 240.000 100.418 236.418 104.000 232.000 104.000 L 216.000 104.000 L 216.000 120.000 C 216.000 124.418 212.418 128.000 208.000 128.000 C 203.582 128.000 200.000 124.418 200.000 120.000 L 200.000 104.000 L 184.000 104.000 C 179.582 104.000 176.000 100.418 176.000 96.000 C 176.000 91.582 179.582 88.000 184.000 88.000 L 200.000 88.000 L 200.000 72.000 C 200.000 67.582 203.582 64.000 208.000 64.000 C 212.418 64.000 216.000 67.582 216.000 72.000 L 216.000 88.000 L 232.000 88.000 C 236.418 88.000 240.000 91.582 240.000 96.000 ZM 144.000 56.000 L 152.000 56.000 L 152.000 64.000 C 152.000 68.418 155.582 72.000 160.000 72.000 C 164.418 72.000 168.000 68.418 168.000 64.000 L 168.000 56.000 L 176.000 56.000 C 180.418 56.000 184.000 52.418 184.000 48.000 C 184.000 43.582 180.418 40.000 176.000 40.000 L 168.000 40.000 L 168.000 32.000 C 168.000 27.582 164.418 24.000 160.000 24.000 C 155.582 24.000 152.000 27.582 152.000 32.000 L 152.000 40.000 L 144.000 40.000 C 139.582 40.000 136.000 43.582 136.000 48.000 C 136.000 52.418 139.582 56.000 144.000 56.000 ZM 216.770 153.000 C 218.666 155.208 219.214 158.272 218.200 161.000 C 202.901 202.724 160.964 228.493 116.829 223.290 C 72.694 218.088 37.900 183.273 32.722 139.135 C 27.544 94.997 53.337 53.076 95.070 37.800 C 97.784 36.806 100.822 37.353 103.019 39.231 C 105.216 41.108 106.229 44.025 105.670 46.860 C 99.977 75.677 109.025 105.435 129.795 126.205 C 150.565 146.975 180.323 156.023 209.140 150.330 C 211.979 149.775 214.896 150.796 216.770 153.000 ZM 197.380 167.880 C 195.590 167.970 193.790 168.020 192.000 168.020 C 134.580 167.959 88.050 121.420 88.000 64.000 C 88.000 62.210 88.000 60.410 88.140 58.620 C 58.966 75.408 43.420 108.662 49.250 141.813 C 55.079 174.965 81.035 200.921 114.187 206.750 C 147.338 212.580 180.592 197.034 197.380 167.860 Z"),
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
        return _moonStars!!
    }

private var _moonStars: ImageVector? = null
