package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MagnetStraight: ImageVector
    get() {
        if (_magnetStraight != null) return _magnetStraight!!
        _magnetStraight = phosphorThinIcon(
            name = "MagnetStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 44.0f),
                    PathNode.LineTo(160.0f, 44.0f),
                    PathNode.CurveTo(153.37259f, 44.0f, 148.0f, 49.37258f, 148.0f, 56.0f),
                    PathNode.LineTo(148.0f, 144.0f),
                    PathNode.CurveTo(148.0f, 155.0457f, 139.0457f, 164.0f, 128.0f, 164.0f),
                    PathNode.CurveTo(116.95431f, 164.0f, 108.0f, 155.0457f, 108.0f, 144.0f),
                    PathNode.LineTo(108.0f, 56.0f),
                    PathNode.CurveTo(108.0f, 49.37258f, 102.62742f, 44.0f, 96.0f, 44.0f),
                    PathNode.LineTo(56.0f, 44.0f),
                    PathNode.CurveTo(49.37258f, 44.0f, 44.0f, 49.37258f, 44.0f, 56.0f),
                    PathNode.LineTo(44.0f, 144.0f),
                    PathNode.CurveTo(44.0f, 190.39192f, 81.60808f, 228.0f, 128.0f, 228.0f),
                    PathNode.LineTo(128.64f, 228.0f),
                    PathNode.CurveTo(174.64f, 227.66f, 212.0f, 189.53f, 212.0f, 143.0f),
                    PathNode.LineTo(212.0f, 56.0f),
                    PathNode.CurveTo(212.0f, 49.37258f, 206.62741f, 44.0f, 200.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 52.0f),
                    PathNode.LineTo(200.0f, 52.0f),
                    PathNode.CurveTo(202.20914f, 52.0f, 204.0f, 53.79086f, 204.0f, 56.0f),
                    PathNode.LineTo(204.0f, 92.0f),
                    PathNode.LineTo(156.0f, 92.0f),
                    PathNode.LineTo(156.0f, 56.0f),
                    PathNode.CurveTo(156.0f, 53.79086f, 157.79086f, 52.0f, 160.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 52.0f),
                    PathNode.LineTo(96.0f, 52.0f),
                    PathNode.CurveTo(98.20914f, 52.0f, 100.0f, 53.79086f, 100.0f, 56.0f),
                    PathNode.LineTo(100.0f, 92.0f),
                    PathNode.LineTo(52.0f, 92.0f),
                    PathNode.LineTo(52.0f, 56.0f),
                    PathNode.CurveTo(52.0f, 53.79086f, 53.79086f, 52.0f, 56.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.58f, 220.0f),
                    PathNode.LineTo(128.0f, 220.0f),
                    PathNode.CurveTo(86.02636f, 220.0f, 52.0f, 185.97365f, 52.0f, 144.0f),
                    PathNode.LineTo(52.0f, 100.0f),
                    PathNode.LineTo(100.0f, 100.0f),
                    PathNode.LineTo(100.0f, 144.0f),
                    PathNode.CurveTo(100.0f, 159.46397f, 112.536026f, 172.0f, 128.0f, 172.0f),
                    PathNode.CurveTo(143.46397f, 172.0f, 156.0f, 159.46397f, 156.0f, 144.0f),
                    PathNode.LineTo(156.0f, 100.0f),
                    PathNode.LineTo(204.0f, 100.0f),
                    PathNode.LineTo(204.0f, 143.0f),
                    PathNode.CurveTo(204.0f, 185.15f, 170.17f, 219.69f, 128.58f, 220.0f),
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
        return _magnetStraight!!
    }

private var _magnetStraight: ImageVector? = null
