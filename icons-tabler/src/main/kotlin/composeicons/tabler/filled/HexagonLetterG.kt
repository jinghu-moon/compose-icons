package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HexagonLetterG: ImageVector
    get() {
        if (_hexagonLetterG != null) return _hexagonLetterG!!
        _hexagonLetterG = tablerFilledIcon(
            name = "HexagonLetterG",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.666 1.429l6.75 3.98 .096 .063 .093 .078 .106 .074c.759 .569 1.229 1.443 1.284 2.39L22 8.218v7.284c0 1.175-.643 2.256-1.623 2.793l-6.804 4.302c-.98 .538-2.166 .538-3.2-.032L3.678 18.328C2.645 17.762 2.002 16.679 2 15.502v-7.285C2 7.111 2.57 6.089 3.476 5.512L10.426 1.414c1-.552 2.214-.552 3.24 .015M14 7h-2C10.343 7 9 8.343 9 10v4c0 1.657 1.343 3 3 3h2c.552 0 1-.448 1-1v-4c0-.552-.448-1-1-1h-1c-.552 0-1 .448-1 1l.007 .117c.059 .503 .486 .883 .993 .883v2h-1c-.552 0-1-.448-1-1v-4c0-.552 .448-1 1-1h2c.552 0 1-.448 1-1C15 7.448 14.552 7 14 7"),
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
        return _hexagonLetterG!!
    }

private var _hexagonLetterG: ImageVector? = null
