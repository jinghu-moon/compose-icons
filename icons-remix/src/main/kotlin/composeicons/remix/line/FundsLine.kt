package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FundsLine: ImageVector
    get() {
        if (_fundsLine != null) return _fundsLine!!
        _fundsLine = remixIcon(
            name = "FundsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.411 14.526 7.812 11.124l2.828 2.828 3.157-3.157L12.005 9.003h5v5L15.212 12.21l-4.571 4.571L7.812 13.953 5.338 16.427c1.433 2.155 3.884 3.576 6.667 3.576 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8 0 .882 .143 1.73 .406 2.523ZM2.873 16.084l-.01-.01 .004-.004C2.313 14.827 2.005 13.451 2.005 12.003 2.005 6.48 6.482 2.003 12.005 2.003c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10-4.069 0-7.571-2.43-9.132-5.919Z"),
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
        return _fundsLine!!
    }

private var _fundsLine: ImageVector? = null
