package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FilterLine: ImageVector
    get() {
        if (_filterLine != null) return _filterLine!!
        _filterLine = remixIcon(
            name = "FilterLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.000 4.000 L 21.000 6.000 L 20.000 6.000 L 15.000 13.500 L 15.000 22.000 L 9.000 22.000 L 9.000 13.500 L 4.000 6.000 L 3.000 6.000 L 3.000 4.000 L 21.000 4.000 ZM 6.404 6.000 L 11.000 12.894 L 11.000 20.000 L 13.000 20.000 L 13.000 12.894 L 17.596 6.000 L 6.404 6.000 Z"),
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
        return _filterLine!!
    }

private var _filterLine: ImageVector? = null
