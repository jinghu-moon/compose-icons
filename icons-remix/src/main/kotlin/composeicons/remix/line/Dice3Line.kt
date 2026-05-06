package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Dice3Line: ImageVector
    get() {
        if (_dice3Line != null) return _dice3Line!!
        _dice3Line = remixIcon(
            name = "Dice3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5 5v14h14v-14h-14ZM3 5C3 3.895 3.895 3 5 3h14c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-14ZM15.5 17C16.328 17 17 16.328 17 15.5 17 14.672 16.328 14 15.5 14 14.672 14 14 14.672 14 15.5c0 .828 .672 1.5 1.5 1.5ZM10 8.5C10 9.328 9.328 10 8.5 10 7.672 10 7 9.328 7 8.5 7 7.672 7.672 7 8.5 7 9.328 7 10 7.672 10 8.5ZM12 13.5c.828 0 1.5-.672 1.5-1.5 0-.828-.672-1.5-1.5-1.5-.828 0-1.5 .672-1.5 1.5 0 .828 .672 1.5 1.5 1.5Z"),
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
        return _dice3Line!!
    }

private var _dice3Line: ImageVector? = null
