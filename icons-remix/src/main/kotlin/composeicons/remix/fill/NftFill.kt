package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.NftFill: ImageVector
    get() {
        if (_nftFill != null) return _nftFill!!
        _nftFill = remixIcon(
            name = "NftFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 12c1.105 0 2-.895 2-2C11 8.895 10.105 8 9 8 7.895 8 7 8.895 7 10c0 1.105 .895 2 2 2ZM12 1l9.5 5.5v11L12 23 2.5 17.5v-11L12 1ZM4.5 7.653v8.694l2.372 1.373 8.072-5.92 4.555 2.733v-6.881L12 3.311 4.5 7.653Z"),
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
        return _nftFill!!
    }

private var _nftFill: ImageVector? = null
