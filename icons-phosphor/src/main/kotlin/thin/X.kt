package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.X: ImageVector
    get() {
        if (_x != null) return _x!!
        _x = phosphorThinIcon(
            name = "X",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(202.83f, 197.17f),
                    PathNode.CurveTo(204.39296f, 198.73297f, 204.39296f, 201.26703f, 202.83f, 202.83f),
                    PathNode.CurveTo(201.26703f, 204.39296f, 198.73297f, 204.39296f, 197.17f, 202.83f),
                    PathNode.LineTo(128.0f, 133.66f),
                    PathNode.LineTo(58.83f, 202.83f),
                    PathNode.CurveTo(57.267033f, 204.39296f, 54.732967f, 204.39296f, 53.17f, 202.83f),
                    PathNode.CurveTo(51.607033f, 201.26703f, 51.607033f, 198.73297f, 53.17f, 197.17f),
                    PathNode.LineTo(122.34f, 128.0f),
                    PathNode.LineTo(53.17f, 58.83f),
                    PathNode.CurveTo(51.607033f, 57.267033f, 51.607033f, 54.732967f, 53.17f, 53.17f),
                    PathNode.CurveTo(54.732967f, 51.607033f, 57.267033f, 51.607033f, 58.83f, 53.17f),
                    PathNode.LineTo(128.0f, 122.34f),
                    PathNode.LineTo(197.17f, 53.17f),
                    PathNode.CurveTo(198.73297f, 51.607033f, 201.26703f, 51.607033f, 202.83f, 53.17f),
                    PathNode.CurveTo(204.39296f, 54.732967f, 204.39296f, 57.267033f, 202.83f, 58.83f),
                    PathNode.LineTo(133.66f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _x!!
    }

private var _x: ImageVector? = null
