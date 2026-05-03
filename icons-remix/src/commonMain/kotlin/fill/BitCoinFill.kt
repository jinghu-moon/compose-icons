package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BitCoinFill: ImageVector
    get() {
        if (_bitCoinFill != null) return _bitCoinFill!!
        _bitCoinFill = remixIcon(
            name = "BitCoinFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.005 22.003 C 6.482 22.003 2.005 17.526 2.005 12.003 C 2.005 6.480 6.482 2.003 12.005 2.003 C 17.528 2.003 22.005 6.480 22.005 12.003 C 22.005 17.526 17.528 22.003 12.005 22.003 ZM 11.005 16.003 L 11.005 18.003 L 13.005 18.003 L 13.005 16.003 L 14.005 16.003 C 15.386 16.003 16.505 14.884 16.505 13.503 C 16.505 12.940 16.319 12.421 16.005 12.003 C 16.319 11.585 16.505 11.066 16.505 10.503 C 16.505 9.122 15.386 8.003 14.005 8.003 L 13.005 8.003 L 13.005 6.003 L 11.005 6.003 L 11.005 8.003 L 8.005 8.003 L 8.005 16.003 L 11.005 16.003 ZM 10.005 13.003 L 14.005 13.003 C 14.281 13.003 14.505 13.227 14.505 13.503 C 14.505 13.779 14.281 14.003 14.005 14.003 L 10.005 14.003 L 10.005 13.003 ZM 10.005 10.003 L 14.005 10.003 C 14.281 10.003 14.505 10.227 14.505 10.503 C 14.505 10.779 14.281 11.003 14.005 11.003 L 10.005 11.003 L 10.005 10.003 Z"),
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
        return _bitCoinFill!!
    }

private var _bitCoinFill: ImageVector? = null
