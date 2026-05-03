package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.InfoCardLine: ImageVector
    get() {
        if (_infoCardLine != null) return _infoCardLine!!
        _infoCardLine = remixIcon(
            name = "InfoCardLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.000 6.000 L 21.000 6.000 L 21.000 18.000 L 3.000 18.000 L 3.000 6.000 ZM 2.000 4.000 C 1.448 4.000 1.000 4.448 1.000 5.000 L 1.000 19.000 C 1.000 19.552 1.448 20.000 2.000 20.000 L 22.000 20.000 C 22.552 20.000 23.000 19.552 23.000 19.000 L 23.000 5.000 C 23.000 4.448 22.552 4.000 22.000 4.000 L 2.000 4.000 ZM 13.000 9.000 L 19.000 9.000 L 19.000 11.000 L 13.000 11.000 L 13.000 9.000 ZM 18.000 13.000 L 13.000 13.000 L 13.000 15.000 L 18.000 15.000 L 18.000 13.000 ZM 6.000 13.000 L 7.000 13.000 L 7.000 16.000 L 9.000 16.000 L 9.000 11.000 L 6.000 11.000 L 6.000 13.000 ZM 9.000 8.000 L 7.000 8.000 L 7.000 10.000 L 9.000 10.000 L 9.000 8.000 Z"),
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
        return _infoCardLine!!
    }

private var _infoCardLine: ImageVector? = null
