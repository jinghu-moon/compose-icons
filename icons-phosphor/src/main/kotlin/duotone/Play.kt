package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Play: ImageVector
    get() {
        if (_play != null) return _play!!
        _play = phosphorDuotoneIcon(
            name = "Play",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 228.230 134.690 L 84.150 222.810 C 81.703 224.296 78.648 224.360 76.140 222.979 C 73.632 221.598 72.053 218.983 72.000 216.120 L 72.000 39.880 C 72.053 37.017 73.632 34.402 76.140 33.021 C 78.648 31.640 81.703 31.704 84.150 33.190 L 228.230 121.310 C 230.571 122.727 232.001 125.264 232.001 128.000 C 232.001 130.736 230.571 133.273 228.230 134.690 Z"),
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
                pathData = parseSvgPathData("M 232.400 114.490 L 88.320 26.350 C 83.374 23.321 77.175 23.206 72.120 26.050 C 67.113 28.849 64.008 34.134 64.000 39.870 L 64.000 216.130 C 64.039 224.930 71.200 232.033 80.000 232.000 C 82.950 231.999 85.842 231.186 88.360 229.650 L 232.400 141.510 C 237.109 138.640 239.982 133.524 239.982 128.010 C 239.982 122.496 237.109 117.380 232.400 114.510 ZM 80.000 215.940 L 80.000 40.000 L 223.830 128.000 Z"),
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
        return _play!!
    }

private var _play: ImageVector? = null
