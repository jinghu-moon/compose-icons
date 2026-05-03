package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HomeSmile2Line: ImageVector
    get() {
        if (_homeSmile2Line != null) return _homeSmile2Line!!
        _homeSmile2Line = remixIcon(
            name = "HomeSmile2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 19.000 L 19.000 9.799 L 12.000 4.277 L 5.000 9.799 L 5.000 19.000 L 19.000 19.000 ZM 21.000 20.000 C 21.000 20.552 20.552 21.000 20.000 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 9.314 C 3.000 9.008 3.140 8.718 3.381 8.529 L 11.381 2.218 C 11.744 1.931 12.256 1.931 12.619 2.218 L 20.619 8.529 C 20.860 8.718 21.000 9.008 21.000 9.314 L 21.000 20.000 ZM 7.000 12.000 L 9.000 12.000 C 9.000 13.657 10.343 15.000 12.000 15.000 C 13.657 15.000 15.000 13.657 15.000 12.000 L 17.000 12.000 C 17.000 14.761 14.761 17.000 12.000 17.000 C 9.239 17.000 7.000 14.761 7.000 12.000 Z"),
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
        return _homeSmile2Line!!
    }

private var _homeSmile2Line: ImageVector? = null
