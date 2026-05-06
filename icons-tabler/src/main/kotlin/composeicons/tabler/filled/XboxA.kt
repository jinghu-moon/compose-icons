package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.XboxA: ImageVector
    get() {
        if (_xboxA != null) return _xboxA!!
        _xboxA = tablerFilledIcon(
            name = "XboxA",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2M12.936 7.649c-.324-.865-1.548-.865-1.872 0l-3 8c-.194 .517 .068 1.093 .585 1.287l.111 .035c.493 .122 .998-.145 1.176-.62L10.443 15h3.114l.507 1.351c.119 .344 .414 .596 .773 .659 .358 .063 .722-.074 .951-.356 .229-.283 .286-.667 .149-1.004ZM12 10.848 12.807 13h-1.614Z"),
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
        return _xboxA!!
    }

private var _xboxA: ImageVector? = null
