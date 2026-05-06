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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2.586l6.207 6.207-1.414 1.414L13 6.414v9.586h-2v-9.586L7.207 10.207 5.793 8.793 12 2.586ZM3 18v-4h2v4c0 .552 .448 1 1 1h12c.552 0 1-.448 1-1v-4h2v4c0 1.657-1.343 3-3 3h-12C4.343 21 3 19.657 3 18Z"),
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
        return _share2Line!!
    }

private var _share2Line: ImageVector? = null
