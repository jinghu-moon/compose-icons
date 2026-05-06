package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BitCoinLine: ImageVector
    get() {
        if (_bitCoinLine != null) return _bitCoinLine!!
        _bitCoinLine = remixIcon(
            name = "BitCoinLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.005 22.003c-5.523 0-10-4.477-10-10C2.005 6.48 6.482 2.003 12.005 2.003c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10ZM12.005 20.003c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM11.005 16.003h-3v-8h3v-2h2v2h1c1.381 0 2.5 1.119 2.5 2.5 0 .563-.186 1.082-.5 1.5 .314 .418 .5 .937 .5 1.5 0 1.381-1.119 2.5-2.5 2.5h-1v2h-2v-2ZM10.005 13.003v1h4c.276 0 .5-.224 .5-.5 0-.276-.224-.5-.5-.5h-4ZM10.005 10.003v1h4c.276 0 .5-.224 .5-.5 0-.276-.224-.5-.5-.5h-4Z"),
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
        return _bitCoinLine!!
    }

private var _bitCoinLine: ImageVector? = null
