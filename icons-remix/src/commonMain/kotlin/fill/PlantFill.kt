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
                pathData = parseSvgPathData("M 20.998 3.000 L 20.998 5.000 C 20.998 8.866 17.864 12.000 13.998 12.000 L 12.998 12.000 L 12.998 13.000 L 17.998 13.000 L 17.998 20.000 C 17.998 21.105 17.103 22.000 15.998 22.000 L 7.998 22.000 C 6.893 22.000 5.998 21.105 5.998 20.000 L 5.998 13.000 L 10.998 13.000 L 10.998 10.000 C 10.998 6.134 14.132 3.000 17.998 3.000 L 20.998 3.000 ZM 5.498 2.000 C 8.027 2.000 10.263 3.251 11.622 5.169 C 10.603 6.511 9.998 8.185 9.998 10.000 L 9.998 11.000 L 9.498 11.000 C 5.356 11.000 1.998 7.642 1.998 3.500 L 1.998 2.000 L 5.498 2.000 Z"),
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
