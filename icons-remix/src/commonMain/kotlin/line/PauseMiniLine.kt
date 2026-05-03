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
                pathData = parseSvgPathData("M 15.000 7.000 C 15.000 6.448 15.448 6.000 16.000 6.000 C 16.552 6.000 17.000 6.448 17.000 7.000 L 17.000 17.000 C 17.000 17.552 16.552 18.000 16.000 18.000 C 15.448 18.000 15.000 17.552 15.000 17.000 L 15.000 7.000 ZM 7.000 7.000 C 7.000 6.448 7.448 6.000 8.000 6.000 C 8.552 6.000 9.000 6.448 9.000 7.000 L 9.000 17.000 C 9.000 17.552 8.552 18.000 8.000 18.000 C 7.448 18.000 7.000 17.552 7.000 17.000 L 7.000 7.000 Z"),
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
