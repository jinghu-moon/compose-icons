package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ArrowGoBackFill: ImageVector
    get() {
        if (_arrowGoBackFill != null) return _arrowGoBackFill!!
        _arrowGoBackFill = remixIcon(
            name = "ArrowGoBackFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8 7v4L2 6 8 1v4h5c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-9v-2h9c3.314 0 6-2.686 6-6C19 9.686 16.314 7 13 7h-5Z"),
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
        return _arrowGoBackFill!!
    }

private var _arrowGoBackFill: ImageVector? = null
