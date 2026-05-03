package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AreaChartLine: ImageVector
    get() {
        if (_areaChartLine != null) return _areaChartLine!!
        _areaChartLine = remixIcon(
            name = "AreaChartLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.116 5.876 L 21.000 3.523 L 21.000 20.000 L 3.000 20.000 L 3.000 4.323 L 9.117 1.876 L 15.116 5.876 ZM 5.000 14.565 L 5.000 18.000 L 19.000 18.000 L 19.000 12.477 L 15.031 14.064 L 9.120 12.094 L 5.000 14.565 ZM 5.000 5.677 L 5.000 12.233 L 8.880 9.906 L 14.968 11.936 L 19.000 10.322 L 19.000 6.477 L 14.883 8.124 L 8.883 4.123 L 5.000 5.677 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _areaChartLine!!
    }

private var _areaChartLine: ImageVector? = null
