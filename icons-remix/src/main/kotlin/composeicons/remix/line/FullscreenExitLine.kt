package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FullscreenExitLine: ImageVector
    get() {
        if (_fullscreenExitLine != null) return _fullscreenExitLine!!
        _fullscreenExitLine = remixIcon(
            name = "FullscreenExitLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 7h4v2h-6v-6h2v4ZM8 9h-6v-2h4v-4h2v6ZM18 17v4h-2v-6h6v2h-4ZM8 15v6h-2v-4h-4v-2h6Z"),
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
        return _fullscreenExitLine!!
    }

private var _fullscreenExitLine: ImageVector? = null
