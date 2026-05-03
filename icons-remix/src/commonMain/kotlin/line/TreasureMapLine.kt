package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TreasureMapLine: ImageVector
    get() {
        if (_treasureMapLine != null) return _treasureMapLine!!
        _treasureMapLine = remixIcon(
            name = "TreasureMapLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.935 7.204 L 8.935 4.204 L 4.000 6.319 L 4.000 18.967 L 9.065 16.796 L 15.065 19.796 L 20.000 17.681 L 20.000 5.033 L 14.935 7.204 ZM 2.000 5.000 L 9.000 2.000 L 15.000 5.000 L 21.303 2.299 C 21.557 2.190 21.851 2.307 21.960 2.561 C 21.986 2.624 22.000 2.691 22.000 2.758 L 22.000 19.000 L 15.000 22.000 L 9.000 19.000 L 2.697 21.701 C 2.443 21.810 2.149 21.692 2.040 21.439 C 2.014 21.376 2.000 21.309 2.000 21.242 L 2.000 5.000 ZM 6.000 11.000 L 8.000 11.000 L 8.000 13.000 L 6.000 13.000 L 6.000 11.000 ZM 10.000 11.000 L 12.000 11.000 L 12.000 13.000 L 10.000 13.000 L 10.000 11.000 ZM 15.998 10.937 L 17.236 9.700 L 18.296 10.761 L 17.059 11.998 L 18.296 13.236 L 17.236 14.296 L 15.998 13.059 L 14.761 14.296 L 13.700 13.236 L 14.937 11.998 L 13.700 10.761 L 14.761 9.700 L 15.998 10.937 Z"),
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
        return _treasureMapLine!!
    }

private var _treasureMapLine: ImageVector? = null
