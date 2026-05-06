package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.VideoCamera: ImageVector
    get() {
        if (_videoCamera != null) return _videoCamera!!
        _videoCamera = phosphorFillIcon(
            name = "VideoCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 72v112c0 8.837-7.163 16-16 16h-144c-8.837 0-16-7.163-16-16v-112C16 63.163 23.163 56 32 56h144c8.837 0 16 7.163 16 16ZM250 72.25c-2.283-.559-4.696-.115-6.63 1.22L209.78 95.86c-1.113 .742-1.781 1.992-1.78 3.33v57.62c-.001 1.338 .667 2.588 1.78 3.33l33.78 22.52c2.581 1.722 5.925 1.796 8.58 .19 2.447-1.555 3.909-4.271 3.86-7.17v-95.68c.002-3.649-2.466-6.838-6-7.75Z"),
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
        return _videoCamera!!
    }

private var _videoCamera: ImageVector? = null
