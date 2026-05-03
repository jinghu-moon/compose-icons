package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NavigationArrow: ImageVector
    get() {
        if (_navigationArrow != null) return _navigationArrow!!
        _navigationArrow = phosphorBoldIcon(
            name = "NavigationArrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(238.7f, 102.46f),
                    PathNode.LineTo(62.81f, 37.21f),
                    PathNode.LineTo(62.56f, 37.12f),
                    PathNode.CurveTo(55.32367f, 34.616383f, 47.29306f, 36.464157f, 41.87861f, 41.87861f),
                    PathNode.CurveTo(36.464157f, 47.29306f, 34.616383f, 55.32367f, 37.12f, 62.56f),
                    PathNode.LineTo(37.21f, 62.81f),
                    PathNode.LineTo(102.46f, 238.7f),
                    PathNode.CurveTo(105.294464f, 246.67218f, 112.83892f, 251.99815f, 121.3f, 252.0f),
                    PathNode.LineTo(121.65f, 252.0f),
                    PathNode.CurveTo(130.30257f, 251.84984f, 137.87706f, 246.15182f, 140.42f, 237.88f),
                    PathNode.LineTo(140.51f, 237.59f),
                    PathNode.LineTo(161.74f, 161.74f),
                    PathNode.LineTo(237.59f, 140.51f),
                    PathNode.LineTo(237.88f, 140.42f),
                    PathNode.CurveTo(246.15056f, 137.90436f, 251.86877f, 130.35971f, 252.05527f, 121.71704f),
                    PathNode.CurveTo(252.24178f, 113.07436f, 246.85434f, 105.29007f, 238.7f, 102.42f),
                    PathNode.Close,
                    PathNode.MoveTo(148.77f, 140.46f),
                    PathNode.CurveTo(144.73401f, 141.59007f, 141.58008f, 144.74402f, 140.45f, 148.78f),
                    PathNode.LineTo(120.77f, 219.07f),
                    PathNode.LineTo(62.8f, 62.8f),
                    PathNode.LineTo(219.06f, 120.8f),
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
        return _navigationArrow!!
    }

private var _navigationArrow: ImageVector? = null
