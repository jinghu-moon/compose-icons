package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TennisBall: ImageVector
    get() {
        if (_tennisBall != null) return _tennisBall!!
        _tennisBall = phosphorThinIcon(
            name = "TennisBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(198.74f, 57.29f),
                    PathNode.CurveTo(180.01758f, 38.47169f, 154.5453f, 27.92485f, 128.0f, 28.0f),
                    PathNode.LineTo(127.81f, 28.0f),
                    PathNode.CurveTo(80.12334f, 28.10415f, 39.14487f, 61.86546f, 29.918116f, 108.65109f),
                    PathNode.CurveTo(20.691359f, 155.43674f, 45.783752f, 202.22809f, 89.860374f, 220.4292f),
                    PathNode.CurveTo(133.937f, 238.63031f, 184.73306f, 223.1765f, 211.20515f, 183.51219f),
                    PathNode.CurveTo(237.67723f, 143.84787f, 232.45921f, 91.01008f, 198.74f, 57.29f),
                    PathNode.Close,
                    PathNode.MoveTo(62.92f, 63.0f),
                    PathNode.CurveTo(79.09795f, 46.735573f, 100.80154f, 37.151012f, 123.72f, 36.15f),
                    PathNode.CurveTo(122.71093f, 59.049046f, 113.12645f, 80.731026f, 96.87f, 96.89f),
                    PathNode.CurveTo(80.69461f, 113.13897f, 59.005215f, 122.71842f, 36.1f, 123.73f),
                    PathNode.CurveTo(37.13252f, 100.84539f, 46.70141f, 79.17803f, 62.92f, 63.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.09f, 131.74f),
                    PathNode.CurveTo(61.126255f, 130.73224f, 84.857376f, 120.30255f, 102.53f, 102.54f),
                    PathNode.CurveTo(120.30767f, 84.87273f, 130.74287f, 61.13364f, 131.74f, 36.09f),
                    PathNode.CurveTo(179.62279f, 37.99703f, 218.00298f, 76.377205f, 219.91f, 124.26f),
                    PathNode.CurveTo(168.02773f, 126.4718f, 126.4718f, 168.02773f, 124.26f, 219.91f),
                    PathNode.CurveTo(76.377205f, 218.00298f, 37.99703f, 179.62279f, 36.09f, 131.74f),
                    PathNode.Close,
                    PathNode.MoveTo(193.09f, 193.05f),
                    PathNode.CurveTo(176.91205f, 209.31442f, 155.20847f, 218.89899f, 132.29f, 219.9f),
                    PathNode.CurveTo(134.49484f, 172.45038f, 172.46065f, 134.48026f, 219.91f, 132.27f),
                    PathNode.CurveTo(218.88713f, 155.1735f, 209.31366f, 176.861f, 193.08f, 193.05f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _tennisBall!!
    }

private var _tennisBall: ImageVector? = null
