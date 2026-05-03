package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Shrimp: ImageVector
    get() {
        if (_shrimp != null) return _shrimp!!
        _shrimp = phosphorThinIcon(
            name = "Shrimp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 140.000 116.000 C 140.000 111.582 143.582 108.000 148.000 108.000 C 152.418 108.000 156.000 111.582 156.000 116.000 C 156.000 120.418 152.418 124.000 148.000 124.000 C 143.582 124.000 140.000 120.418 140.000 116.000 ZM 219.930 82.650 C 218.467 123.542 184.918 155.951 144.000 156.000 L 112.000 156.000 C 103.163 156.000 96.000 163.163 96.000 172.000 C 96.000 180.837 103.163 188.000 112.000 188.000 L 168.000 188.000 C 170.209 188.000 172.000 189.791 172.000 192.000 C 172.000 194.209 170.209 196.000 168.000 196.000 L 116.000 196.000 L 116.000 220.000 L 152.000 220.000 C 154.209 220.000 156.000 221.791 156.000 224.000 C 156.000 226.209 154.209 228.000 152.000 228.000 L 96.000 228.000 C 54.026 228.000 20.000 193.974 20.000 152.000 C 20.000 110.026 54.026 76.000 96.000 76.000 L 212.000 76.000 C 220.837 76.000 228.000 68.837 228.000 60.000 C 228.000 51.163 220.837 44.000 212.000 44.000 L 128.000 44.000 C 116.954 44.000 108.000 35.046 108.000 24.000 C 108.000 21.791 109.791 20.000 112.000 20.000 C 114.209 20.000 116.000 21.791 116.000 24.000 C 116.000 30.627 121.373 36.000 128.000 36.000 L 212.000 36.000 C 223.701 36.003 233.694 44.443 235.655 55.978 C 237.616 67.513 230.972 78.781 219.930 82.650 ZM 50.470 202.460 L 88.250 175.460 C 88.086 174.314 88.002 173.158 88.000 172.000 C 87.995 168.696 88.676 165.427 90.000 162.400 L 30.100 135.170 C 23.866 159.640 31.706 185.550 50.460 202.460 ZM 90.900 183.460 L 57.000 207.640 C 68.411 215.690 82.035 220.008 96.000 220.000 L 108.000 220.000 L 108.000 195.660 C 100.725 194.417 94.422 189.906 90.900 183.420 ZM 108.000 148.340 L 108.000 84.000 L 96.000 84.000 C 67.910 84.035 42.723 101.315 32.580 127.510 L 94.470 155.640 C 98.055 151.785 102.810 149.220 108.000 148.340 ZM 211.880 84.000 L 116.000 84.000 L 116.000 148.000 L 144.000 148.000 C 179.985 147.959 209.723 119.920 211.880 84.000 Z"),
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
        return _shrimp!!
    }

private var _shrimp: ImageVector? = null
