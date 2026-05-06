package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MouseScroll: ImageVector
    get() {
        if (_mouseScroll != null) return _mouseScroll!!
        _mouseScroll = phosphorRegularIcon(
            name = "MouseScroll",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 16h-32C76.67 16.039 48.039 44.67 48 80v96c.039 35.33 28.67 63.961 64 64h32c35.33-.039 63.961-28.67 64-64v-96C207.961 44.67 179.33 16.039 144 16ZM192 176c-.028 26.498-21.502 47.972-48 48h-32C85.502 223.972 64.028 202.498 64 176v-96C64.028 53.502 85.502 32.028 112 32h32c26.498 .028 47.972 21.502 48 48ZM136 83.31v89.38l10.34-10.35c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32l-24 24c-1.501 1.502-3.537 2.346-5.66 2.346-2.123 0-4.159-.844-5.66-2.346l-24-24c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0L120 172.69v-89.38L109.66 93.66c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32l24-24c1.501-1.502 3.537-2.346 5.66-2.346 2.123 0 4.159 .844 5.66 2.346l24 24c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0Z"),
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
        return _mouseScroll!!
    }

private var _mouseScroll: ImageVector? = null
