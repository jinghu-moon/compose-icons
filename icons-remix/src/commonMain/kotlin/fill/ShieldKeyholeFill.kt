package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ShieldKeyholeFill: ImageVector
    get() {
        if (_shieldKeyholeFill != null) return _shieldKeyholeFill!!
        _shieldKeyholeFill = remixIcon(
            name = "ShieldKeyholeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 1.000 L 20.217 2.826 C 20.674 2.928 21.000 3.333 21.000 3.802 L 21.000 13.789 C 21.000 15.795 19.997 17.668 18.328 18.781 L 12.000 23.000 L 5.672 18.781 C 4.003 17.668 3.000 15.795 3.000 13.789 L 3.000 3.802 C 3.000 3.333 3.326 2.928 3.783 2.826 L 12.000 1.000 ZM 12.000 7.000 C 10.895 7.000 10.000 7.895 10.000 9.000 C 10.000 9.740 10.402 10.387 11.000 10.732 L 11.000 15.000 L 13.000 15.000 L 13.001 10.732 C 13.598 10.386 14.000 9.740 14.000 9.000 C 14.000 7.895 13.105 7.000 12.000 7.000 Z"),
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
        return _shieldKeyholeFill!!
    }

private var _shieldKeyholeFill: ImageVector? = null
