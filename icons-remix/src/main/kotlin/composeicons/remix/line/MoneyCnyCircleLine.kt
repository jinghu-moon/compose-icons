package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MoneyCnyCircleLine: ImageVector
    get() {
        if (_moneyCnyCircleLine != null) return _moneyCnyCircleLine!!
        _moneyCnyCircleLine = remixIcon(
            name = "MoneyCnyCircleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.005 22.003C6.482 22.003 2.005 17.526 2.005 12.003 2.005 6.48 6.482 2.003 12.005 2.003c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10ZM12.005 20.003c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM13.005 13.003h3v2h-3v2h-2v-2h-3v-2h3v-1h-3v-2h2.586L8.469 7.881 9.884 6.467l2.121 2.121L14.126 6.467l1.414 1.414-2.121 2.121h2.586v2h-3v1Z"),
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
        return _moneyCnyCircleLine!!
    }

private var _moneyCnyCircleLine: ImageVector? = null
