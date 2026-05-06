package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MouseScroll: ImageVector
    get() {
        if (_mouseScroll != null) return _mouseScroll!!
        _mouseScroll = phosphorBoldIcon(
            name = "MouseScroll",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 12h-32C74.461 12.039 44.039 42.461 44 80v96c.039 37.539 30.461 67.961 68 68h32c37.539-.039 67.961-30.461 68-68v-96C211.961 42.461 181.539 12.039 144 12ZM188 176c-.028 24.289-19.711 43.972-44 44h-32C87.711 219.972 68.028 200.289 68 176v-96C68.028 55.711 87.711 36.028 112 36h32c24.289 .028 43.972 19.711 44 44ZM140 93v70l3.51-3.52c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17l-24 24c-2.252 2.259-5.31 3.529-8.5 3.529-3.19 0-6.248-1.27-8.5-3.529l-24-24c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L116 163v-70l-3.51 3.52c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17l24-24c2.252-2.259 5.31-3.529 8.5-3.529 3.19 0 6.248 1.27 8.5 3.529l24 24c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0Z"),
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
        return _mouseScroll!!
    }

private var _mouseScroll: ImageVector? = null
