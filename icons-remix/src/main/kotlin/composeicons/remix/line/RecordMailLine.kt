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
                pathData = parseSvgPathData("M14.257 15C13.472 14.049 13 12.83 13 11.5 13 8.462 15.462 6 18.5 6 21.538 6 24 8.462 24 11.5 24 14.538 21.538 17 18.5 17h-13C2.462 17 0 14.538 0 11.5 0 8.462 2.462 6 5.5 6 8.538 6 11 8.462 11 11.5c0 1.33-.472 2.549-1.257 3.5h4.514ZM5.5 15C7.433 15 9 13.433 9 11.5 9 9.567 7.433 8 5.5 8 3.567 8 2 9.567 2 11.5 2 13.433 3.567 15 5.5 15ZM18.5 15C20.433 15 22 13.433 22 11.5 22 9.567 20.433 8 18.5 8 16.567 8 15 9.567 15 11.5 15 13.433 16.567 15 18.5 15Z"),
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
