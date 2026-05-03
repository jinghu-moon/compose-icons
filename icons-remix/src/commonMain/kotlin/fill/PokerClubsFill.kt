package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PokerClubsFill: ImageVector
    get() {
        if (_pokerClubsFill != null) return _pokerClubsFill!!
        _pokerClubsFill = remixIcon(
            name = "PokerClubsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.775 11.039 C 14.933 9.267 16.000 7.633 16.000 6.000 C 16.000 3.791 14.209 2.000 12.000 2.000 C 9.791 2.000 8.000 3.791 8.000 6.000 C 8.000 7.633 9.067 9.267 10.225 11.039 L 10.226 11.040 C 10.304 11.159 10.382 11.279 10.460 11.399 C 10.170 11.179 9.903 10.970 9.652 10.773 C 8.276 9.697 7.386 9.000 6.000 9.000 C 3.791 9.000 2.000 10.791 2.000 13.000 C 2.000 15.209 3.791 17.000 6.000 17.000 C 7.633 17.000 9.267 15.933 11.039 14.775 L 11.070 14.755 C 10.977 17.036 10.112 18.438 9.157 19.985 L 9.157 19.985 L 9.157 19.985 C 9.035 20.183 8.912 20.383 8.788 20.587 C 8.404 21.223 8.875 22.000 9.618 22.000 L 14.382 22.000 C 15.125 22.000 15.596 21.223 15.212 20.587 C 15.088 20.383 14.965 20.183 14.843 19.985 L 14.843 19.985 L 14.843 19.985 C 13.888 18.438 13.023 17.036 12.930 14.755 C 12.940 14.761 12.950 14.768 12.961 14.775 C 14.733 15.933 16.367 17.000 18.000 17.000 C 20.209 17.000 22.000 15.209 22.000 13.000 C 22.000 10.791 20.209 9.000 18.000 9.000 C 16.614 9.000 15.724 9.697 14.348 10.773 C 14.097 10.970 13.830 11.179 13.540 11.399 C 13.619 11.278 13.697 11.158 13.775 11.039 Z"),
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
        return _pokerClubsFill!!
    }

private var _pokerClubsFill: ImageVector? = null
