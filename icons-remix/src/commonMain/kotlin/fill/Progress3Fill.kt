package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Progress3Fill: ImageVector
    get() {
        if (_progress3Fill != null) return _progress3Fill!!
        _progress3Fill = remixIcon(
            name = "Progress3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 22.000 C 17.523 22.000 22.000 17.523 22.000 12.000 C 22.000 6.477 17.523 2.000 12.000 2.000 C 6.477 2.000 2.000 6.477 2.000 12.000 C 2.000 17.523 6.477 22.000 12.000 22.000 ZM 18.000 12.000 C 18.000 13.657 17.328 15.157 16.243 16.243 L 12.000 12.000 L 12.000 6.000 C 15.314 6.000 18.000 8.686 18.000 12.000 Z"),
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
        return _progress3Fill!!
    }

private var _progress3Fill: ImageVector? = null
