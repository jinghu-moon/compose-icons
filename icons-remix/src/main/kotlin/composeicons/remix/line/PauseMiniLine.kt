package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PauseMiniLine: ImageVector
    get() {
        if (_pauseMiniLine != null) return _pauseMiniLine!!
        _pauseMiniLine = remixIcon(
            name = "PauseMiniLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 7c0-.552 .448-1 1-1 .552 0 1 .448 1 1v10c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-10ZM7 7C7 6.448 7.448 6 8 6c.552 0 1 .448 1 1v10c0 .552-.448 1-1 1C7.448 18 7 17.552 7 17v-10Z"),
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
        return _pauseMiniLine!!
    }

private var _pauseMiniLine: ImageVector? = null
