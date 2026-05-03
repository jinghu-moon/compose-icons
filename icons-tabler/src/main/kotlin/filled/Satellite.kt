package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Satellite: ImageVector
    get() {
        if (_satellite != null) return _satellite!!
        _satellite = tablerFilledIcon(
            name = "Satellite",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 14.000 C 21.552 14.000 22.000 14.448 22.000 15.000 C 22.000 18.866 18.866 22.000 15.000 22.000 C 14.448 22.000 14.000 21.552 14.000 21.000 C 14.000 20.448 14.448 20.000 15.000 20.000 C 17.761 20.000 20.000 17.761 20.000 15.000 C 20.000 14.448 20.448 14.000 21.000 14.000M 17.000 13.500 C 17.552 13.500 18.000 13.948 18.000 14.500 C 18.000 16.433 16.433 18.000 14.500 18.000 C 13.971 17.999 13.534 17.587 13.503 17.059 C 13.472 16.530 13.858 16.069 14.383 16.007 L 14.500 16.000 C 15.273 16.000 15.919 15.413 15.993 14.644 L 16.000 14.500 C 16.000 13.948 16.448 13.500 17.000 13.500M 3.171 11.413 L 7.171 15.414 Q 7.383 15.626 7.616 15.798 L 6.707 16.708 C 6.317 17.098 5.683 17.098 5.293 16.708 L 2.293 13.708 C 2.105 13.520 2.000 13.266 2.000 13.000 C 2.000 12.735 2.105 12.481 2.293 12.293 ZM 8.414 3.000 L 14.000 8.586 C 14.781 9.367 14.781 10.633 14.000 11.414 L 13.414 11.999 L 14.207 12.793 C 14.586 13.185 14.581 13.809 14.195 14.195 C 13.809 14.581 13.185 14.586 12.793 14.207 L 12.000 13.413 L 11.414 14.000 C 10.633 14.781 9.367 14.781 8.586 14.000 L 3.000 8.414 C 2.296 7.708 2.219 6.592 2.820 5.796 L 2.947 5.644 L 3.000 5.586 L 5.586 3.000 C 6.367 2.219 7.633 2.219 8.414 3.000M 13.707 2.293 L 16.707 5.293 C 17.097 5.683 17.097 6.317 16.707 6.707 L 15.799 7.617 C 15.682 7.459 15.554 7.311 15.415 7.172 L 11.414 3.172 L 12.293 2.292 C 12.684 1.902 13.316 1.902 13.707 2.292"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _satellite!!
    }

private var _satellite: ImageVector? = null
