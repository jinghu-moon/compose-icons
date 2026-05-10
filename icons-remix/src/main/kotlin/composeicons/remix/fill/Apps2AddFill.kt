package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Apps2AddFill: ImageVector
    get() {
        if (_apps2AddFill != null) return _apps2AddFill!!
        _apps2AddFill = remixIcon(
            name = "Apps2AddFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2.5 7c0 2.485 2.015 4.5 4.5 4.5 2.485 0 4.5-2.015 4.5-4.5C11.5 4.515 9.485 2.5 7 2.5 4.515 2.5 2.5 4.515 2.5 7ZM2.5 17c0 2.485 2.015 4.5 4.5 4.5 2.485 0 4.5-2.015 4.5-4.5C11.5 14.515 9.485 12.5 7 12.5 4.515 12.5 2.5 14.515 2.5 17ZM12.5 17c0 2.485 2.015 4.5 4.5 4.5 2.485 0 4.5-2.015 4.5-4.5 0-2.485-2.015-4.5-4.5-4.5-2.485 0-4.5 2.015-4.5 4.5ZM16 11v-3h-3v-2h3v-3h2v3h3v2h-3v3h-2Z"),
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
        return _apps2AddFill!!
    }

private var _apps2AddFill: ImageVector? = null
