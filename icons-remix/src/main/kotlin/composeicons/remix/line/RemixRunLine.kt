package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.RemixRunLine: ImageVector
    get() {
        if (_remixRunLine != null) return _remixRunLine!!
        _remixRunLine = remixIcon(
            name = "RemixRunLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 2h10.5c3.314 0 6 2.686 6 6 0 2.198-1.182 4.121-2.946 5.165C19.038 14.258 20 16.017 20 18v3h-2v-3c0-2.209-1.791-4-4-4h-10v-2h10.5c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-10.5v-2ZM11 21h-7v-2h7v2Z"),
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
        return _remixRunLine!!
    }

private var _remixRunLine: ImageVector? = null
