package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Save3Fill: ImageVector
    get() {
        if (_save3Fill != null) return _save3Fill!!
        _save3Fill = remixIcon(
            name = "Save3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 3.000 L 18.000 3.000 L 20.707 5.707 C 20.895 5.895 21.000 6.149 21.000 6.414 L 21.000 20.000 C 21.000 20.552 20.552 21.000 20.000 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 4.000 C 3.000 3.448 3.448 3.000 4.000 3.000 ZM 7.000 4.000 L 7.000 9.000 L 16.000 9.000 L 16.000 4.000 L 7.000 4.000 ZM 6.000 12.000 L 6.000 19.000 L 18.000 19.000 L 18.000 12.000 L 6.000 12.000 ZM 13.000 5.000 L 15.000 5.000 L 15.000 8.000 L 13.000 8.000 L 13.000 5.000 Z"),
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
        return _save3Fill!!
    }

private var _save3Fill: ImageVector? = null
