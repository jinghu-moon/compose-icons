package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AlignItemBottomFill: ImageVector
    get() {
        if (_alignItemBottomFill != null) return _alignItemBottomFill!!
        _alignItemBottomFill = remixIcon(
            name = "AlignItemBottomFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 4.000 C 4.000 3.448 4.448 3.000 5.000 3.000 L 10.000 3.000 C 10.552 3.000 11.000 3.448 11.000 4.000 L 11.000 16.000 C 11.000 16.552 10.552 17.000 10.000 17.000 L 5.000 17.000 C 4.448 17.000 4.000 16.552 4.000 16.000 L 4.000 4.000 ZM 14.000 7.000 C 13.448 7.000 13.000 7.448 13.000 8.000 L 13.000 16.000 C 13.000 16.552 13.448 17.000 14.000 17.000 L 19.000 17.000 C 19.552 17.000 20.000 16.552 20.000 16.000 L 20.000 8.000 C 20.000 7.448 19.552 7.000 19.000 7.000 L 14.000 7.000 ZM 21.000 19.000 L 3.000 19.000 L 3.000 21.000 L 21.000 21.000 L 21.000 19.000 Z"),
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
        return _alignItemBottomFill!!
    }

private var _alignItemBottomFill: ImageVector? = null
