package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SpeakerSimpleSlash: ImageVector
    get() {
        if (_speakerSimpleSlash != null) return _speakerSimpleSlash!!
        _speakerSimpleSlash = phosphorDuotoneIcon(
            name = "SpeakerSimpleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 160.000 32.000 L 160.000 224.000 L 88.000 168.000 L 40.000 168.000 C 35.582 168.000 32.000 164.418 32.000 160.000 L 32.000 96.000 C 32.000 91.582 35.582 88.000 40.000 88.000 L 88.000 88.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 192.000 152.000 L 192.000 104.000 C 192.000 99.582 195.582 96.000 200.000 96.000 C 204.418 96.000 208.000 99.582 208.000 104.000 L 208.000 152.000 C 208.000 156.418 204.418 160.000 200.000 160.000 C 195.582 160.000 192.000 156.418 192.000 152.000 ZM 232.000 80.000 C 227.582 80.000 224.000 83.582 224.000 88.000 L 224.000 168.000 C 224.000 172.418 227.582 176.000 232.000 176.000 C 236.418 176.000 240.000 172.418 240.000 168.000 L 240.000 88.000 C 240.000 83.582 236.418 80.000 232.000 80.000 ZM 221.920 210.620 C 223.883 212.729 224.561 215.730 223.694 218.478 C 222.827 221.225 220.550 223.294 217.733 223.895 C 214.915 224.496 211.992 223.535 210.080 221.380 L 168.000 175.090 L 168.000 224.000 C 167.998 227.054 166.257 229.840 163.513 231.181 C 160.769 232.523 157.501 232.184 155.090 230.310 L 85.250 176.000 L 40.000 176.000 C 31.163 176.000 24.000 168.837 24.000 160.000 L 24.000 96.000 C 24.000 87.163 31.163 80.000 40.000 80.000 L 81.550 80.000 L 50.080 45.380 C 47.173 42.103 47.442 37.097 50.684 34.151 C 53.926 31.204 58.935 31.413 61.920 34.620 ZM 152.000 157.490 L 96.100 96.000 L 40.000 96.000 L 40.000 160.000 L 88.000 160.000 C 89.780 159.997 91.509 160.592 92.910 161.690 L 152.000 207.640 ZM 125.060 69.310 L 152.000 48.310 L 152.000 106.780 C 152.000 111.198 155.582 114.780 160.000 114.780 C 164.418 114.780 168.000 111.198 168.000 106.780 L 168.000 32.000 C 167.998 28.946 166.257 26.160 163.513 24.819 C 160.769 23.477 157.501 23.816 155.090 25.690 L 115.240 56.690 C 111.825 59.423 111.238 64.393 113.923 67.846 C 116.608 71.300 121.569 71.956 125.060 69.320 Z"),
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
        return _speakerSimpleSlash!!
    }

private var _speakerSimpleSlash: ImageVector? = null
