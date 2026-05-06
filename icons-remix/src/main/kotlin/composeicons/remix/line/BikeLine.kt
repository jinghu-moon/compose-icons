package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BikeLine: ImageVector
    get() {
        if (_bikeLine != null) return _bikeLine!!
        _bikeLine = remixIcon(
            name = "BikeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.5 12h-1.5v-5h-2v-2h6v2h-2v2.795L15.813 7.166 15.233 5h-3.233v-2h3.978c.45-.01 .866 .287 .988 .741l1.553 5.796-1.932 .518-.256-.956L5.5 12ZM5 19c1.105 0 2-.895 2-2C7 15.895 6.105 15 5 15c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2ZM5 21C2.791 21 1 19.209 1 17 1 14.791 2.791 13 5 13c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4ZM18 19c1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3 0 1.657 1.343 3 3 3ZM18 21c-2.761 0-5-2.239-5-5 0-2.761 2.239-5 5-5 2.761 0 5 2.239 5 5 0 2.761-2.239 5-5 5Z"),
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
        return _bikeLine!!
    }

private var _bikeLine: ImageVector? = null
