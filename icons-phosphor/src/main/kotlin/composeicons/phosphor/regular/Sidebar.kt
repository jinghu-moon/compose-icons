package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Sidebar: ImageVector
    get() {
        if (_sidebar != null) return _sidebar!!
        _sidebar = phosphorRegularIcon(
            name = "Sidebar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 40h-176C31.163 40 24 47.163 24 56v144c0 8.837 7.163 16 16 16h176c8.837 0 16-7.163 16-16v-144c0-8.837-7.163-16-16-16ZM40 152h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-16v-16h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-16v-16h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-16v-16h40v144h-40ZM216 200h-120v-144h120v144Z"),
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
