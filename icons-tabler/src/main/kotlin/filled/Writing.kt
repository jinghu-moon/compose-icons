package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Writing: ImageVector
    get() {
        if (_writing != null) return _writing!!
        _writing = tablerFilledIcon(
            name = "Writing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 8.000 L 21.000 17.000 C 21.000 17.265 20.895 17.520 20.707 17.707 L 18.707 19.707 C 18.672 19.742 18.635 19.774 18.595 19.804 L 18.485 19.875 L 18.371 19.929 L 18.266 19.964 L 18.117 19.994 L 18.000 20.000 L 5.000 20.000 C 3.343 20.000 2.000 18.657 2.000 17.000 C 2.000 15.343 3.343 14.000 5.000 14.000 L 9.000 14.000 C 9.552 14.000 10.000 13.552 10.000 13.000 C 10.000 12.448 9.552 12.000 9.000 12.000 L 6.000 12.000 C 5.448 12.000 5.000 11.552 5.000 11.000 C 5.000 10.448 5.448 10.000 6.000 10.000 L 9.000 10.000 C 10.657 10.000 12.000 11.343 12.000 13.000 C 12.000 14.657 10.657 16.000 9.000 16.000 L 5.000 16.000 C 4.448 16.000 4.000 16.448 4.000 17.000 C 4.000 17.552 4.448 18.000 5.000 18.000 L 15.585 18.000 L 15.293 17.707 C 15.105 17.520 15.000 17.265 15.000 17.000 L 15.000 8.000 ZM 18.000 2.000 C 19.673 2.000 21.000 3.327 21.000 5.000 L 21.000 6.000 L 15.000 6.000 L 15.000 5.000 C 15.000 3.327 16.327 2.000 18.000 2.000"),
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
        return _writing!!
    }

private var _writing: ImageVector? = null
