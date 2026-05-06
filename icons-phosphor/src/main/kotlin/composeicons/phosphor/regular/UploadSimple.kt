package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.UploadSimple: ImageVector
    get() {
        if (_uploadSimple != null) return _uploadSimple!!
        _uploadSimple = phosphorRegularIcon(
            name = "UploadSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 144v64c0 4.418-3.582 8-8 8h-176c-4.418 0-8-3.582-8-8v-64c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v56h160v-56c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM93.66 77.66 120 51.31v92.69c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-92.69l26.34 26.35c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32l-40-40C132.159 24.838 130.123 23.994 128 23.994c-2.123 0-4.159 .844-5.66 2.346l-40 40c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0Z"),
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
