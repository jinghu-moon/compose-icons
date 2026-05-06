package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Exchange: ImageVector
    get() {
        if (_exchange != null) return _exchange!!
        _exchange = tablerFilledIcon(
            name = "Exchange",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 3c1.463-.002 2.714 1.051 2.961 2.493C22.209 6.935 21.38 8.345 20 8.83v4.17c0 3.314-2.686 6-6 6h-.585l1.292 1.293c.356 .356 .392 .922 .083 1.32l-.083 .094c-.391 .39-1.023 .39-1.414 0L10.334 18.748c-.1-.09-.181-.198-.238-.32l-.038-.091-.028-.094c-.079-.302-.01-.624 .187-.866l.076-.084 3-3c.392-.379 1.016-.374 1.402 .012 .386 .386 .391 1.009 .012 1.402L13.414 17h.586c2.131 0 3.888-1.671 3.995-3.8L18 13v-4.171C16.801 8.405 16 7.272 16 6l.005-.176C16.098 4.238 17.411 3 19 3M10.707 2.293l3 3c.252 .246 .353 .609 .263 .95l-.01 .031-.003 .018-.008 .018-.007 .027-.016 .035-.01 .032-.007 .01-.005 .014c-.056 .12-.135 .227-.232 .316L10.707 9.707c-.356 .356-.922 .392-1.32 .083L9.293 9.707c-.39-.391-.39-1.023 0-1.414L10.584 7h-.584C7.869 7 6.112 8.671 6.005 10.8L6 11v4.171c1.439 .508 2.268 2.016 1.925 3.503-.343 1.488-1.747 2.481-3.264 2.308C3.145 20.81 2 19.526 2 18l.005-.176C2.075 16.618 2.861 15.573 4 15.17v-4.17C4 7.686 6.686 5 10 5h.585L9.293 3.707C8.937 3.351 8.901 2.785 9.21 2.387l.083-.094c.391-.39 1.023-.39 1.414 0"),
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
        return _exchange!!
    }

private var _exchange: ImageVector? = null
