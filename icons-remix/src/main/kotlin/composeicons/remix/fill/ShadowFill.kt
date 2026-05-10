package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ShadowFill: ImageVector
    get() {
        if (_shadowFill != null) return _shadowFill!!
        _shadowFill = remixIcon(
            name = "ShadowFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 3C2 2.448 2.448 2 3 2h14c.552 0 1 .448 1 1v3h3c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-14C6.448 22 6 21.552 6 21v-3h-3C2.448 18 2 17.552 2 17v-14ZM8 18v2h3.439L9.439 18h-1.439ZM11.561 18l2 2h2.879L14.439 18h-2.879ZM20 20v-1.439l-2-2v.439c0 .552-.448 1-1 1h-.439l2 2h1.439ZM20 13.561l-2-2v2.879l2 2v-2.879ZM20 11.439v-3.439h-2v1.439l2 2Z"),
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
        return _shadowFill!!
    }

private var _shadowFill: ImageVector? = null
