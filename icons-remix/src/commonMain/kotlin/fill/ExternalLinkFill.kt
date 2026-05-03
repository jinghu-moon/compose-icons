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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 6.000 L 10.000 8.000 L 5.000 8.000 L 5.000 19.000 L 16.000 19.000 L 16.000 14.000 L 18.000 14.000 L 18.000 20.000 C 18.000 20.552 17.552 21.000 17.000 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 7.000 C 3.000 6.448 3.448 6.000 4.000 6.000 L 10.000 6.000 ZM 21.000 3.000 L 21.000 12.000 L 17.206 8.207 L 11.207 14.207 L 9.793 12.793 L 15.792 6.793 L 12.000 3.000 L 21.000 3.000 Z"),
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
        return _externalLinkFill!!
    }

private var _externalLinkFill: ImageVector? = null
