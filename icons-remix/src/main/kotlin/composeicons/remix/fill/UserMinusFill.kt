package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.UserMinusFill: ImageVector
    get() {
        if (_userMinusFill != null) return _userMinusFill!!
        _userMinusFill = remixIcon(
            name = "UserMinusFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 14.252v7.748h-10c0-4.418 3.582-8 8-8 .691 0 1.361 .087 2 .252ZM12 13C8.685 13 6 10.315 6 7 6 3.685 8.685 1 12 1c3.315 0 6 2.685 6 6 0 3.315-2.685 6-6 6ZM23 18v2h-8v-2h8Z"),
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
        return _userMinusFill!!
    }

private var _userMinusFill: ImageVector? = null
