package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TwitchLogo: ImageVector
    get() {
        if (_twitchLogo != null) return _twitchLogo!!
        _twitchLogo = phosphorThinIcon(
            name = "TwitchLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 36.000 L 48.000 36.000 C 41.373 36.000 36.000 41.373 36.000 48.000 L 36.000 192.000 C 36.000 198.627 41.373 204.000 48.000 204.000 L 68.000 204.000 L 68.000 240.000 C 68.000 241.550 68.897 242.961 70.300 243.620 C 70.831 243.873 71.412 244.003 72.000 244.000 C 72.936 243.999 73.842 243.670 74.560 243.070 L 121.450 204.000 L 165.100 204.000 C 167.909 203.997 170.629 203.014 172.790 201.220 L 215.680 165.470 C 218.425 163.196 220.010 159.814 220.000 156.250 L 220.000 48.000 C 220.000 41.373 214.627 36.000 208.000 36.000 ZM 212.000 156.250 C 212.002 157.440 211.474 158.569 210.560 159.330 L 167.660 195.070 C 166.942 195.670 166.036 195.999 165.100 196.000 L 120.000 196.000 C 119.064 196.001 118.158 196.330 117.440 196.930 L 76.000 231.460 L 76.000 200.000 C 76.000 197.791 74.209 196.000 72.000 196.000 L 48.000 196.000 C 45.791 196.000 44.000 194.209 44.000 192.000 L 44.000 48.000 C 44.000 45.791 45.791 44.000 48.000 44.000 L 208.000 44.000 C 210.209 44.000 212.000 45.791 212.000 48.000 ZM 172.000 88.000 L 172.000 136.000 C 172.000 138.209 170.209 140.000 168.000 140.000 C 165.791 140.000 164.000 138.209 164.000 136.000 L 164.000 88.000 C 164.000 85.791 165.791 84.000 168.000 84.000 C 170.209 84.000 172.000 85.791 172.000 88.000 ZM 124.000 88.000 L 124.000 136.000 C 124.000 138.209 122.209 140.000 120.000 140.000 C 117.791 140.000 116.000 138.209 116.000 136.000 L 116.000 88.000 C 116.000 85.791 117.791 84.000 120.000 84.000 C 122.209 84.000 124.000 85.791 124.000 88.000 Z"),
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
        return _twitchLogo!!
    }

private var _twitchLogo: ImageVector? = null
