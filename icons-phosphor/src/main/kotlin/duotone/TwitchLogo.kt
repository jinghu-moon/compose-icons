package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TwitchLogo: ImageVector
    get() {
        if (_twitchLogo != null) return _twitchLogo!!
        _twitchLogo = phosphorDuotoneIcon(
            name = "TwitchLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 216.000 48.000 L 216.000 156.250 C 216.001 158.626 214.946 160.879 213.120 162.400 L 170.230 198.150 C 168.787 199.345 166.973 199.999 165.100 200.000 L 120.000 200.000 L 72.000 240.000 L 72.000 200.000 L 48.000 200.000 C 43.582 200.000 40.000 196.418 40.000 192.000 L 40.000 48.000 C 40.000 43.582 43.582 40.000 48.000 40.000 L 208.000 40.000 C 212.418 40.000 216.000 43.582 216.000 48.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 192.000 C 32.000 200.837 39.163 208.000 48.000 208.000 L 64.000 208.000 L 64.000 240.000 C 63.999 243.104 65.794 245.929 68.605 247.247 C 71.415 248.564 74.735 248.137 77.120 246.150 L 122.900 208.000 L 165.100 208.000 C 168.846 208.001 172.473 206.688 175.350 204.290 L 218.240 168.540 C 221.896 165.507 224.009 161.001 224.000 156.250 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 208.000 156.250 L 165.100 192.000 L 120.000 192.000 C 118.130 191.999 116.318 192.654 114.880 193.850 L 80.000 222.920 L 80.000 200.000 C 80.000 195.582 76.418 192.000 72.000 192.000 L 48.000 192.000 L 48.000 48.000 L 208.000 48.000 ZM 160.000 136.000 L 160.000 88.000 C 160.000 83.582 163.582 80.000 168.000 80.000 C 172.418 80.000 176.000 83.582 176.000 88.000 L 176.000 136.000 C 176.000 140.418 172.418 144.000 168.000 144.000 C 163.582 144.000 160.000 140.418 160.000 136.000 ZM 112.000 136.000 L 112.000 88.000 C 112.000 83.582 115.582 80.000 120.000 80.000 C 124.418 80.000 128.000 83.582 128.000 88.000 L 128.000 136.000 C 128.000 140.418 124.418 144.000 120.000 144.000 C 115.582 144.000 112.000 140.418 112.000 136.000 Z"),
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
