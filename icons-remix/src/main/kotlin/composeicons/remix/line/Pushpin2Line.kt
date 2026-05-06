package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Pushpin2Line: ImageVector
    get() {
        if (_pushpin2Line != null) return _pushpin2Line!!
        _pushpin2Line = remixIcon(
            name = "Pushpin2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 3v2h-1v6l2 3v2h-6v7h-2v-7h-6v-2L7 11v-6h-1v-2h12ZM9 5v6.606L7.404 14h9.193L15 11.606v-6.606h-6Z"),
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
        return _pushpin2Line!!
    }

private var _pushpin2Line: ImageVector? = null
