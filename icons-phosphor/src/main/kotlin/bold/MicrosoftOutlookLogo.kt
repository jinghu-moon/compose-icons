package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MicrosoftOutlookLogo: ImageVector
    get() {
        if (_microsoftOutlookLogo != null) return _microsoftOutlookLogo!!
        _microsoftOutlookLogo = phosphorBoldIcon(
            name = "MicrosoftOutlookLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 124.000 128.000 C 124.000 108.118 107.882 92.000 88.000 92.000 C 68.118 92.000 52.000 108.118 52.000 128.000 C 52.000 147.882 68.118 164.000 88.000 164.000 C 107.882 164.000 124.000 147.882 124.000 128.000 ZM 76.000 128.000 C 76.000 121.373 81.373 116.000 88.000 116.000 C 94.627 116.000 100.000 121.373 100.000 128.000 C 100.000 134.627 94.627 140.000 88.000 140.000 C 81.373 140.000 76.000 134.627 76.000 128.000 ZM 224.000 100.000 L 212.000 100.000 L 212.000 32.000 C 212.000 25.373 206.627 20.000 200.000 20.000 L 104.000 20.000 C 97.373 20.000 92.000 25.373 92.000 32.000 L 92.000 56.000 L 36.000 56.000 C 24.954 56.000 16.000 64.954 16.000 76.000 L 16.000 180.000 C 16.000 191.046 24.954 200.000 36.000 200.000 L 68.000 200.000 L 68.000 216.000 C 68.000 227.046 76.954 236.000 88.000 236.000 L 216.000 236.000 C 227.046 236.000 236.000 227.046 236.000 216.000 L 236.000 112.000 C 236.000 105.373 230.627 100.000 224.000 100.000 ZM 171.550 168.000 L 212.000 136.540 L 212.000 199.460 ZM 116.000 44.000 L 188.000 44.000 L 188.000 124.800 L 160.000 146.580 L 160.000 76.000 C 160.000 64.954 151.046 56.000 140.000 56.000 L 116.000 56.000 ZM 40.000 80.000 L 136.000 80.000 L 136.000 176.000 L 40.000 176.000 ZM 92.000 200.000 L 140.000 200.000 C 147.915 199.994 155.082 195.321 158.280 188.080 L 189.000 212.000 L 92.000 212.000 Z"),
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
        return _microsoftOutlookLogo!!
    }

private var _microsoftOutlookLogo: ImageVector? = null
