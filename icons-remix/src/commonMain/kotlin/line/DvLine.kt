package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DvLine: ImageVector
    get() {
        if (_dvLine != null) return _dvLine!!
        _dvLine = remixIcon(
            name = "DvLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.608 3.000 L 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 16.000 C 22.000 16.552 21.552 17.000 21.000 17.000 L 14.000 17.000 L 14.000 15.000 L 20.000 15.000 L 20.000 5.000 L 13.745 5.000 C 14.536 6.134 15.000 7.513 15.000 9.000 C 15.000 11.379 13.814 13.480 12.000 14.745 L 12.000 21.000 C 12.000 21.552 11.552 22.000 11.000 22.000 L 5.000 22.000 C 4.448 22.000 4.000 21.552 4.000 21.000 L 4.000 14.745 C 2.187 13.480 1.000 11.379 1.000 9.000 C 1.000 5.134 4.134 2.000 8.000 2.000 C 9.320 2.000 10.554 2.365 11.608 3.000 L 11.608 3.000 ZM 6.000 13.584 L 6.000 20.000 L 10.000 20.000 L 10.000 13.584 C 11.766 12.812 13.000 11.050 13.000 9.000 C 13.000 6.239 10.761 4.000 8.000 4.000 C 5.239 4.000 3.000 6.239 3.000 9.000 C 3.000 11.050 4.234 12.812 6.000 13.584 ZM 8.000 12.000 C 6.343 12.000 5.000 10.657 5.000 9.000 C 5.000 7.343 6.343 6.000 8.000 6.000 C 9.657 6.000 11.000 7.343 11.000 9.000 C 11.000 10.657 9.657 12.000 8.000 12.000 ZM 8.000 10.000 C 8.552 10.000 9.000 9.552 9.000 9.000 C 9.000 8.448 8.552 8.000 8.000 8.000 C 7.448 8.000 7.000 8.448 7.000 9.000 C 7.000 9.552 7.448 10.000 8.000 10.000 ZM 17.000 7.000 L 19.000 7.000 L 19.000 9.000 L 17.000 9.000 L 17.000 7.000 ZM 7.000 17.000 L 9.000 17.000 L 9.000 19.000 L 7.000 19.000 L 7.000 17.000 Z"),
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
        return _dvLine!!
    }

private var _dvLine: ImageVector? = null
