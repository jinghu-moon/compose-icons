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
                pathData = parseSvgPathData("M8 4C8 2.343 9.343 1 11 1c1.657 0 3 1.343 3 3 0 .351-.06 .687-.171 1h4.171c.552 0 1 .448 1 1v4.171c.313-.111 .649-.171 1-.171 1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3-.351 0-.687-.06-1-.171v4.171c0 .552-.448 1-1 1h-14C3.448 21 3 20.552 3 20v-14C3 5.448 3.448 5 4 5h4.171C8.06 4.687 8 4.351 8 4Z"),
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
