package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FileChartFill: ImageVector
    get() {
        if (_fileChartFill != null) return _fileChartFill!!
        _fileChartFill = remixIcon(
            name = "FileChartFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.000 2.000 L 21.000 7.000 L 21.000 21.008 C 21.000 21.556 20.555 22.000 20.007 22.000 L 3.993 22.000 C 3.445 22.000 3.000 21.545 3.000 21.008 L 3.000 2.992 C 3.000 2.444 3.445 2.000 3.993 2.000 L 16.000 2.000 ZM 11.000 7.000 L 11.000 17.000 L 13.000 17.000 L 13.000 7.000 L 11.000 7.000 ZM 15.000 11.000 L 15.000 17.000 L 17.000 17.000 L 17.000 11.000 L 15.000 11.000 ZM 7.000 13.000 L 7.000 17.000 L 9.000 17.000 L 9.000 13.000 L 7.000 13.000 Z"),
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
        return _fileChartFill!!
    }

private var _fileChartFill: ImageVector? = null
