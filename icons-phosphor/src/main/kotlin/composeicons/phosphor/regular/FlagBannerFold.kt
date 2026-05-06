package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FlagBannerFold: ImageVector
    get() {
        if (_flagBannerFold != null) return _flagBannerFold!!
        _flagBannerFold = phosphorRegularIcon(
            name = "FlagBannerFold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M238.73 43.67C237.257 41.382 234.722 39.999 232 40h-80c-3.136 .001-5.982 1.835-7.28 4.69L135.94 64h-107.94c-3.166 0-6.034 1.868-7.315 4.763-1.281 2.895-.734 6.274 1.395 8.617L57.19 116 22.08 154.62c-2.129 2.343-2.676 5.722-1.395 8.617 1.281 2.895 4.149 4.763 7.315 4.763h73.09c3.136-.001 5.982-1.835 7.28-4.69L117.15 144h62.43l-34.86 76.69c-1.274 2.615-1.028 5.716 .642 8.097 1.67 2.382 4.502 3.669 7.394 3.362 2.893-.307 5.391-2.16 6.524-4.839l80-176c1.127-2.475 .92-5.352-.55-7.64ZM95.94 152h-49.86L73.92 121.38c2.772-3.051 2.772-7.709 0-10.76L46.08 80h82.59ZM186.85 128h-62.43L157.15 56h62.43Z"),
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
        return _flagBannerFold!!
    }

private var _flagBannerFold: ImageVector? = null
