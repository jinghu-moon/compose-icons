package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FadersHorizontal: ImageVector
    get() {
        if (_fadersHorizontal != null) return _fadersHorizontal!!
        _fadersHorizontal = phosphorBoldIcon(
            name = "FadersHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 80.0f),
                    PathNode.CurveTo(176.0f, 73.37258f, 181.37259f, 68.0f, 188.0f, 68.0f),
                    PathNode.LineTo(216.0f, 68.0f),
                    PathNode.CurveTo(222.62741f, 68.0f, 228.0f, 73.37258f, 228.0f, 80.0f),
                    PathNode.CurveTo(228.0f, 86.62742f, 222.62741f, 92.0f, 216.0f, 92.0f),
                    PathNode.LineTo(188.0f, 92.0f),
                    PathNode.CurveTo(181.37259f, 92.0f, 176.0f, 86.62742f, 176.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 92.0f),
                    PathNode.LineTo(136.0f, 92.0f),
                    PathNode.LineTo(136.0f, 104.0f),
                    PathNode.CurveTo(136.0f, 110.62742f, 141.37259f, 116.0f, 148.0f, 116.0f),
                    PathNode.CurveTo(154.62741f, 116.0f, 160.0f, 110.62742f, 160.0f, 104.0f),
                    PathNode.LineTo(160.0f, 56.0f),
                    PathNode.CurveTo(160.0f, 49.37258f, 154.62741f, 44.0f, 148.0f, 44.0f),
                    PathNode.CurveTo(141.37259f, 44.0f, 136.0f, 49.37258f, 136.0f, 56.0f),
                    PathNode.LineTo(136.0f, 68.0f),
                    PathNode.LineTo(40.0f, 68.0f),
                    PathNode.CurveTo(33.37258f, 68.0f, 28.0f, 73.37258f, 28.0f, 80.0f),
                    PathNode.CurveTo(28.0f, 86.62742f, 33.37258f, 92.0f, 40.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 164.0f),
                    PathNode.LineTo(124.0f, 164.0f),
                    PathNode.CurveTo(117.37258f, 164.0f, 112.0f, 169.37259f, 112.0f, 176.0f),
                    PathNode.CurveTo(112.0f, 182.62741f, 117.37258f, 188.0f, 124.0f, 188.0f),
                    PathNode.LineTo(216.0f, 188.0f),
                    PathNode.CurveTo(222.62741f, 188.0f, 228.0f, 182.62741f, 228.0f, 176.0f),
                    PathNode.CurveTo(228.0f, 169.37259f, 222.62741f, 164.0f, 216.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 140.0f),
                    PathNode.CurveTo(77.37258f, 140.0f, 72.0f, 145.37259f, 72.0f, 152.0f),
                    PathNode.LineTo(72.0f, 164.0f),
                    PathNode.LineTo(40.0f, 164.0f),
                    PathNode.CurveTo(33.37258f, 164.0f, 28.0f, 169.37259f, 28.0f, 176.0f),
                    PathNode.CurveTo(28.0f, 182.62741f, 33.37258f, 188.0f, 40.0f, 188.0f),
                    PathNode.LineTo(72.0f, 188.0f),
                    PathNode.LineTo(72.0f, 200.0f),
                    PathNode.CurveTo(72.0f, 206.62741f, 77.37258f, 212.0f, 84.0f, 212.0f),
                    PathNode.CurveTo(90.62742f, 212.0f, 96.0f, 206.62741f, 96.0f, 200.0f),
                    PathNode.LineTo(96.0f, 152.0f),
                    PathNode.CurveTo(96.0f, 145.37259f, 90.62742f, 140.0f, 84.0f, 140.0f),
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
        return _fadersHorizontal!!
    }

private var _fadersHorizontal: ImageVector? = null
