package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FourK: ImageVector
    get() {
        if (_fourK != null) return _fourK!!
        _fourK = phosphorRegularIcon(
            name = "FourK",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M24 48c0-4.418 3.582-8 8-8h192c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-192c-4.418 0-8-3.582-8-8ZM224 200h-192c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h192c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM144 72c-4.418 0-8 3.582-8 8v96c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-29l13.09-15 28 48c1.327 2.666 4.026 4.374 7.003 4.433 2.977 .059 5.741-1.541 7.173-4.152 1.432-2.611 1.295-5.802-.356-8.281L176.21 119.37 206 85.27c2.091-2.112 2.838-5.209 1.941-8.043-.897-2.833-3.291-4.936-6.216-5.46-2.925-.524-5.9 .617-7.725 2.963l-42 48v-42.73c0-4.418-3.582-8-8-8ZM88 176v-16h-48c-3.054-.002-5.84-1.743-7.181-4.487-1.341-2.744-1.003-6.012 .871-8.423l56-72c2.099-2.693 5.676-3.757 8.906-2.649 3.23 1.108 5.4 4.144 5.404 7.559v64h8c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-8v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM88 144v-40.68L56.36 144Z"),
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
        return _fourK!!
    }

private var _fourK: ImageVector? = null
