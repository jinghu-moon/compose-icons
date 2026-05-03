package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FireExtinguisher: ImageVector
    get() {
        if (_fireExtinguisher != null) return _fireExtinguisher!!
        _fireExtinguisher = phosphorBoldIcon(
            name = "FireExtinguisher",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(219.45f, 44.51f),
                    PathNode.LineTo(170.07f, 29.7f),
                    PathNode.LineTo(185.0f, 22.93f),
                    PathNode.CurveTo(191.0337f, 20.168577f, 193.68642f, 13.038711f, 190.925f, 7.005f),
                    PathNode.CurveTo(188.16357f, 0.971289f, 181.0337f, -1.681424f, 175.0f, 1.08f),
                    PathNode.LineTo(133.22f, 20.08f),
                    PathNode.CurveTo(87.96874f, 21.625284f, 52.06516f, 58.722412f, 52.0f, 104.0f),
                    PathNode.LineTo(52.0f, 208.0f),
                    PathNode.CurveTo(52.0f, 214.62741f, 57.37258f, 220.0f, 64.0f, 220.0f),
                    PathNode.CurveTo(70.62742f, 220.0f, 76.0f, 214.62741f, 76.0f, 208.0f),
                    PathNode.LineTo(76.0f, 180.0f),
                    PathNode.LineTo(92.0f, 180.0f),
                    PathNode.LineTo(92.0f, 232.0f),
                    PathNode.CurveTo(92.0f, 243.0457f, 100.95431f, 252.0f, 112.0f, 252.0f),
                    PathNode.LineTo(160.0f, 252.0f),
                    PathNode.CurveTo(171.0457f, 252.0f, 180.0f, 243.0457f, 180.0f, 232.0f),
                    PathNode.LineTo(180.0f, 104.0f),
                    PathNode.CurveTo(179.96767f, 84.334564f, 166.91261f, 67.06924f, 148.0f, 61.68f),
                    PathNode.LineTo(148.0f, 48.13f),
                    PathNode.LineTo(212.55f, 67.5f),
                    PathNode.CurveTo(213.66893f, 67.83641f, 214.8316f, 68.00491f, 216.0f, 68.0f),
                    PathNode.CurveTo(221.94965f, 67.99445f, 226.99689f, 63.630253f, 227.86145f, 57.74375f),
                    PathNode.CurveTo(228.726f, 51.85725f, 225.14679f, 46.22607f, 219.45f, 44.51f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 156.0f),
                    PathNode.LineTo(76.0f, 104.0f),
                    PathNode.CurveTo(76.037636f, 75.50144f, 96.08498f, 50.947624f, 124.0f, 45.21f),
                    PathNode.LineTo(124.0f, 61.68f),
                    PathNode.CurveTo(105.08339f, 67.063385f, 92.025604f, 84.3323f, 92.0f, 104.0f),
                    PathNode.LineTo(92.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 228.0f),
                    PathNode.LineTo(116.0f, 180.0f),
                    PathNode.LineTo(156.0f, 180.0f),
                    PathNode.LineTo(156.0f, 228.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 104.0f),
                    PathNode.LineTo(156.0f, 156.0f),
                    PathNode.LineTo(116.0f, 156.0f),
                    PathNode.LineTo(116.0f, 104.0f),
                    PathNode.CurveTo(116.0f, 92.95431f, 124.95431f, 84.0f, 136.0f, 84.0f),
                    PathNode.CurveTo(147.0457f, 84.0f, 156.0f, 92.95431f, 156.0f, 104.0f),
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
        return _fireExtinguisher!!
    }

private var _fireExtinguisher: ImageVector? = null
