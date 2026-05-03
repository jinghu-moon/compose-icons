package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LastfmLogo: ImageVector
    get() {
        if (_lastfmLogo != null) return _lastfmLogo!!
        _lastfmLogo = phosphorFillIcon(
            name = "LastfmLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 184.000 184.000 L 172.610 184.000 C 156.928 183.979 142.699 174.817 136.190 160.550 L 113.190 110.070 C 109.303 101.518 100.784 96.019 91.390 96.000 L 80.000 96.000 C 66.745 96.000 56.000 106.745 56.000 120.000 L 56.000 144.000 C 56.000 157.255 66.745 168.000 80.000 168.000 L 88.000 168.000 C 95.292 168.013 102.192 164.700 106.740 159.000 C 108.492 156.667 111.376 155.474 114.265 155.885 C 117.153 156.297 119.589 158.248 120.620 160.977 C 121.651 163.707 121.115 166.781 119.220 169.000 C 111.646 178.500 100.150 184.023 88.000 184.000 L 80.000 184.000 C 57.909 184.000 40.000 166.091 40.000 144.000 L 40.000 120.000 C 40.000 97.909 57.909 80.000 80.000 80.000 L 91.390 80.000 C 107.071 80.021 121.301 89.183 127.810 103.450 L 150.760 153.930 C 154.654 162.499 163.198 168.000 172.610 168.000 L 184.000 168.000 C 192.837 168.000 200.000 160.837 200.000 152.000 C 200.000 143.163 192.837 136.000 184.000 136.000 L 176.000 136.000 C 160.536 136.000 148.000 123.464 148.000 108.000 C 148.000 92.536 160.536 80.000 176.000 80.000 L 188.000 80.000 C 199.046 80.000 208.000 88.954 208.000 100.000 C 208.000 104.418 204.418 108.000 200.000 108.000 C 195.582 108.000 192.000 104.418 192.000 100.000 C 192.000 97.791 190.209 96.000 188.000 96.000 L 176.000 96.000 C 169.373 96.000 164.000 101.373 164.000 108.000 C 164.000 114.627 169.373 120.000 176.000 120.000 L 184.000 120.000 C 201.673 120.000 216.000 134.327 216.000 152.000 C 216.000 169.673 201.673 184.000 184.000 184.000 Z"),
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
        return _lastfmLogo!!
    }

private var _lastfmLogo: ImageVector? = null
