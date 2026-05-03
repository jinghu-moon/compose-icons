package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FileCpp: ImageVector
    get() {
        if (_fileCpp != null) return _fileCpp!!
        _fileCpp = phosphorDuotoneIcon(
            name = "FileCpp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 208.000 88.000 L 152.000 88.000 L 152.000 32.000 Z"),
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
                pathData = parseSvgPathData("M 48.000 180.000 C 48.000 191.000 55.180 200.000 64.000 200.000 C 67.903 199.920 71.600 198.234 74.220 195.340 C 77.287 192.216 82.296 192.138 85.459 195.164 C 88.622 198.191 88.765 203.198 85.780 206.400 C 80.150 212.460 72.272 215.933 64.000 216.000 C 46.350 216.000 32.000 199.850 32.000 180.000 C 32.000 160.150 46.350 144.000 64.000 144.000 C 72.272 144.067 80.150 147.540 85.780 153.600 C 88.765 156.802 88.622 161.809 85.459 164.836 C 82.296 167.862 77.287 167.784 74.220 164.660 C 71.600 161.766 67.903 160.080 64.000 160.000 C 55.180 160.000 48.000 169.000 48.000 180.000 ZM 40.000 112.000 L 40.000 40.000 C 40.000 31.163 47.163 24.000 56.000 24.000 L 152.000 24.000 C 154.122 23.998 156.158 24.840 157.660 26.340 L 213.660 82.340 C 215.160 83.842 216.002 85.878 216.000 88.000 L 216.000 112.000 C 216.000 116.418 212.418 120.000 208.000 120.000 C 203.582 120.000 200.000 116.418 200.000 112.000 L 200.000 96.000 L 152.000 96.000 C 147.582 96.000 144.000 92.418 144.000 88.000 L 144.000 40.000 L 56.000 40.000 L 56.000 112.000 C 56.000 116.418 52.418 120.000 48.000 120.000 C 43.582 120.000 40.000 116.418 40.000 112.000 ZM 160.000 80.000 L 188.690 80.000 L 160.000 51.310 ZM 148.000 172.000 L 136.000 172.000 L 136.000 160.000 C 136.000 155.582 132.418 152.000 128.000 152.000 C 123.582 152.000 120.000 155.582 120.000 160.000 L 120.000 172.000 L 108.000 172.000 C 103.582 172.000 100.000 175.582 100.000 180.000 C 100.000 184.418 103.582 188.000 108.000 188.000 L 120.000 188.000 L 120.000 200.000 C 120.000 204.418 123.582 208.000 128.000 208.000 C 132.418 208.000 136.000 204.418 136.000 200.000 L 136.000 188.000 L 148.000 188.000 C 152.418 188.000 156.000 184.418 156.000 180.000 C 156.000 175.582 152.418 172.000 148.000 172.000 ZM 216.000 172.000 L 204.000 172.000 L 204.000 160.000 C 204.000 155.582 200.418 152.000 196.000 152.000 C 191.582 152.000 188.000 155.582 188.000 160.000 L 188.000 172.000 L 176.000 172.000 C 171.582 172.000 168.000 175.582 168.000 180.000 C 168.000 184.418 171.582 188.000 176.000 188.000 L 188.000 188.000 L 188.000 200.000 C 188.000 204.418 191.582 208.000 196.000 208.000 C 200.418 208.000 204.000 204.418 204.000 200.000 L 204.000 188.000 L 216.000 188.000 C 220.418 188.000 224.000 184.418 224.000 180.000 C 224.000 175.582 220.418 172.000 216.000 172.000 Z"),
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
        return _fileCpp!!
    }

private var _fileCpp: ImageVector? = null
