package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChatDots: ImageVector
    get() {
        if (_chatDots != null) return _chatDots!!
        _chatDots = phosphorBoldIcon(
            name = "ChatDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 88.000 128.000 C 88.000 119.163 95.163 112.000 104.000 112.000 C 112.837 112.000 120.000 119.163 120.000 128.000 C 120.000 136.837 112.837 144.000 104.000 144.000 C 95.163 144.000 88.000 136.837 88.000 128.000 ZM 152.000 144.000 C 160.837 144.000 168.000 136.837 168.000 128.000 C 168.000 119.163 160.837 112.000 152.000 112.000 C 143.163 112.000 136.000 119.163 136.000 128.000 C 136.000 136.837 143.163 144.000 152.000 144.000 ZM 236.000 64.000 L 236.000 192.000 C 236.000 203.046 227.046 212.000 216.000 212.000 L 84.470 212.000 L 53.000 239.170 L 52.880 239.280 C 49.294 242.318 44.750 243.990 40.050 244.000 C 37.115 243.993 34.218 243.344 31.560 242.100 C 24.489 238.858 19.967 231.779 20.000 224.000 L 20.000 64.000 C 20.000 52.954 28.954 44.000 40.000 44.000 L 216.000 44.000 C 227.046 44.000 236.000 52.954 236.000 64.000 ZM 212.000 68.000 L 44.000 68.000 L 44.000 215.230 L 72.160 190.910 C 74.337 189.026 77.121 187.992 80.000 188.000 L 212.000 188.000 Z"),
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
        return _chatDots!!
    }

private var _chatDots: ImageVector? = null
