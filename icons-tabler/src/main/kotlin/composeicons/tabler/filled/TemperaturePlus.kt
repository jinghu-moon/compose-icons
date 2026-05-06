package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.TemperaturePlus: ImageVector
    get() {
        if (_temperaturePlus != null) return _temperaturePlus!!
        _temperaturePlus = tablerFilledIcon(
            name = "TemperaturePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10 2c1.657 0 3 1.343 3 3v7.965l.075 .056c1.517 1.183 2.221 3.131 1.81 5.01l-.055 .227c-.564 2.103-2.424 3.599-4.598 3.7C8.057 22.058 6.067 20.74 5.311 18.698 4.556 16.656 5.208 14.36 6.925 13.021L7 12.965v-7.965C7 3.411 8.238 2.098 9.824 2.005ZM19 5c.552 0 1 .448 1 1v2h2c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-2v2c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-2h-2c-.552 0-1-.448-1-1 0-.552 .448-1 1-1h2v-2c0-.552 .448-1 1-1M10 4C9.448 4 9 4.448 9 5v4h2v-4C11 4.448 10.552 4 10 4"),
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
        return _temperaturePlus!!
    }

private var _temperaturePlus: ImageVector? = null
