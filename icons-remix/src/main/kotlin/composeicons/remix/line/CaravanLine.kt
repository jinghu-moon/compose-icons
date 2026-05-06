package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CaravanLine: ImageVector
    get() {
        if (_caravanLine != null) return _caravanLine!!
        _caravanLine = remixIcon(
            name = "CaravanLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.172 3c.53 0 1.039 .211 1.414 .586l4.828 4.828c.375 .375 .586 .884 .586 1.414v7.172h2v2l-8.126 .001C14.429 20.726 12.864 22 11 22 9.136 22 7.571 20.726 7.126 19.001L3 19C2.448 19 2 18.552 2 18v-13C2 3.895 2.895 3 4 3h10.172ZM11 16c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2ZM14.172 5h-10.172v12l3.126 0C7.57 15.275 9.136 14 11 14c1.864 0 3.43 1.275 3.874 3L19 17v-7.172L14.172 5ZM14 7v6h-8v-6h8ZM12 9h-4v2h4v-2Z"),
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
        return _caravanLine!!
    }

private var _caravanLine: ImageVector? = null
