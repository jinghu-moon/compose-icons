package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MicrosoftOutlookLogo: ImageVector
    get() {
        if (_microsoftOutlookLogo != null) return _microsoftOutlookLogo!!
        _microsoftOutlookLogo = phosphorRegularIcon(
            name = "MicrosoftOutlookLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 120.000 128.000 C 120.000 110.327 105.673 96.000 88.000 96.000 C 70.327 96.000 56.000 110.327 56.000 128.000 C 56.000 145.673 70.327 160.000 88.000 160.000 C 105.673 160.000 120.000 145.673 120.000 128.000 ZM 72.000 128.000 C 72.000 119.163 79.163 112.000 88.000 112.000 C 96.837 112.000 104.000 119.163 104.000 128.000 C 104.000 136.837 96.837 144.000 88.000 144.000 C 79.163 144.000 72.000 136.837 72.000 128.000 ZM 224.000 104.000 L 208.000 104.000 L 208.000 40.000 C 208.000 35.582 204.418 32.000 200.000 32.000 L 104.000 32.000 C 99.582 32.000 96.000 35.582 96.000 40.000 L 96.000 64.000 L 40.000 64.000 C 31.163 64.000 24.000 71.163 24.000 80.000 L 24.000 176.000 C 24.000 184.837 31.163 192.000 40.000 192.000 L 72.000 192.000 L 72.000 208.000 C 72.000 216.837 79.163 224.000 88.000 224.000 L 216.000 224.000 C 224.837 224.000 232.000 216.837 232.000 208.000 L 232.000 112.000 C 232.000 107.582 228.418 104.000 224.000 104.000 ZM 165.660 164.000 L 216.000 127.650 L 216.000 200.350 ZM 112.000 48.000 L 192.000 48.000 L 192.000 125.240 L 152.000 154.130 L 152.000 80.000 C 152.000 71.163 144.837 64.000 136.000 64.000 L 112.000 64.000 ZM 40.000 80.000 L 136.000 80.000 L 136.000 157.900 C 136.000 158.020 136.000 158.140 136.000 158.260 L 136.000 176.000 L 40.000 176.000 ZM 88.000 192.000 L 136.000 192.000 C 144.837 192.000 152.000 184.837 152.000 176.000 L 152.000 173.870 L 199.260 208.000 L 88.000 208.000 Z"),
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
        return _microsoftOutlookLogo!!
    }

private var _microsoftOutlookLogo: ImageVector? = null
