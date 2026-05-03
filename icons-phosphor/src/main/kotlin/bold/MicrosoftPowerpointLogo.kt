package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MicrosoftPowerpointLogo: ImageVector
    get() {
        if (_microsoftPowerpointLogo != null) return _microsoftPowerpointLogo!!
        _microsoftPowerpointLogo = phosphorBoldIcon(
            name = "MicrosoftPowerpointLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 94.000 88.000 L 76.000 88.000 C 69.373 88.000 64.000 93.373 64.000 100.000 L 64.000 152.000 C 64.000 158.627 69.373 164.000 76.000 164.000 C 82.627 164.000 88.000 158.627 88.000 152.000 L 88.000 148.000 L 94.000 148.000 C 110.569 148.000 124.000 134.569 124.000 118.000 C 124.000 101.431 110.569 88.000 94.000 88.000 ZM 94.000 124.000 L 88.000 124.000 L 88.000 112.000 L 94.000 112.000 C 97.314 112.000 100.000 114.686 100.000 118.000 C 100.000 121.314 97.314 124.000 94.000 124.000 ZM 136.000 20.000 C 107.182 20.019 79.562 31.537 59.270 52.000 L 40.000 52.000 C 28.954 52.000 20.000 60.954 20.000 72.000 L 20.000 180.000 C 20.000 191.046 28.954 200.000 40.000 200.000 L 55.500 200.000 C 88.585 236.990 142.620 246.672 186.490 223.470 C 230.360 200.269 252.772 150.156 240.819 101.989 C 228.867 53.822 185.627 20.001 136.000 20.000 ZM 136.000 44.000 C 177.734 44.056 213.117 74.701 219.130 116.000 L 164.000 116.000 L 164.000 72.000 C 164.000 60.954 155.046 52.000 144.000 52.000 L 100.270 52.000 C 111.446 46.735 123.646 44.003 136.000 44.000 ZM 44.000 76.000 L 140.000 76.000 L 140.000 176.000 L 44.000 176.000 ZM 136.000 212.000 C 120.736 212.026 105.755 207.877 92.680 200.000 L 144.000 200.000 C 155.046 200.000 164.000 191.046 164.000 180.000 L 164.000 140.000 L 219.130 140.000 C 213.117 181.299 177.734 211.944 136.000 212.000 Z"),
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
        return _microsoftPowerpointLogo!!
    }

private var _microsoftPowerpointLogo: ImageVector? = null
