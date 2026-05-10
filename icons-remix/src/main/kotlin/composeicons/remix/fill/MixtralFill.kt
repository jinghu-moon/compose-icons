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
                pathData = parseSvgPathData("M3 3h3.6v3.6l3.6 0v3.6l3.6 0v-3.6h3.6v-3.6h3.6v18h-3.6v-7.2l-3.6-0v3.6h-3.6v-3.6L6.6 13.8v7.2h-3.6v-18Z"),
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
