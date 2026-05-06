package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Robot3Fill: ImageVector
    get() {
        if (_robot3Fill != null) return _robot3Fill!!
        _robot3Fill = remixIcon(
            name = "Robot3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 2h-4v-1h-2v1h-4C5.343 2 4 3.343 4 5v3c0 2.761 2.239 5 5 5h6c2.761 0 5-2.239 5-5v-3C20 3.343 18.657 2 17 2ZM11 7.5C11 8.328 10.328 9 9.5 9 8.672 9 8 8.328 8 7.5 8 6.672 8.672 6 9.5 6 10.328 6 11 6.672 11 7.5ZM16 7.5C16 8.328 15.328 9 14.5 9 13.672 9 13 8.328 13 7.5 13 6.672 13.672 6 14.5 6 15.328 6 16 6.672 16 7.5ZM4 22c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8h-16Z"),
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
        return _robot3Fill!!
    }

private var _robot3Fill: ImageVector? = null
