package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PlayReverseLargeLine: ImageVector
    get() {
        if (_playReverseLargeLine != null) return _playReverseLargeLine!!
        _playReverseLargeLine = remixIcon(
            name = "PlayReverseLargeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.000 18.392 L 16.000 5.608 L 5.774 12.000 L 16.000 18.392 ZM 18.000 3.804 L 18.000 20.196 C 18.000 20.981 17.136 21.460 16.470 21.044 L 3.357 12.848 C 2.730 12.456 2.730 11.544 3.357 11.152 L 16.470 2.956 C 17.136 2.540 18.000 3.019 18.000 3.804 Z"),
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
        return _playReverseLargeLine!!
    }

private var _playReverseLargeLine: ImageVector? = null
