package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberSquareFive: ImageVector
    get() {
        if (_numberSquareFive != null) return _numberSquareFive!!
        _numberSquareFive = phosphorThinIcon(
            name = "NumberSquareFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 36h-160C41.373 36 36 41.373 36 48v160c0 6.627 5.373 12 12 12h160c6.627 0 12-5.373 12-12v-160c0-6.627-5.373-12-12-12ZM212 208c0 2.209-1.791 4-4 4h-160c-2.209 0-4-1.791-4-4v-160c0-2.209 1.791-4 4-4h160c2.209 0 4 1.791 4 4ZM115.39 84l-5.87 35.21c4.524-2.146 9.473-3.244 14.48-3.21 17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32-8.551 .151-16.798-3.168-22.86-9.2-1.546-1.58-1.52-4.114 .06-5.66 1.58-1.546 4.114-1.52 5.66 .06 4.559 4.49 10.742 6.943 17.14 6.8 13.255 0 24-10.745 24-24 0-13.255-10.745-24-24-24-6.398-.143-12.581 2.31-17.14 6.8-1.221 1.255-3.117 1.57-4.678 .776-1.561-.793-2.425-2.51-2.132-4.236l8-48c.323-1.929 1.994-3.342 3.95-3.34h40c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4Z"),
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
        return _numberSquareFive!!
    }

private var _numberSquareFive: ImageVector? = null
