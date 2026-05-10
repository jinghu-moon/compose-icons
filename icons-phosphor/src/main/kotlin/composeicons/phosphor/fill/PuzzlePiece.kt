package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PuzzlePiece: ImageVector
    get() {
        if (_puzzlePiece != null) return _puzzlePiece!!
        _puzzlePiece = phosphorFillIcon(
            name = "PuzzlePiece",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M165.78 224h42.22c8.837 0 16-7.163 16-16v-37.65c-.014-2.664-1.353-5.147-3.572-6.621-2.219-1.475-5.026-1.748-7.488-.729-2.835 1.171-5.873 1.772-8.94 1.77-13.23 0-24-11.1-24-24.73 0-13.63 10.77-24.73 24-24.73 3.067-.002 6.105 .599 8.94 1.77 2.475 1.025 5.298 .743 7.521-.751 2.223-1.494 3.552-4.001 3.539-6.679v-37.65c0-8.837-7.163-16-16-16h-36.22c.149-1.328 .222-2.664 .22-4C172 32.118 155.882 16 136 16c-19.882 0-36 16.118-36 36-.002 1.336 .071 2.672 .22 4h-36.22C55.163 56 48 63.163 48 72v32.22c-1.328-.149-2.664-.222-4-.22C24.118 104 8 120.118 8 140c0 19.882 16.118 36 36 36 1.336 .002 2.672-.071 4-.22v32.22c0 8.837 7.163 16 16 16h42.22"),
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
        return _puzzlePiece!!
    }

private var _puzzlePiece: ImageVector? = null
