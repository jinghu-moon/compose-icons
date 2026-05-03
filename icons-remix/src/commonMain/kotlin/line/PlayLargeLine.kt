package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PlayLargeLine: ImageVector
    get() {
        if (_playLargeLine != null) return _playLargeLine!!
        _playLargeLine = remixIcon(
            name = "PlayLargeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.000 18.392 L 8.000 5.608 L 18.226 12.000 L 8.000 18.392 ZM 6.000 3.804 L 6.000 20.196 C 6.000 20.981 6.864 21.460 7.530 21.044 L 20.643 12.848 C 21.270 12.456 21.270 11.544 20.643 11.152 L 7.530 2.956 C 6.864 2.540 6.000 3.019 6.000 3.804 Z"),
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
        return _playLargeLine!!
    }

private var _playLargeLine: ImageVector? = null
