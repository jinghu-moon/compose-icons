package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Share2Line: ImageVector
    get() {
        if (_share2Line != null) return _share2Line!!
        _share2Line = remixIcon(
            name = "Share2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.586 L 18.207 8.793 L 16.793 10.207 L 13.000 6.414 L 13.000 16.000 L 11.000 16.000 L 11.000 6.414 L 7.207 10.207 L 5.793 8.793 L 12.000 2.586 ZM 3.000 18.000 L 3.000 14.000 L 5.000 14.000 L 5.000 18.000 C 5.000 18.552 5.448 19.000 6.000 19.000 L 18.000 19.000 C 18.552 19.000 19.000 18.552 19.000 18.000 L 19.000 14.000 L 21.000 14.000 L 21.000 18.000 C 21.000 19.657 19.657 21.000 18.000 21.000 L 6.000 21.000 C 4.343 21.000 3.000 19.657 3.000 18.000 Z"),
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
        return _share2Line!!
    }

private var _share2Line: ImageVector? = null
