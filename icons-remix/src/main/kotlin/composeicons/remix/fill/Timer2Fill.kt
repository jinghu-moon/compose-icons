package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Timer2Fill: ImageVector
    get() {
        if (_timer2Fill != null) return _timer2Fill!!
        _timer2Fill = remixIcon(
            name = "Timer2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.52 0 10 4.48 10 10 0 5.52-4.48 10-10 10C6.48 22 2 17.52 2 12 2 6.48 6.48 2 12 2ZM15.535 7.05 10.586 12 12 13.414 16.95 8.464 15.535 7.05Z"),
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
        return _timer2Fill!!
    }

private var _timer2Fill: ImageVector? = null
