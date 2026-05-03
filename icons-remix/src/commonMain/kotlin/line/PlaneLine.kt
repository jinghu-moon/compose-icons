package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PlaneLine: ImageVector
    get() {
        if (_planeLine != null) return _planeLine!!
        _planeLine = remixIcon(
            name = "PlaneLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 8.947 L 22.000 14.000 L 22.000 16.000 L 14.000 13.474 L 14.000 18.833 L 17.000 20.500 L 17.000 22.000 L 12.500 21.000 L 8.000 22.000 L 8.000 20.500 L 11.000 18.833 L 11.000 13.474 L 3.000 16.000 L 3.000 14.000 L 11.000 8.947 L 11.000 3.500 C 11.000 2.672 11.672 2.000 12.500 2.000 C 13.328 2.000 14.000 2.672 14.000 3.500 L 14.000 8.947 Z"),
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
        return _planeLine!!
    }

private var _planeLine: ImageVector? = null
