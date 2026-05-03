package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Database: ImageVector
    get() {
        if (_database != null) return _database!!
        _database = phosphorLightIcon(
            name = "Database",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 26.0f),
                    PathNode.CurveTo(75.29f, 26.0f, 34.0f, 49.72f, 34.0f, 80.0f),
                    PathNode.LineTo(34.0f, 176.0f),
                    PathNode.CurveTo(34.0f, 206.28f, 75.29f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(180.71f, 230.0f, 222.0f, 206.28f, 222.0f, 176.0f),
                    PathNode.LineTo(222.0f, 80.0f),
                    PathNode.CurveTo(222.0f, 49.72f, 180.71f, 26.0f, 128.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 38.0f),
                    PathNode.CurveTo(172.45f, 38.0f, 210.0f, 57.23f, 210.0f, 80.0f),
                    PathNode.CurveTo(210.0f, 102.77f, 172.45f, 122.0f, 128.0f, 122.0f),
                    PathNode.CurveTo(83.55f, 122.0f, 46.0f, 102.77f, 46.0f, 80.0f),
                    PathNode.CurveTo(46.0f, 57.23f, 83.55f, 38.0f, 128.0f, 38.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 176.0f),
                    PathNode.CurveTo(210.0f, 198.77f, 172.45f, 218.0f, 128.0f, 218.0f),
                    PathNode.CurveTo(83.55f, 218.0f, 46.0f, 198.77f, 46.0f, 176.0f),
                    PathNode.LineTo(46.0f, 154.79f),
                    PathNode.CurveTo(62.0f, 171.16f, 92.37f, 182.0f, 128.0f, 182.0f),
                    PathNode.CurveTo(163.63f, 182.0f, 194.0f, 171.16f, 210.0f, 154.79f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 128.0f),
                    PathNode.CurveTo(210.0f, 150.77f, 172.45f, 170.0f, 128.0f, 170.0f),
                    PathNode.CurveTo(83.55f, 170.0f, 46.0f, 150.77f, 46.0f, 128.0f),
                    PathNode.LineTo(46.0f, 106.79f),
                    PathNode.CurveTo(62.0f, 123.16f, 92.37f, 134.0f, 128.0f, 134.0f),
                    PathNode.CurveTo(163.63f, 134.0f, 194.0f, 123.16f, 210.0f, 106.79f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _database!!
    }

private var _database: ImageVector? = null
