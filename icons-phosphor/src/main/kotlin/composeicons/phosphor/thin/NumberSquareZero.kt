package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberSquareZero: ImageVector
    get() {
        if (_numberSquareZero != null) return _numberSquareZero!!
        _numberSquareZero = phosphorThinIcon(
            name = "NumberSquareZero",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 76c-12.82 0-23.41 5.81-30.62 16.81C91.33 102 88 114.52 88 128c0 13.48 3.33 26 9.38 35.2 7.21 11 17.8 16.8 30.62 16.8 12.82 0 23.41-5.81 30.62-16.8 6-9.22 9.38-21.72 9.38-35.2 0-13.48-3.33-26-9.38-35.19C151.41 81.81 140.82 76 128 76ZM128 172C105.89 172 96 149.9 96 128c0-21.9 9.89-44 32-44 22.11 0 32 22.1 32 44 0 21.9-9.89 44-32 44ZM208 36h-160C41.373 36 36 41.373 36 48v160c0 6.627 5.373 12 12 12h160c6.627 0 12-5.373 12-12v-160c0-6.627-5.373-12-12-12ZM212 208c0 2.209-1.791 4-4 4h-160c-2.209 0-4-1.791-4-4v-160c0-2.209 1.791-4 4-4h160c2.209 0 4 1.791 4 4Z"),
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
        return _numberSquareZero!!
    }

private var _numberSquareZero: ImageVector? = null
