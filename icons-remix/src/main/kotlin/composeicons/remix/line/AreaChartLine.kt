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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.116 5.876 21 3.523v16.477h-18v-15.677L9.117 1.876l5.999 4ZM5 14.565v3.435h14v-5.523l-3.969 1.588L9.12 12.094 5 14.565ZM5 5.677v6.557L8.88 9.906l6.088 2.029L19 10.322v-3.846L14.883 8.124 8.883 4.123 5 5.677Z"),
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
        return _areaChartLine!!
    }

private var _areaChartLine: ImageVector? = null
