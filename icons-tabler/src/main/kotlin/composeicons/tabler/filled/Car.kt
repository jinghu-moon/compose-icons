package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Car: ImageVector
    get() {
        if (_car != null) return _car!!
        _car = tablerFilledIcon(
            name = "Car",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 5c.259-0 .508 .1 .694 .28l.087 .095L18.48 10h.52c1.589-0 2.902 1.238 2.995 2.824L22 13v4c0 .552-.448 1-1 1h-1.171c-.424 1.198-1.558 2-2.829 2-1.271 0-2.405-.801-2.829-2h-4.342C9.405 19.198 8.271 20 7 20 5.729 20 4.595 19.198 4.171 18h-1.171C2.448 18 2 17.552 2 17v-6l.007-.117 .008-.056 .017-.078 .012-.036 .014-.05L4.072 5.629C4.224 5.249 4.591 5 5 5ZM7 16c-.552 0-1 .448-1 1 0 .552 .448 1 1 1 .552 0 1-.448 1-1C8 16.448 7.552 16 7 16M17 16c-.552 0-1 .448-1 1 0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1M11 7h-5.324L4.476 10h6.524ZM13.52 7h-.52v3h2.92Z"),
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
        return _car!!
    }

private var _car: ImageVector? = null
