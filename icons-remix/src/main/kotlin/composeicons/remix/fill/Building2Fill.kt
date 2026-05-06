package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Building2Fill: ImageVector
    get() {
        if (_building2Fill != null) return _building2Fill!!
        _building2Fill = remixIcon(
            name = "Building2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 19h2v-13l6.394 2.74c.368 .158 .606 .519 .606 .919v9.341h2v2h-22v-2h2v-13.35c0-.395 .233-.753 .594-.914L11.297 1.313c.252-.112 .548 .001 .66 .254 .028 .064 .043 .133 .043 .203v17.231Z"),
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
        return _building2Fill!!
    }

private var _building2Fill: ImageVector? = null
