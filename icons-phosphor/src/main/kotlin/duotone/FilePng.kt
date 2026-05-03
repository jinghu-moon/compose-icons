package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FilePng: ImageVector
    get() {
        if (_filePng != null) return _filePng!!
        _filePng = phosphorDuotoneIcon(
            name = "FilePng",
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
                pathData = parseSvgPathData("M 60.000 144.000 L 44.000 144.000 C 39.582 144.000 36.000 147.582 36.000 152.000 L 36.000 208.000 C 36.000 212.418 39.582 216.000 44.000 216.000 C 48.418 216.000 52.000 212.418 52.000 208.000 L 52.000 200.000 L 60.000 200.000 C 75.464 200.000 88.000 187.464 88.000 172.000 C 88.000 156.536 75.464 144.000 60.000 144.000 ZM 60.000 184.000 L 52.000 184.000 L 52.000 160.000 L 60.000 160.000 C 66.627 160.000 72.000 165.373 72.000 172.000 C 72.000 178.627 66.627 184.000 60.000 184.000 ZM 224.000 200.870 C 224.000 202.930 223.205 204.911 221.780 206.400 C 216.150 212.460 208.272 215.933 200.000 216.000 C 182.360 216.000 168.000 199.850 168.000 180.000 C 168.000 160.150 182.360 144.000 200.000 144.000 C 205.880 144.020 211.620 145.800 216.480 149.110 C 220.144 151.595 221.100 156.581 218.615 160.245 C 216.130 163.909 211.144 164.865 207.480 162.380 C 205.285 160.847 202.677 160.017 200.000 160.000 C 191.180 160.000 184.000 169.000 184.000 180.000 C 184.000 191.000 191.180 200.000 200.000 200.000 C 202.888 199.968 205.691 199.015 208.000 197.280 L 208.000 192.000 C 203.582 192.000 200.000 188.418 200.000 184.000 C 200.000 179.582 203.582 176.000 208.000 176.000 L 216.000 176.000 C 220.418 176.000 224.000 179.582 224.000 184.000 ZM 156.000 152.000 L 156.000 208.000 C 156.001 211.479 153.753 214.559 150.440 215.620 C 149.652 215.874 148.828 216.002 148.000 216.000 C 145.416 216.000 142.992 214.752 141.490 212.650 L 116.000 177.000 L 116.000 208.000 C 116.000 212.418 112.418 216.000 108.000 216.000 C 103.582 216.000 100.000 212.418 100.000 208.000 L 100.000 152.000 C 100.000 148.522 102.247 145.443 105.559 144.381 C 108.870 143.320 112.489 144.520 114.510 147.350 L 140.000 183.000 L 140.000 152.000 C 140.000 147.582 143.582 144.000 148.000 144.000 C 152.418 144.000 156.000 147.582 156.000 152.000 ZM 48.000 120.000 C 52.418 120.000 56.000 116.418 56.000 112.000 L 56.000 40.000 L 144.000 40.000 L 144.000 88.000 C 144.000 92.418 147.582 96.000 152.000 96.000 L 200.000 96.000 L 200.000 112.000 C 200.000 116.418 203.582 120.000 208.000 120.000 C 212.418 120.000 216.000 116.418 216.000 112.000 L 216.000 88.000 C 216.002 85.878 215.160 83.842 213.660 82.340 L 157.660 26.340 C 156.158 24.840 154.122 23.998 152.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 112.000 C 40.000 116.418 43.582 120.000 48.000 120.000 ZM 160.000 51.310 L 188.690 80.000 L 160.000 80.000 Z"),
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
        return _filePng!!
    }

private var _filePng: ImageVector? = null
