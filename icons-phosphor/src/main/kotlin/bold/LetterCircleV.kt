package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LetterCircleV: ImageVector
    get() {
        if (_letterCircleV != null) return _letterCircleV!!
        _letterCircleV = phosphorBoldIcon(
            name = "LetterCircleV",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 211.950 174.371 174.371 211.950 128.000 212.000 ZM 171.140 100.460 L 139.140 180.460 C 137.317 185.014 132.905 187.999 128.000 187.999 C 123.095 187.999 118.683 185.014 116.860 180.460 L 84.860 100.460 C 83.227 96.472 83.858 91.914 86.513 88.520 C 89.168 85.125 93.440 83.415 97.704 84.040 C 101.968 84.664 105.570 87.527 107.140 91.540 L 128.000 143.690 L 148.860 91.540 C 151.357 85.441 158.307 82.497 164.425 84.947 C 170.544 87.396 173.542 94.322 171.140 100.460 Z"),
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
        return _letterCircleV!!
    }

private var _letterCircleV: ImageVector? = null
