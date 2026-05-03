package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MoreFill: ImageVector
    get() {
        if (_moreFill != null) return _moreFill!!
        _moreFill = remixIcon(
            name = "MoreFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.000 10.000 C 3.900 10.000 3.000 10.900 3.000 12.000 C 3.000 13.100 3.900 14.000 5.000 14.000 C 6.100 14.000 7.000 13.100 7.000 12.000 C 7.000 10.900 6.100 10.000 5.000 10.000 ZM 19.000 10.000 C 17.900 10.000 17.000 10.900 17.000 12.000 C 17.000 13.100 17.900 14.000 19.000 14.000 C 20.100 14.000 21.000 13.100 21.000 12.000 C 21.000 10.900 20.100 10.000 19.000 10.000 ZM 12.000 10.000 C 10.900 10.000 10.000 10.900 10.000 12.000 C 10.000 13.100 10.900 14.000 12.000 14.000 C 13.100 14.000 14.000 13.100 14.000 12.000 C 14.000 10.900 13.100 10.000 12.000 10.000 Z"),
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
        return _moreFill!!
    }

private var _moreFill: ImageVector? = null
