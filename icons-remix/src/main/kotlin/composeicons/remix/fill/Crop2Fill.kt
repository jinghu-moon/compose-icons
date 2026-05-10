package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Crop2Fill: ImageVector
    get() {
        if (_crop2Fill != null) return _crop2Fill!!
        _crop2Fill = remixIcon(
            name = "Crop2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.586 5 20.142 2.444l1.414 1.414L19 6.414v10.586h3v2h-3v3h-2v-15h-8v-2h8.586ZM15 17v2h-9C5.448 19 5 18.552 5 18v-11h-3v-2h3v-3h2v15h8ZM9 9h6v6h-6v-6Z"),
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
        return _crop2Fill!!
    }

private var _crop2Fill: ImageVector? = null
