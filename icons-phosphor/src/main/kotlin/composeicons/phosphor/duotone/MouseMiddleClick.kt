package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MouseMiddleClick: ImageVector
    get() {
        if (_mouseMiddleClick != null) return _mouseMiddleClick!!
        _mouseMiddleClick = phosphorDuotoneIcon(
            name = "MouseMiddleClick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 88v48c0 4.418-3.582 8-8 8h-16c-4.418 0-8-3.582-8-8v-48c0-4.418 3.582-8 8-8h16c4.418 0 8 3.582 8 8Z"),
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
                pathData = parseSvgPathData("M144 16h-32C76.67 16.039 48.039 44.67 48 80v96c.039 35.33 28.67 63.961 64 64h32c35.33-.039 63.961-28.67 64-64v-96C207.961 44.67 179.33 16.039 144 16ZM192 80v24h-40v-16c0-8.837-7.163-16-16-16v-40h8c26.498 .028 47.972 21.502 48 48ZM136 136h-16v-48h16v23.9c-.013 .066-.013 .134 0 .2ZM112 32h8v40c-8.837 0-16 7.163-16 16v16h-40v-24C64.028 53.502 85.502 32.028 112 32ZM144 224h-32C85.502 223.972 64.028 202.498 64 176v-56h40v16c0 8.837 7.163 16 16 16h16c8.837 0 16-7.163 16-16v-16h40v56c-.028 26.498-21.502 47.972-48 48Z"),
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
        return _mouseMiddleClick!!
    }

private var _mouseMiddleClick: ImageVector? = null
