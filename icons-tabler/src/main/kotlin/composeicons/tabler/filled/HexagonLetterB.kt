package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HexagonLetterB: ImageVector
    get() {
        if (_hexagonLetterB != null) return _hexagonLetterB!!
        _hexagonLetterB = tablerFilledIcon(
            name = "HexagonLetterB",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.666 1.429l6.75 3.98 .096 .063 .093 .078 .106 .074c.759 .569 1.229 1.443 1.284 2.39L22 8.218v7.284c0 1.175-.643 2.256-1.623 2.793l-6.804 4.302c-.98 .538-2.166 .538-3.2-.032L3.678 18.328C2.645 17.762 2.002 16.679 2 15.502v-7.285C2 7.111 2.57 6.089 3.476 5.512L10.426 1.414c1-.552 2.214-.552 3.24 .015M12 7h-2C9.448 7 9 7.448 9 8v8c0 .552 .448 1 1 1h2c1.657 0 3-1.343 3-3l-.005-.176c-.037-.621-.265-1.215-.654-1.7L14.235 12l.106-.124c.721-.9 .863-2.134 .363-3.174C14.205 7.662 13.154 7 12 7M12 13c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-1v-2ZM12 9c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-1v-2Z"),
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
        return _hexagonLetterB!!
    }

private var _hexagonLetterB: ImageVector? = null
