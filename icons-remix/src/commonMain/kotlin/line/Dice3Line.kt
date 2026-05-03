package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Dice3Line: ImageVector
    get() {
        if (_dice3Line != null) return _dice3Line!!
        _dice3Line = remixIcon(
            name = "Dice3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.000 5.000 L 5.000 19.000 L 19.000 19.000 L 19.000 5.000 L 5.000 5.000 ZM 3.000 5.000 C 3.000 3.895 3.895 3.000 5.000 3.000 L 19.000 3.000 C 20.105 3.000 21.000 3.895 21.000 5.000 L 21.000 19.000 C 21.000 20.105 20.105 21.000 19.000 21.000 L 5.000 21.000 C 3.895 21.000 3.000 20.105 3.000 19.000 L 3.000 5.000 ZM 15.500 17.000 C 16.328 17.000 17.000 16.328 17.000 15.500 C 17.000 14.672 16.328 14.000 15.500 14.000 C 14.672 14.000 14.000 14.672 14.000 15.500 C 14.000 16.328 14.672 17.000 15.500 17.000 ZM 10.000 8.500 C 10.000 9.328 9.328 10.000 8.500 10.000 C 7.672 10.000 7.000 9.328 7.000 8.500 C 7.000 7.672 7.672 7.000 8.500 7.000 C 9.328 7.000 10.000 7.672 10.000 8.500 ZM 12.000 13.500 C 12.828 13.500 13.500 12.828 13.500 12.000 C 13.500 11.172 12.828 10.500 12.000 10.500 C 11.172 10.500 10.500 11.172 10.500 12.000 C 10.500 12.828 11.172 13.500 12.000 13.500 Z"),
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
        return _dice3Line!!
    }

private var _dice3Line: ImageVector? = null
