package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Caravan: ImageVector
    get() {
        if (_caravan != null) return _caravan!!
        _caravan = tablerFilledIcon(
            name = "Caravan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.949 3.684 16.72 6h1.28c1.657 0 3 1.343 3 3v6h1c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-1.17c-.424 1.199-1.558 2.001-2.83 2h-6.17C11.407 20.2 10.272 21.002 9 21.002 7.728 21.002 6.593 20.2 6.17 19h-1.17C3.343 19 2 17.657 2 16v-3.5C2 9.23 4.429 6.469 7.672 6.052L14.606 3.081c.257-.11 .549-.108 .804 .007 .255 .115 .451 .331 .539 .596M9 17c-.552 0-1 .448-1 1 0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1M14.5 10h-1C12.672 10 12 10.672 12 11.5v1c0 .828 .672 1.5 1.5 1.5h1C15.328 14 16 13.328 16 12.5v-1C16 10.672 15.328 10 14.5 10M14.395 5.347 12.871 6h1.742Z"),
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
        return _caravan!!
    }

private var _caravan: ImageVector? = null
