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
                pathData = parseSvgPathData("M 6.000 7.000 C 6.000 6.448 6.448 6.000 7.000 6.000 L 17.000 6.000 C 17.552 6.000 18.000 6.448 18.000 7.000 L 18.000 17.000 C 18.000 17.552 17.552 18.000 17.000 18.000 L 7.000 18.000 C 6.448 18.000 6.000 17.552 6.000 17.000 L 6.000 7.000 ZM 8.000 8.000 L 8.000 16.000 L 16.000 16.000 L 16.000 8.000 L 8.000 8.000 Z"),
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
