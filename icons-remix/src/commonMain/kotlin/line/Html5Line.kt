package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Html5Line: ImageVector
    get() {
        if (_html5Line != null) return _html5Line!!
        _html5Line = remixIcon(
            name = "Html5Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 18.178 L 7.381 16.922 L 7.052 13.378 L 9.322 13.378 L 9.480 15.222 L 12.000 15.889 L 14.519 15.222 L 14.781 12.356 L 6.961 12.356 L 6.325 5.678 L 17.675 5.678 L 17.448 7.889 L 8.822 7.889 L 9.026 10.144 L 17.243 10.144 L 16.619 16.922 L 12.000 18.178 ZM 3.000 2.000 L 21.000 2.000 L 19.377 20.000 L 12.000 22.000 L 4.623 20.000 L 3.000 2.000 ZM 5.188 4.000 L 6.490 18.434 L 12.000 19.928 L 17.510 18.434 L 18.812 4.000 L 5.188 4.000 Z"),
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
        return _html5Line!!
    }

private var _html5Line: ImageVector? = null
