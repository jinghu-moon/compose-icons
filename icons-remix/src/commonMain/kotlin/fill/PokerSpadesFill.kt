package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PokerSpadesFill: ImageVector
    get() {
        if (_pokerSpadesFill != null) return _pokerSpadesFill!!
        _pokerSpadesFill = remixIcon(
            name = "PokerSpadesFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.951 15.893 C 10.008 16.586 8.807 17.000 7.500 17.000 C 4.462 17.000 2.000 14.761 2.000 12.000 C 2.000 8.452 5.525 5.911 8.644 3.662 C 9.920 2.742 11.129 1.871 12.000 1.000 C 12.871 1.871 14.080 2.742 15.356 3.662 C 18.475 5.911 22.000 8.452 22.000 12.000 C 22.000 14.761 19.538 17.000 16.500 17.000 C 15.193 17.000 13.992 16.586 13.049 15.893 C 13.333 17.539 14.058 18.713 14.843 19.985 C 14.965 20.183 15.088 20.383 15.212 20.587 C 15.596 21.223 15.125 22.000 14.382 22.000 L 9.618 22.000 C 8.875 22.000 8.404 21.223 8.788 20.587 C 8.912 20.383 9.035 20.183 9.157 19.985 C 9.942 18.713 10.667 17.539 10.951 15.893 Z"),
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
        return _pokerSpadesFill!!
    }

private var _pokerSpadesFill: ImageVector? = null
