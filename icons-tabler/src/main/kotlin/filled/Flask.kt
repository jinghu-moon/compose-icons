package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Flask: ImageVector
    get() {
        if (_flask != null) return _flask!!
        _flask = tablerFilledIcon(
            name = "Flask",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.000 2.000 C 15.552 2.000 16.000 2.448 16.000 3.000 C 16.000 3.552 15.552 4.000 15.000 4.000 L 15.000 8.826 L 18.932 19.640 L 18.966 19.717 C 19.109 20.102 19.109 20.526 18.964 20.910 L 18.894 21.072 C 18.655 21.549 18.206 21.887 17.681 21.983 L 17.500 22.000 L 6.500 22.000 L 6.319 21.983 C 5.825 21.892 5.396 21.587 5.148 21.150 C 4.900 20.712 4.858 20.188 5.034 19.717 L 5.073 19.627 L 9.000 8.823 L 9.000 4.000 C 8.448 4.000 8.000 3.552 8.000 3.000 C 8.000 2.448 8.448 2.000 9.000 2.000 L 15.000 2.000 ZM 13.000 4.000 L 11.000 4.000 L 11.000 8.000 L 13.000 8.000 L 13.000 4.000 Z"),
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
        return _flask!!
    }

private var _flask: ImageVector? = null
