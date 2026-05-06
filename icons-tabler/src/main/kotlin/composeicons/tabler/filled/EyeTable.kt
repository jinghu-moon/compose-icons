package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.EyeTable: ImageVector
    get() {
        if (_eyeTable != null) return _eyeTable!!
        _eyeTable = tablerFilledIcon(
            name = "EyeTable",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 2c.552 0 1 .448 1 1 0 .552-.448 1-1 1v16c0 1.105-.895 2-2 2h-12C4.895 22 4 21.105 4 20v-16C3.448 4 3 3.552 3 3 3 2.448 3.448 2 4 2ZM8 17l-.128 .007c-.526 .063-.911 .524-.88 1.052 .031 .528 .469 .941 .998 .941l.128-.007c.526-.063 .911-.524 .88-1.052C8.967 17.413 8.529 17 8 17M12 17l-.128 .007c-.526 .063-.911 .524-.88 1.052 .031 .528 .469 .941 .998 .941l.128-.007c.526-.063 .911-.524 .88-1.052C12.967 17.413 12.529 17 12 17M16 17l-.128 .007c-.526 .063-.911 .524-.88 1.052 .031 .528 .469 .941 .998 .941l.128-.007c.526-.063 .911-.524 .88-1.052C16.967 17.413 16.529 17 16 17M10 14h-1c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h1c.552 0 1-.448 1-1 0-.552-.448-1-1-1M15 14h-1c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h1c.552 0 1-.448 1-1 0-.552-.448-1-1-1M14 6h-4C9.448 6 9 6.448 9 7c0 .552 .448 1 1 1h1v3c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-3h1c.552 0 1-.448 1-1C15 6.448 14.552 6 14 6"),
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
        return _eyeTable!!
    }

private var _eyeTable: ImageVector? = null
