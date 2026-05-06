package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Wall: ImageVector
    get() {
        if (_wall != null) return _wall!!
        _wall = phosphorBoldIcon(
            name = "Wall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 44h-192C25.373 44 20 49.373 20 56v144c0 6.627 5.373 12 12 12h192c6.627 0 12-5.373 12-12v-144c0-6.627-5.373-12-12-12ZM92 140v-24h72v24ZM44 140v-24h24v24ZM188 116h24v24h-24ZM212 92h-72v-24h72ZM116 68v24h-72v-24ZM44 164h72v24h-72ZM140 188v-24h72v24Z"),
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
        return _wall!!
    }

private var _wall: ImageVector? = null
