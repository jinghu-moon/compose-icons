package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.StackedChartLine: ImageVector
    get() {
        if (_stackedChartLine != null) return _stackedChartLine!!
        _stackedChartLine = remixIcon(
            name = "StackedChartLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.000 8.000 L 8.000 20.000 L 3.000 20.000 L 3.000 8.000 L 8.000 8.000 ZM 14.500 4.000 L 14.500 20.000 L 9.500 20.000 L 9.500 4.000 L 14.500 4.000 ZM 21.000 9.000 L 21.000 20.000 L 16.000 20.000 L 16.000 9.000 L 21.000 9.000 ZM 18.000 18.000 L 19.000 18.000 L 19.000 17.000 L 18.000 17.000 L 18.000 18.000 ZM 11.500 18.000 L 12.500 18.000 L 12.500 16.000 L 11.500 16.000 L 11.500 18.000 ZM 5.000 18.000 L 6.000 18.000 L 6.000 14.000 L 5.000 14.000 L 5.000 18.000 ZM 18.000 15.000 L 19.000 15.000 L 19.000 11.000 L 18.000 11.000 L 18.000 15.000 ZM 11.500 14.000 L 12.500 14.000 L 12.500 6.000 L 11.500 6.000 L 11.500 14.000 ZM 5.000 12.000 L 6.000 12.000 L 6.000 10.000 L 5.000 10.000 L 5.000 12.000 Z"),
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
        return _stackedChartLine!!
    }

private var _stackedChartLine: ImageVector? = null
