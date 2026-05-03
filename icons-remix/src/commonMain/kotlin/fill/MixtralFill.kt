package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MixtralFill: ImageVector
    get() {
        if (_mixtralFill != null) return _mixtralFill!!
        _mixtralFill = remixIcon(
            name = "MixtralFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 3.000 L 6.600 3.000 L 6.600 6.600 L 10.200 6.600 L 10.200 10.200 L 13.800 10.200 L 13.800 6.600 L 17.400 6.600 L 17.400 3.000 L 21.000 3.000 L 21.000 21.000 L 17.400 21.000 L 17.400 13.800 L 13.800 13.800 L 13.800 17.400 L 10.200 17.400 L 10.200 13.800 L 6.600 13.800 L 6.600 21.000 L 3.000 21.000 L 3.000 3.000 Z"),
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
        return _mixtralFill!!
    }

private var _mixtralFill: ImageVector? = null
