package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Database: ImageVector
    get() {
        if (_database != null) return _database!!
        _database = phosphorBoldIcon(
            name = "Database",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(196.0f, 35.52f),
                    PathNode.CurveTo(177.62f, 25.51f, 153.48f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(102.52f, 20.0f, 78.38f, 25.51f, 60.0f, 35.52f),
                    PathNode.CurveTo(39.37f, 46.79f, 28.0f, 62.58f, 28.0f, 80.0f),
                    PathNode.LineTo(28.0f, 176.0f),
                    PathNode.CurveTo(28.0f, 193.42f, 39.37f, 209.21f, 60.0f, 220.48f),
                    PathNode.CurveTo(78.35f, 230.48f, 102.49f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(153.51f, 236.0f, 177.62f, 230.49f, 196.0f, 220.48f),
                    PathNode.CurveTo(216.66f, 209.21f, 228.0f, 193.42f, 228.0f, 176.0f),
                    PathNode.LineTo(228.0f, 80.0f),
                    PathNode.CurveTo(228.0f, 62.58f, 216.63f, 46.79f, 196.0f, 35.52f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 128.0f),
                    PathNode.CurveTo(204.0f, 145.0f, 172.79f, 164.0f, 128.0f, 164.0f),
                    PathNode.CurveTo(83.21f, 164.0f, 52.0f, 145.0f, 52.0f, 128.0f),
                    PathNode.LineTo(52.0f, 119.54f),
                    PathNode.CurveTo(54.57766f, 121.32663f, 57.248062f, 122.9756f, 60.0f, 124.48f),
                    PathNode.CurveTo(78.35f, 134.48f, 102.49f, 140.0f, 128.0f, 140.0f),
                    PathNode.CurveTo(153.51f, 140.0f, 177.62f, 134.49f, 196.0f, 124.48f),
                    PathNode.CurveTo(198.75194f, 122.9756f, 201.42233f, 121.32663f, 204.0f, 119.54f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 44.0f),
                    PathNode.CurveTo(172.79f, 44.0f, 204.0f, 63.0f, 204.0f, 80.0f),
                    PathNode.CurveTo(204.0f, 97.0f, 172.79f, 116.0f, 128.0f, 116.0f),
                    PathNode.CurveTo(83.21f, 116.0f, 52.0f, 97.0f, 52.0f, 80.0f),
                    PathNode.CurveTo(52.0f, 63.0f, 83.21f, 44.0f, 128.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(83.21f, 212.0f, 52.0f, 193.0f, 52.0f, 176.0f),
                    PathNode.LineTo(52.0f, 167.54f),
                    PathNode.CurveTo(54.57766f, 169.32663f, 57.248062f, 170.9756f, 60.0f, 172.48f),
                    PathNode.CurveTo(78.35f, 182.48f, 102.49f, 188.0f, 128.0f, 188.0f),
                    PathNode.CurveTo(153.51f, 188.0f, 177.62f, 182.49f, 196.0f, 172.48f),
                    PathNode.CurveTo(198.75194f, 170.9756f, 201.42233f, 169.32663f, 204.0f, 167.54f),
                    PathNode.LineTo(204.0f, 176.0f),
                    PathNode.CurveTo(204.0f, 193.0f, 172.79f, 212.0f, 128.0f, 212.0f),
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
        return _database!!
    }

private var _database: ImageVector? = null
