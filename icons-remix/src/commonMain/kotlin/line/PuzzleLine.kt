package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PuzzleLine: ImageVector
    get() {
        if (_puzzleLine != null) return _puzzleLine!!
        _puzzleLine = remixIcon(
            name = "PuzzleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.000 5.000 C 7.000 2.791 8.791 1.000 11.000 1.000 C 13.209 1.000 15.000 2.791 15.000 5.000 L 18.000 5.000 C 18.552 5.000 19.000 5.448 19.000 6.000 L 19.000 9.000 C 21.209 9.000 23.000 10.791 23.000 13.000 C 23.000 15.209 21.209 17.000 19.000 17.000 L 19.000 20.000 C 19.000 20.552 18.552 21.000 18.000 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 6.000 C 3.000 5.448 3.448 5.000 4.000 5.000 L 7.000 5.000 ZM 11.000 3.000 C 9.895 3.000 9.000 3.895 9.000 5.000 C 9.000 5.236 9.040 5.460 9.114 5.667 C 9.222 5.973 9.175 6.312 8.987 6.577 C 8.800 6.842 8.495 7.000 8.171 7.000 L 5.000 7.000 L 5.000 19.000 L 17.000 19.000 L 17.000 15.829 C 17.000 15.505 17.158 15.200 17.423 15.013 C 17.688 14.825 18.027 14.778 18.333 14.887 C 18.541 14.960 18.764 15.000 19.000 15.000 C 20.105 15.000 21.000 14.105 21.000 13.000 C 21.000 11.895 20.105 11.000 19.000 11.000 C 18.764 11.000 18.541 11.040 18.333 11.113 C 18.027 11.222 17.688 11.175 17.423 10.987 C 17.158 10.800 17.000 10.495 17.000 10.171 L 17.000 7.000 L 13.829 7.000 C 13.505 7.000 13.200 6.842 13.013 6.577 C 12.825 6.312 12.778 5.973 12.887 5.667 C 12.960 5.460 13.000 5.236 13.000 5.000 C 13.000 3.895 12.105 3.000 11.000 3.000 Z"),
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
        return _puzzleLine!!
    }

private var _puzzleLine: ImageVector? = null
