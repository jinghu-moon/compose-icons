package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ManualGearbox: ImageVector
    get() {
        if (_manualGearbox != null) return _manualGearbox!!
        _manualGearbox = tablerFilledIcon(
            name = "ManualGearbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 3c1.462-.001 2.711 1.052 2.958 2.493C22.206 6.933 21.378 8.343 20 8.829v1.171c0 1.657-1.343 3-3 3h-4v2.171c1.439 .508 2.268 2.016 1.925 3.503-.343 1.488-1.747 2.481-3.264 2.308C10.145 20.81 9 19.526 9 18l.005-.176C9.075 16.618 9.861 15.573 11 15.17v-2.17h-5v2.171c1.439 .508 2.268 2.016 1.925 3.503-.343 1.488-1.747 2.481-3.264 2.308C3.145 20.81 2 19.526 2 18l.005-.176C2.075 16.618 2.861 15.573 4 15.17v-6.341C2.801 8.405 2 7.272 2 6l.005-.176C2.094 4.324 3.279 3.12 4.778 3.009c1.499-.111 2.849 .904 3.158 2.375C8.245 6.855 7.418 8.327 6.001 8.829L6 11h5v-2.17C9.801 8.406 8.999 7.272 9 6l.005-.176C9.094 4.324 10.279 3.12 11.778 3.009c1.499-.111 2.849 .904 3.158 2.375 .309 1.471-.518 2.943-1.935 3.445L13 11h4c.552 0 1-.448 1-1v-1.17C16.801 8.406 15.999 7.272 16 6l.005-.176C16.098 4.238 17.411 3 19 3"),
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
        return _manualGearbox!!
    }

private var _manualGearbox: ImageVector? = null
