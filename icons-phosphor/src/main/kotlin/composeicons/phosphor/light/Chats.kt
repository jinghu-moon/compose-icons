package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Chats: ImageVector
    get() {
        if (_chats != null) return _chats!!
        _chats = phosphorLightIcon(
            name = "Chats",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 82h-34v-34c0-7.732-6.268-14-14-14h-128C32.268 34 26 40.268 26 48v128c.003 2.312 1.333 4.416 3.42 5.41 .804 .391 1.686 .593 2.58 .59 1.372 .001 2.702-.469 3.77-1.33L73.71 150h.29v34c0 7.732 6.268 14 14 14h94.29l37.94 30.67c1.068 .861 2.398 1.331 3.77 1.33 .894 .003 1.776-.199 2.58-.59 2.087-.994 3.417-3.098 3.42-5.41v-128c0-7.732-6.268-14-14-14ZM71.58 138c-1.372-.001-2.702 .469-3.77 1.33L38 163.43v-115.43c0-1.105 .895-2 2-2h128c1.105 0 2 .895 2 2v88c0 1.105-.895 2-2 2ZM218 211.43 188.19 187.33c-1.068-.861-2.398-1.331-3.77-1.33h-96.42c-1.105 0-2-.895-2-2v-34h82c7.732 0 14-6.268 14-14v-42h34c1.105 0 2 .895 2 2Z"),
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
        return _chats!!
    }

private var _chats: ImageVector? = null
