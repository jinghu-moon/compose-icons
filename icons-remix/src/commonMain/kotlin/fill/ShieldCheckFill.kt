package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ShieldCheckFill: ImageVector
    get() {
        if (_shieldCheckFill != null) return _shieldCheckFill!!
        _shieldCheckFill = remixIcon(
            name = "ShieldCheckFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 1.000 L 20.217 2.826 C 20.674 2.928 21.000 3.333 21.000 3.802 L 21.000 13.789 C 21.000 15.795 19.997 17.668 18.328 18.781 L 12.000 23.000 L 5.672 18.781 C 4.003 17.668 3.000 15.795 3.000 13.789 L 3.000 3.802 C 3.000 3.333 3.326 2.928 3.783 2.826 L 12.000 1.000 ZM 16.452 8.222 L 11.502 13.171 L 8.674 10.343 L 7.260 11.757 L 11.503 16.000 L 17.867 9.636 L 16.452 8.222 Z"),
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
        return _shieldCheckFill!!
    }

private var _shieldCheckFill: ImageVector? = null
