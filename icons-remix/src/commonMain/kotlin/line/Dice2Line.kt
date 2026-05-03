package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Dice2Line: ImageVector
    get() {
        if (_dice2Line != null) return _dice2Line!!
        _dice2Line = remixIcon(
            name = "Dice2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 5.000 L 19.000 19.000 L 5.000 19.000 L 5.000 5.000 L 19.000 5.000 ZM 5.000 3.000 C 3.895 3.000 3.000 3.895 3.000 5.000 L 3.000 19.000 C 3.000 20.105 3.895 21.000 5.000 21.000 L 19.000 21.000 C 20.105 21.000 21.000 20.105 21.000 19.000 L 21.000 5.000 C 21.000 3.895 20.105 3.000 19.000 3.000 L 5.000 3.000 ZM 16.500 15.000 C 16.500 15.828 15.828 16.500 15.000 16.500 C 14.172 16.500 13.500 15.828 13.500 15.000 C 13.500 14.172 14.172 13.500 15.000 13.500 C 15.828 13.500 16.500 14.172 16.500 15.000 ZM 9.000 10.500 C 9.828 10.500 10.500 9.828 10.500 9.000 C 10.500 8.172 9.828 7.500 9.000 7.500 C 8.172 7.500 7.500 8.172 7.500 9.000 C 7.500 9.828 8.172 10.500 9.000 10.500 Z"),
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
        return _dice2Line!!
    }

private var _dice2Line: ImageVector? = null
