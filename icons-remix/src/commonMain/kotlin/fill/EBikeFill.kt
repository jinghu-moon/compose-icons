package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.EBikeFill: ImageVector
    get() {
        if (_eBikeFill != null) return _eBikeFill!!
        _eBikeFill = remixIcon(
            name = "EBikeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.501 6.937 C 17.593 8.147 19.000 10.409 19.000 13.000 L 19.000 21.000 L 14.829 21.000 C 14.417 22.165 13.306 23.000 12.000 23.000 C 10.694 23.000 9.583 22.165 9.171 21.000 L 5.000 21.000 L 5.000 13.000 C 5.000 10.409 6.407 8.147 8.499 6.937 C 8.338 6.645 8.211 6.331 8.126 6.000 L 5.000 6.000 L 5.000 4.000 L 8.126 4.000 C 8.570 2.275 10.136 1.000 12.000 1.000 C 13.864 1.000 15.430 2.275 15.874 4.000 L 19.000 4.000 L 19.000 6.000 L 15.874 6.000 C 15.789 6.331 15.663 6.645 15.501 6.937 ZM 12.000 14.000 C 11.448 14.000 11.000 14.448 11.000 15.000 L 11.000 20.000 C 11.000 20.552 11.448 21.000 12.000 21.000 C 12.552 21.000 13.000 20.552 13.000 20.000 L 13.000 15.000 C 13.000 14.448 12.552 14.000 12.000 14.000 ZM 12.000 7.000 C 13.105 7.000 14.000 6.105 14.000 5.000 C 14.000 3.895 13.105 3.000 12.000 3.000 C 10.895 3.000 10.000 3.895 10.000 5.000 C 10.000 6.105 10.895 7.000 12.000 7.000 Z"),
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
        return _eBikeFill!!
    }

private var _eBikeFill: ImageVector? = null
