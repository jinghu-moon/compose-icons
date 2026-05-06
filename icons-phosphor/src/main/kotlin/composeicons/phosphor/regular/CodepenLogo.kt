package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CodepenLogo: ImageVector
    get() {
        if (_codepenLogo != null) return _codepenLogo!!
        _codepenLogo = phosphorRegularIcon(
            name = "CodepenLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.79 89l-104-56c-2.366-1.273-5.214-1.273-7.58 0l-104 56C17.631 90.387 16.017 93.072 16 96v64c-.002 2.946 1.616 5.654 4.21 7.05l104 56c2.366 1.273 5.214 1.273 7.58 0l104-56c2.594-1.396 4.212-4.104 4.21-7.05v-64c-.017-2.928-1.631-5.613-4.21-7ZM224 146.61 189.45 128 224 109.39ZM172.57 118.91 136 99.22v-45.83L215.13 96ZM128 142.91 100.3 128 128 113.09 155.7 128ZM120 53.39v45.83L83.43 118.91 40.87 96ZM32 109.39 66.55 128 32 146.61ZM83.43 137.09 120 156.78v45.83L40.87 160ZM136 202.61v-45.83l36.57-19.69L215.13 160Z"),
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
        return _codepenLogo!!
    }

private var _codepenLogo: ImageVector? = null
