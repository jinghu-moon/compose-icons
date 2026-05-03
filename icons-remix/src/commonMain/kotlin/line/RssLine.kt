package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.RssLine: ImageVector
    get() {
        if (_rssLine != null) return _rssLine!!
        _rssLine = remixIcon(
            name = "RssLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.000 17.000 C 5.209 17.000 7.000 18.791 7.000 21.000 L 3.000 21.000 L 3.000 17.000 ZM 3.000 10.000 C 9.075 10.000 14.000 14.925 14.000 21.000 L 12.000 21.000 C 12.000 16.029 7.971 12.000 3.000 12.000 L 3.000 10.000 ZM 3.000 3.000 C 12.941 3.000 21.000 11.059 21.000 21.000 L 19.000 21.000 C 19.000 12.163 11.837 5.000 3.000 5.000 L 3.000 3.000 Z"),
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
        return _rssLine!!
    }

private var _rssLine: ImageVector? = null
