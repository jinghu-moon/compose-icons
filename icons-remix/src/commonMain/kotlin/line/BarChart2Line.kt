package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BarChart2Line: ImageVector
    get() {
        if (_barChart2Line != null) return _barChart2Line!!
        _barChart2Line = remixIcon(
            name = "BarChart2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.000 13.000 L 8.000 13.000 L 8.000 21.000 L 2.000 21.000 L 2.000 13.000 ZM 16.000 8.000 L 22.000 8.000 L 22.000 21.000 L 16.000 21.000 L 16.000 8.000 ZM 9.000 3.000 L 15.000 3.000 L 15.000 21.000 L 9.000 21.000 L 9.000 3.000 ZM 4.000 15.000 L 4.000 19.000 L 6.000 19.000 L 6.000 15.000 L 4.000 15.000 ZM 11.000 5.000 L 11.000 19.000 L 13.000 19.000 L 13.000 5.000 L 11.000 5.000 ZM 18.000 10.000 L 18.000 19.000 L 20.000 19.000 L 20.000 10.000 L 18.000 10.000 Z"),
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
        return _barChart2Line!!
    }

private var _barChart2Line: ImageVector? = null
