package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Star: ImageVector
    get() {
        if (_star != null) return _star!!
        _star = phosphorFillIcon(
            name = "Star",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(234.29f, 114.85f),
                    PathNode.LineTo(189.29f, 153.68f),
                    PathNode.LineTo(203.0f, 211.75f),
                    PathNode.CurveTo(204.54689f, 218.19638f, 202.06061f, 224.94008f, 196.69937f, 228.83955f),
                    PathNode.CurveTo(191.33813f, 232.73903f, 184.1565f, 233.02727f, 178.5f, 229.57f),
                    PathNode.LineTo(128.0f, 198.49f),
                    PathNode.LineTo(77.47f, 229.57f),
                    PathNode.CurveTo(71.81467f, 233.00711f, 64.64769f, 232.70836f, 59.29802f, 228.81252f),
                    PathNode.CurveTo(53.94835f, 224.91669f, 51.46443f, 218.18727f, 53.0f, 211.75f),
                    PathNode.LineTo(66.76f, 153.68f),
                    PathNode.LineTo(21.76f, 114.85f),
                    PathNode.CurveTo(16.757307f, 110.526306f, 14.827508f, 103.628716f, 16.86015f, 97.336685f),
                    PathNode.CurveTo(18.892792f, 91.04466f, 24.493258f, 86.57972f, 31.08f, 86.0f),
                    PathNode.LineTo(90.08f, 81.24f),
                    PathNode.LineTo(112.84f, 26.16f),
                    PathNode.CurveTo(115.35965f, 20.020498f, 121.33858f, 16.01139f, 127.975f, 16.01139f),
                    PathNode.CurveTo(134.61142f, 16.01139f, 140.59035f, 20.020498f, 143.11f, 26.16f),
                    PathNode.LineTo(165.86f, 81.24f),
                    PathNode.LineTo(224.86f, 86.0f),
                    PathNode.CurveTo(231.4603f, 86.55821f, 237.08293f, 91.018425f, 239.1284f, 97.31855f),
                    PathNode.CurveTo(241.17386f, 103.618675f, 239.24359f, 110.5311f, 234.23f, 114.86f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _star!!
    }

private var _star: ImageVector? = null
