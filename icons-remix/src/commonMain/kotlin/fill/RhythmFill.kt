package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RhythmFill: ImageVector
    get() {
        if (_rhythmFill != null) return _rhythmFill!!
        _rhythmFill = remixIcon(
            name = "RhythmFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.000 9.000 L 4.000 9.000 L 4.000 21.000 L 2.000 21.000 L 2.000 9.000 ZM 8.000 3.000 L 10.000 3.000 L 10.000 21.000 L 8.000 21.000 L 8.000 3.000 ZM 14.000 12.000 L 16.000 12.000 L 16.000 21.000 L 14.000 21.000 L 14.000 12.000 ZM 20.000 6.000 L 22.000 6.000 L 22.000 21.000 L 20.000 21.000 L 20.000 6.000 Z"),
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
        return _rhythmFill!!
    }

private var _rhythmFill: ImageVector? = null
