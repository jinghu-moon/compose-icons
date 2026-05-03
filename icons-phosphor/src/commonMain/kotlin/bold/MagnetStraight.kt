package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MagnetStraight: ImageVector
    get() {
        if (_magnetStraight != null) return _magnetStraight!!
        _magnetStraight = phosphorBoldIcon(
            name = "MagnetStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 36.0f),
                    PathNode.LineTo(160.0f, 36.0f),
                    PathNode.CurveTo(148.9543f, 36.0f, 140.0f, 44.954304f, 140.0f, 56.0f),
                    PathNode.LineTo(140.0f, 144.0f),
                    PathNode.CurveTo(140.0f, 150.62741f, 134.62741f, 156.0f, 128.0f, 156.0f),
                    PathNode.CurveTo(121.37258f, 156.0f, 116.0f, 150.62741f, 116.0f, 144.0f),
                    PathNode.LineTo(116.0f, 56.0f),
                    PathNode.CurveTo(116.0f, 44.954304f, 107.04569f, 36.0f, 96.0f, 36.0f),
                    PathNode.LineTo(56.0f, 36.0f),
                    PathNode.CurveTo(44.954304f, 36.0f, 36.0f, 44.954304f, 36.0f, 56.0f),
                    PathNode.LineTo(36.0f, 144.0f),
                    PathNode.CurveTo(36.0f, 194.8102f, 77.18981f, 236.0f, 128.0f, 236.0f),
                    PathNode.LineTo(128.71f, 236.0f),
                    PathNode.CurveTo(179.05f, 235.62f, 220.01f, 193.9f, 220.01f, 143.0f),
                    PathNode.LineTo(220.01f, 56.0f),
                    PathNode.CurveTo(220.01f, 50.693935f, 217.90149f, 45.605343f, 214.1486f, 41.85433f),
                    PathNode.CurveTo(210.3957f, 38.103313f, 205.30606f, 35.99735f, 200.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 60.0f),
                    PathNode.LineTo(196.0f, 84.0f),
                    PathNode.LineTo(164.0f, 84.0f),
                    PathNode.LineTo(164.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 60.0f),
                    PathNode.LineTo(92.0f, 84.0f),
                    PathNode.LineTo(60.0f, 84.0f),
                    PathNode.LineTo(60.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.52f, 212.0f),
                    PathNode.LineTo(128.0f, 212.0f),
                    PathNode.CurveTo(90.44463f, 212.0f, 60.0f, 181.55536f, 60.0f, 144.0f),
                    PathNode.LineTo(60.0f, 108.0f),
                    PathNode.LineTo(92.0f, 108.0f),
                    PathNode.LineTo(92.0f, 144.0f),
                    PathNode.CurveTo(92.0f, 163.88223f, 108.11775f, 180.0f, 128.0f, 180.0f),
                    PathNode.CurveTo(147.88223f, 180.0f, 164.0f, 163.88223f, 164.0f, 144.0f),
                    PathNode.LineTo(164.0f, 108.0f),
                    PathNode.LineTo(196.0f, 108.0f),
                    PathNode.LineTo(196.0f, 143.0f),
                    PathNode.CurveTo(196.0f, 180.77f, 165.73f, 211.72f, 128.52f, 212.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _magnetStraight!!
    }

private var _magnetStraight: ImageVector? = null
