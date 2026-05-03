package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Dice1Fill: ImageVector
    get() {
        if (_dice1Fill != null) return _dice1Fill!!
        _dice1Fill = remixIcon(
            name = "Dice1Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.000 3.000 C 3.895 3.000 3.000 3.895 3.000 5.000 L 3.000 19.000 C 3.000 20.105 3.895 21.000 5.000 21.000 L 19.000 21.000 C 20.105 21.000 21.000 20.105 21.000 19.000 L 21.000 5.000 C 21.000 3.895 20.105 3.000 19.000 3.000 L 5.000 3.000 ZM 12.000 14.000 C 10.895 14.000 10.000 13.105 10.000 12.000 C 10.000 10.895 10.895 10.000 12.000 10.000 C 13.105 10.000 14.000 10.895 14.000 12.000 C 14.000 13.105 13.105 14.000 12.000 14.000 Z"),
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
        return _dice1Fill!!
    }

private var _dice1Fill: ImageVector? = null
