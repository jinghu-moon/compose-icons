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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 20.196v-16.391c0-.785-.864-1.264-1.53-.848L3.357 11.152c-.627 .392-.627 1.304 0 1.696l13.113 8.196c.666 .416 1.53-.062 1.53-.848Z"),
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
        return _playReverseLargeFill!!
    }

private var _playReverseLargeFill: ImageVector? = null
