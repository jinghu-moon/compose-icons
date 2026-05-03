package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ArrowDownBoxLine: ImageVector
    get() {
        if (_arrowDownBoxLine != null) return _arrowDownBoxLine!!
        _arrowDownBoxLine = remixIcon(
            name = "ArrowDownBoxLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.000 3.000 L 4.000 3.000 C 3.448 3.000 3.000 3.448 3.000 4.000 L 3.000 20.000 C 3.000 20.552 3.448 21.000 4.000 21.000 L 20.000 21.000 C 20.552 21.000 21.000 20.552 21.000 20.000 L 21.000 4.000 C 21.000 3.448 20.552 3.000 20.000 3.000 ZM 5.000 19.000 L 5.000 5.000 L 19.000 5.000 L 19.000 19.000 L 5.000 19.000 ZM 11.000 6.344 L 11.000 13.829 L 7.758 10.586 L 6.344 12.001 L 12.000 17.657 L 17.657 12.001 L 16.243 10.586 L 13.000 13.829 L 13.000 6.344 L 11.000 6.344 Z"),
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
        return _arrowDownBoxLine!!
    }

private var _arrowDownBoxLine: ImageVector? = null
