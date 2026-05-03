package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowArcRight: ImageVector
    get() {
        if (_arrowArcRight != null) return _arrowArcRight!!
        _arrowArcRight = phosphorBoldIcon(
            name = "ArrowArcRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 244.000 88.000 L 244.000 152.000 C 244.000 158.627 238.627 164.000 232.000 164.000 L 168.000 164.000 C 161.373 164.000 156.000 158.627 156.000 152.000 C 156.000 145.373 161.373 140.000 168.000 140.000 L 202.900 140.000 L 187.420 124.630 C 163.402 100.593 127.268 93.394 95.871 106.391 C 64.475 119.388 44.002 150.020 44.000 184.000 C 44.000 190.627 38.627 196.000 32.000 196.000 C 25.373 196.000 20.000 190.627 20.000 184.000 C 19.998 140.317 46.311 100.934 86.670 84.216 C 127.028 67.499 173.482 76.740 204.370 107.630 L 220.000 123.160 L 220.000 88.000 C 220.000 81.373 225.373 76.000 232.000 76.000 C 238.627 76.000 244.000 81.373 244.000 88.000 Z"),
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
        return _arrowArcRight!!
    }

private var _arrowArcRight: ImageVector? = null
