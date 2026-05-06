package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GhostSmileFill: ImageVector
    get() {
        if (_ghostSmileFill != null) return _ghostSmileFill!!
        _ghostSmileFill = remixIcon(
            name = "GhostSmileFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c4.971 0 9 4.029 9 9v7.5C21 20.433 19.433 22 17.5 22c-1.2 0-2.259-.604-2.889-1.524C14.098 21.386 13.12 22 12 22 10.88 22 9.902 21.386 9.387 20.475 8.759 21.396 7.7 22 6.5 22 4.631 22 3.105 20.536 3.005 18.692L3 18.5v-7.5C3 6.029 7.029 2 12 2ZM16 13h-2c0 1.105-.895 2-2 2-1.054 0-1.918-.816-1.995-1.851L10 13h-2l.005 .2C8.109 15.316 9.858 17 12 17c2.142 0 3.891-1.684 3.995-3.8L16 13ZM12 7c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C14 7.895 13.105 7 12 7Z"),
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
        return _ghostSmileFill!!
    }

private var _ghostSmileFill: ImageVector? = null
