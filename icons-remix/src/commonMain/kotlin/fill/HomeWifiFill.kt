package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.HomeWifiFill: ImageVector
    get() {
        if (_homeWifiFill != null) return _homeWifiFill!!
        _homeWifiFill = remixIcon(
            name = "HomeWifiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.000 20.000 C 20.000 20.552 19.552 21.000 19.000 21.000 L 5.000 21.000 C 4.448 21.000 4.000 20.552 4.000 20.000 L 4.000 11.000 L 1.000 11.000 L 11.327 1.612 C 11.709 1.265 12.291 1.265 12.673 1.612 L 23.000 11.000 L 20.000 11.000 L 20.000 20.000 ZM 7.000 11.000 L 7.000 13.000 C 9.761 13.000 12.000 15.239 12.000 18.000 L 14.000 18.000 C 14.000 14.134 10.866 11.000 7.000 11.000 ZM 7.000 15.000 L 7.000 18.000 L 10.000 18.000 C 10.000 16.343 8.657 15.000 7.000 15.000 Z"),
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
        return _homeWifiFill!!
    }

private var _homeWifiFill: ImageVector? = null
