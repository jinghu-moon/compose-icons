package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Pencil: ImageVector
    get() {
        if (_pencil != null) return _pencil!!
        _pencil = tablerFilledIcon(
            name = "Pencil",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.085 6.5l5.415 5.415L8.707 20.707C8.52 20.895 8.265 21 8 21h-4C3.448 21 3 20.552 3 20v-4c0-.265 .105-.52 .293-.707ZM17.491 3.802c1.321 .354 2.353 1.386 2.707 2.707 .354 1.321-.024 2.731-.991 3.698l-.292 .293L13.5 5.085l.293-.292c.967-.967 2.377-1.345 3.698-.991"),
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
        return _pencil!!
    }

private var _pencil: ImageVector? = null
