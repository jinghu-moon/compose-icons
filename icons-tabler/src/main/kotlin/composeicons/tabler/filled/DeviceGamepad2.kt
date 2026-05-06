package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceGamepad2: ImageVector
    get() {
        if (_deviceGamepad2 != null) return _deviceGamepad2!!
        _deviceGamepad2 = tablerFilledIcon(
            name = "DeviceGamepad2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.5 4c3-0 5.539 2.215 5.945 5.187l1.532 7.883c.28 1.44-.424 2.892-1.727 3.564-1.304 .672-2.895 .403-3.905-.661L13.569 15.999 10.429 16 6.71 19.916c-1.012 1.066-2.608 1.334-3.913 .657C1.492 19.896 .792 18.438 1.081 16.996L2.715 8.823C3.276 6.018 5.739 3.999 8.6 4ZM8 7C7.448 7 7 7.448 7 8v1h-1C5.448 9 5 9.448 5 10c0 .552 .448 1 1 1h1v1c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-1h1c.552 0 1-.448 1-1C11 9.448 10.552 9 10 9h-1v-1C9 7.448 8.552 7 8 7M18 9h-4c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h4c.552 0 1-.448 1-1C19 9.448 18.552 9 18 9"),
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
        return _deviceGamepad2!!
    }

private var _deviceGamepad2: ImageVector? = null
