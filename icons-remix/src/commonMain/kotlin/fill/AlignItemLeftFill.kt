package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AlignItemLeftFill: ImageVector
    get() {
        if (_alignItemLeftFill != null) return _alignItemLeftFill!!
        _alignItemLeftFill = remixIcon(
            name = "AlignItemLeftFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 21.000 L 3.000 3.000 L 5.000 3.000 L 5.000 21.000 L 3.000 21.000 ZM 7.000 14.000 C 7.000 13.448 7.448 13.000 8.000 13.000 L 16.000 13.000 C 16.552 13.000 17.000 13.448 17.000 14.000 L 17.000 19.000 C 17.000 19.552 16.552 20.000 16.000 20.000 L 8.000 20.000 C 7.448 20.000 7.000 19.552 7.000 19.000 L 7.000 14.000 ZM 8.000 4.000 C 7.448 4.000 7.000 4.448 7.000 5.000 L 7.000 10.000 C 7.000 10.552 7.448 11.000 8.000 11.000 L 20.000 11.000 C 20.552 11.000 21.000 10.552 21.000 10.000 L 21.000 5.000 C 21.000 4.448 20.552 4.000 20.000 4.000 L 8.000 4.000 Z"),
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
        return _alignItemLeftFill!!
    }

private var _alignItemLeftFill: ImageVector? = null
