package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CodepenLogo: ImageVector
    get() {
        if (_codepenLogo != null) return _codepenLogo!!
        _codepenLogo = phosphorFillIcon(
            name = "CodepenLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.79 89l-104-56c-2.366-1.273-5.214-1.273-7.58 0l-104 56C17.631 90.387 16.017 93.072 16 96v64c.017 2.928 1.631 5.613 4.21 7l93.89 50.6c1.24 .669 2.74 .637 3.949-.085 1.21-.722 1.951-2.027 1.951-3.435v-57.3L66.55 128 32 146.61v-37.22L66.55 128l16.88-9.09L40.87 96 120 53.39v45.83L83.43 118.91l44.57 24 44.57-24L189.45 128 224 109.39v37.22L189.45 128 136 156.78v57.3c-0 1.409 .741 2.713 1.951 3.435 1.21 .722 2.71 .754 3.949 .085L235.79 167c2.579-1.387 4.193-4.072 4.21-7v-64c-.017-2.928-1.631-5.613-4.21-7ZM172.57 119 136 99.22v-45.83L215.13 96Z"),
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
