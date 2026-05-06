package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.OrangeSlice: ImageVector
    get() {
        if (_orangeSlice != null) return _orangeSlice!!
        _orangeSlice = phosphorFillIcon(
            name = "OrangeSlice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M51.18 145.51C38.71 128.932 31.978 108.744 32 88c0-1.41 0-2.81 .09-4.21 .112-2.127 1.87-3.793 4-3.79h70.91c1.619-.001 3.079 .973 3.698 2.469 .62 1.496 .277 3.217-.868 4.361ZM120 183.66v-84.35L61.83 157.49c15.826 15.12 36.357 24.357 58.17 26.17ZM204.82 145.51C217.29 128.932 224.022 108.744 224 88c0-1.41 0-2.81-.09-4.21-.112-2.127-1.87-3.793-4-3.79h-70.91c-1.619-.001-3.079 .973-3.698 2.469-.62 1.496-.277 3.217 .868 4.361ZM248 80h-4.08c-1.086-.001-2.125 .44-2.879 1.221-.754 .781-1.159 1.834-1.121 2.919 0 1.28 .07 2.57 .07 3.86-.581 61.44-50.552 110.942-111.995 110.942C66.552 198.942 16.581 149.44 16 88c0-1.29 0-2.58 .07-3.86 .038-1.085-.367-2.139-1.121-2.919C14.195 80.44 13.156 79.999 12.07 80h-4.07C3.582 80 0 83.582 0 88c0 70.692 57.308 128 128 128 70.692 0 128-57.308 128-128 0-4.418-3.582-8-8-8ZM136 99.31v84.35c21.813-1.813 42.344-11.05 58.17-26.17Z"),
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
        return _orangeSlice!!
    }

private var _orangeSlice: ImageVector? = null
