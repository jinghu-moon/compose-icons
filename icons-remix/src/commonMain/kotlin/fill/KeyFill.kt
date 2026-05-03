package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.KeyFill: ImageVector
    get() {
        if (_keyFill != null) return _keyFill!!
        _keyFill = remixIcon(
            name = "KeyFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 14.000 L 12.659 14.000 C 11.835 16.330 9.612 18.000 7.000 18.000 C 3.686 18.000 1.000 15.314 1.000 12.000 C 1.000 8.686 3.686 6.000 7.000 6.000 C 9.612 6.000 11.835 7.670 12.659 10.000 L 23.000 10.000 L 23.000 14.000 L 21.000 14.000 L 21.000 18.000 L 17.000 18.000 L 17.000 14.000 ZM 7.000 14.000 C 8.105 14.000 9.000 13.105 9.000 12.000 C 9.000 10.895 8.105 10.000 7.000 10.000 C 5.895 10.000 5.000 10.895 5.000 12.000 C 5.000 13.105 5.895 14.000 7.000 14.000 Z"),
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
        return _keyFill!!
    }

private var _keyFill: ImageVector? = null
