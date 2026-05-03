package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Hash: ImageVector
    get() {
        if (_hash != null) return _hash!!
        _hash = phosphorDuotoneIcon(
            name = "Hash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(165.82f, 96.0f),
                    PathNode.LineTo(154.18f, 160.0f),
                    PathNode.LineTo(90.18f, 160.0f),
                    PathNode.LineTo(101.82f, 96.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 88.0f),
                    PathNode.LineTo(175.4f, 88.0f),
                    PathNode.LineTo(183.87f, 41.43f),
                    PathNode.CurveTo(184.57793f, 37.122097f, 181.70143f, 33.04209f, 177.40608f, 32.261616f),
                    PathNode.CurveTo(173.11073f, 31.481138f, 168.9828f, 34.28842f, 168.13f, 38.57f),
                    PathNode.LineTo(159.13f, 88.0f),
                    PathNode.LineTo(111.4f, 88.0f),
                    PathNode.LineTo(119.87f, 41.43f),
                    PathNode.CurveTo(120.577934f, 37.122097f, 117.70144f, 33.04209f, 113.40608f, 32.261616f),
                    PathNode.CurveTo(109.11073f, 31.481138f, 104.9828f, 34.28842f, 104.13f, 38.57f),
                    PathNode.LineTo(95.14f, 88.0f),
                    PathNode.LineTo(48.0f, 88.0f),
                    PathNode.CurveTo(43.581722f, 88.0f, 40.0f, 91.58172f, 40.0f, 96.0f),
                    PathNode.CurveTo(40.0f, 100.41828f, 43.581722f, 104.0f, 48.0f, 104.0f),
                    PathNode.LineTo(92.23f, 104.0f),
                    PathNode.LineTo(83.5f, 152.0f),
                    PathNode.LineTo(32.0f, 152.0f),
                    PathNode.CurveTo(27.581722f, 152.0f, 24.0f, 155.58173f, 24.0f, 160.0f),
                    PathNode.CurveTo(24.0f, 164.41827f, 27.581722f, 168.0f, 32.0f, 168.0f),
                    PathNode.LineTo(80.6f, 168.0f),
                    PathNode.LineTo(72.13f, 214.57f),
                    PathNode.CurveTo(71.3409f, 218.91634f, 74.223885f, 223.07967f, 78.57f, 223.87f),
                    PathNode.CurveTo(79.04165f, 223.95726f, 79.52035f, 224.00078f, 80.0f, 224.0f),
                    PathNode.CurveTo(83.862495f, 223.99461f, 87.16958f, 221.2303f, 87.86f, 217.43f),
                    PathNode.LineTo(96.86f, 168.0f),
                    PathNode.LineTo(144.6f, 168.0f),
                    PathNode.LineTo(136.13f, 214.57f),
                    PathNode.CurveTo(135.3409f, 218.91634f, 138.22389f, 223.07967f, 142.57f, 223.87f),
                    PathNode.CurveTo(143.04164f, 223.95726f, 143.52036f, 224.00078f, 144.0f, 224.0f),
                    PathNode.CurveTo(147.8625f, 223.99461f, 151.16959f, 221.2303f, 151.86f, 217.43f),
                    PathNode.LineTo(160.86f, 168.0f),
                    PathNode.LineTo(208.0f, 168.0f),
                    PathNode.CurveTo(212.41827f, 168.0f, 216.0f, 164.41827f, 216.0f, 160.0f),
                    PathNode.CurveTo(216.0f, 155.58173f, 212.41827f, 152.0f, 208.0f, 152.0f),
                    PathNode.LineTo(163.77f, 152.0f),
                    PathNode.LineTo(172.5f, 104.0f),
                    PathNode.LineTo(224.0f, 104.0f),
                    PathNode.CurveTo(228.41827f, 104.0f, 232.0f, 100.41828f, 232.0f, 96.0f),
                    PathNode.CurveTo(232.0f, 91.58172f, 228.41827f, 88.0f, 224.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(147.5f, 152.0f),
                    PathNode.LineTo(99.77f, 152.0f),
                    PathNode.LineTo(108.5f, 104.0f),
                    PathNode.LineTo(156.23f, 104.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _hash!!
    }

private var _hash: ImageVector? = null
