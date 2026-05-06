package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.StarSmileLine: ImageVector
    get() {
        if (_starSmileLine != null) return _starSmileLine!!
        _starSmileLine = remixIcon(
            name = "StarSmileLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 .5l4.226 6.183 7.187 2.108-4.575 5.93 .216 7.487L12 19.69 4.946 22.208l.216-7.487L.587 8.792 7.774 6.683 12 .5ZM12 4.044 9.022 8.402 3.957 9.887l3.225 4.179-.153 5.274 4.971-1.774 4.97 1.774-.152-5.274L20.042 9.887 14.977 8.402 12 4.044ZM10 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2h2c0 2.209-1.791 4-4 4C9.79 16 8 14.209 8 12h2Z"),
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
        return _starSmileLine!!
    }

private var _starSmileLine: ImageVector? = null
