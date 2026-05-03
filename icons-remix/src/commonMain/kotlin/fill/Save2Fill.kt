package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Save2Fill: ImageVector
    get() {
        if (_save2Fill != null) return _save2Fill!!
        _save2Fill = remixIcon(
            name = "Save2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 3.000 L 17.000 3.000 L 20.707 6.707 C 20.895 6.895 21.000 7.149 21.000 7.414 L 21.000 20.000 C 21.000 20.552 20.552 21.000 20.000 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 4.000 C 3.000 3.448 3.448 3.000 4.000 3.000 ZM 12.000 18.000 C 13.657 18.000 15.000 16.657 15.000 15.000 C 15.000 13.343 13.657 12.000 12.000 12.000 C 10.343 12.000 9.000 13.343 9.000 15.000 C 9.000 16.657 10.343 18.000 12.000 18.000 ZM 5.000 5.000 L 5.000 9.000 L 15.000 9.000 L 15.000 5.000 L 5.000 5.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _save2Fill!!
    }

private var _save2Fill: ImageVector? = null
