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
                pathData = parseSvgPathData("M 12.000 1.000 C 12.552 1.000 13.000 1.448 13.000 2.000 L 13.000 3.055 C 17.179 3.523 20.478 6.821 20.946 11.000 L 22.000 11.000 C 22.552 11.000 23.000 11.448 23.000 12.000 C 23.000 12.552 22.552 13.000 22.000 13.000 L 20.945 13.000 C 20.477 17.178 17.179 20.476 13.001 20.945 L 13.000 22.000 C 13.000 22.552 12.552 23.000 12.000 23.000 C 11.448 23.000 11.000 22.552 11.000 22.000 L 11.000 20.945 C 6.822 20.477 3.524 17.179 3.055 13.001 L 2.000 13.000 C 1.448 13.000 1.000 12.552 1.000 12.000 C 1.000 11.448 1.448 11.000 2.000 11.000 L 3.055 11.000 C 3.523 6.821 6.821 3.523 11.000 3.055 L 11.000 2.000 C 11.000 1.448 11.448 1.000 12.000 1.000M 12.000 5.000 C 8.134 5.000 5.000 8.134 5.000 12.000 C 5.000 15.866 8.134 19.000 12.000 19.000 C 15.866 19.000 19.000 15.866 19.000 12.000 C 19.000 8.134 15.866 5.000 12.000 5.000M 12.000 8.000 C 14.209 8.000 16.000 9.791 16.000 12.000 C 16.000 14.209 14.209 16.000 12.000 16.000 C 9.791 16.000 8.000 14.209 8.000 12.000 L 8.005 11.800 C 8.112 9.671 9.869 8.000 12.000 8.000"),
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
