package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.LayoutHorizontalFill: ImageVector
    get() {
        if (_layoutHorizontalFill != null) return _layoutHorizontalFill!!
        _layoutHorizontalFill = remixIcon(
            name = "LayoutHorizontalFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 3.000 C 3.448 3.000 3.000 3.448 3.000 4.000 L 3.000 20.000 C 3.000 20.552 3.448 21.000 4.000 21.000 L 20.000 21.000 C 20.552 21.000 21.000 20.552 21.000 20.000 L 21.000 4.000 C 21.000 3.448 20.552 3.000 20.000 3.000 L 4.000 3.000 ZM 7.000 9.000 L 7.000 7.000 L 17.000 7.000 L 17.000 9.000 L 7.000 9.000 ZM 7.000 13.000 L 7.000 11.000 L 17.000 11.000 L 17.000 13.000 L 7.000 13.000 ZM 17.000 17.000 L 7.000 17.000 L 7.000 15.000 L 17.000 15.000 L 17.000 17.000 Z"),
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
        return _layoutHorizontalFill!!
    }

private var _layoutHorizontalFill: ImageVector? = null
