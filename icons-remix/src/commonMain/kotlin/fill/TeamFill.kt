package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TeamFill: ImageVector
    get() {
        if (_teamFill != null) return _teamFill!!
        _teamFill = remixIcon(
            name = "TeamFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 10.000 C 14.209 10.000 16.000 8.209 16.000 6.000 C 16.000 3.791 14.209 2.000 12.000 2.000 C 9.791 2.000 8.000 3.791 8.000 6.000 C 8.000 8.209 9.791 10.000 12.000 10.000 ZM 5.500 13.000 C 6.881 13.000 8.000 11.881 8.000 10.500 C 8.000 9.119 6.881 8.000 5.500 8.000 C 4.119 8.000 3.000 9.119 3.000 10.500 C 3.000 11.881 4.119 13.000 5.500 13.000 ZM 21.000 10.500 C 21.000 11.881 19.881 13.000 18.500 13.000 C 17.119 13.000 16.000 11.881 16.000 10.500 C 16.000 9.119 17.119 8.000 18.500 8.000 C 19.881 8.000 21.000 9.119 21.000 10.500 ZM 12.000 11.000 C 14.761 11.000 17.000 13.239 17.000 16.000 L 17.000 22.000 L 7.000 22.000 L 7.000 16.000 C 7.000 13.239 9.239 11.000 12.000 11.000 ZM 5.000 16.000 C 5.000 15.307 5.101 14.638 5.288 14.006 L 5.119 14.020 C 3.365 14.210 2.000 15.696 2.000 17.500 L 2.000 22.000 L 5.000 22.000 L 5.000 16.000 ZM 22.000 22.000 L 22.000 17.500 C 22.000 15.638 20.546 14.115 18.712 14.006 C 18.899 14.638 19.000 15.307 19.000 16.000 L 19.000 22.000 L 22.000 22.000 Z"),
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
        return _teamFill!!
    }

private var _teamFill: ImageVector? = null
