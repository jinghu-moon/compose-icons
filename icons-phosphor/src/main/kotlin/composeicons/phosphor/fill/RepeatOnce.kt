package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.RepeatOnce: ImageVector
    get() {
        if (_repeatOnce != null) return _repeatOnce!!
        _repeatOnce = phosphorFillIcon(
            name = "RepeatOnce",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M24 128C24.044 88.254 56.254 56.044 96 56h96v-16c-.003-3.238 1.947-6.158 4.938-7.397 2.991-1.239 6.434-.554 8.722 1.737l24 24c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66l-24 24c-2.288 2.291-5.731 2.976-8.722 1.737C193.947 94.158 191.997 91.238 192 88v-16h-96C65.086 72.033 40.033 97.086 40 128c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM224 120c-4.418 0-8 3.582-8 8-.033 30.914-25.086 55.967-56 56h-96v-16c.003-3.238-1.947-6.158-4.938-7.397-2.991-1.239-6.434-.554-8.722 1.737l-24 24c-1.502 1.501-2.346 3.537-2.346 5.66 0 2.123 .844 4.159 2.346 5.66l24 24c2.288 2.291 5.731 2.976 8.722 1.737C62.053 222.158 64.003 219.238 64 216v-16h96c39.746-.044 71.956-32.254 72-72 0-4.418-3.582-8-8-8ZM136 160c4.418 0 8-3.582 8-8v-48c.002-2.774-1.433-5.351-3.793-6.81-2.359-1.459-5.306-1.591-7.787-.35l-16 8c-3.952 1.977-5.552 6.783-3.575 10.735 1.977 3.952 6.783 5.552 10.735 3.575L128 116.94v35.06c0 4.418 3.582 8 8 8Z"),
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
        return _repeatOnce!!
    }

private var _repeatOnce: ImageVector? = null
