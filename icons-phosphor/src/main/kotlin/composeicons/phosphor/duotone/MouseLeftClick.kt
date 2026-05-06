package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MouseLeftClick: ImageVector
    get() {
        if (_mouseLeftClick != null) return _mouseLeftClick!!
        _mouseLeftClick = phosphorDuotoneIcon(
            name = "MouseLeftClick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24v88h-72v-32C56 49.072 81.072 24 112 24Z"),
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
                pathData = parseSvgPathData("M144 16h-32C76.67 16.039 48.039 44.67 48 80v96c.039 35.33 28.67 63.961 64 64h32c35.33-.039 63.961-28.67 64-64v-96C207.961 44.67 179.33 16.039 144 16ZM192 80v24h-56v-72h8c26.498 .028 47.972 21.502 48 48ZM115.31 104l-46-46C72.122 52.613 75.921 47.803 80.51 43.82L120 83.31v20.69ZM64 80c0-1.51 .08-3 .22-4.47L92.69 104h-28.69ZM120 32v28.69L94.59 35.28C100.138 33.11 106.043 31.997 112 32ZM144 224h-32C85.502 223.972 64.028 202.498 64 176v-56h128v56c-.028 26.498-21.502 47.972-48 48Z"),
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
