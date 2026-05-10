package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Apps2Fill: ImageVector
    get() {
        if (_apps2Fill != null) return _apps2Fill!!
        _apps2Fill = remixIcon(
            name = "Apps2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 11.5C4.515 11.5 2.5 9.485 2.5 7 2.5 4.515 4.515 2.5 7 2.5c2.485 0 4.5 2.015 4.5 4.5 0 2.485-2.015 4.5-4.5 4.5ZM7 21.5C4.515 21.5 2.5 19.485 2.5 17 2.5 14.515 4.515 12.5 7 12.5c2.485 0 4.5 2.015 4.5 4.5 0 2.485-2.015 4.5-4.5 4.5ZM17 11.5C14.515 11.5 12.5 9.485 12.5 7 12.5 4.515 14.515 2.5 17 2.5c2.485 0 4.5 2.015 4.5 4.5 0 2.485-2.015 4.5-4.5 4.5ZM17 21.5c-2.485 0-4.5-2.015-4.5-4.5 0-2.485 2.015-4.5 4.5-4.5 2.485 0 4.5 2.015 4.5 4.5 0 2.485-2.015 4.5-4.5 4.5Z"),
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
        return _apps2Fill!!
    }

private var _apps2Fill: ImageVector? = null
