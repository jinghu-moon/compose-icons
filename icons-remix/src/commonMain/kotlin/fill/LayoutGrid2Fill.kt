package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.LayoutGrid2Fill: ImageVector
    get() {
        if (_layoutGrid2Fill != null) return _layoutGrid2Fill!!
        _layoutGrid2Fill = remixIcon(
            name = "LayoutGrid2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.000 3.000 C 2.448 3.000 2.000 3.448 2.000 4.000 L 2.000 8.000 L 7.500 8.000 L 7.500 3.000 L 3.000 3.000 ZM 9.500 3.000 L 9.500 8.000 L 14.500 8.000 L 14.500 3.000 L 9.500 3.000 ZM 16.500 3.000 L 16.500 8.000 L 22.000 8.000 L 22.000 4.000 C 22.000 3.448 21.552 3.000 21.000 3.000 L 16.500 3.000 ZM 22.000 10.000 L 16.500 10.000 L 16.500 14.000 L 22.000 14.000 L 22.000 10.000 ZM 22.000 16.000 L 16.500 16.000 L 16.500 21.000 L 21.000 21.000 C 21.552 21.000 22.000 20.552 22.000 20.000 L 22.000 16.000 ZM 14.500 21.000 L 14.500 16.000 L 9.500 16.000 L 9.500 21.000 L 14.500 21.000 ZM 7.500 21.000 L 7.500 16.000 L 2.000 16.000 L 2.000 20.000 C 2.000 20.552 2.448 21.000 3.000 21.000 L 7.500 21.000 ZM 2.000 14.000 L 7.500 14.000 L 7.500 10.000 L 2.000 10.000 L 2.000 14.000 ZM 9.500 10.000 L 14.500 10.000 L 14.500 14.000 L 9.500 14.000 L 9.500 10.000 Z"),
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
        return _layoutGrid2Fill!!
    }

private var _layoutGrid2Fill: ImageVector? = null
