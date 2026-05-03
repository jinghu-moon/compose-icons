package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChatTeardropSlash: ImageVector
    get() {
        if (_chatTeardropSlash != null) return _chatTeardropSlash!!
        _chatTeardropSlash = phosphorFillIcon(
            name = "ChatTeardropSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 213.920 210.620 C 215.883 212.729 216.561 215.730 215.694 218.478 C 214.827 221.225 212.550 223.294 209.733 223.895 C 206.915 224.496 203.992 223.535 202.080 221.380 L 188.510 206.460 C 171.891 217.908 152.180 224.025 132.000 224.000 L 48.000 224.000 C 39.163 224.000 32.000 216.837 32.000 208.000 L 32.000 124.000 C 31.978 100.564 40.225 77.872 55.290 59.920 L 42.080 45.380 C 40.625 43.779 39.880 41.657 40.016 39.498 C 40.152 37.338 41.156 35.326 42.800 33.920 C 46.224 31.146 51.226 31.565 54.140 34.870 ZM 208.350 180.710 C 209.168 181.611 210.352 182.090 211.566 182.012 C 212.781 181.934 213.893 181.308 214.590 180.310 C 240.581 142.082 236.983 91.022 205.887 56.817 C 174.792 22.612 124.304 14.179 83.780 36.420 C 82.717 37.017 81.984 38.066 81.790 39.269 C 81.595 40.472 81.960 41.698 82.780 42.600 Z"),
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
        return _chatTeardropSlash!!
    }

private var _chatTeardropSlash: ImageVector? = null
