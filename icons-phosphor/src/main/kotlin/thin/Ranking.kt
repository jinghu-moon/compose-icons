package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Ranking: ImageVector
    get() {
        if (_ranking != null) return _ranking!!
        _ranking = phosphorThinIcon(
            name = "Ranking",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(116.21f, 101.26f),
                    PathNode.CurveTo(115.517715f, 99.1671f, 116.6492f, 96.9086f, 118.74f, 96.21f),
                    PathNode.LineTo(130.74f, 92.21f),
                    PathNode.CurveTo(131.95839f, 91.80562f, 133.29683f, 92.01059f, 134.33836f, 92.76105f),
                    PathNode.CurveTo(135.3799f, 93.511505f, 135.99796f, 94.71626f, 136.0f, 96.0f),
                    PathNode.LineTo(136.0f, 136.0f),
                    PathNode.CurveTo(136.0f, 138.20914f, 134.20914f, 140.0f, 132.0f, 140.0f),
                    PathNode.CurveTo(129.79086f, 140.0f, 128.0f, 138.20914f, 128.0f, 136.0f),
                    PathNode.LineTo(128.0f, 101.55f),
                    PathNode.LineTo(121.26f, 103.79f),
                    PathNode.CurveTo(119.1671f, 104.482285f, 116.9086f, 103.3508f, 116.21f, 101.26f),
                    PathNode.Close,
                    PathNode.MoveTo(244.0f, 208.0f),
                    PathNode.CurveTo(244.0f, 210.20914f, 242.20914f, 212.0f, 240.0f, 212.0f),
                    PathNode.LineTo(16.0f, 212.0f),
                    PathNode.CurveTo(13.790861f, 212.0f, 12.0f, 210.20914f, 12.0f, 208.0f),
                    PathNode.CurveTo(12.0f, 205.79086f, 13.790861f, 204.0f, 16.0f, 204.0f),
                    PathNode.LineTo(28.0f, 204.0f),
                    PathNode.LineTo(28.0f, 104.0f),
                    PathNode.CurveTo(28.0f, 97.37258f, 33.37258f, 92.0f, 40.0f, 92.0f),
                    PathNode.LineTo(84.0f, 92.0f),
                    PathNode.LineTo(84.0f, 56.0f),
                    PathNode.CurveTo(84.0f, 49.37258f, 89.37258f, 44.0f, 96.0f, 44.0f),
                    PathNode.LineTo(160.0f, 44.0f),
                    PathNode.CurveTo(166.62741f, 44.0f, 172.0f, 49.37258f, 172.0f, 56.0f),
                    PathNode.LineTo(172.0f, 132.0f),
                    PathNode.LineTo(216.0f, 132.0f),
                    PathNode.CurveTo(222.62741f, 132.0f, 228.0f, 137.37259f, 228.0f, 144.0f),
                    PathNode.LineTo(228.0f, 204.0f),
                    PathNode.LineTo(240.0f, 204.0f),
                    PathNode.CurveTo(242.20914f, 204.0f, 244.0f, 205.79086f, 244.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 140.0f),
                    PathNode.LineTo(172.0f, 204.0f),
                    PathNode.LineTo(220.0f, 204.0f),
                    PathNode.LineTo(220.0f, 144.0f),
                    PathNode.CurveTo(220.0f, 141.79086f, 218.20914f, 140.0f, 216.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 204.0f),
                    PathNode.LineTo(164.0f, 204.0f),
                    PathNode.LineTo(164.0f, 56.0f),
                    PathNode.CurveTo(164.0f, 53.79086f, 162.20914f, 52.0f, 160.0f, 52.0f),
                    PathNode.LineTo(96.0f, 52.0f),
                    PathNode.CurveTo(93.79086f, 52.0f, 92.0f, 53.79086f, 92.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 204.0f),
                    PathNode.LineTo(84.0f, 204.0f),
                    PathNode.LineTo(84.0f, 100.0f),
                    PathNode.LineTo(40.0f, 100.0f),
                    PathNode.CurveTo(37.79086f, 100.0f, 36.0f, 101.79086f, 36.0f, 104.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _ranking!!
    }

private var _ranking: ImageVector? = null
