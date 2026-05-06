package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DirectionLine: ImageVector
    get() {
        if (_directionLine != null) return _directionLine!!
        _directionLine = remixIcon(
            name = "DirectionLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 3.515 3.515 12l8.485 8.485 8.485-8.485L12 3.515ZM12.707 1.393l9.9 9.9c.39 .391 .39 1.024 0 1.414l-9.9 9.9c-.391 .39-1.024 .39-1.414 0L1.393 12.707c-.391-.391-.391-1.024 0-1.414L11.293 1.393c.391-.391 1.024-.391 1.414 0ZM13 10v-2.5l3.5 3.5-3.5 3.5v-2.5h-3v3h-2v-4c0-.552 .448-1 1-1h4Z"),
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
        return _directionLine!!
    }

private var _directionLine: ImageVector? = null
