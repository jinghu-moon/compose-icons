package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Upload: ImageVector
    get() {
        if (_upload != null) return _upload!!
        _upload = phosphorBoldIcon(
            name = "Upload",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M188 184c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM224 116h-44c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h40v56h-184v-56h40c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-44c-11.046 0-20 8.954-20 20v64c0 11.046 8.954 20 20 20h192c11.046 0 20-8.954 20-20v-64c0-11.046-8.954-20-20-20ZM88.49 80.49 116 53v75c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-75l27.51 27.52c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17l-48-48c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529l-48 48c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0Z"),
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
        return _upload!!
    }

private var _upload: ImageVector? = null
