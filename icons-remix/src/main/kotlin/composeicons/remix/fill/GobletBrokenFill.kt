package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GobletBrokenFill: ImageVector
    get() {
        if (_gobletBrokenFill != null) return _gobletBrokenFill!!
        _gobletBrokenFill = remixIcon(
            name = "GobletBrokenFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.923 2 10.835 5.616l2.598 1.5-1.75 3.031 1.732 1L16.166 6.384 13.567 4.884 15.232 2h2.635l1.123 7.859c.302 2.114-.522 3.931-1.881 5.188-1.105 1.022-2.568 1.685-4.109 1.888v3.066h5v2h-12v-2h5v-3.066C9.459 16.732 7.996 16.069 6.891 15.047 5.532 13.789 4.708 11.973 5.011 9.859L6.133 2h6.79Z"),
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
        return _gobletBrokenFill!!
    }

private var _gobletBrokenFill: ImageVector? = null
