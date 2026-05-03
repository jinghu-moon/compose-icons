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
                pathData = parseSvgPathData("M 2.000 4.001 C 2.000 3.448 2.455 3.000 2.992 3.000 L 21.008 3.000 C 21.556 3.000 22.000 3.445 22.000 4.001 L 22.000 17.999 C 22.000 18.552 21.545 19.000 21.008 19.000 L 2.992 19.000 C 2.444 19.000 2.000 18.555 2.000 17.999 L 2.000 4.001 ZM 5.000 20.000 L 19.000 20.000 L 19.000 22.000 L 5.000 22.000 L 5.000 20.000 Z"),
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
