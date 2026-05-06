package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UploadSimple: ImageVector
    get() {
        if (_uploadSimple != null) return _uploadSimple!!
        _uploadSimple = phosphorFillIcon(
            name = "UploadSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 144v64c0 4.418-3.582 8-8 8h-176c-4.418 0-8-3.582-8-8v-64c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v56h160v-56c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM88 80h32v64c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-64h32c3.238 .003 6.158-1.947 7.397-4.938 1.239-2.991 .554-6.434-1.737-8.722l-40-40C132.159 24.838 130.123 23.994 128 23.994c-2.123 0-4.159 .844-5.66 2.346l-40 40c-2.291 2.288-2.976 5.731-1.737 8.722C81.842 78.053 84.762 80.003 88 80Z"),
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
        return _uploadSimple!!
    }

private var _uploadSimple: ImageVector? = null
