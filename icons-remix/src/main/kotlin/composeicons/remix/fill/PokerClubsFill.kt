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
                pathData = parseSvgPathData("M13.775 11.039C14.933 9.267 16 7.633 16 6 16 3.791 14.209 2 12 2 9.791 2 8 3.791 8 6c0 1.633 1.067 3.267 2.225 5.039l.001 .001c.078 .119 .156 .238 .234 .358-.289-.22-.557-.429-.808-.625C8.276 9.697 7.386 9 6 9 3.791 9 2 10.791 2 13c0 2.209 1.791 4 4 4 1.633 0 3.267-1.067 5.039-2.225l.031-.02c-.093 2.281-.958 3.683-1.913 5.231h-0-0c-.122 .198-.245 .397-.369 .602C8.404 21.223 8.875 22 9.618 22h4.764c.743 0 1.214-.777 .83-1.413-.123-.204-.247-.404-.369-.602h0 0c-.955-1.547-1.821-2.949-1.913-5.231 .01 .007 .021 .013 .031 .02C14.733 15.933 16.367 17 18 17c2.209 0 4-1.791 4-4C22 10.791 20.209 9 18 9c-1.386 0-2.276 .697-3.652 1.773-.251 .196-.518 .406-.808 .625 .078-.12 .157-.24 .234-.359Z"),
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
