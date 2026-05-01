package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FunnelX: ImageVector
    get() {
        if (_funnelX != null) return _funnelX!!
        _funnelX = phosphorFillIcon(
            name = "FunnelX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(227.73f, 66.85f),
                    PathNode.LineTo(160.0f, 139.17f),
                    PathNode.LineTo(160.0f, 194.66f),
                    PathNode.CurveTo(160.00795f, 200.02028f, 157.3312f, 205.0284f, 152.87f, 208.0f),
                    PathNode.LineTo(120.87f, 229.34f),
                    PathNode.CurveTo(115.95641f, 232.61296f, 109.639725f, 232.91412f, 104.43705f, 230.12346f),
                    PathNode.CurveTo(99.23437f, 227.3328f, 95.99124f, 221.90385f, 96.0f, 216.0f),
                    PathNode.LineTo(96.0f, 139.17f),
                    PathNode.LineTo(28.27f, 66.85f),
                    PathNode.LineTo(28.19f, 66.76f),
                    PathNode.CurveTo(23.935287f, 62.077644f, 22.83922f, 55.327915f, 25.393673f, 49.53984f),
                    PathNode.CurveTo(27.948126f, 43.751766f, 33.67332f, 40.012466f, 40.0f, 40.0f),
                    PathNode.LineTo(216.0f, 40.0f),
                    PathNode.CurveTo(222.33212f, 40.000614f, 228.06816f, 43.735504f, 230.63023f, 49.526142f),
                    PathNode.CurveTo(233.1923f, 55.316784f, 232.09836f, 62.073616f, 227.84f, 66.76f),
                    PathNode.Close,
                    PathNode.MoveTo(227.31f, 192.0f),
                    PathNode.LineTo(245.66f, 173.66f),
                    PathNode.CurveTo(248.78593f, 170.53407f, 248.78593f, 165.46593f, 245.66f, 162.34f),
                    PathNode.CurveTo(242.53407f, 159.21407f, 237.46593f, 159.21407f, 234.34f, 162.34f),
                    PathNode.LineTo(216.0f, 180.69f),
                    PathNode.LineTo(197.66f, 162.34f),
                    PathNode.CurveTo(194.53407f, 159.21407f, 189.46593f, 159.21407f, 186.34f, 162.34f),
                    PathNode.CurveTo(183.21407f, 165.46593f, 183.21407f, 170.53407f, 186.34f, 173.66f),
                    PathNode.LineTo(204.69f, 192.0f),
                    PathNode.LineTo(186.34f, 210.34f),
                    PathNode.CurveTo(183.21407f, 213.46593f, 183.21407f, 218.53407f, 186.34f, 221.66f),
                    PathNode.CurveTo(189.46593f, 224.78593f, 194.53407f, 224.78593f, 197.66f, 221.66f),
                    PathNode.LineTo(216.0f, 203.31f),
                    PathNode.LineTo(234.34f, 221.66f),
                    PathNode.CurveTo(237.46593f, 224.78593f, 242.53407f, 224.78593f, 245.66f, 221.66f),
                    PathNode.CurveTo(248.78593f, 218.53407f, 248.78593f, 213.46593f, 245.66f, 210.34f),
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
        return _funnelX!!
    }

private var _funnelX: ImageVector? = null
