package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowLineDownRight: ImageVector
    get() {
        if (_arrowLineDownRight != null) return _arrowLineDownRight!!
        _arrowLineDownRight = phosphorFillIcon(
            name = "ArrowLineDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 40.000 C 224.000 44.418 220.418 48.000 216.000 48.000 L 40.000 48.000 C 35.582 48.000 32.000 44.418 32.000 40.000 C 32.000 35.582 35.582 32.000 40.000 32.000 L 216.000 32.000 C 220.418 32.000 224.000 35.582 224.000 40.000 ZM 195.060 96.610 C 192.071 95.370 188.629 96.053 186.340 98.340 L 144.000 140.690 L 85.660 82.340 C 82.534 79.214 77.466 79.214 74.340 82.340 C 71.214 85.466 71.214 90.534 74.340 93.660 L 132.690 152.000 L 90.340 194.340 C 88.049 196.628 87.364 200.071 88.603 203.062 C 89.842 206.053 92.762 208.003 96.000 208.000 L 192.000 208.000 C 196.418 208.000 200.000 204.418 200.000 200.000 L 200.000 104.000 C 199.999 100.764 198.050 97.848 195.060 96.610 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _arrowLineDownRight!!
    }

private var _arrowLineDownRight: ImageVector? = null
