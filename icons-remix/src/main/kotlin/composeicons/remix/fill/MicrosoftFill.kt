package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MicrosoftFill: ImageVector
    get() {
        if (_microsoftFill != null) return _microsoftFill!!
        _microsoftFill = remixIcon(
            name = "MicrosoftFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.501 3v8.5h-8.5v-8.5h8.5ZM11.501 21h-8.5v-8.5h8.5v8.5ZM12.501 3h8.5v8.5h-8.5v-8.5ZM21.001 12.5v8.5h-8.5v-8.5h8.5Z"),
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
        return _microsoftFill!!
    }

private var _microsoftFill: ImageVector? = null
