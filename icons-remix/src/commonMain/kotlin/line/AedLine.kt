package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AedLine: ImageVector
    get() {
        if (_aedLine != null) return _aedLine!!
        _aedLine = remixIcon(
            name = "AedLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.000 5.000 C 5.448 5.000 5.000 5.448 5.000 6.000 L 5.000 18.000 C 5.000 18.552 5.448 19.000 6.000 19.000 L 18.000 19.000 C 18.552 19.000 19.000 18.552 19.000 18.000 L 19.000 6.000 C 19.000 5.448 18.552 5.000 18.000 5.000 L 6.000 5.000 ZM 3.000 6.000 C 3.000 4.343 4.343 3.000 6.000 3.000 L 18.000 3.000 C 19.657 3.000 21.000 4.343 21.000 6.000 L 21.000 18.000 C 21.000 19.657 19.657 21.000 18.000 21.000 L 6.000 21.000 C 4.343 21.000 3.000 19.657 3.000 18.000 L 3.000 6.000 ZM 16.000 11.000 L 13.000 11.000 L 13.000 6.000 L 8.000 13.000 L 11.000 13.000 L 11.000 18.000 L 16.000 11.000 Z"),
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
        return _aedLine!!
    }

private var _aedLine: ImageVector? = null
