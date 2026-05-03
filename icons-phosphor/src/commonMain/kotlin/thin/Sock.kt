package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Sock: ImageVector
    get() {
        if (_sock != null) return _sock!!
        _sock = phosphorThinIcon(
            name = "Sock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 20.0f),
                    PathNode.LineTo(104.0f, 20.0f),
                    PathNode.CurveTo(97.37258f, 20.0f, 92.0f, 25.372583f, 92.0f, 32.0f),
                    PathNode.LineTo(92.0f, 110.34f),
                    PathNode.LineTo(52.08f, 150.26f),
                    PathNode.CurveTo(30.634783f, 171.70522f, 30.634783f, 206.47478f, 52.08f, 227.92f),
                    PathNode.CurveTo(73.525215f, 249.36522f, 108.294785f, 249.36522f, 129.74f, 227.92f),
                    PathNode.LineTo(198.14f, 159.51f),
                    PathNode.CurveTo(201.90506f, 155.76958f, 204.01549f, 150.67719f, 204.0f, 145.37f),
                    PathNode.LineTo(204.0f, 32.0f),
                    PathNode.CurveTo(204.0f, 25.372583f, 198.62741f, 20.0f, 192.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 28.0f),
                    PathNode.LineTo(192.0f, 28.0f),
                    PathNode.CurveTo(194.20914f, 28.0f, 196.0f, 29.790861f, 196.0f, 32.0f),
                    PathNode.LineTo(196.0f, 52.0f),
                    PathNode.LineTo(100.0f, 52.0f),
                    PathNode.LineTo(100.0f, 32.0f),
                    PathNode.CurveTo(100.0f, 29.790861f, 101.79086f, 28.0f, 104.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(124.08f, 222.26f),
                    PathNode.CurveTo(112.24856f, 234.20512f, 94.92923f, 238.90503f, 78.68244f, 234.57945f),
                    PathNode.CurveTo(62.43565f, 230.25389f, 49.746117f, 217.56435f, 45.42054f, 201.31757f),
                    PathNode.CurveTo(41.094967f, 185.07077f, 45.794884f, 167.75143f, 57.74f, 155.92f),
                    PathNode.LineTo(98.83f, 114.83f),
                    PathNode.CurveTo(99.57996f, 114.07921f, 100.00083f, 113.06119f, 100.0f, 112.0f),
                    PathNode.LineTo(100.0f, 60.0f),
                    PathNode.LineTo(196.0f, 60.0f),
                    PathNode.LineTo(196.0f, 108.17f),
                    PathNode.CurveTo(168.93054f, 110.28265f, 148.03246f, 132.84825f, 148.0f, 160.0f),
                    PathNode.CurveTo(147.95291f, 170.45432f, 151.0923f, 180.6748f, 157.0f, 189.3f),
                    PathNode.Close,
                    PathNode.MoveTo(192.48f, 153.86f),
                    PathNode.LineTo(162.82f, 183.53f),
                    PathNode.CurveTo(158.33939f, 176.502f, 155.97215f, 168.33473f, 156.0f, 160.0f),
                    PathNode.CurveTo(156.03227f, 137.26335f, 173.36005f, 118.285095f, 196.0f, 116.19f),
                    PathNode.LineTo(196.0f, 145.37f),
                    PathNode.CurveTo(196.00874f, 148.55675f, 194.74104f, 151.6143f, 192.48f, 153.86f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _sock!!
    }

private var _sock: ImageVector? = null
