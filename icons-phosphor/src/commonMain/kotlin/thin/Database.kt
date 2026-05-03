package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Database: ImageVector
    get() {
        if (_database != null) return _database!!
        _database = phosphorThinIcon(
            name = "Database",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.14f, 42.55f),
                    PathNode.CurveTo(174.94f, 33.17f, 152.16f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(103.84f, 28.0f, 81.06f, 33.17f, 63.86f, 42.55f),
                    PathNode.CurveTo(45.89f, 52.35f, 36.0f, 65.65f, 36.0f, 80.0f),
                    PathNode.LineTo(36.0f, 176.0f),
                    PathNode.CurveTo(36.0f, 190.35f, 45.89f, 203.65f, 63.86f, 213.45f),
                    PathNode.CurveTo(81.06f, 222.83f, 103.86f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(152.14f, 228.0f, 174.94f, 222.83f, 192.14f, 213.45f),
                    PathNode.CurveTo(210.14f, 203.65f, 220.0f, 190.35f, 220.0f, 176.0f),
                    PathNode.LineTo(220.0f, 80.0f),
                    PathNode.CurveTo(220.0f, 65.65f, 210.11f, 52.35f, 192.14f, 42.55f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 176.0f),
                    PathNode.CurveTo(212.0f, 187.29f, 203.59f, 198.1f, 188.31f, 206.43f),
                    PathNode.CurveTo(172.27f, 215.18f, 150.85f, 220.0f, 128.0f, 220.0f),
                    PathNode.CurveTo(105.15f, 220.0f, 83.73f, 215.18f, 67.69f, 206.43f),
                    PathNode.CurveTo(52.41f, 198.1f, 44.0f, 187.29f, 44.0f, 176.0f),
                    PathNode.LineTo(44.0f, 149.48f),
                    PathNode.CurveTo(48.69f, 155.41f, 55.37f, 160.82f, 63.86f, 165.48f),
                    PathNode.CurveTo(81.06f, 174.86f, 103.86f, 180.03f, 128.0f, 180.03f),
                    PathNode.CurveTo(152.14f, 180.03f, 174.94f, 174.86f, 192.14f, 165.48f),
                    PathNode.CurveTo(200.63f, 160.85f, 207.31f, 155.48f, 212.0f, 149.48f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 128.0f),
                    PathNode.CurveTo(212.0f, 139.29f, 203.59f, 150.1f, 188.31f, 158.43f),
                    PathNode.CurveTo(172.27f, 167.18f, 150.85f, 172.0f, 128.0f, 172.0f),
                    PathNode.CurveTo(105.15f, 172.0f, 83.73f, 167.18f, 67.69f, 158.43f),
                    PathNode.CurveTo(52.41f, 150.1f, 44.0f, 139.29f, 44.0f, 128.0f),
                    PathNode.LineTo(44.0f, 101.48f),
                    PathNode.CurveTo(48.69f, 107.41f, 55.37f, 112.82f, 63.86f, 117.48f),
                    PathNode.CurveTo(81.06f, 126.86f, 103.86f, 132.03f, 128.0f, 132.03f),
                    PathNode.CurveTo(152.14f, 132.03f, 174.94f, 126.86f, 192.14f, 117.48f),
                    PathNode.CurveTo(200.63f, 112.85f, 207.31f, 107.48f, 212.0f, 101.48f),
                    PathNode.Close,
                    PathNode.MoveTo(188.31f, 110.43f),
                    PathNode.CurveTo(172.27f, 119.18f, 150.85f, 124.0f, 128.0f, 124.0f),
                    PathNode.CurveTo(105.15f, 124.0f, 83.73f, 119.18f, 67.69f, 110.43f),
                    PathNode.CurveTo(52.41f, 102.1f, 44.0f, 91.29f, 44.0f, 80.0f),
                    PathNode.CurveTo(44.0f, 68.71f, 52.41f, 57.9f, 67.69f, 49.57f),
                    PathNode.CurveTo(83.73f, 40.82f, 105.15f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(150.85f, 36.0f, 172.27f, 40.82f, 188.31f, 49.57f),
                    PathNode.CurveTo(203.59f, 57.9f, 212.0f, 68.71f, 212.0f, 80.0f),
                    PathNode.CurveTo(212.0f, 91.29f, 203.59f, 102.1f, 188.31f, 110.43f),
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
        return _database!!
    }

private var _database: ImageVector? = null
