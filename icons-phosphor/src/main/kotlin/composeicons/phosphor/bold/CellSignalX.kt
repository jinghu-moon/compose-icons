package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CellSignalX: ImageVector
    get() {
        if (_cellSignalX != null) return _cellSignalX!!
        _cellSignalX = phosphorBoldIcon(
            name = "CellSignalX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216.49 191.51c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0L184 193l-15.51 15.52c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L167 176 151.48 160.49c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L184 159l15.51-15.52c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17L201 176ZM160 120c6.627 0 12-5.373 12-12v-36c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v36c0 6.627 5.373 12 12 12ZM200 120c6.627 0 12-5.373 12-12v-76c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v76c0 6.627 5.373 12 12 12ZM120 100c-6.627 0-12 5.373-12 12v88c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-88c0-6.627-5.373-12-12-12ZM80 140c-6.627 0-12 5.373-12 12v48c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-48c0-6.627-5.373-12-12-12ZM40 180c-6.627 0-12 5.373-12 12v8c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-8c0-6.627-5.373-12-12-12Z"),
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
        return _cellSignalX!!
    }

private var _cellSignalX: ImageVector? = null
