package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Brain3Fill: ImageVector
    get() {
        if (_brain3Fill != null) return _brain3Fill!!
        _brain3Fill = remixIcon(
            name = "Brain3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.500 4.783 L 19.500 7.671 L 22.000 9.114 L 22.000 14.887 L 19.499 16.331 L 19.500 19.218 L 14.500 22.104 L 13.000 21.238 L 13.000 18.000 L 11.000 18.000 L 11.000 21.237 L 9.500 22.104 L 4.500 19.218 L 4.500 16.331 L 2.000 14.888 L 2.001 9.113 L 4.500 7.670 L 4.500 4.784 L 9.500 1.897 L 11.000 2.764 L 11.000 6.000 L 13.000 6.000 L 13.000 2.763 L 14.501 1.896 L 19.500 4.783 Z"),
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
        return _brain3Fill!!
    }

private var _brain3Fill: ImageVector? = null
