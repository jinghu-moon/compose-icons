package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DvFill: ImageVector
    get() {
        if (_dvFill != null) return _dvFill!!
        _dvFill = remixIcon(
            name = "DvFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 14.745 C 2.187 13.480 1.000 11.379 1.000 9.000 C 1.000 5.134 4.134 2.000 8.000 2.000 C 11.866 2.000 15.000 5.134 15.000 9.000 C 15.000 11.379 13.814 13.480 12.000 14.745 L 12.000 21.000 C 12.000 21.552 11.552 22.000 11.000 22.000 L 5.000 22.000 C 4.448 22.000 4.000 21.552 4.000 21.000 L 4.000 14.745 ZM 8.000 14.000 C 10.761 14.000 13.000 11.761 13.000 9.000 C 13.000 6.239 10.761 4.000 8.000 4.000 C 5.239 4.000 3.000 6.239 3.000 9.000 C 3.000 11.761 5.239 14.000 8.000 14.000 ZM 7.000 18.000 L 7.000 20.000 L 9.000 20.000 L 9.000 18.000 L 7.000 18.000 ZM 8.000 12.000 C 6.343 12.000 5.000 10.657 5.000 9.000 C 5.000 7.343 6.343 6.000 8.000 6.000 C 9.657 6.000 11.000 7.343 11.000 9.000 C 11.000 10.657 9.657 12.000 8.000 12.000 ZM 14.000 17.000 L 14.000 15.708 C 15.841 14.060 17.000 11.665 17.000 9.000 C 17.000 6.695 16.133 4.592 14.708 3.000 L 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 16.000 C 22.000 16.552 21.552 17.000 21.000 17.000 L 14.000 17.000 ZM 18.000 7.000 L 18.000 9.000 L 20.000 9.000 L 20.000 7.000 L 18.000 7.000 Z"),
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
        return _dvFill!!
    }

private var _dvFill: ImageVector? = null
