package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CupFill: ImageVector
    get() {
        if (_cupFill != null) return _cupFill!!
        _cupFill = remixIcon(
            name = "CupFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.000 3.000 L 20.000 3.000 C 21.105 3.000 22.000 3.895 22.000 5.000 L 22.000 8.000 C 22.000 9.105 21.105 10.000 20.000 10.000 L 18.000 10.000 L 18.000 13.000 C 18.000 15.209 16.209 17.000 14.000 17.000 L 8.000 17.000 C 5.791 17.000 4.000 15.209 4.000 13.000 L 4.000 4.000 C 4.000 3.448 4.448 3.000 5.000 3.000 ZM 18.000 5.000 L 18.000 8.000 L 20.000 8.000 L 20.000 5.000 L 18.000 5.000 ZM 2.000 19.000 L 20.000 19.000 L 20.000 21.000 L 2.000 21.000 L 2.000 19.000 Z"),
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
        return _cupFill!!
    }

private var _cupFill: ImageVector? = null
