package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Ladder: ImageVector
    get() {
        if (_ladder != null) return _ladder!!
        _ladder = phosphorBoldIcon(
            name = "Ladder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(219.27f, 211.9f),
                    PathNode.LineTo(168.77f, 73.0f),
                    PathNode.LineTo(176.4f, 52.0f),
                    PathNode.LineTo(184.0f, 52.0f),
                    PathNode.CurveTo(190.62741f, 52.0f, 196.0f, 46.62742f, 196.0f, 40.0f),
                    PathNode.CurveTo(196.0f, 33.37258f, 190.62741f, 28.0f, 184.0f, 28.0f),
                    PathNode.LineTo(88.0f, 28.0f),
                    PathNode.CurveTo(81.62189f, 28.045425f, 76.39376f, 33.07247f, 76.09834f, 39.4439f),
                    PathNode.CurveTo(75.802925f, 45.815334f, 80.54345f, 51.304585f, 86.89f, 51.94f),
                    PathNode.LineTo(28.73f, 211.94f),
                    PathNode.CurveTo(26.470036f, 218.16406f, 29.678728f, 225.04239f, 35.9f, 227.31f),
                    PathNode.CurveTo(37.215218f, 227.78024f, 38.603317f, 228.01384f, 40.0f, 228.0f),
                    PathNode.CurveTo(45.047222f, 228.0009f, 49.555534f, 224.84349f, 51.28f, 220.1f),
                    PathNode.LineTo(60.0f, 196.0f),
                    PathNode.LineTo(98.5f, 196.0f),
                    PathNode.LineTo(92.72f, 211.9f),
                    PathNode.CurveTo(90.46101f, 218.12689f, 93.67476f, 225.00645f, 99.9f, 227.27f),
                    PathNode.CurveTo(101.212524f, 227.75468f, 102.600845f, 228.00188f, 104.0f, 228.0f),
                    PathNode.CurveTo(109.04722f, 228.0009f, 113.555534f, 224.84349f, 115.28f, 220.1f),
                    PathNode.LineTo(132.77f, 172.0f),
                    PathNode.LineTo(179.23f, 172.0f),
                    PathNode.LineTo(196.72f, 220.1f),
                    PathNode.CurveTo(198.44447f, 224.84349f, 202.95277f, 228.0009f, 208.0f, 228.0f),
                    PathNode.CurveTo(209.39908f, 228.00102f, 210.78725f, 227.75386f, 212.1f, 227.27f),
                    PathNode.CurveTo(218.32127f, 225.00238f, 221.52997f, 218.12405f, 219.27f, 211.9f),
                    PathNode.Close,
                    PathNode.MoveTo(124.69f, 124.0f),
                    PathNode.LineTo(86.22f, 124.0f),
                    PathNode.LineTo(95.0f, 100.0f),
                    PathNode.LineTo(133.46f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(142.14f, 76.0f),
                    PathNode.LineTo(103.68f, 76.0f),
                    PathNode.LineTo(112.41f, 52.0f),
                    PathNode.LineTo(150.87f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.77f, 172.0f),
                    PathNode.LineTo(77.5f, 148.0f),
                    PathNode.LineTo(116.0f, 148.0f),
                    PathNode.LineTo(107.27f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(141.5f, 148.0f),
                    PathNode.LineTo(156.0f, 108.11f),
                    PathNode.LineTo(170.5f, 148.0f),
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
        return _ladder!!
    }

private var _ladder: ImageVector? = null
