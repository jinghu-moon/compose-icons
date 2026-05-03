package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.IceCream: ImageVector
    get() {
        if (_iceCream != null) return _iceCream!!
        _iceCream = phosphorBoldIcon(
            name = "IceCream",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.000 116.000 C 227.969 104.424 221.716 93.760 211.630 88.080 C 207.567 44.930 171.341 11.955 128.000 11.955 C 84.659 11.955 48.433 44.930 44.370 88.080 C 32.169 94.910 25.815 108.872 28.680 122.558 C 31.544 136.245 42.964 146.486 56.880 147.850 L 110.630 241.920 C 114.189 248.157 120.819 252.006 128.000 252.006 C 135.181 252.006 141.811 248.157 145.370 241.920 L 199.120 147.850 C 215.507 146.245 228.001 132.466 228.000 116.000 ZM 58.390 108.160 C 63.982 107.023 68.000 102.106 68.000 96.400 L 68.000 96.000 C 68.000 62.863 94.863 36.000 128.000 36.000 C 161.137 36.000 188.000 62.863 188.000 96.000 L 188.000 96.400 C 188.000 102.106 192.018 107.023 197.610 108.160 C 201.640 108.978 204.393 112.718 203.977 116.809 C 203.561 120.900 200.112 124.009 196.000 124.000 L 60.000 124.000 C 55.888 124.009 52.439 120.900 52.023 116.809 C 51.607 112.718 54.360 108.978 58.390 108.160 ZM 171.390 148.000 L 154.890 176.880 L 138.390 148.000 ZM 84.610 148.000 L 110.750 148.000 L 141.070 201.060 L 128.000 223.940 Z"),
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
        return _iceCream!!
    }

private var _iceCream: ImageVector? = null
