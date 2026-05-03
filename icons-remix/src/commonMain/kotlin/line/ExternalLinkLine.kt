package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ExternalLinkLine: ImageVector
    get() {
        if (_externalLinkLine != null) return _externalLinkLine!!
        _externalLinkLine = remixIcon(
            name = "ExternalLinkLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 6.000 L 10.000 8.000 L 5.000 8.000 L 5.000 19.000 L 16.000 19.000 L 16.000 14.000 L 18.000 14.000 L 18.000 20.000 C 18.000 20.552 17.552 21.000 17.000 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 7.000 C 3.000 6.448 3.448 6.000 4.000 6.000 L 10.000 6.000 ZM 21.000 3.000 L 21.000 11.000 L 19.000 11.000 L 19.000 6.413 L 11.207 14.207 L 9.793 12.793 L 17.585 5.000 L 13.000 5.000 L 13.000 3.000 L 21.000 3.000 Z"),
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
        return _externalLinkLine!!
    }

private var _externalLinkLine: ImageVector? = null
