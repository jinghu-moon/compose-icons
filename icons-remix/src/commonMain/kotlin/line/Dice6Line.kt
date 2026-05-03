package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Dice6Line: ImageVector
    get() {
        if (_dice6Line != null) return _dice6Line!!
        _dice6Line = remixIcon(
            name = "Dice6Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 5.000 L 19.000 19.000 L 5.000 19.000 L 5.000 5.000 L 19.000 5.000 ZM 5.000 3.000 C 3.895 3.000 3.000 3.895 3.000 5.000 L 3.000 19.000 C 3.000 20.105 3.895 21.000 5.000 21.000 L 19.000 21.000 C 20.105 21.000 21.000 20.105 21.000 19.000 L 21.000 5.000 C 21.000 3.895 20.105 3.000 19.000 3.000 L 5.000 3.000 ZM 9.000 9.500 C 9.828 9.500 10.500 8.828 10.500 8.000 C 10.500 7.172 9.828 6.500 9.000 6.500 C 8.172 6.500 7.500 7.172 7.500 8.000 C 7.500 8.828 8.172 9.500 9.000 9.500 ZM 10.500 12.000 C 10.500 12.828 9.828 13.500 9.000 13.500 C 8.172 13.500 7.500 12.828 7.500 12.000 C 7.500 11.172 8.172 10.500 9.000 10.500 C 9.828 10.500 10.500 11.172 10.500 12.000 ZM 10.500 16.000 C 10.500 16.828 9.828 17.500 9.000 17.500 C 8.172 17.500 7.500 16.828 7.500 16.000 C 7.500 15.172 8.172 14.500 9.000 14.500 C 9.828 14.500 10.500 15.172 10.500 16.000 ZM 16.500 8.000 C 16.500 8.828 15.828 9.500 15.000 9.500 C 14.172 9.500 13.500 8.828 13.500 8.000 C 13.500 7.172 14.172 6.500 15.000 6.500 C 15.828 6.500 16.500 7.172 16.500 8.000 ZM 15.000 13.500 C 15.828 13.500 16.500 12.828 16.500 12.000 C 16.500 11.172 15.828 10.500 15.000 10.500 C 14.172 10.500 13.500 11.172 13.500 12.000 C 13.500 12.828 14.172 13.500 15.000 13.500 ZM 15.000 17.500 C 15.828 17.500 16.500 16.828 16.500 16.000 C 16.500 15.172 15.828 14.500 15.000 14.500 C 14.172 14.500 13.500 15.172 13.500 16.000 C 13.500 16.828 14.172 17.500 15.000 17.500 Z"),
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
        return _dice6Line!!
    }

private var _dice6Line: ImageVector? = null
