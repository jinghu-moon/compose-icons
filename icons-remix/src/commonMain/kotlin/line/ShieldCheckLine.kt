package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ShieldCheckLine: ImageVector
    get() {
        if (_shieldCheckLine != null) return _shieldCheckLine!!
        _shieldCheckLine = remixIcon(
            name = "ShieldCheckLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 1.000 L 20.217 2.826 C 20.674 2.928 21.000 3.333 21.000 3.802 L 21.000 13.789 C 21.000 15.795 19.997 17.668 18.328 18.781 L 12.000 23.000 L 5.672 18.781 C 4.003 17.668 3.000 15.795 3.000 13.789 L 3.000 3.802 C 3.000 3.333 3.326 2.928 3.783 2.826 L 12.000 1.000 ZM 12.000 3.049 L 5.000 4.604 L 5.000 13.789 C 5.000 15.126 5.668 16.375 6.781 17.117 L 12.000 20.596 L 17.219 17.117 C 18.332 16.375 19.000 15.126 19.000 13.789 L 19.000 4.604 L 12.000 3.049 ZM 16.452 8.222 L 17.867 9.636 L 11.503 16.000 L 7.260 11.757 L 8.674 10.343 L 11.502 13.171 L 16.452 8.222 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _shieldCheckLine!!
    }

private var _shieldCheckLine: ImageVector? = null
