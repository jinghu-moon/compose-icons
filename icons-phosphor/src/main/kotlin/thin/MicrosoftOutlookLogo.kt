package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MicrosoftOutlookLogo: ImageVector
    get() {
        if (_microsoftOutlookLogo != null) return _microsoftOutlookLogo!!
        _microsoftOutlookLogo = phosphorThinIcon(
            name = "MicrosoftOutlookLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 116.000 128.000 C 116.000 112.536 103.464 100.000 88.000 100.000 C 72.536 100.000 60.000 112.536 60.000 128.000 C 60.000 143.464 72.536 156.000 88.000 156.000 C 103.464 156.000 116.000 143.464 116.000 128.000 ZM 68.000 128.000 C 68.000 116.954 76.954 108.000 88.000 108.000 C 99.046 108.000 108.000 116.954 108.000 128.000 C 108.000 139.046 99.046 148.000 88.000 148.000 C 76.954 148.000 68.000 139.046 68.000 128.000 ZM 224.000 108.000 L 204.000 108.000 L 204.000 40.000 C 204.000 37.791 202.209 36.000 200.000 36.000 L 104.000 36.000 C 101.791 36.000 100.000 37.791 100.000 40.000 L 100.000 68.000 L 40.000 68.000 C 33.373 68.000 28.000 73.373 28.000 80.000 L 28.000 176.000 C 28.000 182.627 33.373 188.000 40.000 188.000 L 76.000 188.000 L 76.000 208.000 C 76.000 214.627 81.373 220.000 88.000 220.000 L 216.000 220.000 C 222.627 220.000 228.000 214.627 228.000 208.000 L 228.000 112.000 C 228.000 109.791 226.209 108.000 224.000 108.000 ZM 220.000 208.170 L 158.830 164.000 L 220.000 119.820 L 220.000 208.000 C 220.005 208.057 220.005 208.113 220.000 208.170 ZM 211.630 116.000 L 204.000 121.510 L 204.000 116.000 ZM 108.000 44.000 L 196.000 44.000 L 196.000 127.290 L 152.000 159.070 L 148.000 156.180 L 148.000 80.000 C 148.000 73.373 142.627 68.000 136.000 68.000 L 108.000 68.000 ZM 36.000 176.000 L 36.000 80.000 C 36.000 77.791 37.791 76.000 40.000 76.000 L 136.000 76.000 C 138.209 76.000 140.000 77.791 140.000 80.000 L 140.000 176.000 C 140.000 178.209 138.209 180.000 136.000 180.000 L 40.000 180.000 C 37.791 180.000 36.000 178.209 36.000 176.000 ZM 84.000 208.000 L 84.000 188.000 L 136.000 188.000 C 142.627 188.000 148.000 182.627 148.000 176.000 L 148.000 166.050 L 211.630 212.000 L 88.000 212.000 C 85.791 212.000 84.000 210.209 84.000 208.000 Z"),
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
