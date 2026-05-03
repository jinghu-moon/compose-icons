package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RecordMailFill: ImageVector
    get() {
        if (_recordMailFill != null) return _recordMailFill!!
        _recordMailFill = remixIcon(
            name = "RecordMailFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.743 15.000 L 14.257 15.000 C 13.472 14.049 13.000 12.830 13.000 11.500 C 13.000 8.462 15.462 6.000 18.500 6.000 C 21.538 6.000 24.000 8.462 24.000 11.500 C 24.000 14.538 21.538 17.000 18.500 17.000 L 5.500 17.000 C 2.462 17.000 0.000 14.538 0.000 11.500 C 0.000 8.462 2.462 6.000 5.500 6.000 C 8.538 6.000 11.000 8.462 11.000 11.500 C 11.000 12.830 10.528 14.049 9.743 15.000 ZM 5.500 13.000 C 6.328 13.000 7.000 12.328 7.000 11.500 C 7.000 10.672 6.328 10.000 5.500 10.000 C 4.672 10.000 4.000 10.672 4.000 11.500 C 4.000 12.328 4.672 13.000 5.500 13.000 ZM 18.500 13.000 C 19.328 13.000 20.000 12.328 20.000 11.500 C 20.000 10.672 19.328 10.000 18.500 10.000 C 17.672 10.000 17.000 10.672 17.000 11.500 C 17.000 12.328 17.672 13.000 18.500 13.000 Z"),
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
        return _recordMailFill!!
    }

private var _recordMailFill: ImageVector? = null
