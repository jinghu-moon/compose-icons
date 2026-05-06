package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Home9Line: ImageVector
    get() {
        if (_home9Line != null) return _home9Line!!
        _home9Line = remixIcon(
            name = "Home9Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.581 2.686c-.348-.248-.815-.248-1.162 0L1.919 9.472l1.162 1.627L12 4.729l8.919 6.37L22.081 9.472 12.581 2.686ZM19.581 12.686l-7-5c-.348-.248-.815-.248-1.162 0l-7 5c-.263 .188-.419 .491-.419 .814v6.5c0 .552 .448 1 1 1h14c.552 0 1-.448 1-1v-6.5c0-.323-.156-.626-.419-.814ZM6 19v-4.985L12 9.729l6 4.286v4.985h-12Z"),
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
        return _home9Line!!
    }

private var _home9Line: ImageVector? = null
