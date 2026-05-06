package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GobletBrokenLine: ImageVector
    get() {
        if (_gobletBrokenLine != null) return _gobletBrokenLine!!
        _gobletBrokenLine = remixIcon(
            name = "GobletBrokenLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.867 2l1.122 7.858c.302 2.114-.521 3.931-1.88 5.188-1.105 1.022-2.568 1.685-4.109 1.888v3.065h5v2h-12v-2h5v-3.065C9.459 16.732 7.995 16.069 6.89 15.047 5.532 13.79 4.707 11.973 5.01 9.858L6.133 2h11.734ZM14.077 4l-.511 .884 2.599 1.5-2.75 4.764-1.732-1L13.432 7.116 10.835 5.616 11.768 4h-3.901l-.878 6.142c-.198 1.386 .322 2.569 1.26 3.437 .955 .883 2.334 1.422 3.751 1.422 1.417-0 2.796-.539 3.751-1.422 .938-.868 1.457-2.051 1.259-3.437L16.133 4h-2.056Z"),
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
        return _gobletBrokenLine!!
    }

private var _gobletBrokenLine: ImageVector? = null
