package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ShadowLine: ImageVector
    get() {
        if (_shadowLine != null) return _shadowLine!!
        _shadowLine = remixIcon(
            name = "ShadowLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 2C2.448 2 2 2.448 2 3v14c0 .552 .448 1 1 1h3v3c0 .552 .448 1 1 1h14c.552 0 1-.448 1-1v-14C22 6.448 21.552 6 21 6h-3v-3C18 2.448 17.552 2 17 2h-14ZM18 11.561l2 2v2.879L18 14.439v-2.879ZM18 9.439v-1.439h2v3.439L18 9.439ZM18 17v-.439l2 2v1.439h-1.439l-2-2h.439c.552 0 1-.448 1-1ZM14.439 18l2 2h-2.879l-2-2h2.879ZM9.439 18l2 2h-3.439v-2h1.439ZM4 16v-12h12v12h-12Z"),
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
        return _shadowLine!!
    }

private var _shadowLine: ImageVector? = null
