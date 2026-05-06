package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Factory: ImageVector
    get() {
        if (_factory != null) return _factory!!
        _factory = phosphorFillIcon(
            name = "Factory",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 208h-8v-72c0-.05 0-.09 0-.14 0-.05 0-.29 0-.43 0-.14 0-.28 0-.41 .005-.05 .005-.1 0-.15L209 29.74C207.837 21.836 201.049 15.985 193.06 16h-18.12c-7.951 .034-14.683 5.874-15.84 13.74l-11.56 80.91L108.8 81.6c-2.424-1.818-5.667-2.111-8.378-.755C97.712 82.2 96 84.97 96 88v32L44.8 81.6c-2.424-1.818-5.667-2.111-8.378-.755C33.712 82.2 32 84.97 32 88v120h-8c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h208c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM108 184h-28c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h28c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM176 184h-28c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h28c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM170.67 128l-8.53-6.4L174.94 32h18.12l13.72 96Z"),
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
        return _factory!!
    }

private var _factory: ImageVector? = null
