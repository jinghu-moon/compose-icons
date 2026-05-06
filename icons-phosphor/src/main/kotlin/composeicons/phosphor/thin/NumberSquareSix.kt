package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberSquareSix: ImageVector
    get() {
        if (_numberSquareSix != null) return _numberSquareSix!!
        _numberSquareSix = phosphorThinIcon(
            name = "NumberSquareSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 36h-160C41.373 36 36 41.373 36 48v160c0 6.627 5.373 12 12 12h160c6.627 0 12-5.373 12-12v-160c0-6.627-5.373-12-12-12ZM212 208c0 2.209-1.791 4-4 4h-160c-2.209 0-4-1.791-4-4v-160c0-2.209 1.791-4 4-4h160c2.209 0 4 1.791 4 4ZM128 116c-3.309 .001-6.598 .514-9.75 1.52L139.43 82.05c1.013-1.884 .365-4.231-1.471-5.329-1.836-1.097-4.21-.556-5.389 1.229l-32.24 54c-7.268 12.536-5.205 28.39 5.028 38.649 10.233 10.259 26.083 12.361 38.637 5.125 12.554-7.236 18.678-22.005 14.93-36.002C155.176 125.725 142.49 115.994 128 116ZM128 172c-13.255 0-24-10.745-24-24 0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24Z"),
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
        return _numberSquareSix!!
    }

private var _numberSquareSix: ImageVector? = null
