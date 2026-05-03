package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Scan2Line: ImageVector
    get() {
        if (_scan2Line != null) return _scan2Line!!
        _scan2Line = remixIcon(
            name = "Scan2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.671 4.257 L 13.414 12.000 L 12.000 13.414 L 8.554 9.968 C 8.202 10.564 8.000 11.258 8.000 12.000 C 8.000 14.209 9.791 16.000 12.000 16.000 C 14.209 16.000 16.000 14.209 16.000 12.000 C 16.000 9.875 14.343 8.137 12.250 8.008 L 10.446 6.203 C 10.942 6.071 11.462 6.000 12.000 6.000 C 15.314 6.000 18.000 8.686 18.000 12.000 C 18.000 15.314 15.314 18.000 12.000 18.000 C 8.686 18.000 6.000 15.314 6.000 12.000 C 6.000 10.704 6.411 9.504 7.109 8.523 L 5.680 7.094 C 4.627 8.449 4.000 10.151 4.000 12.000 C 4.000 16.418 7.582 20.000 12.000 20.000 C 16.418 20.000 20.000 16.418 20.000 12.000 C 20.000 7.582 16.418 4.000 12.000 4.000 C 10.892 4.000 9.836 4.225 8.876 4.633 L 7.374 3.132 C 8.758 2.409 10.331 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 8.878 3.430 6.091 5.671 4.257 Z"),
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
        return _scan2Line!!
    }

private var _scan2Line: ImageVector? = null
