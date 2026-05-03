package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PuzzleFill: ImageVector
    get() {
        if (_puzzleFill != null) return _puzzleFill!!
        _puzzleFill = remixIcon(
            name = "PuzzleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.000 4.000 C 8.000 2.343 9.343 1.000 11.000 1.000 C 12.657 1.000 14.000 2.343 14.000 4.000 C 14.000 4.351 13.940 4.687 13.829 5.000 L 18.000 5.000 C 18.552 5.000 19.000 5.448 19.000 6.000 L 19.000 10.171 C 19.313 10.060 19.649 10.000 20.000 10.000 C 21.657 10.000 23.000 11.343 23.000 13.000 C 23.000 14.657 21.657 16.000 20.000 16.000 C 19.649 16.000 19.313 15.940 19.000 15.829 L 19.000 20.000 C 19.000 20.552 18.552 21.000 18.000 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 6.000 C 3.000 5.448 3.448 5.000 4.000 5.000 L 8.171 5.000 C 8.060 4.687 8.000 4.351 8.000 4.000 Z"),
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
        return _puzzleFill!!
    }

private var _puzzleFill: ImageVector? = null
