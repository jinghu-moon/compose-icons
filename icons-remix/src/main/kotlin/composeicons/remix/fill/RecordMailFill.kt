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
                pathData = parseSvgPathData("M9.743 15h4.514C13.472 14.049 13 12.83 13 11.5 13 8.462 15.462 6 18.5 6 21.538 6 24 8.462 24 11.5 24 14.538 21.538 17 18.5 17h-13C2.462 17 0 14.538 0 11.5 0 8.462 2.462 6 5.5 6 8.538 6 11 8.462 11 11.5c0 1.33-.472 2.549-1.257 3.5ZM5.5 13C6.328 13 7 12.328 7 11.5 7 10.672 6.328 10 5.5 10 4.672 10 4 10.672 4 11.5 4 12.328 4.672 13 5.5 13ZM18.5 13C19.328 13 20 12.328 20 11.5 20 10.672 19.328 10 18.5 10 17.672 10 17 10.672 17 11.5c0 .828 .672 1.5 1.5 1.5Z"),
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
