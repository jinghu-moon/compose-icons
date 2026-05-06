package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberSquareFour: ImageVector
    get() {
        if (_numberSquareFour != null) return _numberSquareFour!!
        _numberSquareFour = phosphorBoldIcon(
            name = "NumberSquareFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 28h-160C36.954 28 28 36.954 28 48v160c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20v-160C228 36.954 219.046 28 208 28ZM204 204h-152v-152h152ZM88 164h44v12c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-12h4c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-4v-60c-0-5.126-3.256-9.686-8.104-11.35-4.848-1.664-10.218-.065-13.366 3.98l-56 72c-2.815 3.617-3.324 8.523-1.31 12.641 2.013 4.118 6.197 6.729 10.78 6.729ZM132 115v25h-19.46Z"),
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
