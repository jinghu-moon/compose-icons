package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DropHalf: ImageVector
    get() {
        if (_dropHalf != null) return _dropHalf!!
        _dropHalf = phosphorThinIcon(
            name = "DropHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(171.0f, 50.37f),
                    PathNode.CurveTo(158.8608f, 36.349144f, 145.2002f, 23.721558f, 130.27f, 12.72f),
                    PathNode.CurveTo(128.89441f, 11.759492f, 127.06559f, 11.759492f, 125.69f, 12.72f),
                    PathNode.CurveTo(110.7738f, 23.723885f, 97.12671f, 36.351387f, 85.0f, 50.37f),
                    PathNode.CurveTo(58.17f, 81.21f, 44.0f, 113.58f, 44.0f, 144.0f),
                    PathNode.CurveTo(44.0f, 190.39192f, 81.60808f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(174.39192f, 228.0f, 212.0f, 190.39192f, 212.0f, 144.0f),
                    PathNode.CurveTo(212.0f, 113.58f, 197.83f, 81.21f, 171.0f, 50.37f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 144.0f),
                    PathNode.CurveTo(203.98708f, 148.02025f, 203.65268f, 152.03305f, 203.0f, 156.0f),
                    PathNode.LineTo(132.0f, 156.0f),
                    PathNode.LineTo(132.0f, 132.0f),
                    PathNode.LineTo(203.21f, 132.0f),
                    PathNode.CurveTo(203.7309f, 135.97887f, 203.99478f, 139.98718f, 204.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(190.14f, 92.0f),
                    PathNode.LineTo(132.0f, 92.0f),
                    PathNode.LineTo(132.0f, 68.0f),
                    PathNode.LineTo(175.0f, 68.0f),
                    PathNode.CurveTo(180.6824f, 75.58084f, 185.74542f, 83.60676f, 190.14f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 164.0f),
                    PathNode.LineTo(201.31f, 164.0f),
                    PathNode.CurveTo(198.95604f, 172.61005f, 195.0965f, 180.73541f, 189.91f, 188.0f),
                    PathNode.LineTo(132.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 124.0f),
                    PathNode.LineTo(132.0f, 100.0f),
                    PathNode.LineTo(194.0f, 100.0f),
                    PathNode.CurveTo(197.46323f, 107.70067f, 200.1045f, 115.745186f, 201.88f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(165.1f, 55.77f),
                    PathNode.QuadTo(166.87f, 57.77f, 168.69f, 60.0f),
                    PathNode.LineTo(132.0f, 60.0f),
                    PathNode.LineTo(132.0f, 24.07f),
                    PathNode.CurveTo(143.95734f, 33.627567f, 155.03491f, 44.23659f, 165.1f, 55.77f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 144.0f),
                    PathNode.CurveTo(52.0f, 108.1f, 73.15f, 76.2f, 90.9f, 55.77f),
                    PathNode.CurveTo(100.96508f, 44.23659f, 112.04265f, 33.627567f, 124.0f, 24.07f),
                    PathNode.LineTo(124.0f, 219.89f),
                    PathNode.CurveTo(83.65906f, 217.71848f, 52.047787f, 184.39932f, 52.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 219.89f),
                    PathNode.LineTo(132.0f, 196.0f),
                    PathNode.LineTo(183.35f, 196.0f),
                    PathNode.CurveTo(169.9636f, 210.29977f, 151.56071f, 218.86151f, 132.0f, 219.89f),
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
        return _dropHalf!!
    }

private var _dropHalf: ImageVector? = null
