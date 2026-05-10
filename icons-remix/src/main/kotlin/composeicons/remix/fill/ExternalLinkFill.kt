package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ExternalLinkFill: ImageVector
    get() {
        if (_externalLinkFill != null) return _externalLinkFill!!
        _externalLinkFill = remixIcon(
            name = "ExternalLinkFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10 6v2h-5v11h11v-5h2v6c0 .552-.448 1-1 1h-13C3.448 21 3 20.552 3 20v-13C3 6.448 3.448 6 4 6h6ZM21 3v9L17.206 8.207l-5.999 6L9.793 12.793 15.792 6.793 12 3h9Z"),
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
        return _externalLinkFill!!
    }

private var _externalLinkFill: ImageVector? = null
