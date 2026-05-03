package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TiktokLogo: ImageVector
    get() {
        if (_tiktokLogo != null) return _tiktokLogo!!
        _tiktokLogo = phosphorFillIcon(
            name = "TiktokLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 80.000 L 232.000 120.000 C 232.000 124.418 228.418 128.000 224.000 128.000 C 207.288 128.039 190.817 124.020 176.000 116.290 L 176.000 156.000 C 176.000 197.974 141.974 232.000 100.000 232.000 C 58.026 232.000 24.000 197.974 24.000 156.000 C 24.000 119.100 50.910 86.480 86.600 80.120 C 88.931 79.706 91.325 80.345 93.139 81.866 C 94.954 83.387 96.001 85.633 96.000 88.000 L 96.000 130.690 C 96.001 133.780 94.222 136.595 91.430 137.920 C 82.477 142.166 77.983 152.327 80.864 161.807 C 83.746 171.287 93.134 177.229 102.935 175.774 C 112.737 174.320 119.995 165.908 120.000 156.000 L 120.000 24.000 C 120.000 19.582 123.582 16.000 128.000 16.000 L 168.000 16.000 C 172.418 16.000 176.000 19.582 176.000 24.000 C 176.028 50.498 197.502 71.972 224.000 72.000 C 228.418 72.000 232.000 75.582 232.000 80.000 Z"),
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
        return _tiktokLogo!!
    }

private var _tiktokLogo: ImageVector? = null
