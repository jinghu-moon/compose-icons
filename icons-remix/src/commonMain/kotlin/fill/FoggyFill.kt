package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FoggyFill: ImageVector
    get() {
        if (_foggyFill != null) return _foggyFill!!
        _foggyFill = remixIcon(
            name = "FoggyFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 1.584 13.007 C 1.208 12.079 1.000 11.064 1.000 10.000 C 1.000 5.582 4.582 2.000 9.000 2.000 C 12.395 2.000 15.296 4.115 16.458 7.099 C 16.795 7.034 17.144 7.000 17.500 7.000 C 20.538 7.000 23.000 9.462 23.000 12.500 C 23.000 12.671 22.992 12.840 22.977 13.007 L 1.584 13.007 ZM 4.000 19.000 L 21.000 19.000 L 21.000 21.000 L 4.000 21.000 L 4.000 19.000 ZM 2.000 15.000 L 23.000 15.000 L 23.000 17.000 L 2.000 17.000 L 2.000 15.000 Z"),
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
        return _foggyFill!!
    }

private var _foggyFill: ImageVector? = null
