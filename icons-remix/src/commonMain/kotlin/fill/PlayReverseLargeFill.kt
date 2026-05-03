package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PlayReverseLargeFill: ImageVector
    get() {
        if (_playReverseLargeFill != null) return _playReverseLargeFill!!
        _playReverseLargeFill = remixIcon(
            name = "PlayReverseLargeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.000 20.196 L 18.000 3.804 C 18.000 3.019 17.136 2.540 16.470 2.956 L 3.357 11.152 C 2.730 11.544 2.730 12.456 3.357 12.848 L 16.470 21.044 C 17.136 21.460 18.000 20.981 18.000 20.196 Z"),
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
        return _playReverseLargeFill!!
    }

private var _playReverseLargeFill: ImageVector? = null
