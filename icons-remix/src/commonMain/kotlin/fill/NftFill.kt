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
                pathData = parseSvgPathData("M 9.000 12.000 C 10.105 12.000 11.000 11.105 11.000 10.000 C 11.000 8.895 10.105 8.000 9.000 8.000 C 7.895 8.000 7.000 8.895 7.000 10.000 C 7.000 11.105 7.895 12.000 9.000 12.000 ZM 12.000 1.000 L 21.500 6.500 L 21.500 17.500 L 12.000 23.000 L 2.500 17.500 L 2.500 6.500 L 12.000 1.000 ZM 4.500 7.653 L 4.500 16.347 L 6.872 17.720 L 14.945 11.801 L 19.500 14.534 L 19.500 7.653 L 12.000 3.311 L 4.500 7.653 Z"),
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
