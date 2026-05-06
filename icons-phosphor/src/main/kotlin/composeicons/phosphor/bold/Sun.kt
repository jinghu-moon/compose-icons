package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Sun: ImageVector
    get() {
        if (_sun != null) return _sun!!
        _sun = phosphorBoldIcon(
            name = "Sun",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M116 36v-16c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v16c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM196 128c0 37.555-30.445 68-68 68C90.445 196 60 165.555 60 128 60 90.445 90.445 60 128 60c37.539 .039 67.961 30.461 68 68ZM172 128C172 103.699 152.301 84 128 84c-24.301 0-44 19.699-44 44 0 24.301 19.699 44 44 44 24.289-.028 43.972-19.711 44-44ZM51.51 68.49c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17l-12-12c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17ZM51.51 187.49l-12 12c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0l12-12c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0ZM196 72c3.184 .003 6.238-1.26 8.49-3.51l12-12c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0l-12 12c-3.453 3.433-4.489 8.612-2.623 13.109 1.866 4.497 6.264 7.421 11.133 7.401ZM204.49 187.51c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17l12 12c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17ZM48 128c0-6.627-5.373-12-12-12h-16c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h16c6.627 0 12-5.373 12-12ZM128 208c-6.627 0-12 5.373-12 12v16c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-16c0-6.627-5.373-12-12-12ZM236 116h-16c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h16c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12Z"),
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
        return _sun!!
    }

private var _sun: ImageVector? = null
