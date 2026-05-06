package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Sidebar: ImageVector
    get() {
        if (_sidebar != null) return _sidebar!!
        _sidebar = phosphorBoldIcon(
            name = "Sidebar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 36h-176C28.954 36 20 44.954 20 56v144c0 11.046 8.954 20 20 20h176c11.046 0 20-8.954 20-20v-144C236 44.954 227.046 36 216 36ZM44 104h28v20h-28ZM72 60v20h-28v-20ZM44 148h28v48h-28ZM212 196h-116v-136h116Z"),
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
        return _sidebar!!
    }

private var _sidebar: ImageVector? = null
