package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AccountCircleFill: ImageVector
    get() {
        if (_accountCircleFill != null) return _accountCircleFill!!
        _accountCircleFill = remixIcon(
            name = "AccountCircleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.52 0 10 4.48 10 10 0 5.52-4.48 10-10 10C6.48 22 2 17.52 2 12 2 6.48 6.48 2 12 2ZM6.023 15.416C7.491 17.607 9.695 19 12.16 19c2.465 0 4.669-1.393 6.136-3.584C16.688 13.917 14.531 13 12.16 13c-2.371 0-4.529 .917-6.136 2.416ZM12 11c1.657 0 3-1.343 3-3C15 6.343 13.657 5 12 5 10.343 5 9 6.343 9 8c0 1.657 1.343 3 3 3Z"),
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
        return _accountCircleFill!!
    }

private var _accountCircleFill: ImageVector? = null
