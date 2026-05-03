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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.000 7.000 L 22.000 7.000 L 22.000 9.000 L 16.000 9.000 L 16.000 3.000 L 18.000 3.000 L 18.000 7.000 ZM 8.000 9.000 L 2.000 9.000 L 2.000 7.000 L 6.000 7.000 L 6.000 3.000 L 8.000 3.000 L 8.000 9.000 ZM 18.000 17.000 L 18.000 21.000 L 16.000 21.000 L 16.000 15.000 L 22.000 15.000 L 22.000 17.000 L 18.000 17.000 ZM 8.000 15.000 L 8.000 21.000 L 6.000 21.000 L 6.000 17.000 L 2.000 17.000 L 2.000 15.000 L 8.000 15.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _fullscreenExitLine!!
    }

private var _fullscreenExitLine: ImageVector? = null
