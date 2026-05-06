package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.UploadSimple: ImageVector
    get() {
        if (_uploadSimple != null) return _uploadSimple!!
        _uploadSimple = phosphorBoldIcon(
            name = "UploadSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 144v64c0 6.627-5.373 12-12 12h-176c-6.627 0-12-5.373-12-12v-64c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v52h152v-52c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM96.49 80.49 116 61v83c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-83l19.51 19.52c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17l-40-40c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529l-40 40c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0Z"),
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
