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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 12c1.105 0 2-.895 2-2C11 8.895 10.105 8 9 8 7.895 8 7 8.895 7 10c0 1.105 .895 2 2 2ZM21.5 6.5 12 1 2.5 6.5v11L12 23l9.5-5.5v-11ZM12 3.311l7.5 4.342v6.881L14.938 11.797 6.967 17.775 4.5 16.347v-8.694L12 3.311ZM12 20.689 8.848 18.864l6.214-4.661 3.997 2.399L12 20.689Z"),
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
        return _nftLine!!
    }

private var _nftLine: ImageVector? = null
