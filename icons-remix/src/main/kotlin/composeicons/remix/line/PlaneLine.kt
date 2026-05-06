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
                pathData = parseSvgPathData("M14 8.947 22 14v2L14 13.474v5.36l3 1.667v1.5L12.5 21 8 22v-1.5l3-1.667v-5.36L3 16v-2L11 8.947v-5.447C11 2.672 11.672 2 12.5 2 13.328 2 14 2.672 14 3.5v5.447Z"),
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
