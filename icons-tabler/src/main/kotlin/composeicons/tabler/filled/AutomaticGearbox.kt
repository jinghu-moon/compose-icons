package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AutomaticGearbox: ImageVector
    get() {
        if (_automaticGearbox != null) return _automaticGearbox!!
        _automaticGearbox = tablerFilledIcon(
            name = "AutomaticGearbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 16c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3h-1c-.552 0-1-.448-1-1v-4c0-.552 .448-1 1-1ZM18 20l.117-.007c.525-.062 .911-.523 .88-1.052C18.966 18.413 18.529 18.001 18 18ZM18.5 7C19.881 7 21 8.119 21 9.5 21 10.881 19.881 12 18.5 12h-.5v1c-0 .507-.38 .934-.883 .993L17 14c-.552 0-1-.448-1-1v-5c0-.552 .448-1 1-1ZM18 10h.5c.276 0 .5-.224 .5-.5C19 9.224 18.776 9 18.5 9h-.5ZM13 10c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-3v6h3c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-3C8.895 20 8 19.105 8 18v-6h-2C4.953 12 4.083 11.194 4.005 10.15L4 10v-2.17C2.801 7.406 1.999 6.272 2 5l.005-.176C2.094 3.324 3.279 2.12 4.778 2.009c1.499-.111 2.849 .904 3.158 2.375C8.245 5.855 7.418 7.327 6.001 7.829L6 10Z"),
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
        return _automaticGearbox!!
    }

private var _automaticGearbox: ImageVector? = null
