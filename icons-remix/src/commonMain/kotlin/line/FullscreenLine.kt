package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FullscreenLine: ImageVector
    get() {
        if (_fullscreenLine != null) return _fullscreenLine!!
        _fullscreenLine = remixIcon(
            name = "FullscreenLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.000 3.000 L 8.000 5.000 L 4.000 5.000 L 4.000 9.000 L 2.000 9.000 L 2.000 3.000 L 8.000 3.000 ZM 2.000 21.000 L 2.000 15.000 L 4.000 15.000 L 4.000 19.000 L 8.000 19.000 L 8.000 21.000 L 2.000 21.000 ZM 22.000 21.000 L 16.000 21.000 L 16.000 19.000 L 20.000 19.000 L 20.000 15.000 L 22.000 15.000 L 22.000 21.000 ZM 22.000 9.000 L 20.000 9.000 L 20.000 5.000 L 16.000 5.000 L 16.000 3.000 L 22.000 3.000 L 22.000 9.000 Z"),
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
        return _fullscreenLine!!
    }

private var _fullscreenLine: ImageVector? = null
