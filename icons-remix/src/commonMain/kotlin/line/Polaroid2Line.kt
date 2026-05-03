package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Polaroid2Line: ImageVector
    get() {
        if (_polaroid2Line != null) return _polaroid2Line!!
        _polaroid2Line = remixIcon(
            name = "Polaroid2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 15.000 L 19.000 5.000 L 5.000 5.000 L 5.000 15.000 L 19.000 15.000 ZM 3.000 3.993 C 3.000 3.445 3.445 3.000 3.993 3.000 L 20.007 3.000 C 20.555 3.000 21.000 3.445 21.000 3.993 L 21.000 20.007 C 21.000 20.555 20.555 21.000 20.007 21.000 L 3.993 21.000 C 3.445 21.000 3.000 20.555 3.000 20.007 L 3.000 3.993 ZM 12.000 12.000 C 13.105 12.000 14.000 11.105 14.000 10.000 C 14.000 8.895 13.105 8.000 12.000 8.000 C 10.895 8.000 10.000 8.895 10.000 10.000 C 10.000 11.105 10.895 12.000 12.000 12.000 ZM 12.000 14.000 C 9.791 14.000 8.000 12.209 8.000 10.000 C 8.000 7.791 9.791 6.000 12.000 6.000 C 14.209 6.000 16.000 7.791 16.000 10.000 C 16.000 12.209 14.209 14.000 12.000 14.000 ZM 6.000 6.000 L 8.000 6.000 L 8.000 8.000 L 6.000 8.000 L 6.000 6.000 ZM 6.000 17.000 L 6.000 19.000 L 18.000 19.000 L 18.000 17.000 L 6.000 17.000 Z"),
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
        return _polaroid2Line!!
    }

private var _polaroid2Line: ImageVector? = null
