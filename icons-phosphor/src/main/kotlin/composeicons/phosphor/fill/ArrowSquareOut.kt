package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowSquareOut: ImageVector
    get() {
        if (_arrowSquareOut != null) return _arrowSquareOut!!
        _arrowSquareOut = phosphorFillIcon(
            name = "ArrowSquareOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 136v72c0 8.837-7.163 16-16 16h-128c-8.837 0-16-7.163-16-16v-128C32 71.163 39.163 64 48 64h72c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-72v128h128v-72c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM224 40c0-4.418-3.582-8-8-8h-64c-3.238-.003-6.158 1.947-7.397 4.938-1.239 2.991-.554 6.434 1.737 8.722L172.69 72l-42.35 42.34c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0L184 83.31l26.34 26.35c2.288 2.291 5.731 2.976 8.722 1.737 2.991-1.239 4.94-4.159 4.938-7.397Z"),
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
        return _arrowSquareOut!!
    }

private var _arrowSquareOut: ImageVector? = null
