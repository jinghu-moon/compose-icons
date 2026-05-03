package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CarSimple: ImageVector
    get() {
        if (_carSimple != null) return _carSimple!!
        _carSimple = phosphorThinIcon(
            name = "CarSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 108.000 L 226.600 108.000 L 197.770 43.130 C 195.840 38.784 191.526 35.987 186.770 36.000 L 69.200 36.000 C 64.444 35.987 60.130 38.784 58.200 43.130 L 29.400 108.000 L 16.000 108.000 C 13.791 108.000 12.000 109.791 12.000 112.000 C 12.000 114.209 13.791 116.000 16.000 116.000 L 28.000 116.000 L 28.000 200.000 C 28.000 206.627 33.373 212.000 40.000 212.000 L 64.000 212.000 C 70.627 212.000 76.000 206.627 76.000 200.000 L 76.000 180.000 L 180.000 180.000 L 180.000 200.000 C 180.000 206.627 185.373 212.000 192.000 212.000 L 216.000 212.000 C 222.627 212.000 228.000 206.627 228.000 200.000 L 228.000 116.000 L 240.000 116.000 C 242.209 116.000 244.000 114.209 244.000 112.000 C 244.000 109.791 242.209 108.000 240.000 108.000 ZM 65.540 46.380 C 66.181 44.932 67.616 43.999 69.200 44.000 L 186.800 44.000 C 188.384 43.999 189.819 44.932 190.460 46.380 L 217.840 108.000 L 38.160 108.000 ZM 220.000 200.000 C 220.000 202.209 218.209 204.000 216.000 204.000 L 192.000 204.000 C 189.791 204.000 188.000 202.209 188.000 200.000 L 188.000 176.000 C 188.000 173.791 186.209 172.000 184.000 172.000 L 72.000 172.000 C 69.791 172.000 68.000 173.791 68.000 176.000 L 68.000 200.000 C 68.000 202.209 66.209 204.000 64.000 204.000 L 40.000 204.000 C 37.791 204.000 36.000 202.209 36.000 200.000 L 36.000 116.000 L 220.000 116.000 Z"),
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
        return _carSimple!!
    }

private var _carSimple: ImageVector? = null
