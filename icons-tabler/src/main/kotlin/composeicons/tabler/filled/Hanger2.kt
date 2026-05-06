package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Hanger2: ImageVector
    get() {
        if (_hanger2 != null) return _hanger2!!
        _hanger2 = tablerFilledIcon(
            name = "Hanger2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c1.657 0 3 1.343 3 3-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L13 5c.001-.552-.446-1.001-.998-1.002C11.45 3.997 11.001 4.444 11 4.996c.006 1.516 .495 2.579 1.486 3.13l7.97 4.428c.953 .529 1.544 1.533 1.544 2.623v.823c0 1.589-1.238 2.902-2.824 2.995L19 19c0 1.657-1.343 3-3 3h-8C6.343 22 5 20.657 5 19 3.343 19 2 17.657 2 16v-.823c-0-1.09 .59-2.094 1.543-2.623L10.238 8.834C9.406 7.858 9.006 6.538 9 5 9 3.343 10.343 2 12 2M12 10.144 4.514 14.302c-.318 .177-.514 .512-.514 .875v.823c0 .552 .448 1 1 1h.17C5.594 15.801 6.728 14.999 8 15h8c1.306 0 2.418 .835 2.83 2h.17c.552 0 1-.448 1-1v-.823c0-.364-.197-.699-.515-.875Z"),
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
        return _hanger2!!
    }

private var _hanger2: ImageVector? = null
