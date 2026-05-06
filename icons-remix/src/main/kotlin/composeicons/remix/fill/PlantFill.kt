package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PlantFill: ImageVector
    get() {
        if (_plantFill != null) return _plantFill!!
        _plantFill = remixIcon(
            name = "PlantFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.998 3v2c0 3.866-3.134 7-7 7h-1v1h5v7c0 1.105-.895 2-2 2h-8c-1.105 0-2-.895-2-2v-7h5v-3c0-3.866 3.134-7 7-7h3ZM5.498 2c2.529 0 4.765 1.251 6.124 3.169C10.603 6.511 9.998 8.185 9.998 10v1h-.5C5.356 11 1.998 7.642 1.998 3.5v-1.5h3.5Z"),
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
        return _plantFill!!
    }

private var _plantFill: ImageVector? = null
