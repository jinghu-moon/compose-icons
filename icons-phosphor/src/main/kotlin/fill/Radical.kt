package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Radical: ImageVector
    get() {
        if (_radical != null) return _radical!!
        _radical = phosphorFillIcon(
            name = "Radical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 208.000 112.000 C 208.000 116.418 204.418 120.000 200.000 120.000 C 195.582 120.000 192.000 116.418 192.000 112.000 L 192.000 104.000 L 125.420 104.000 L 95.420 179.000 C 94.207 182.040 91.263 184.034 87.990 184.034 C 84.717 184.034 81.773 182.040 80.560 179.000 L 48.560 99.000 C 46.903 94.894 48.889 90.222 52.995 88.565 C 57.101 86.908 61.773 88.894 63.430 93.000 L 88.000 154.460 L 112.570 93.000 C 113.794 89.973 116.735 87.994 120.000 88.000 L 200.000 88.000 C 204.418 88.000 208.000 91.582 208.000 96.000 Z"),
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
        return _radical!!
    }

private var _radical: ImageVector? = null
