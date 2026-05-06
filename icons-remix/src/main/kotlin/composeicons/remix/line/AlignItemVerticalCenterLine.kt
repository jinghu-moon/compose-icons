package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AlignItemVerticalCenterLine: ImageVector
    get() {
        if (_alignItemVerticalCenterLine != null) return _alignItemVerticalCenterLine!!
        _alignItemVerticalCenterLine = remixIcon(
            name = "AlignItemVerticalCenterLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 18v-12h-3v12h3ZM5 20C4.448 20 4 19.552 4 19v-6h-2v-2h2v-6C4 4.448 4.448 4 5 4h5c.552 0 1 .448 1 1v6h2v-4c0-.552 .448-1 1-1h5c.552 0 1 .448 1 1v4h2v2h-2v4c0 .552-.448 1-1 1h-5c-.552 0-1-.448-1-1v-4h-2v6c0 .552-.448 1-1 1h-5ZM15 16h3v-8h-3v8Z"),
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
        return _alignItemVerticalCenterLine!!
    }

private var _alignItemVerticalCenterLine: ImageVector? = null
