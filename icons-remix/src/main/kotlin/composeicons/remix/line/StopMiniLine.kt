package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.StopMiniLine: ImageVector
    get() {
        if (_stopMiniLine != null) return _stopMiniLine!!
        _stopMiniLine = remixIcon(
            name = "StopMiniLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6 7C6 6.448 6.448 6 7 6h10c.552 0 1 .448 1 1v10c0 .552-.448 1-1 1h-10C6.448 18 6 17.552 6 17v-10ZM8 8v8h8v-8h-8Z"),
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
        return _stopMiniLine!!
    }

private var _stopMiniLine: ImageVector? = null
