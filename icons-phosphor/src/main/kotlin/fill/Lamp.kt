package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Lamp: ImageVector
    get() {
        if (_lamp != null) return _lamp!!
        _lamp = phosphorFillIcon(
            name = "Lamp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 246.680 156.400 C 245.200 158.647 242.690 160.000 240.000 160.000 L 208.000 160.000 L 208.000 192.000 C 208.000 196.418 204.418 200.000 200.000 200.000 C 195.582 200.000 192.000 196.418 192.000 192.000 L 192.000 160.000 L 136.000 160.000 L 136.000 208.000 L 160.000 208.000 C 164.418 208.000 168.000 211.582 168.000 216.000 C 168.000 220.418 164.418 224.000 160.000 224.000 L 96.000 224.000 C 91.582 224.000 88.000 220.418 88.000 216.000 C 88.000 211.582 91.582 208.000 96.000 208.000 L 120.000 208.000 L 120.000 160.000 L 16.000 160.000 C 13.312 159.999 10.804 158.647 9.324 156.403 C 7.845 154.159 7.592 151.321 8.650 148.850 L 56.650 36.850 C 57.910 33.909 60.801 32.001 64.000 32.000 L 192.000 32.000 C 195.199 32.001 198.090 33.909 199.350 36.850 L 247.350 148.850 C 248.409 151.319 248.157 154.156 246.680 156.400 Z"),
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
        return _lamp!!
    }

private var _lamp: ImageVector? = null
