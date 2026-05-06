package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ChargingPileLine: ImageVector
    get() {
        if (_chargingPileLine != null) return _chargingPileLine!!
        _chargingPileLine = remixIcon(
            name = "ChargingPileLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 19h1v2h-13v-2h1v-15C3 3.448 3.448 3 4 3h9c.552 0 1 .448 1 1v8h2c1.105 0 2 .895 2 2v4c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-7h-2c-.552 0-1-.448-1-1v-3.586L15.343 4.757 16.757 3.343l4.95 4.95C21.902 8.488 22 8.744 22 9v9c0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3v-4h-2v5ZM5 19h7v-14h-7v14ZM9 11h3L8 17v-4h-3L9 7v4Z"),
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
        return _chargingPileLine!!
    }

private var _chargingPileLine: ImageVector? = null
