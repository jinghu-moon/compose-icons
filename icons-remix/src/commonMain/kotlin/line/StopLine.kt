package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.StopLine: ImageVector
    get() {
        if (_stopLine != null) return _stopLine!!
        _stopLine = remixIcon(
            name = "StopLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.000 7.000 L 7.000 17.000 L 17.000 17.000 L 17.000 7.000 L 7.000 7.000 ZM 6.000 5.000 L 18.000 5.000 C 18.552 5.000 19.000 5.448 19.000 6.000 L 19.000 18.000 C 19.000 18.552 18.552 19.000 18.000 19.000 L 6.000 19.000 C 5.448 19.000 5.000 18.552 5.000 18.000 L 5.000 6.000 C 5.000 5.448 5.448 5.000 6.000 5.000 Z"),
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
        return _stopLine!!
    }

private var _stopLine: ImageVector? = null
