package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Buildings: ImageVector
    get() {
        if (_buildings != null) return _buildings!!
        _buildings = phosphorBoldIcon(
            name = "Buildings",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 204h-12v-108C228 84.954 219.046 76 208 76h-36v-44c-.002-6.833-3.493-13.191-9.256-16.862-5.763-3.671-13.001-4.145-19.194-1.258L39.55 62.42C32.514 65.716 28.014 72.78 28 80.55v123.45h-12C9.373 204 4 209.373 4 216c0 6.627 5.373 12 12 12h224c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM204 100v104h-32v-104ZM52 83.09 148 38.3v165.7h-96ZM132 112v12c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-12c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM92 112v12c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-12c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM92 164v12c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-12c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM132 164v12c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-12c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
        return _buildings!!
    }

private var _buildings: ImageVector? = null
