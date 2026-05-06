package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Tv2Fill: ImageVector
    get() {
        if (_tv2Fill != null) return _tv2Fill!!
        _tv2Fill = remixIcon(
            name = "Tv2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 4.001C2 3.448 2.455 3 2.992 3h18.016c.548 0 .992 .445 .992 1.001v13.998c0 .553-.455 1.001-.992 1.001h-18.016C2.444 19 2 18.555 2 17.999v-13.998ZM5 20h14v2h-14v-2Z"),
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
        return _tv2Fill!!
    }

private var _tv2Fill: ImageVector? = null
