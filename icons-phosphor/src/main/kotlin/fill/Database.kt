package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Database: ImageVector
    get() {
        if (_database != null) return _database!!
        _database = phosphorFillIcon(
            name = "Database",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(74.17f, 24.0f, 32.0f, 48.6f, 32.0f, 80.0f),
                    PathNode.LineTo(32.0f, 176.0f),
                    PathNode.CurveTo(32.0f, 207.4f, 74.17f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(181.83f, 232.0f, 224.0f, 207.4f, 224.0f, 176.0f),
                    PathNode.LineTo(224.0f, 80.0f),
                    PathNode.CurveTo(224.0f, 48.6f, 181.83f, 24.0f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 128.0f),
                    PathNode.CurveTo(208.0f, 137.62f, 200.12f, 147.43f, 186.39f, 154.92f),
                    PathNode.CurveTo(170.93f, 163.35f, 150.19f, 168.0f, 128.0f, 168.0f),
                    PathNode.CurveTo(105.81f, 168.0f, 85.07f, 163.35f, 69.61f, 154.92f),
                    PathNode.CurveTo(55.88f, 147.43f, 48.0f, 137.62f, 48.0f, 128.0f),
                    PathNode.LineTo(48.0f, 111.36f),
                    PathNode.CurveTo(65.06f, 126.36f, 94.23f, 136.0f, 128.0f, 136.0f),
                    PathNode.CurveTo(161.77f, 136.0f, 190.94f, 126.32f, 208.0f, 111.36f),
                    PathNode.Close,
                    PathNode.MoveTo(186.39f, 202.92f),
                    PathNode.CurveTo(170.93f, 211.35f, 150.19f, 216.0f, 128.0f, 216.0f),
                    PathNode.CurveTo(105.81f, 216.0f, 85.07f, 211.35f, 69.61f, 202.92f),
                    PathNode.CurveTo(55.88f, 195.43f, 48.0f, 185.62f, 48.0f, 176.0f),
                    PathNode.LineTo(48.0f, 159.36f),
                    PathNode.CurveTo(65.06f, 174.36f, 94.23f, 184.0f, 128.0f, 184.0f),
                    PathNode.CurveTo(161.77f, 184.0f, 190.94f, 174.32f, 208.0f, 159.36f),
                    PathNode.LineTo(208.0f, 176.0f),
                    PathNode.CurveTo(208.0f, 185.62f, 200.12f, 195.43f, 186.39f, 202.92f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _database!!
    }

private var _database: ImageVector? = null
