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
                pathData = parseSvgPathData("M 12.005 22.003 C 6.482 22.003 2.005 17.526 2.005 12.003 C 2.005 6.480 6.482 2.003 12.005 2.003 C 17.528 2.003 22.005 6.480 22.005 12.003 C 22.005 17.526 17.528 22.003 12.005 22.003 ZM 13.005 13.003 L 13.005 12.003 L 16.005 12.003 L 16.005 10.003 L 13.419 10.003 L 15.540 7.881 L 14.126 6.467 L 12.005 8.589 L 9.884 6.467 L 8.469 7.881 L 10.591 10.003 L 8.005 10.003 L 8.005 12.003 L 11.005 12.003 L 11.005 13.003 L 8.005 13.003 L 8.005 15.003 L 11.005 15.003 L 11.005 17.003 L 13.005 17.003 L 13.005 15.003 L 16.005 15.003 L 16.005 13.003 L 13.005 13.003 Z"),
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
