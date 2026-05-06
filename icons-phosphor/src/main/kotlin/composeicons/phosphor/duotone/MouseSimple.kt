package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MouseSimple: ImageVector
    get() {
        if (_mouseSimple != null) return _mouseSimple!!
        _mouseSimple = phosphorDuotoneIcon(
            name = "MouseSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 80v96c0 30.928-25.072 56-56 56h-32C81.072 232 56 206.928 56 176v-96C56 49.072 81.072 24 112 24h32c30.928 0 56 25.072 56 56Z"),
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
                pathData = parseSvgPathData("M144 16h-32C76.67 16.039 48.039 44.67 48 80v96c.039 35.33 28.67 63.961 64 64h32c35.33-.039 63.961-28.67 64-64v-96C207.961 44.67 179.33 16.039 144 16ZM192 176c-.028 26.498-21.502 47.972-48 48h-32C85.502 223.972 64.028 202.498 64 176v-96C64.028 53.502 85.502 32.028 112 32h32c26.498 .028 47.972 21.502 48 48ZM136 64v48c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-48c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _mouseSimple!!
    }

private var _mouseSimple: ImageVector? = null
