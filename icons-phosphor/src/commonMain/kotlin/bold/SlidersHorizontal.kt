package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SlidersHorizontal: ImageVector
    get() {
        if (_slidersHorizontal != null) return _slidersHorizontal!!
        _slidersHorizontal = phosphorBoldIcon(
            name = "SlidersHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(40.0f, 92.0f),
                    PathNode.LineTo(70.06f, 92.0f),
                    PathNode.CurveTo(75.14633f, 106.38203f, 88.74505f, 115.99682f, 104.0f, 115.99682f),
                    PathNode.CurveTo(119.25495f, 115.99682f, 132.85367f, 106.38203f, 137.94f, 92.0f),
                    PathNode.LineTo(216.0f, 92.0f),
                    PathNode.CurveTo(222.62741f, 92.0f, 228.0f, 86.62742f, 228.0f, 80.0f),
                    PathNode.CurveTo(228.0f, 73.37258f, 222.62741f, 68.0f, 216.0f, 68.0f),
                    PathNode.LineTo(137.94f, 68.0f),
                    PathNode.CurveTo(132.85367f, 53.617973f, 119.25495f, 44.00318f, 104.0f, 44.00318f),
                    PathNode.CurveTo(88.74505f, 44.00318f, 75.14633f, 53.617973f, 70.06f, 68.0f),
                    PathNode.LineTo(40.0f, 68.0f),
                    PathNode.CurveTo(33.37258f, 68.0f, 28.0f, 73.37258f, 28.0f, 80.0f),
                    PathNode.CurveTo(28.0f, 86.62742f, 33.37258f, 92.0f, 40.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 68.0f),
                    PathNode.CurveTo(110.62742f, 68.0f, 116.0f, 73.37258f, 116.0f, 80.0f),
                    PathNode.CurveTo(116.0f, 86.62742f, 110.62742f, 92.0f, 104.0f, 92.0f),
                    PathNode.CurveTo(97.37258f, 92.0f, 92.0f, 86.62742f, 92.0f, 80.0f),
                    PathNode.CurveTo(92.0f, 73.37258f, 97.37258f, 68.0f, 104.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 164.0f),
                    PathNode.LineTo(201.94f, 164.0f),
                    PathNode.CurveTo(196.85367f, 149.61797f, 183.25494f, 140.00319f, 168.0f, 140.00319f),
                    PathNode.CurveTo(152.74506f, 140.00319f, 139.14633f, 149.61797f, 134.06f, 164.0f),
                    PathNode.LineTo(40.0f, 164.0f),
                    PathNode.CurveTo(33.37258f, 164.0f, 28.0f, 169.37259f, 28.0f, 176.0f),
                    PathNode.CurveTo(28.0f, 182.62741f, 33.37258f, 188.0f, 40.0f, 188.0f),
                    PathNode.LineTo(134.06f, 188.0f),
                    PathNode.CurveTo(139.14633f, 202.38203f, 152.74506f, 211.99681f, 168.0f, 211.99681f),
                    PathNode.CurveTo(183.25494f, 211.99681f, 196.85367f, 202.38203f, 201.94f, 188.0f),
                    PathNode.LineTo(216.0f, 188.0f),
                    PathNode.CurveTo(222.62741f, 188.0f, 228.0f, 182.62741f, 228.0f, 176.0f),
                    PathNode.CurveTo(228.0f, 169.37259f, 222.62741f, 164.0f, 216.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 188.0f),
                    PathNode.CurveTo(161.37259f, 188.0f, 156.0f, 182.62741f, 156.0f, 176.0f),
                    PathNode.CurveTo(156.0f, 169.37259f, 161.37259f, 164.0f, 168.0f, 164.0f),
                    PathNode.CurveTo(174.62741f, 164.0f, 180.0f, 169.37259f, 180.0f, 176.0f),
                    PathNode.CurveTo(180.0f, 182.62741f, 174.62741f, 188.0f, 168.0f, 188.0f),
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
        return _slidersHorizontal!!
    }

private var _slidersHorizontal: ImageVector? = null
