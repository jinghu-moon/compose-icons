package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Pacman: ImageVector
    get() {
        if (_pacman != null) return _pacman!!
        _pacman = tablerFilledIcon(
            name = "Pacman",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.557 2.015 C 16.399 2.173 19.038 3.535 20.814 5.759 C 21.132 6.157 21.100 6.730 20.740 7.090 L 15.828 12.000 L 20.740 16.910 C 21.100 17.270 21.132 17.844 20.814 18.242 C 18.524 21.103 14.853 22.483 11.246 21.838 C 7.639 21.193 4.673 18.627 3.517 15.149 C 2.361 11.672 3.199 7.841 5.702 5.164 L 5.937 4.922 L 6.007 4.859 C 8.011 2.891 10.752 1.858 13.557 2.015M 12.500 5.500 C 11.480 5.500 10.640 6.262 10.518 7.248 L 10.505 7.398 C 10.502 7.432 10.500 7.466 10.500 7.500 C 10.500 8.605 11.395 9.500 12.500 9.500 C 13.605 9.500 14.500 8.605 14.500 7.500 C 14.500 6.395 13.605 5.500 12.500 5.500"),
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
        return _pacman!!
    }

private var _pacman: ImageVector? = null
