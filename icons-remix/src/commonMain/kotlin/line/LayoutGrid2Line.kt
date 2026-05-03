package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.LayoutGrid2Line: ImageVector
    get() {
        if (_layoutGrid2Line != null) return _layoutGrid2Line!!
        _layoutGrid2Line = remixIcon(
            name = "LayoutGrid2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 10.000 L 8.000 10.000 L 8.000 14.000 L 4.000 14.000 L 4.000 10.000 ZM 4.000 19.000 L 4.000 16.000 L 8.000 16.000 L 8.000 19.000 L 4.000 19.000 ZM 10.000 19.000 L 10.000 16.000 L 14.000 16.000 L 14.000 19.000 L 10.000 19.000 ZM 16.000 19.000 L 16.000 16.000 L 20.000 16.000 L 20.000 19.000 L 16.000 19.000 ZM 16.000 14.000 L 16.000 10.000 L 20.000 10.000 L 20.000 14.000 L 16.000 14.000 ZM 16.000 8.000 L 16.000 5.000 L 20.000 5.000 L 20.000 8.000 L 16.000 8.000 ZM 14.000 5.000 L 14.000 8.000 L 10.000 8.000 L 10.000 5.000 L 14.000 5.000 ZM 14.000 10.000 L 14.000 14.000 L 10.000 14.000 L 10.000 10.000 L 14.000 10.000 ZM 4.000 8.000 L 4.000 5.000 L 8.000 5.000 L 8.000 8.000 L 4.000 8.000 ZM 3.000 3.000 C 2.448 3.000 2.000 3.448 2.000 4.000 L 2.000 20.000 C 2.000 20.552 2.448 21.000 3.000 21.000 L 21.000 21.000 C 21.552 21.000 22.000 20.552 22.000 20.000 L 22.000 4.000 C 22.000 3.448 21.552 3.000 21.000 3.000 L 3.000 3.000 Z"),
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
        return _layoutGrid2Line!!
    }

private var _layoutGrid2Line: ImageVector? = null
