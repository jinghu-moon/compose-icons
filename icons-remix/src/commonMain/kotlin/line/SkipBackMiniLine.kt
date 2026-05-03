package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SkipBackMiniLine: ImageVector
    get() {
        if (_skipBackMiniLine != null) return _skipBackMiniLine!!
        _skipBackMiniLine = remixIcon(
            name = "SkipBackMiniLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.000 6.000 C 7.552 6.000 8.000 6.448 8.000 7.000 L 8.000 17.000 C 8.000 17.552 7.552 18.000 7.000 18.000 C 6.448 18.000 6.000 17.552 6.000 17.000 L 6.000 7.000 C 6.000 6.448 6.448 6.000 7.000 6.000 ZM 15.000 14.140 L 15.000 9.860 L 11.968 12.000 L 15.000 14.140 ZM 9.079 12.408 C 9.032 12.376 8.991 12.335 8.959 12.288 C 8.799 12.063 8.853 11.751 9.079 11.592 L 16.212 6.556 C 16.296 6.497 16.397 6.465 16.500 6.465 C 16.776 6.465 17.000 6.689 17.000 6.965 L 17.000 17.035 C 17.000 17.138 16.968 17.239 16.909 17.323 C 16.749 17.549 16.437 17.603 16.212 17.444 L 9.079 12.408 Z"),
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
        return _skipBackMiniLine!!
    }

private var _skipBackMiniLine: ImageVector? = null
