package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.XtzLine: ImageVector
    get() {
        if (_xtzLine != null) return _xtzLine!!
        _xtzLine = remixIcon(
            name = "XtzLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 6v-4h-2v4h-2.5v2h2.5v5c0 2.209 1.791 4 4 4 1.024 0 1.96-.386 2.667-1.019L12.333 14.491C11.979 14.808 11.513 15 11 15 9.895 15 9 14.105 9 13v-5h6.625l-4.125 3.975v1.525h1c3.067 0 5 2.179 5 4 0 1.883-1.627 3.5-3.75 3.5-1.823 0-3.293-1.202-3.66-2.733l-1.945 .466C8.739 21.21 11.051 23 13.75 23c3.124 0 5.75-2.412 5.75-5.5 0-2.565-2.034-4.932-4.914-5.722L19 7.525v-1.525h-10Z"),
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
        return _xtzLine!!
    }

private var _xtzLine: ImageVector? = null
