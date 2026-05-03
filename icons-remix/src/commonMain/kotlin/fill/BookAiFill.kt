package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BookAiFill: ImageVector
    get() {
        if (_bookAiFill != null) return _bookAiFill!!
        _bookAiFill = remixIcon(
            name = "BookAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.343 2.000 C 13.122 2.626 13.000 3.299 13.000 4.000 C 13.000 7.314 15.686 10.000 19.000 10.000 C 19.701 10.000 20.374 9.878 21.000 9.657 L 21.000 21.000 C 21.000 21.552 20.552 22.000 20.000 22.000 L 6.500 22.000 C 4.567 22.000 3.000 20.433 3.000 18.500 L 3.000 5.000 C 3.000 3.343 4.343 2.000 6.000 2.000 L 13.343 2.000 ZM 6.500 17.000 C 5.672 17.000 5.000 17.672 5.000 18.500 C 5.000 19.328 5.672 20.000 6.500 20.000 L 19.000 20.000 L 19.000 17.000 L 6.500 17.000 ZM 18.529 0.329 C 18.706 -0.096 19.294 -0.097 19.471 0.329 L 19.724 0.941 C 20.156 1.983 20.962 2.816 21.975 3.267 L 22.692 3.586 C 23.103 3.769 23.103 4.366 22.692 4.549 L 21.933 4.887 C 20.945 5.326 20.153 6.129 19.714 7.138 L 19.467 7.703 C 19.286 8.117 18.714 8.117 18.533 7.703 L 18.287 7.138 C 17.848 6.129 17.055 5.326 16.067 4.887 L 15.308 4.549 C 14.897 4.366 14.897 3.769 15.308 3.586 L 16.025 3.267 C 17.038 2.816 17.844 1.983 18.276 0.941 L 18.529 0.329 Z"),
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
        return _bookAiFill!!
    }

private var _bookAiFill: ImageVector? = null
