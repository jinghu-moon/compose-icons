package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CoinFill: ImageVector
    get() {
        if (_coinFill != null) return _coinFill!!
        _coinFill = remixIcon(
            name = "CoinFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M23.005 12.003v2c0 3.314-4.925 6-11 6C6.038 20.003 1.181 17.412 1.01 14.18l-.005-.177v-2c0 3.314 4.925 6 11 6 6.075 0 11-2.686 11-6ZM12.005 4.003c6.075 0 11 2.686 11 6 0 3.314-4.925 6-11 6-6.075 0-11-2.686-11-6C1.005 6.689 5.93 4.003 12.005 4.003Z"),
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
        return _coinFill!!
    }

private var _coinFill: ImageVector? = null
