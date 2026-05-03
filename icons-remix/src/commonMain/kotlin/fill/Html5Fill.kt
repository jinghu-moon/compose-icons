package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Html5Fill: ImageVector
    get() {
        if (_html5Fill != null) return _html5Fill!!
        _html5Fill = remixIcon(
            name = "Html5Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 18.178 L 16.619 16.922 L 17.243 10.144 L 9.026 10.144 L 8.822 7.889 L 17.448 7.889 L 17.675 5.678 L 6.325 5.678 L 6.961 12.356 L 14.781 12.356 L 14.519 15.222 L 12.000 15.889 L 9.480 15.222 L 9.322 13.378 L 7.052 13.378 L 7.381 16.922 L 12.000 18.178 ZM 3.000 2.000 L 21.000 2.000 L 19.377 20.000 L 12.000 22.000 L 4.623 20.000 L 3.000 2.000 Z"),
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
        return _html5Fill!!
    }

private var _html5Fill: ImageVector? = null
