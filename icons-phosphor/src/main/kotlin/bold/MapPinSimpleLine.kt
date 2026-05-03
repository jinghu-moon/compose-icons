package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MapPinSimpleLine: ImageVector
    get() {
        if (_mapPinSimpleLine != null) return _mapPinSimpleLine!!
        _mapPinSimpleLine = phosphorBoldIcon(
            name = "MapPinSimpleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 204.000 L 140.000 204.000 L 140.000 138.790 C 170.180 132.630 190.792 104.618 187.696 73.972 C 184.600 43.326 158.802 20.002 128.000 20.002 C 97.198 20.002 71.400 43.326 68.304 73.972 C 65.208 104.618 85.820 132.630 116.000 138.790 L 116.000 204.000 L 40.000 204.000 C 33.373 204.000 28.000 209.373 28.000 216.000 C 28.000 222.627 33.373 228.000 40.000 228.000 L 216.000 228.000 C 222.627 228.000 228.000 222.627 228.000 216.000 C 228.000 209.373 222.627 204.000 216.000 204.000 ZM 92.000 80.000 C 92.000 60.118 108.118 44.000 128.000 44.000 C 147.882 44.000 164.000 60.118 164.000 80.000 C 164.000 99.882 147.882 116.000 128.000 116.000 C 108.118 116.000 92.000 99.882 92.000 80.000 Z"),
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
