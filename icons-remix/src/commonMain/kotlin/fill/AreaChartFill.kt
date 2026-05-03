package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AreaChartFill: ImageVector
    get() {
        if (_areaChartFill != null) return _areaChartFill!!
        _areaChartFill = remixIcon(
            name = "AreaChartFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.116 5.876 L 21.000 3.523 L 21.000 20.000 L 3.000 20.000 L 3.000 4.323 L 9.117 1.876 L 15.116 5.876 ZM 5.000 5.677 L 5.000 12.233 L 8.880 9.906 L 14.968 11.936 L 19.000 10.322 L 19.000 6.477 L 14.883 8.124 L 8.883 4.123 L 5.000 5.677 Z"),
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
        return _areaChartFill!!
    }

private var _areaChartFill: ImageVector? = null
