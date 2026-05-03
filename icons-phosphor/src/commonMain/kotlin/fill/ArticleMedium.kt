package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArticleMedium: ImageVector
    get() {
        if (_articleMedium != null) return _articleMedium!!
        _articleMedium = phosphorFillIcon(
            name = "ArticleMedium",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(31.163445f, 40.0f, 24.0f, 47.163445f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(24.0f, 208.83656f, 31.163445f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(224.83656f, 216.0f, 232.0f, 208.83656f, 232.0f, 200.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 47.163445f, 224.83656f, 40.0f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 144.0f),
                    PathNode.CurveTo(71.9997f, 147.2163f, 70.0733f, 150.11967f, 67.11f, 151.37f),
                    PathNode.CurveTo(66.126945f, 151.78925f, 65.06872f, 152.00362f, 64.0f, 152.0f),
                    PathNode.LineTo(52.0f, 152.0f),
                    PathNode.CurveTo(47.581722f, 152.0f, 44.0f, 148.41827f, 44.0f, 144.0f),
                    PathNode.CurveTo(44.0f, 139.58173f, 47.581722f, 136.0f, 52.0f, 136.0f),
                    PathNode.LineTo(56.0f, 136.0f),
                    PathNode.LineTo(56.0f, 88.0f),
                    PathNode.LineTo(52.0f, 88.0f),
                    PathNode.CurveTo(47.581722f, 88.0f, 44.0f, 84.41828f, 44.0f, 80.0f),
                    PathNode.CurveTo(44.0f, 75.58172f, 47.581722f, 72.0f, 52.0f, 72.0f),
                    PathNode.LineTo(64.0f, 72.0f),
                    PathNode.CurveTo(66.851616f, 72.00649f, 69.48419f, 73.53042f, 70.91f, 76.0f),
                    PathNode.LineTo(92.0f, 112.12f),
                    PathNode.LineTo(113.09f, 76.0f),
                    PathNode.CurveTo(114.51581f, 73.53042f, 117.148384f, 72.00649f, 120.0f, 72.0f),
                    PathNode.LineTo(132.0f, 72.0f),
                    PathNode.CurveTo(136.41827f, 72.0f, 140.0f, 75.58172f, 140.0f, 80.0f),
                    PathNode.CurveTo(140.0f, 84.41828f, 136.41827f, 88.0f, 132.0f, 88.0f),
                    PathNode.LineTo(128.0f, 88.0f),
                    PathNode.LineTo(128.0f, 136.0f),
                    PathNode.LineTo(132.0f, 136.0f),
                    PathNode.CurveTo(136.41827f, 136.0f, 140.0f, 139.58173f, 140.0f, 144.0f),
                    PathNode.CurveTo(140.0f, 148.41827f, 136.41827f, 152.0f, 132.0f, 152.0f),
                    PathNode.LineTo(120.0f, 152.0f),
                    PathNode.CurveTo(118.93128f, 152.00362f, 117.873055f, 151.78925f, 116.89f, 151.37f),
                    PathNode.CurveTo(113.9267f, 150.11967f, 112.0003f, 147.2163f, 112.0f, 144.0f),
                    PathNode.LineTo(112.0f, 109.59f),
                    PathNode.LineTo(98.91f, 132.0f),
                    PathNode.CurveTo(97.47626f, 134.45752f, 94.84517f, 135.96863f, 92.0f, 135.96863f),
                    PathNode.CurveTo(89.15483f, 135.96863f, 86.52374f, 134.45752f, 85.09f, 132.0f),
                    PathNode.LineTo(72.0f, 109.59f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 184.0f),
                    PathNode.LineTo(88.0f, 184.0f),
                    PathNode.CurveTo(83.58172f, 184.0f, 80.0f, 180.41827f, 80.0f, 176.0f),
                    PathNode.CurveTo(80.0f, 171.58173f, 83.58172f, 168.0f, 88.0f, 168.0f),
                    PathNode.LineTo(200.0f, 168.0f),
                    PathNode.CurveTo(204.41827f, 168.0f, 208.0f, 171.58173f, 208.0f, 176.0f),
                    PathNode.CurveTo(208.0f, 180.41827f, 204.41827f, 184.0f, 200.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 152.0f),
                    PathNode.LineTo(160.0f, 152.0f),
                    PathNode.CurveTo(155.58173f, 152.0f, 152.0f, 148.41827f, 152.0f, 144.0f),
                    PathNode.CurveTo(152.0f, 139.58173f, 155.58173f, 136.0f, 160.0f, 136.0f),
                    PathNode.LineTo(200.0f, 136.0f),
                    PathNode.CurveTo(204.41827f, 136.0f, 208.0f, 139.58173f, 208.0f, 144.0f),
                    PathNode.CurveTo(208.0f, 148.41827f, 204.41827f, 152.0f, 200.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 120.0f),
                    PathNode.LineTo(160.0f, 120.0f),
                    PathNode.CurveTo(155.58173f, 120.0f, 152.0f, 116.41828f, 152.0f, 112.0f),
                    PathNode.CurveTo(152.0f, 107.58172f, 155.58173f, 104.0f, 160.0f, 104.0f),
                    PathNode.LineTo(200.0f, 104.0f),
                    PathNode.CurveTo(204.41827f, 104.0f, 208.0f, 107.58172f, 208.0f, 112.0f),
                    PathNode.CurveTo(208.0f, 116.41828f, 204.41827f, 120.0f, 200.0f, 120.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _articleMedium!!
    }

private var _articleMedium: ImageVector? = null
