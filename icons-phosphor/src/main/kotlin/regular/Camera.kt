package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Camera: ImageVector
    get() {
        if (_camera != null) return _camera!!
        _camera = phosphorRegularIcon(
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
                    PathNode.MoveTo(216.0f, 192.0f),
                    PathNode.CurveTo(216.0f, 196.41827f, 212.41827f, 200.0f, 208.0f, 200.0f),
                    PathNode.LineTo(48.0f, 200.0f),
                    PathNode.CurveTo(43.581722f, 200.0f, 40.0f, 196.41827f, 40.0f, 192.0f),
                    PathNode.LineTo(40.0f, 80.0f),
                    PathNode.CurveTo(40.0f, 75.58172f, 43.581722f, 72.0f, 48.0f, 72.0f),
                    PathNode.LineTo(80.0f, 72.0f),
                    PathNode.CurveTo(82.67564f, 72.00174f, 85.17502f, 70.66574f, 86.66f, 68.44f),
                    PathNode.LineTo(100.28f, 48.0f),
                    PathNode.LineTo(155.71f, 48.0f),
                    PathNode.LineTo(169.34f, 68.44f),
                    PathNode.CurveTo(170.82498f, 70.66574f, 173.32436f, 72.00174f, 176.0f, 72.0f),
                    PathNode.LineTo(208.0f, 72.0f),
                    PathNode.CurveTo(212.41827f, 72.0f, 216.0f, 75.58172f, 216.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 88.0f),
                    PathNode.CurveTo(103.69947f, 88.0f, 84.0f, 107.69947f, 84.0f, 132.0f),
                    PathNode.CurveTo(84.0f, 156.30052f, 103.69947f, 176.0f, 128.0f, 176.0f),
                    PathNode.CurveTo(152.30052f, 176.0f, 172.0f, 156.30052f, 172.0f, 132.0f),
                    PathNode.CurveTo(171.97244f, 107.71089f, 152.28911f, 88.02756f, 128.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 160.0f),
                    PathNode.CurveTo(112.536026f, 160.0f, 100.0f, 147.46397f, 100.0f, 132.0f),
                    PathNode.CurveTo(100.0f, 116.536026f, 112.536026f, 104.0f, 128.0f, 104.0f),
                    PathNode.CurveTo(143.46397f, 104.0f, 156.0f, 116.536026f, 156.0f, 132.0f),
                    PathNode.CurveTo(156.0f, 147.46397f, 143.46397f, 160.0f, 128.0f, 160.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _camera!!
    }

private var _camera: ImageVector? = null
