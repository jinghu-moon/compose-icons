package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GhostFill: ImageVector
    get() {
        if (_ghostFill != null) return _ghostFill!!
        _ghostFill = remixIcon(
            name = "GhostFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c4.971 0 9 4.029 9 9v7.5C21 20.433 19.433 22 17.5 22c-1.2 0-2.259-.604-2.889-1.524C14.098 21.386 13.12 22 12 22 10.88 22 9.902 21.386 9.387 20.475 8.759 21.396 7.7 22 6.5 22 4.631 22 3.105 20.536 3.005 18.692L3 18.5v-7.5C3 6.029 7.029 2 12 2ZM12 12c-1.105 0-2 1.119-2 2.5 0 1.381 .895 2.5 2 2.5 1.105 0 2-1.119 2-2.5C14 13.119 13.105 12 12 12ZM9.5 8C8.672 8 8 8.672 8 9.5 8 10.328 8.672 11 9.5 11 10.328 11 11 10.328 11 9.5 11 8.672 10.328 8 9.5 8ZM14.5 8C13.672 8 13 8.672 13 9.5c0 .828 .672 1.5 1.5 1.5C15.328 11 16 10.328 16 9.5 16 8.672 15.328 8 14.5 8Z"),
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
        return _ghostFill!!
    }

private var _ghostFill: ImageVector? = null
