package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Droplets: ImageVector
    get() {
        if (_droplets != null) return _droplets!!
        _droplets = lucideOutlineIcon(
            name = "Droplets",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 16.3f),
                    PathNode.CurveTo(9.2f, 16.3f, 11.0f, 14.47f, 11.0f, 12.25f),
                    PathNode.CurveTo(11.0f, 11.09f, 10.43f, 9.99f, 9.29f, 9.06f),
                    PathNode.CurveTo(8.15f, 8.13f, 7.29f, 6.75f, 7.0f, 5.3f),
                    PathNode.CurveTo(6.71f, 6.75f, 5.86f, 8.140001f, 4.71f, 9.06f),
                    PathNode.CurveTo(3.56f, 9.98f, 3.0f, 11.1f, 3.0f, 12.25f),
                    PathNode.CurveTo(3.0f, 14.47f, 4.8f, 16.3f, 7.0f, 16.3f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.56f, 6.6f),
                    PathNode.CurveTo(13.247759f, 5.501125f, 13.7353f, 4.289044f, 14.0f, 3.02f),
                    PathNode.CurveTo(14.5f, 5.52f, 16.0f, 7.92f, 18.0f, 9.52f),
                    PathNode.CurveTo(20.0f, 11.12f, 21.0f, 13.02f, 21.0f, 15.02f),
                    PathNode.CurveTo(21.011686f, 17.846949f, 19.31706f, 20.401794f, 16.708132f, 21.490492f),
                    PathNode.CurveTo(14.099202f, 22.579187f, 11.091214f, 21.986725f, 9.09f, 19.99f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _droplets!!
    }

private var _droplets: ImageVector? = null
