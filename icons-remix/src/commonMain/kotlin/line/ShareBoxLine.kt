package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ShareBoxLine: ImageVector
    get() {
        if (_shareBoxLine != null) return _shareBoxLine!!
        _shareBoxLine = remixIcon(
            name = "ShareBoxLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 3.000 L 10.000 5.000 L 5.000 5.000 L 5.000 19.000 L 19.000 19.000 L 19.000 14.000 L 21.000 14.000 L 21.000 20.000 C 21.000 20.552 20.552 21.000 20.000 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 4.000 C 3.000 3.448 3.448 3.000 4.000 3.000 L 10.000 3.000 ZM 17.586 5.000 L 13.000 5.000 L 13.000 3.000 L 21.000 3.000 L 21.000 11.000 L 19.000 11.000 L 19.000 6.414 L 12.000 13.414 L 10.586 12.000 L 17.586 5.000 Z"),
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
        return _shareBoxLine!!
    }

private var _shareBoxLine: ImageVector? = null
