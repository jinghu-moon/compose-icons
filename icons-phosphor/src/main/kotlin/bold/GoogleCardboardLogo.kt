package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GoogleCardboardLogo: ImageVector
    get() {
        if (_googleCardboardLogo != null) return _googleCardboardLogo!!
        _googleCardboardLogo = phosphorBoldIcon(
            name = "GoogleCardboardLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 44.000 L 32.000 44.000 C 20.954 44.000 12.000 52.954 12.000 64.000 L 12.000 192.000 C 12.000 203.046 20.954 212.000 32.000 212.000 L 96.000 212.000 C 99.184 212.003 102.238 210.740 104.490 208.490 L 128.000 185.000 L 151.510 208.520 C 153.767 210.759 156.821 212.010 160.000 212.000 L 224.000 212.000 C 235.046 212.000 244.000 203.046 244.000 192.000 L 244.000 64.000 C 244.000 52.954 235.046 44.000 224.000 44.000 ZM 220.000 188.000 L 165.000 188.000 L 142.170 165.170 C 134.360 157.362 121.700 157.362 113.890 165.170 L 91.000 188.000 L 36.000 188.000 L 36.000 68.000 L 220.000 68.000 ZM 82.000 160.000 C 100.778 160.000 116.000 144.778 116.000 126.000 C 116.000 107.222 100.778 92.000 82.000 92.000 C 63.222 92.000 48.000 107.222 48.000 126.000 C 48.000 144.778 63.222 160.000 82.000 160.000 ZM 82.000 116.000 C 87.523 116.000 92.000 120.477 92.000 126.000 C 92.000 131.523 87.523 136.000 82.000 136.000 C 76.477 136.000 72.000 131.523 72.000 126.000 C 72.000 120.477 76.477 116.000 82.000 116.000 ZM 174.000 160.000 C 192.778 160.000 208.000 144.778 208.000 126.000 C 208.000 107.222 192.778 92.000 174.000 92.000 C 155.222 92.000 140.000 107.222 140.000 126.000 C 140.000 144.778 155.222 160.000 174.000 160.000 ZM 174.000 116.000 C 179.523 116.000 184.000 120.477 184.000 126.000 C 184.000 131.523 179.523 136.000 174.000 136.000 C 168.477 136.000 164.000 131.523 164.000 126.000 C 164.000 120.477 168.477 116.000 174.000 116.000 Z"),
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
        return _googleCardboardLogo!!
    }

private var _googleCardboardLogo: ImageVector? = null
