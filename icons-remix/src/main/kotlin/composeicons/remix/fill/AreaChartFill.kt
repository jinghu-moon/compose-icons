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
                pathData = parseSvgPathData("M15.116 5.876 21 3.523v16.477h-18v-15.677L9.117 1.876l5.999 4ZM5 5.677v6.557L8.88 9.906l6.088 2.029L19 10.322v-3.846L14.883 8.124 8.883 4.123 5 5.677Z"),
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
