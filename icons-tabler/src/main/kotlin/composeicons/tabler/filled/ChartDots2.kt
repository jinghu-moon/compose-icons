package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChartDots2: ImageVector
    get() {
        if (_chartDots2 != null) return _chartDots2!!
        _chartDots2 = tablerFilledIcon(
            name = "ChartDots2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 2c.552 0 1 .448 1 1v17h17c.507 0 .934 .38 .993 .883L22 21c0 .552-.448 1-1 1h-18C2.448 22 2 21.552 2 21v-18C2 2.448 2.448 2 3 2M21.97 2.757c.134 .536-.191 1.079-.727 1.213L15.987 5.284c-.051 .528-.24 1.034-.55 1.465l1.768 2.358c.903-.247 1.868-.059 2.613 .508 .744 .567 1.181 1.449 1.182 2.385 0 1.302-.84 2.456-2.08 2.856-1.24 .399-2.596-.047-3.356-1.105l-3.57 1.428c-.102 1.615-1.466 2.858-3.084 2.809C7.293 17.94 6.006 16.618 6 15l.005-.176c.075-1.268 .939-2.351 2.159-2.705 1.22-.354 2.53 .098 3.271 1.129l3.57-1.428 .015-.17c.06-.518 .253-.996 .542-1.4L13.795 7.893c-.903 .247-1.868 .059-2.613-.508C10.438 6.817 10.001 5.936 10 5l.005-.176c.075-1.289 .968-2.386 2.215-2.722 1.247-.336 2.569 .164 3.282 1.242L20.757 2.03c.536-.134 1.079 .191 1.213 .727"),
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
        return _chartDots2!!
    }

private var _chartDots2: ImageVector? = null
