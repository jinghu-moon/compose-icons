package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Camera: ImageVector
    get() {
        if (_camera != null) return _camera!!
        _camera = phosphorFillIcon(
            name = "Camera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 56.0f),
                    PathNode.LineTo(180.28f, 56.0f),
                    PathNode.LineTo(166.65f, 35.56f),
                    PathNode.CurveTo(165.16698f, 33.33721f, 162.67209f, 32.001606f, 160.0f, 32.0f),
                    PathNode.LineTo(96.0f, 32.0f),
                    PathNode.CurveTo(93.327896f, 32.001606f, 90.833015f, 33.33721f, 89.35f, 35.56f),
                    PathNode.LineTo(75.71f, 56.0f),
                    PathNode.LineTo(48.0f, 56.0f),
                    PathNode.CurveTo(34.745167f, 56.0f, 24.0f, 66.74516f, 24.0f, 80.0f),
                    PathNode.LineTo(24.0f, 192.0f),
                    PathNode.CurveTo(24.0f, 205.25484f, 34.745167f, 216.0f, 48.0f, 216.0f),
                    PathNode.LineTo(208.0f, 216.0f),
                    PathNode.CurveTo(221.25484f, 216.0f, 232.0f, 205.25484f, 232.0f, 192.0f),
                    PathNode.LineTo(232.0f, 80.0f),
                    PathNode.CurveTo(232.0f, 66.74516f, 221.25484f, 56.0f, 208.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 132.0f),
                    PathNode.CurveTo(164.0f, 151.88223f, 147.88223f, 168.0f, 128.0f, 168.0f),
                    PathNode.CurveTo(108.11775f, 168.0f, 92.0f, 151.88223f, 92.0f, 132.0f),
                    PathNode.CurveTo(92.0f, 112.11775f, 108.11775f, 96.0f, 128.0f, 96.0f),
                    PathNode.CurveTo(147.88223f, 96.0f, 164.0f, 112.11775f, 164.0f, 132.0f),
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
        return _camera!!
    }

private var _camera: ImageVector? = null
