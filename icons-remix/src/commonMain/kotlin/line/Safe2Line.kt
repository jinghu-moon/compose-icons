package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Safe2Line: ImageVector
    get() {
        if (_safe2Line != null) return _safe2Line!!
        _safe2Line = remixIcon(
            name = "Safe2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.005 20.333 L 20.005 22.000 L 18.005 22.000 L 18.005 20.666 L 10.587 21.903 C 10.315 21.948 10.057 21.764 10.012 21.492 C 10.007 21.465 10.005 21.437 10.005 21.410 L 10.005 20.000 L 6.005 20.000 L 6.005 22.000 L 4.005 22.000 L 4.005 20.000 L 3.005 20.000 C 2.453 20.000 2.005 19.552 2.005 19.000 L 2.005 4.000 C 2.005 3.447 2.453 3.000 3.005 3.000 L 10.005 3.000 L 10.005 1.590 C 10.005 1.314 10.229 1.090 10.505 1.090 C 10.532 1.090 10.560 1.092 10.587 1.097 L 21.169 2.861 C 21.652 2.941 22.005 3.358 22.005 3.847 L 22.005 6.000 L 23.005 6.000 L 23.005 8.000 L 22.005 8.000 L 22.005 15.000 L 23.005 15.000 L 23.005 17.000 L 22.005 17.000 L 22.005 19.153 C 22.005 19.642 21.652 20.059 21.169 20.139 L 20.005 20.333 ZM 4.005 5.000 L 4.005 18.000 L 10.005 18.000 L 10.005 5.000 L 4.005 5.000 ZM 12.005 19.639 L 20.005 18.306 L 20.005 4.694 L 12.005 3.361 L 12.005 19.639 ZM 16.505 14.000 C 15.677 14.000 15.005 12.880 15.005 11.500 C 15.005 10.119 15.677 9.000 16.505 9.000 C 17.333 9.000 18.005 10.119 18.005 11.500 C 18.005 12.880 17.333 14.000 16.505 14.000 Z"),
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
        return _safe2Line!!
    }

private var _safe2Line: ImageVector? = null
