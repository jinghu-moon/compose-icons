package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.RhythmLine: ImageVector
    get() {
        if (_rhythmLine != null) return _rhythmLine!!
        _rhythmLine = remixIcon(
            name = "RhythmLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.000 9.000 L 4.000 9.000 L 4.000 21.000 L 2.000 21.000 L 2.000 9.000 ZM 8.000 3.000 L 10.000 3.000 L 10.000 21.000 L 8.000 21.000 L 8.000 3.000 ZM 14.000 12.000 L 16.000 12.000 L 16.000 21.000 L 14.000 21.000 L 14.000 12.000 ZM 20.000 6.000 L 22.000 6.000 L 22.000 21.000 L 20.000 21.000 L 20.000 6.000 Z"),
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
        return _rhythmLine!!
    }

private var _rhythmLine: ImageVector? = null
