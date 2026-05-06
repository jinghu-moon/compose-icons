package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CurrentLocation: ImageVector
    get() {
        if (_currentLocation != null) return _currentLocation!!
        _currentLocation = tablerFilledIcon(
            name = "CurrentLocation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 1c.552 0 1 .448 1 1v1.055c4.179 .468 7.478 3.766 7.946 7.945h1.054c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-1.055c-.468 4.178-3.766 7.476-7.944 7.945L13 22c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-1.055C6.822 20.477 3.524 17.179 3.055 13.001L2 13C1.448 13 1 12.552 1 12c0-.552 .448-1 1-1h1.055C3.523 6.821 6.821 3.523 11 3.055v-1.055c0-.552 .448-1 1-1M12 5C8.134 5 5 8.134 5 12c0 3.866 3.134 7 7 7 3.866 0 7-3.134 7-7C19 8.134 15.866 5 12 5M12 8c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4C9.791 16 8 14.209 8 12l.005-.2C8.112 9.671 9.869 8 12 8"),
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
        return _currentLocation!!
    }

private var _currentLocation: ImageVector? = null
