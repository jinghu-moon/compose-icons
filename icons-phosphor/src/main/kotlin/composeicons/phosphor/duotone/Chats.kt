package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Chats: ImageVector
    get() {
        if (_chats != null) return _chats!!
        _chats = phosphorDuotoneIcon(
            name = "Chats",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 96v128L184.42 192h-96.42c-4.418 0-8-3.582-8-8v-40h88c4.418 0 8-3.582 8-8v-48h40c4.418 0 8 3.582 8 8Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M216 80h-32v-32c0-8.837-7.163-16-16-16h-128C31.163 32 24 39.163 24 48v128c.01 3.071 1.777 5.866 4.547 7.192 2.771 1.326 6.055 .948 8.453-.972L72 154v30c0 8.837 7.163 16 16 16h93.59L219 230.22c1.416 1.145 3.179 1.773 5 1.78 4.418 0 8-3.582 8-8v-128c0-8.837-7.163-16-16-16ZM66.55 137.78 40 159.25v-111.25h128v88h-96.42c-1.831 0-3.606 .629-5.03 1.78ZM216 207.25 189.45 185.78c-1.416-1.145-3.179-1.773-5-1.78h-96.45v-32h80c8.837 0 16-7.163 16-16v-40h32Z"),
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
