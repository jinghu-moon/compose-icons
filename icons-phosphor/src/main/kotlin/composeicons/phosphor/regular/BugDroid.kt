package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BugDroid: ImageVector
    get() {
        if (_bugDroid != null) return _bugDroid!!
        _bugDroid = phosphorRegularIcon(
            name = "BugDroid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M191.83 51.48 205.66 37.66c3.126-3.126 3.126-8.194 0-11.32-3.126-3.126-8.194-3.126-11.32 0L179.79 40.9C148.939 18.368 107.061 18.368 76.21 40.9L61.66 26.34c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32L64.17 51.48C48.641 67.801 39.986 89.471 40 112v40c0 48.601 39.399 88 88 88 48.601 0 88-39.399 88-88v-40c.014-22.529-8.641-44.199-24.17-60.52ZM128 40c39.746 .044 71.956 32.254 72 72v8h-144v-8C56.044 72.254 88.254 40.044 128 40ZM128 224C88.254 223.956 56.044 191.746 56 152v-16h144v16c-.044 39.746-32.254 71.956-72 72ZM144 92c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM88 92c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12C93.373 104 88 98.627 88 92Z"),
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
        return _bugDroid!!
    }

private var _bugDroid: ImageVector? = null
