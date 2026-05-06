package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HexagonLetterS: ImageVector
    get() {
        if (_hexagonLetterS != null) return _hexagonLetterS!!
        _hexagonLetterS = tablerFilledIcon(
            name = "HexagonLetterS",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.666 1.429l6.75 3.98 .096 .063 .093 .078 .106 .074c.759 .569 1.229 1.443 1.284 2.39L22 8.218v7.284c0 1.175-.643 2.256-1.623 2.793l-6.804 4.302c-.98 .538-2.166 .538-3.2-.032L3.678 18.328C2.645 17.762 2.002 16.679 2 15.502v-7.285C2 7.111 2.57 6.089 3.476 5.512L10.426 1.414c1-.552 2.214-.552 3.24 .015M13 7h-2C9.895 7 9 7.895 9 9v2c0 1.105 .895 2 2 2h2v2h-2c0-.552-.448-1-1-1-.552 0-1 .448-1 1 0 1.105 .895 2 2 2h2c1.105 0 2-.895 2-2v-2c0-1.105-.895-2-2-2h-2v-2h2l.007 .117c.062 .525 .523 .911 1.052 .88C14.587 9.966 14.999 9.529 15 9 15 7.895 14.105 7 13 7"),
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
        return _hexagonLetterS!!
    }

private var _hexagonLetterS: ImageVector? = null
