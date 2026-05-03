package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PlayMiniFill: ImageVector
    get() {
        if (_playMiniFill != null) return _playMiniFill!!
        _playMiniFill = remixIcon(
            name = "PlayMiniFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.752 5.439 L 18.260 11.568 C 18.498 11.707 18.579 12.014 18.440 12.252 C 18.396 12.326 18.334 12.389 18.260 12.432 L 7.752 18.562 C 7.513 18.701 7.207 18.620 7.068 18.382 C 7.023 18.305 7.000 18.218 7.000 18.130 L 7.000 5.871 C 7.000 5.594 7.224 5.371 7.500 5.371 C 7.589 5.371 7.675 5.394 7.752 5.439 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _playMiniFill!!
    }

private var _playMiniFill: ImageVector? = null
