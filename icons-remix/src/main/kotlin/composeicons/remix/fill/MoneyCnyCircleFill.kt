package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MoneyCnyCircleFill: ImageVector
    get() {
        if (_moneyCnyCircleFill != null) return _moneyCnyCircleFill!!
        _moneyCnyCircleFill = remixIcon(
            name = "MoneyCnyCircleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.005 22.003C6.482 22.003 2.005 17.526 2.005 12.003 2.005 6.48 6.482 2.003 12.005 2.003c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10ZM13.005 13.003v-1h3v-2h-2.586L15.54 7.881 14.126 6.467 12.005 8.589 9.884 6.467 8.469 7.881l2.121 2.121h-2.586v2h3v1h-3v2h3v2h2v-2h3v-2h-3Z"),
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
        return _moneyCnyCircleFill!!
    }

private var _moneyCnyCircleFill: ImageVector? = null
