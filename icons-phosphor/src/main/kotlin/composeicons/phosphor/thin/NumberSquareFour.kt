package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberSquareFour: ImageVector
    get() {
        if (_numberSquareFour != null) return _numberSquareFour!!
        _numberSquareFour = phosphorThinIcon(
            name = "NumberSquareFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 36h-160C41.373 36 36 41.373 36 48v160c0 6.627 5.373 12 12 12h160c6.627 0 12-5.373 12-12v-160c0-6.627-5.373-12-12-12ZM212 208c0 2.209-1.791 4-4 4h-160c-2.209 0-4-1.791-4-4v-160c0-2.209 1.791-4 4-4h160c2.209 0 4 1.791 4 4ZM160 148h-12v-68c.003-1.711-1.082-3.235-2.7-3.791-1.618-.556-3.411-.021-4.46 1.331l-56 72c-.941 1.206-1.111 2.843-.439 4.218 .672 1.374 2.069 2.245 3.599 2.242h52v20c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-20h12c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM140 148h-43.82L140 91.66Z"),
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
        return _numberSquareFour!!
    }

private var _numberSquareFour: ImageVector? = null
