package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ArrowRightBoxLine: ImageVector
    get() {
        if (_arrowRightBoxLine != null) return _arrowRightBoxLine!!
        _arrowRightBoxLine = remixIcon(
            name = "ArrowRightBoxLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.000 3.000 L 4.000 3.000 C 3.448 3.000 3.000 3.448 3.000 4.000 L 3.000 20.000 C 3.000 20.552 3.448 21.000 4.000 21.000 L 20.000 21.000 C 20.552 21.000 21.000 20.552 21.000 20.000 L 21.000 4.000 C 21.000 3.448 20.552 3.000 20.000 3.000 ZM 5.000 19.000 L 5.000 5.000 L 19.000 5.000 L 19.000 19.000 L 5.000 19.000 ZM 17.657 12.000 L 12.000 17.657 L 10.586 16.243 L 13.828 13.000 L 6.343 13.000 L 6.343 11.000 L 13.828 11.000 L 10.586 7.757 L 12.000 6.343 L 17.657 12.000 Z"),
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
        return _arrowRightBoxLine!!
    }

private var _arrowRightBoxLine: ImageVector? = null
