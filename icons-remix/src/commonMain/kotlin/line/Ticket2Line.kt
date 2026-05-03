package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Ticket2Line: ImageVector
    get() {
        if (_ticket2Line != null) return _ticket2Line!!
        _ticket2Line = remixIcon(
            name = "Ticket2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.005 3.000 C 21.557 3.000 22.005 3.447 22.005 4.000 L 22.005 9.500 C 20.624 9.500 19.505 10.619 19.505 12.000 C 19.505 13.380 20.624 14.500 22.005 14.500 L 22.005 20.000 C 22.005 20.552 21.557 21.000 21.005 21.000 L 3.005 21.000 C 2.453 21.000 2.005 20.552 2.005 20.000 L 2.005 14.500 C 3.386 14.500 4.505 13.380 4.505 12.000 C 4.505 10.619 3.386 9.500 2.005 9.500 L 2.005 4.000 C 2.005 3.447 2.453 3.000 3.005 3.000 L 21.005 3.000 ZM 20.005 5.000 L 4.005 5.000 L 4.005 7.968 L 4.161 8.049 C 5.499 8.781 6.425 10.173 6.500 11.788 L 6.505 12.000 C 6.505 13.704 5.558 15.187 4.161 15.951 L 4.005 16.031 L 4.005 19.000 L 20.005 19.000 L 20.005 16.031 L 19.849 15.951 C 18.510 15.219 17.585 13.826 17.510 12.212 L 17.505 12.000 C 17.505 10.296 18.452 8.813 19.849 8.049 L 20.005 7.968 L 20.005 5.000 ZM 16.005 9.000 L 16.005 15.000 L 8.005 15.000 L 8.005 9.000 L 16.005 9.000 Z"),
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
        return _ticket2Line!!
    }

private var _ticket2Line: ImageVector? = null
