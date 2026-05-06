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
                pathData = parseSvgPathData("M6 20.196v-16.391C6 3.019 6.864 2.54 7.53 2.956l13.113 8.196c.627 .392 .627 1.304 0 1.696L7.53 21.044C6.864 21.46 6 20.981 6 20.196Z"),
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
