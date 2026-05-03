package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FileJpg: ImageVector
    get() {
        if (_fileJpg != null) return _fileJpg!!
        _fileJpg = phosphorDuotoneIcon(
            name = "FileJpg",
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
                pathData = parseSvgPathData("M 120.000 144.000 L 104.000 144.000 C 99.582 144.000 96.000 147.582 96.000 152.000 L 96.000 208.000 C 96.000 212.418 99.582 216.000 104.000 216.000 C 108.418 216.000 112.000 212.418 112.000 208.000 L 112.000 200.000 L 120.000 200.000 C 135.464 200.000 148.000 187.464 148.000 172.000 C 148.000 156.536 135.464 144.000 120.000 144.000 ZM 120.000 184.000 L 112.000 184.000 L 112.000 160.000 L 120.000 160.000 C 126.627 160.000 132.000 165.373 132.000 172.000 C 132.000 178.627 126.627 184.000 120.000 184.000 ZM 216.000 184.000 L 216.000 200.870 C 216.000 202.930 215.205 204.911 213.780 206.400 C 208.150 212.460 200.272 215.933 192.000 216.000 C 174.360 216.000 160.000 199.850 160.000 180.000 C 160.000 160.150 174.360 144.000 192.000 144.000 C 197.882 144.018 203.623 145.802 208.480 149.120 C 212.142 151.605 213.095 156.588 210.610 160.250 C 208.125 163.912 203.142 164.865 199.480 162.380 C 197.285 160.847 194.677 160.017 192.000 160.000 C 183.180 160.000 176.000 169.000 176.000 180.000 C 176.000 191.000 183.180 200.000 192.000 200.000 C 194.886 199.967 197.688 199.018 200.000 197.290 L 200.000 192.000 C 195.582 192.000 192.000 188.418 192.000 184.000 C 192.000 179.582 195.582 176.000 200.000 176.000 L 208.000 176.000 C 212.418 176.000 216.000 179.582 216.000 184.000 ZM 80.000 152.000 L 80.000 190.000 C 80.000 204.359 68.359 216.000 54.000 216.000 C 39.641 216.000 28.000 204.359 28.000 190.000 C 28.000 185.582 31.582 182.000 36.000 182.000 C 40.418 182.000 44.000 185.582 44.000 190.000 C 44.000 195.523 48.477 200.000 54.000 200.000 C 59.523 200.000 64.000 195.523 64.000 190.000 L 64.000 152.000 C 64.000 147.582 67.582 144.000 72.000 144.000 C 76.418 144.000 80.000 147.582 80.000 152.000 ZM 213.660 82.340 L 157.660 26.340 C 156.158 24.840 154.122 23.998 152.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 112.000 C 40.000 116.418 43.582 120.000 48.000 120.000 C 52.418 120.000 56.000 116.418 56.000 112.000 L 56.000 40.000 L 144.000 40.000 L 144.000 88.000 C 144.000 92.418 147.582 96.000 152.000 96.000 L 200.000 96.000 L 200.000 112.000 C 200.000 116.418 203.582 120.000 208.000 120.000 C 212.418 120.000 216.000 116.418 216.000 112.000 L 216.000 88.000 C 216.002 85.878 215.160 83.842 213.660 82.340 ZM 160.000 80.000 L 160.000 51.310 L 188.690 80.000 Z"),
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
        return _fileJpg!!
    }

private var _fileJpg: ImageVector? = null
