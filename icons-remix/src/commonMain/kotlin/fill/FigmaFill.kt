package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FigmaFill: ImageVector
    get() {
        if (_figmaFill != null) return _figmaFill!!
        _figmaFill = remixIcon(
            name = "FigmaFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.333 5.333 C 5.333 3.492 6.826 2.000 8.667 2.000 L 12.000 2.000 L 12.000 2.000 L 15.333 2.000 C 17.174 2.000 18.666 3.492 18.666 5.333 C 18.666 7.174 17.174 8.667 15.333 8.667 L 12.000 8.667 L 12.000 8.667 L 12.000 12.000 L 12.000 15.333 L 12.000 18.667 C 12.000 20.508 10.507 22.000 8.666 22.000 C 6.825 22.000 5.333 20.508 5.333 18.667 C 5.333 16.826 6.825 15.333 8.666 15.333 C 6.825 15.333 5.333 13.841 5.333 12.000 C 5.333 10.159 6.825 8.667 8.666 8.667 L 8.667 8.667 C 6.826 8.667 5.333 7.174 5.333 5.333 ZM 12.000 12.000 C 12.000 13.841 13.492 15.333 15.333 15.333 C 17.174 15.333 18.666 13.841 18.666 12.000 C 18.666 10.159 17.174 8.667 15.333 8.667 C 13.492 8.667 12.000 10.159 12.000 12.000 Z"),
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
        return _figmaFill!!
    }

private var _figmaFill: ImageVector? = null
