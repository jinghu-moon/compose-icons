package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TwitchLogo: ImageVector
    get() {
        if (_twitchLogo != null) return _twitchLogo!!
        _twitchLogo = phosphorBoldIcon(
            name = "TwitchLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 28.000 L 48.000 28.000 C 36.954 28.000 28.000 36.954 28.000 48.000 L 28.000 192.000 C 28.000 203.046 36.954 212.000 48.000 212.000 L 60.000 212.000 L 60.000 240.000 C 60.000 244.656 62.693 248.891 66.909 250.866 C 71.125 252.841 76.103 252.200 79.680 249.220 L 124.340 212.000 L 165.100 212.000 C 169.781 211.995 174.312 210.354 177.910 207.360 L 220.800 171.620 C 225.371 167.826 228.011 162.190 228.000 156.250 L 228.000 48.000 C 228.000 36.954 219.046 28.000 208.000 28.000 ZM 204.000 154.380 L 163.660 188.000 L 120.000 188.000 C 117.194 188.000 114.476 188.984 112.320 190.780 L 84.000 214.380 L 84.000 200.000 C 84.000 193.373 78.627 188.000 72.000 188.000 L 52.000 188.000 L 52.000 52.000 L 204.000 52.000 ZM 156.000 136.000 L 156.000 88.000 C 156.000 81.373 161.373 76.000 168.000 76.000 C 174.627 76.000 180.000 81.373 180.000 88.000 L 180.000 136.000 C 180.000 142.627 174.627 148.000 168.000 148.000 C 161.373 148.000 156.000 142.627 156.000 136.000 ZM 108.000 136.000 L 108.000 88.000 C 108.000 81.373 113.373 76.000 120.000 76.000 C 126.627 76.000 132.000 81.373 132.000 88.000 L 132.000 136.000 C 132.000 142.627 126.627 148.000 120.000 148.000 C 113.373 148.000 108.000 142.627 108.000 136.000 Z"),
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
        return _twitchLogo!!
    }

private var _twitchLogo: ImageVector? = null
