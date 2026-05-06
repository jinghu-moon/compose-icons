package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bottle: ImageVector
    get() {
        if (_bottle != null) return _bottle!!
        _bottle = tablerFilledIcon(
            name = "Bottle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13 1c1.047-0 1.917 .806 1.995 1.85L15 3v.5c0 1.317 .381 2.604 1.094 3.705l.17 .25 .05 .072c1.027 1.442 1.611 3.151 1.68 4.92l.006 .354v6.199c0 1.589-1.238 2.902-2.824 2.995L15 22h-6C7.411 22 6.098 20.762 6.005 19.176L6 19v-6.2C6 11.03 6.517 9.299 7.486 7.818l.2-.292 .05-.069C8.558 6.301 9 4.918 9 3.5v-.5C9 1.953 9.806 1.083 10.85 1.005L11 1h2ZM13.362 6h-2.724c-.244 .827-.608 1.613-1.08 2.334l-.194 .284-.05 .069C8.521 9.801 8.068 11.119 8.007 12.485l-.003 .125c.577-.408 1.269-.621 1.975-.61 1.12-.023 2.18 .507 2.833 1.417 .27 .375 .706 .593 1.209 .583 .461 .01 .897-.209 1.166-.583 .223-.31 .497-.581 .81-.8l.003 .183c0-1.37-.396-2.707-1.137-3.852l-.228-.332C14.069 7.82 13.639 6.936 13.362 6Z"),
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
        return _bottle!!
    }

private var _bottle: ImageVector? = null
