package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FileCloud: ImageVector
    get() {
        if (_fileCloud != null) return _fileCloud!!
        _fileCloud = phosphorDuotoneIcon(
            name = "FileCloud",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 208.000 88.000 L 152.000 88.000 L 152.000 32.000 ZM 108.000 136.000 C 88.318 135.996 71.028 149.064 65.660 168.000 L 65.660 168.000 L 60.000 168.000 C 44.536 168.000 32.000 180.536 32.000 196.000 C 32.000 211.464 44.536 224.000 60.000 224.000 L 108.000 224.000 C 132.301 224.000 152.000 204.301 152.000 180.000 C 152.000 155.699 132.301 136.000 108.000 136.000 Z"),
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
                pathData = parseSvgPathData("M 213.660 82.340 L 157.660 26.340 C 156.158 24.840 154.122 23.998 152.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 128.000 C 40.000 132.418 43.582 136.000 48.000 136.000 C 52.418 136.000 56.000 132.418 56.000 128.000 L 56.000 40.000 L 144.000 40.000 L 144.000 88.000 C 144.000 92.418 147.582 96.000 152.000 96.000 L 200.000 96.000 L 200.000 216.000 L 176.000 216.000 C 171.582 216.000 168.000 219.582 168.000 224.000 C 168.000 228.418 171.582 232.000 176.000 232.000 L 200.000 232.000 C 208.837 232.000 216.000 224.837 216.000 216.000 L 216.000 88.000 C 216.002 85.878 215.160 83.842 213.660 82.340 ZM 160.000 51.310 L 188.690 80.000 L 160.000 80.000 ZM 108.000 128.000 C 87.008 128.000 68.074 140.622 60.000 160.000 C 40.118 160.000 24.000 176.118 24.000 196.000 C 24.000 215.882 40.118 232.000 60.000 232.000 L 108.000 232.000 C 136.719 232.000 160.000 208.719 160.000 180.000 C 160.000 151.281 136.719 128.000 108.000 128.000 ZM 108.000 216.000 L 60.000 216.000 C 49.683 216.017 41.046 208.183 40.059 197.914 C 39.072 187.644 46.059 178.309 56.190 176.360 C 56.091 180.778 59.592 184.441 64.010 184.540 C 68.428 184.639 72.091 181.138 72.190 176.720 C 72.377 174.665 72.732 172.628 73.250 170.630 C 73.363 170.303 73.453 169.969 73.520 169.630 C 78.856 151.890 96.785 141.096 114.961 144.680 C 133.136 148.265 145.623 165.059 143.824 183.497 C 142.024 201.935 126.526 215.997 108.000 216.000 Z"),
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
        return _fileCloud!!
    }

private var _fileCloud: ImageVector? = null
