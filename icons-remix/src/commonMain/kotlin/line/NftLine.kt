package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.NftLine: ImageVector
    get() {
        if (_nftLine != null) return _nftLine!!
        _nftLine = remixIcon(
            name = "NftLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.000 12.000 C 10.105 12.000 11.000 11.105 11.000 10.000 C 11.000 8.895 10.105 8.000 9.000 8.000 C 7.895 8.000 7.000 8.895 7.000 10.000 C 7.000 11.105 7.895 12.000 9.000 12.000 ZM 21.500 6.500 L 12.000 1.000 L 2.500 6.500 L 2.500 17.500 L 12.000 23.000 L 21.500 17.500 L 21.500 6.500 ZM 12.000 3.311 L 19.500 7.653 L 19.500 14.534 L 14.938 11.797 L 6.967 17.775 L 4.500 16.347 L 4.500 7.653 L 12.000 3.311 ZM 12.000 20.689 L 8.848 18.864 L 15.062 14.203 L 19.059 16.602 L 12.000 20.689 Z"),
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
        return _nftLine!!
    }

private var _nftLine: ImageVector? = null
