package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.RepeatOnce: ImageVector
    get() {
        if (_repeatOnce != null) return _repeatOnce!!
        _repeatOnce = phosphorRegularIcon(
            name = "RepeatOnce",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M24 128C24.044 88.254 56.254 56.044 96 56h108.69L194.34 45.66c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0l24 24c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66l-24 24c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32L204.69 72h-108.69C65.086 72.033 40.033 97.086 40 128c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM224 120c-4.418 0-8 3.582-8 8-.033 30.914-25.086 55.967-56 56h-108.69L61.66 173.66c3.126-3.126 3.126-8.194 0-11.32-3.126-3.126-8.194-3.126-11.32 0l-24 24c-1.502 1.501-2.346 3.537-2.346 5.66 0 2.123 .844 4.159 2.346 5.66l24 24c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32L51.31 200h108.69c39.746-.044 71.956-32.254 72-72 0-4.418-3.582-8-8-8ZM136 160c4.418 0 8-3.582 8-8v-48c.002-2.774-1.433-5.351-3.793-6.81-2.359-1.459-5.306-1.591-7.787-.35l-16 8c-3.952 1.977-5.552 6.783-3.575 10.735 1.977 3.952 6.783 5.552 10.735 3.575L128 116.94v35.06c0 4.418 3.582 8 8 8Z"),
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
