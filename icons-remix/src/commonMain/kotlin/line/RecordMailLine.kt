package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.RecordMailLine: ImageVector
    get() {
        if (_recordMailLine != null) return _recordMailLine!!
        _recordMailLine = remixIcon(
            name = "RecordMailLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.257 15.000 C 13.472 14.049 13.000 12.830 13.000 11.500 C 13.000 8.462 15.462 6.000 18.500 6.000 C 21.538 6.000 24.000 8.462 24.000 11.500 C 24.000 14.538 21.538 17.000 18.500 17.000 L 5.500 17.000 C 2.462 17.000 0.000 14.538 0.000 11.500 C 0.000 8.462 2.462 6.000 5.500 6.000 C 8.538 6.000 11.000 8.462 11.000 11.500 C 11.000 12.830 10.528 14.049 9.743 15.000 L 14.257 15.000 ZM 5.500 15.000 C 7.433 15.000 9.000 13.433 9.000 11.500 C 9.000 9.567 7.433 8.000 5.500 8.000 C 3.567 8.000 2.000 9.567 2.000 11.500 C 2.000 13.433 3.567 15.000 5.500 15.000 ZM 18.500 15.000 C 20.433 15.000 22.000 13.433 22.000 11.500 C 22.000 9.567 20.433 8.000 18.500 8.000 C 16.567 8.000 15.000 9.567 15.000 11.500 C 15.000 13.433 16.567 15.000 18.500 15.000 Z"),
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
        return _recordMailLine!!
    }

private var _recordMailLine: ImageVector? = null
