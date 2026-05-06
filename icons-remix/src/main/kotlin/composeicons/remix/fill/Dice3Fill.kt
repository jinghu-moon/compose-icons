package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Dice3Fill: ImageVector
    get() {
        if (_dice3Fill != null) return _dice3Fill!!
        _dice3Fill = remixIcon(
            name = "Dice3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5 3C3.895 3 3 3.895 3 5v14c0 1.105 .895 2 2 2h14c1.105 0 2-.895 2-2v-14C21 3.895 20.105 3 19 3h-14ZM8.5 10C7.672 10 7 9.328 7 8.5 7 7.672 7.672 7 8.5 7 9.328 7 10 7.672 10 8.5 10 9.328 9.328 10 8.5 10ZM15.5 17C14.672 17 14 16.328 14 15.5 14 14.672 14.672 14 15.5 14c.828 0 1.5 .672 1.5 1.5C17 16.328 16.328 17 15.5 17ZM13.5 12c0 .828-.672 1.5-1.5 1.5-.828 0-1.5-.672-1.5-1.5 0-.828 .672-1.5 1.5-1.5 .828 0 1.5 .672 1.5 1.5Z"),
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
        return _dice3Fill!!
    }

private var _dice3Fill: ImageVector? = null
