package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Trash: ImageVector
    get() {
        if (_trash != null) return _trash!!
        _trash = phosphorBoldIcon(
            name = "Trash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 48h-36v-12C180 20.536 167.464 8 152 8h-48C88.536 8 76 20.536 76 36v12h-36C33.373 48 28 53.373 28 60c0 6.627 5.373 12 12 12h4v136c0 11.046 8.954 20 20 20h128c11.046 0 20-8.954 20-20v-136h4c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM100 36c0-2.209 1.791-4 4-4h48c2.209 0 4 1.791 4 4v12h-56ZM188 204h-120v-132h120ZM116 104v64c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-64c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM164 104v64c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-64c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
        return _trash!!
    }

private var _trash: ImageVector? = null
