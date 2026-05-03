package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PlayReverseMiniLine: ImageVector
    get() {
        if (_playReverseMiniLine != null) return _playReverseMiniLine!!
        _playReverseMiniLine = remixIcon(
            name = "PlayReverseMiniLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 8.482 L 15.000 15.518 L 8.969 12.000 L 15.000 8.482 ZM 16.248 5.439 L 5.740 11.568 C 5.502 11.707 5.421 12.014 5.560 12.252 C 5.604 12.326 5.666 12.389 5.740 12.432 L 16.248 18.562 C 16.486 18.701 16.793 18.620 16.932 18.382 C 16.976 18.305 17.000 18.218 17.000 18.130 L 17.000 5.871 C 17.000 5.594 16.776 5.371 16.500 5.371 C 16.411 5.371 16.324 5.394 16.248 5.439 Z"),
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
        return _playReverseMiniLine!!
    }

private var _playReverseMiniLine: ImageVector? = null
