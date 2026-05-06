package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ArrowGoForwardLine: ImageVector
    get() {
        if (_arrowGoForwardLine != null) return _arrowGoForwardLine!!
        _arrowGoForwardLine = remixIcon(
            name = "ArrowGoForwardLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.172 7h-7.172c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h9v2h-9c-4.418 0-8-3.582-8-8C3 8.581 6.582 5 11 5h7.172L15.636 2.464 17.05 1.05 22 6l-4.95 4.95L15.636 9.535 18.172 7Z"),
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
        return _arrowGoForwardLine!!
    }

private var _arrowGoForwardLine: ImageVector? = null
