package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BugDroid: ImageVector
    get() {
        if (_bugDroid != null) return _bugDroid!!
        _bugDroid = phosphorBoldIcon(
            name = "BugDroid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M197.35 51.62 208.49 40.49c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0L179.34 35.69C148.31 14.77 107.69 14.77 76.66 35.69L64.49 23.51c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17L58.65 51.62C44.029 68.335 35.98 89.793 36 112v40c0 50.81 41.19 92 92 92 50.81 0 92-41.19 92-92v-40c.02-22.207-8.029-43.665-22.65-60.38ZM196 112v4h-136v-4C60 74.445 90.445 44 128 44c37.555 0 68 30.445 68 68ZM128 220C90.461 219.961 60.039 189.539 60 152v-12h136v12c-.039 37.539-30.461 67.961-68 68ZM140 88c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16ZM84 88c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16C91.163 104 84 96.837 84 88Z"),
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
