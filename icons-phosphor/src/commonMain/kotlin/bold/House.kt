package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.House: ImageVector
    get() {
        if (_house != null) return _house!!
        _house = phosphorBoldIcon(
            name = "House",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.14f, 105.85f),
                    PathNode.LineTo(142.14f, 25.85f),
                    PathNode.CurveTo(134.33f, 18.04236f, 121.67f, 18.04236f, 113.86f, 25.85f),
                    PathNode.LineTo(33.86f, 105.85f),
                    PathNode.CurveTo(30.093409f, 109.5935f, 27.982954f, 114.68957f, 28.0f, 120.0f),
                    PathNode.LineTo(28.0f, 216.0f),
                    PathNode.CurveTo(28.0f, 222.62741f, 33.37258f, 228.0f, 40.0f, 228.0f),
                    PathNode.LineTo(104.0f, 228.0f),
                    PathNode.CurveTo(110.62742f, 228.0f, 116.0f, 222.62741f, 116.0f, 216.0f),
                    PathNode.LineTo(116.0f, 164.0f),
                    PathNode.LineTo(140.0f, 164.0f),
                    PathNode.LineTo(140.0f, 216.0f),
                    PathNode.CurveTo(140.0f, 222.62741f, 145.37259f, 228.0f, 152.0f, 228.0f),
                    PathNode.LineTo(216.0f, 228.0f),
                    PathNode.CurveTo(222.62741f, 228.0f, 228.0f, 222.62741f, 228.0f, 216.0f),
                    PathNode.LineTo(228.0f, 120.0f),
                    PathNode.CurveTo(228.01704f, 114.68957f, 225.90659f, 109.5935f, 222.14f, 105.85f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 204.0f),
                    PathNode.LineTo(164.0f, 204.0f),
                    PathNode.LineTo(164.0f, 152.0f),
                    PathNode.CurveTo(164.0f, 145.37259f, 158.62741f, 140.0f, 152.0f, 140.0f),
                    PathNode.LineTo(104.0f, 140.0f),
                    PathNode.CurveTo(97.37258f, 140.0f, 92.0f, 145.37259f, 92.0f, 152.0f),
                    PathNode.LineTo(92.0f, 204.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.LineTo(52.0f, 121.65f),
                    PathNode.LineTo(128.0f, 45.65f),
                    PathNode.LineTo(204.0f, 121.65f),
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
        return _house!!
    }

private var _house: ImageVector? = null
