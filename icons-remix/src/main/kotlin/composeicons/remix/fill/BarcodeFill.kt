package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BarcodeFill: ImageVector
    get() {
        if (_barcodeFill != null) return _barcodeFill!!
        _barcodeFill = remixIcon(
            name = "BarcodeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 4h2v16h-2v-16ZM6 4h2v16h-2v-16ZM9 4h3v16h-3v-16ZM13 4h2v16h-2v-16ZM16 4h2v16h-2v-16ZM19 4h3v16h-3v-16Z"),
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
        return _barcodeFill!!
    }

private var _barcodeFill: ImageVector? = null
