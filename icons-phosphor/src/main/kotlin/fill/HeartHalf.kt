package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HeartHalf: ImageVector
    get() {
        if (_heartHalf != null) return _heartHalf!!
        _heartHalf = phosphorFillIcon(
            name = "HeartHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 178.000 40.000 C 157.350 40.000 139.270 48.880 128.000 63.890 C 116.730 48.880 98.650 40.000 78.000 40.000 C 43.774 40.039 16.039 67.774 16.000 102.000 C 16.000 172.000 119.790 228.670 124.210 231.000 C 126.576 232.273 129.424 232.273 131.790 231.000 C 136.210 228.670 240.000 172.000 240.000 102.000 C 239.961 67.774 212.226 40.039 178.000 40.000 ZM 128.000 214.800 L 128.000 104.000 C 128.006 79.965 145.789 59.640 169.610 56.440 C 172.398 56.153 175.198 56.006 178.000 56.000 C 203.391 56.033 223.967 76.609 224.000 102.000 C 224.000 155.610 146.250 204.150 128.000 214.800 Z"),
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
        return _heartHalf!!
    }

private var _heartHalf: ImageVector? = null
