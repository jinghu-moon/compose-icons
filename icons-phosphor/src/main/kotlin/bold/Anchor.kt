package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Anchor: ImageVector
    get() {
        if (_anchor != null) return _anchor!!
        _anchor = phosphorBoldIcon(
            name = "Anchor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 132.0f),
                    PathNode.CurveTo(209.37259f, 132.0f, 204.0f, 137.37259f, 204.0f, 144.0f),
                    PathNode.CurveTo(204.0f, 165.86f, 192.59f, 169.95f, 168.84f, 176.42f),
                    PathNode.CurveTo(159.72f, 178.91f, 149.23f, 181.78f, 140.0f, 187.11f),
                    PathNode.LineTo(140.0f, 132.0f),
                    PathNode.LineTo(168.0f, 132.0f),
                    PathNode.CurveTo(174.62741f, 132.0f, 180.0f, 126.62742f, 180.0f, 120.0f),
                    PathNode.CurveTo(180.0f, 113.37258f, 174.62741f, 108.0f, 168.0f, 108.0f),
                    PathNode.LineTo(140.0f, 108.0f),
                    PathNode.LineTo(140.0f, 89.94f),
                    PathNode.CurveTo(156.53056f, 84.095566f, 166.44649f, 67.19201f, 163.48155f, 49.9112f),
                    PathNode.CurveTo(160.51665f, 32.6304f, 145.53331f, 19.998875f, 128.0f, 19.998875f),
                    PathNode.CurveTo(110.46669f, 19.998875f, 95.48337f, 32.6304f, 92.518456f, 49.9112f),
                    PathNode.CurveTo(89.553535f, 67.19201f, 99.46944f, 84.095566f, 116.0f, 89.94f),
                    PathNode.LineTo(116.0f, 108.0f),
                    PathNode.LineTo(88.0f, 108.0f),
                    PathNode.CurveTo(81.37258f, 108.0f, 76.0f, 113.37258f, 76.0f, 120.0f),
                    PathNode.CurveTo(76.0f, 126.62742f, 81.37258f, 132.0f, 88.0f, 132.0f),
                    PathNode.LineTo(116.0f, 132.0f),
                    PathNode.LineTo(116.0f, 187.11f),
                    PathNode.CurveTo(106.77f, 181.78f, 96.28f, 178.91f, 87.16f, 176.42f),
                    PathNode.CurveTo(63.41f, 170.0f, 52.0f, 165.86f, 52.0f, 144.0f),
                    PathNode.CurveTo(52.0f, 137.37259f, 46.62742f, 132.0f, 40.0f, 132.0f),
                    PathNode.CurveTo(33.37258f, 132.0f, 28.0f, 137.37259f, 28.0f, 144.0f),
                    PathNode.CurveTo(28.0f, 185.17f, 58.54f, 193.5f, 80.84f, 199.58f),
                    PathNode.CurveTo(104.59f, 206.05f, 116.0f, 210.14f, 116.0f, 232.0f),
                    PathNode.CurveTo(116.0f, 238.62741f, 121.37258f, 244.0f, 128.0f, 244.0f),
                    PathNode.CurveTo(134.62741f, 244.0f, 140.0f, 238.62741f, 140.0f, 232.0f),
                    PathNode.CurveTo(140.0f, 210.14f, 151.41f, 206.05f, 175.16f, 199.58f),
                    PathNode.CurveTo(197.46f, 193.5f, 228.0f, 185.17f, 228.0f, 144.0f),
                    PathNode.CurveTo(228.0f, 137.37259f, 222.62741f, 132.0f, 216.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 44.0f),
                    PathNode.CurveTo(134.62741f, 44.0f, 140.0f, 49.37258f, 140.0f, 56.0f),
                    PathNode.CurveTo(140.0f, 62.62742f, 134.62741f, 68.0f, 128.0f, 68.0f),
                    PathNode.CurveTo(121.37258f, 68.0f, 116.0f, 62.62742f, 116.0f, 56.0f),
                    PathNode.CurveTo(116.0f, 49.37258f, 121.37258f, 44.0f, 128.0f, 44.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _anchor!!
    }

private var _anchor: ImageVector? = null
