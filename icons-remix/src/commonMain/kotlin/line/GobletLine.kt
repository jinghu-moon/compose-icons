package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GobletLine: ImageVector
    get() {
        if (_gobletLine != null) return _gobletLine!!
        _gobletLine = remixIcon(
            name = "GobletLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.000 19.000 L 11.000 13.889 L 3.000 5.000 L 3.000 3.000 L 21.000 3.000 L 21.000 5.000 L 13.000 13.889 L 13.000 19.000 L 18.000 19.000 L 18.000 21.000 L 6.000 21.000 L 6.000 19.000 L 11.000 19.000 ZM 7.491 7.000 L 16.509 7.000 L 18.309 5.000 L 5.691 5.000 L 7.491 7.000 ZM 9.291 9.000 L 12.000 12.010 L 14.709 9.000 L 9.291 9.000 Z"),
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
        return _gobletLine!!
    }

private var _gobletLine: ImageVector? = null
