package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ShieldUserFill: ImageVector
    get() {
        if (_shieldUserFill != null) return _shieldUserFill!!
        _shieldUserFill = remixIcon(
            name = "ShieldUserFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.783 2.826 L 12.000 1.000 L 20.217 2.826 C 20.674 2.928 21.000 3.333 21.000 3.802 L 21.000 13.789 C 21.000 15.795 19.997 17.668 18.328 18.781 L 12.000 23.000 L 5.672 18.781 C 4.003 17.668 3.000 15.795 3.000 13.789 L 3.000 3.802 C 3.000 3.333 3.326 2.928 3.783 2.826 ZM 12.000 11.000 C 13.381 11.000 14.500 9.881 14.500 8.500 C 14.500 7.119 13.381 6.000 12.000 6.000 C 10.619 6.000 9.500 7.119 9.500 8.500 C 9.500 9.881 10.619 11.000 12.000 11.000 ZM 7.527 16.000 L 16.472 16.000 C 16.224 13.750 14.316 12.000 12.000 12.000 C 9.684 12.000 7.776 13.750 7.527 16.000 Z"),
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
        return _shieldUserFill!!
    }

private var _shieldUserFill: ImageVector? = null
