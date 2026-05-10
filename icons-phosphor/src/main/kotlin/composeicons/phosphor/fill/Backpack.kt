package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Backpack: ImageVector
    get() {
        if (_backpack != null) return _backpack!!
        _backpack = phosphorFillIcon(
            name = "Backpack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 40.58v-8.58C168 18.745 157.255 8 144 8h-32C98.745 8 88 18.745 88 32v8.58C60.47 44.593 40.041 68.179 40 96v120c0 8.837 7.163 16 16 16h144c8.837 0 16-7.163 16-16v-120C215.959 68.179 195.53 44.593 168 40.58ZM104 32c0-4.418 3.582-8 8-8h32c4.418 0 8 3.582 8 8v8h-48ZM112 72h32c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-32c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8ZM176 216h-96v-40h56v8c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-8h24ZM176 160h-96v-8c0-8.837 7.163-16 16-16h64c8.837 0 16 7.163 16 16Z"),
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
        return _backpack!!
    }

private var _backpack: ImageVector? = null
