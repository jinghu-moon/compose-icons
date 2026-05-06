package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TrashSimple: ImageVector
    get() {
        if (_trashSimple != null) return _trashSimple!!
        _trashSimple = phosphorBoldIcon(
            name = "TrashSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 48h-176C33.373 48 28 53.373 28 60c0 6.627 5.373 12 12 12h4v136c0 11.046 8.954 20 20 20h128c11.046 0 20-8.954 20-20v-136h4c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM188 204h-120v-132h120ZM76 20C76 13.373 81.373 8 88 8h80c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-80C81.373 32 76 26.627 76 20Z"),
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
        return _trashSimple!!
    }

private var _trashSimple: ImageVector? = null
