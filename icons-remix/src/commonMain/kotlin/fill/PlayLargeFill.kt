package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PlayLargeFill: ImageVector
    get() {
        if (_playLargeFill != null) return _playLargeFill!!
        _playLargeFill = remixIcon(
            name = "PlayLargeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.000 20.196 L 6.000 3.804 C 6.000 3.019 6.864 2.540 7.530 2.956 L 20.643 11.152 C 21.270 11.544 21.270 12.456 20.643 12.848 L 7.530 21.044 C 6.864 21.460 6.000 20.981 6.000 20.196 Z"),
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
        return _playLargeFill!!
    }

private var _playLargeFill: ImageVector? = null
