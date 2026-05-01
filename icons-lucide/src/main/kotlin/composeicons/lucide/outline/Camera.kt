package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Camera: ImageVector
    get() {
        if (_camera != null) return _camera!!
        _camera = lucideOutlineIcon(
            name = "Camera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.997f, 4.0f),
                    PathNode.CurveTo(14.732041f, 3.99999f, 15.407855f, 4.403174f, 15.757f, 5.05f),
                    PathNode.LineTo(16.243f, 5.95f),
                    PathNode.CurveTo(16.592144f, 6.596826f, 17.267958f, 7.000011f, 18.003f, 7.0f),
                    PathNode.LineTo(20.0f, 7.0f),
                    PathNode.CurveTo(21.10457f, 7.0f, 22.0f, 7.895431f, 22.0f, 9.0f),
                    PathNode.LineTo(22.0f, 18.0f),
                    PathNode.CurveTo(22.0f, 19.10457f, 21.10457f, 20.0f, 20.0f, 20.0f),
                    PathNode.LineTo(4.0f, 20.0f),
                    PathNode.CurveTo(2.895431f, 20.0f, 2.0f, 19.10457f, 2.0f, 18.0f),
                    PathNode.LineTo(2.0f, 9.0f),
                    PathNode.CurveTo(2.0f, 7.895431f, 2.895431f, 7.0f, 4.0f, 7.0f),
                    PathNode.LineTo(5.997f, 7.0f),
                    PathNode.CurveTo(6.731255f, 7.00004f, 7.406495f, 6.597738f, 7.756f, 5.952f),
                    PathNode.LineTo(8.245f, 5.048f),
                    PathNode.CurveTo(8.594505f, 4.402263f, 9.269745f, 3.99996f, 10.004f, 4.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 13.0f),
                    PathNode.CurveTo(15.0f, 14.656855f, 13.656855f, 16.0f, 12.0f, 16.0f),
                    PathNode.CurveTo(10.343145f, 16.0f, 9.0f, 14.656855f, 9.0f, 13.0f),
                    PathNode.CurveTo(9.0f, 11.343145f, 10.343145f, 10.0f, 12.0f, 10.0f),
                    PathNode.CurveTo(13.656855f, 10.0f, 15.0f, 11.343145f, 15.0f, 13.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _camera!!
    }

private var _camera: ImageVector? = null
