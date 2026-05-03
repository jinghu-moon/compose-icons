package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Database: ImageVector
    get() {
        if (_database != null) return _database!!
        _database = tablerFilledIcon(
            name = "Database",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 15.731f),
                    PathNode.CurveTo(4.968f, 17.238f, 8.234f, 18.0f, 12.0f, 18.0f),
                    PathNode.CurveTo(15.76f, 18.0f, 19.025f, 17.24f, 21.0f, 15.748f),
                    PathNode.LineTo(21.0f, 18.0f),
                    PathNode.CurveTo(21.0f, 20.425f, 17.105f, 21.936f, 12.307f, 21.998f),
                    PathNode.LineTo(12.0f, 22.0f),
                    PathNode.CurveTo(7.062f, 22.0f, 3.0f, 20.477f, 3.0f, 18.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 9.731f),
                    PathNode.CurveTo(4.968f, 11.238f, 8.234f, 12.0f, 12.0f, 12.0f),
                    PathNode.CurveTo(15.76f, 12.0f, 19.025f, 11.24f, 21.0f, 9.748f),
                    PathNode.LineTo(21.0f, 12.0f),
                    PathNode.CurveTo(21.0f, 14.477f, 16.938f, 16.0f, 12.0f, 16.0f),
                    PathNode.CurveTo(7.202f, 16.0f, 3.23f, 14.562f, 3.021f, 12.205f),
                    PathNode.LineTo(3.005f, 12.104f),
                    PathNode.LineTo(3.0f, 12.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(13.041f, 2.0f, 14.044f, 2.068f, 14.977f, 2.198f),
                    PathNode.LineTo(15.446f, 2.269f),
                    PathNode.QuadTo(16.286f, 2.409f, 17.032f, 2.617f),
                    PathNode.LineTo(17.472f, 2.748f),
                    PathNode.LineTo(17.547f, 2.772f),
                    PathNode.CurveTo(17.819138f, 2.86148f, 18.087675f, 2.961556f, 18.352f, 3.072f),
                    PathNode.LineTo(18.551f, 3.158f),
                    PathNode.QuadTo(19.086f, 3.4f, 19.518f, 3.688f),
                    PathNode.QuadTo(19.683f, 3.798f, 19.831f, 3.913f),
                    PathNode.CurveTo(20.080936f, 4.10695f, 20.305676f, 4.331353f, 20.5f, 4.581f),
                    PathNode.LineTo(20.591f, 4.709f),
                    PathNode.QuadTo(20.661f, 4.814f, 20.72f, 4.92f),
                    PathNode.LineTo(20.79f, 5.059f),
                    PathNode.QuadTo(20.953f, 5.409f, 20.99f, 5.789f),
                    PathNode.LineTo(21.0f, 6.0f),
                    PathNode.CurveTo(21.0f, 8.477f, 16.938f, 10.0f, 12.0f, 10.0f),
                    PathNode.CurveTo(7.202f, 10.0f, 3.23f, 8.562f, 3.021f, 6.205f),
                    PathNode.CurveTo(3.006959f, 6.137573f, 2.999922f, 6.068875f, 3.0f, 6.0f),
                    PathNode.LineTo(3.005f, 5.896f),
                    PathNode.LineTo(3.021f, 5.796f),
                    PathNode.CurveTo(3.226f, 3.49f, 7.031f, 2.063f, 11.688f, 2.002f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _database!!
    }

private var _database: ImageVector? = null
