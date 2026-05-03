package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MapPinSimpleLine: ImageVector
    get() {
        if (_mapPinSimpleLine != null) return _mapPinSimpleLine!!
        _mapPinSimpleLine = phosphorFillIcon(
            name = "MapPinSimpleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 216.000 C 224.000 220.418 220.418 224.000 216.000 224.000 L 40.000 224.000 C 35.582 224.000 32.000 220.418 32.000 216.000 C 32.000 211.582 35.582 208.000 40.000 208.000 L 120.000 208.000 L 120.000 135.420 C 90.929 131.224 70.040 105.281 72.144 75.984 C 74.247 46.688 98.628 23.994 128.000 23.994 C 157.372 23.994 181.753 46.688 183.856 75.984 C 185.960 105.281 165.071 131.224 136.000 135.420 L 136.000 208.000 L 216.000 208.000 C 220.418 208.000 224.000 211.582 224.000 216.000 Z"),
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
        return _mapPinSimpleLine!!
    }

private var _mapPinSimpleLine: ImageVector? = null
