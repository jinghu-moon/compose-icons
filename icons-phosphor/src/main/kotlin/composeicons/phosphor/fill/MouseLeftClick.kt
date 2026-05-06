package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MouseLeftClick: ImageVector
    get() {
        if (_mouseLeftClick != null) return _mouseLeftClick!!
        _mouseLeftClick = phosphorFillIcon(
            name = "MouseLeftClick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 16h-32C76.67 16.039 48.039 44.67 48 80v96c.039 35.33 28.67 63.961 64 64h32c35.33-.039 63.961-28.67 64-64v-96C207.961 44.67 179.33 16.039 144 16ZM192 80v24h-64v-72h16c26.498 .028 47.972 21.502 48 48ZM144 224h-32C85.502 223.972 64.028 202.498 64 176v-56h128v56c-.028 26.498-21.502 47.972-48 48Z"),
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
        return _mouseLeftClick!!
    }

private var _mouseLeftClick: ImageVector? = null
