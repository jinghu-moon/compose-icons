package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MicrosoftTeamsLogo: ImageVector
    get() {
        if (_microsoftTeamsLogo != null) return _microsoftTeamsLogo!!
        _microsoftTeamsLogo = phosphorBoldIcon(
            name = "MicrosoftTeamsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 116.000 104.000 C 116.000 110.627 110.627 116.000 104.000 116.000 L 100.000 116.000 L 100.000 152.000 C 100.000 158.627 94.627 164.000 88.000 164.000 C 81.373 164.000 76.000 158.627 76.000 152.000 L 76.000 116.000 L 72.000 116.000 C 65.373 116.000 60.000 110.627 60.000 104.000 C 60.000 97.373 65.373 92.000 72.000 92.000 L 104.000 92.000 C 110.627 92.000 116.000 97.373 116.000 104.000 ZM 240.000 92.740 L 240.000 152.000 C 240.024 175.540 221.516 194.930 198.000 196.000 C 187.336 219.634 164.160 235.147 138.246 235.996 C 112.331 236.846 88.189 222.885 76.000 200.000 L 36.000 200.000 C 24.954 200.000 16.000 191.046 16.000 180.000 L 16.000 76.000 C 16.000 64.954 24.954 56.000 36.000 56.000 L 92.000 56.000 C 92.012 36.649 104.665 19.577 123.176 13.937 C 141.687 8.297 161.710 15.413 172.510 31.470 C 185.656 25.198 201.286 27.465 212.108 37.214 C 222.930 46.963 226.811 62.273 221.940 76.000 L 223.260 76.000 C 232.501 76.011 239.989 83.499 240.000 92.740 ZM 180.000 55.090 C 180.000 55.390 180.000 55.690 180.000 56.000 C 180.007 62.949 178.372 69.802 175.230 76.000 L 188.000 76.000 C 193.360 76.017 198.081 72.478 199.567 67.328 C 201.054 62.179 198.945 56.668 194.401 53.826 C 189.857 50.984 183.980 51.500 180.000 55.090 ZM 116.000 56.000 L 140.000 56.000 C 145.676 56.003 151.081 58.425 154.860 62.660 C 155.610 60.520 155.996 58.268 156.000 56.000 C 156.000 44.954 147.046 36.000 136.000 36.000 C 124.954 36.000 116.000 44.954 116.000 56.000 ZM 40.000 176.000 L 136.000 176.000 L 136.000 80.000 L 40.000 80.000 ZM 180.000 168.000 L 180.000 100.000 L 160.000 100.000 L 160.000 180.000 C 160.000 191.046 151.046 200.000 140.000 200.000 L 105.860 200.000 C 118.639 212.015 137.332 215.293 153.436 208.342 C 169.540 201.391 179.978 185.540 180.000 168.000 ZM 216.000 100.000 L 204.000 100.000 L 204.000 168.000 C 204.000 168.790 204.000 169.570 203.940 170.350 C 211.259 167.184 215.997 159.974 216.000 152.000 Z"),
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
        return _microsoftTeamsLogo!!
    }

private var _microsoftTeamsLogo: ImageVector? = null
