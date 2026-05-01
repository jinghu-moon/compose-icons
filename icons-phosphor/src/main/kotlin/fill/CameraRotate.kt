package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CameraRotate: ImageVector
    get() {
        if (_cameraRotate != null) return _cameraRotate!!
        _cameraRotate = phosphorFillIcon(
            name = "CameraRotate",
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
                    PathNode.MoveTo(156.81f, 166.4f),
                    PathNode.CurveTo(138.4788f, 180.04736f, 113.084465f, 178.94907f, 96.0f, 163.77f),
                    PathNode.LineTo(96.0f, 168.0f),
                    PathNode.CurveTo(96.0f, 172.41827f, 92.41828f, 176.0f, 88.0f, 176.0f),
                    PathNode.CurveTo(83.58172f, 176.0f, 80.0f, 172.41827f, 80.0f, 168.0f),
                    PathNode.LineTo(80.0f, 144.0f),
                    PathNode.CurveTo(80.0f, 139.58173f, 83.58172f, 136.0f, 88.0f, 136.0f),
                    PathNode.LineTo(112.0f, 136.0f),
                    PathNode.CurveTo(116.41828f, 136.0f, 120.0f, 139.58173f, 120.0f, 144.0f),
                    PathNode.CurveTo(120.0f, 148.41827f, 116.41828f, 152.0f, 112.0f, 152.0f),
                    PathNode.LineTo(106.85f, 152.0f),
                    PathNode.CurveTo(118.23698f, 161.97624f, 135.04419f, 162.64703f, 147.19f, 153.61f),
                    PathNode.CurveTo(150.72186f, 150.9535f, 155.73851f, 151.66313f, 158.395f, 155.195f),
                    PathNode.CurveTo(161.05148f, 158.72687f, 160.34186f, 163.74352f, 156.81f, 166.4f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 120.0f),
                    PathNode.CurveTo(176.0f, 124.41828f, 172.41827f, 128.0f, 168.0f, 128.0f),
                    PathNode.LineTo(144.0f, 128.0f),
                    PathNode.CurveTo(139.58173f, 128.0f, 136.0f, 124.41828f, 136.0f, 120.0f),
                    PathNode.CurveTo(136.0f, 115.58172f, 139.58173f, 112.0f, 144.0f, 112.0f),
                    PathNode.LineTo(149.15f, 112.0f),
                    PathNode.CurveTo(137.763f, 102.02376f, 120.95581f, 101.35297f, 108.81f, 110.39f),
                    PathNode.CurveTo(105.27814f, 113.046486f, 100.26149f, 112.33686f, 97.605f, 108.805f),
                    PathNode.CurveTo(94.94851f, 105.27313f, 95.65814f, 100.25649f, 99.19f, 97.6f),
                    PathNode.CurveTo(117.521194f, 83.95264f, 142.91553f, 85.050934f, 160.0f, 100.23f),
                    PathNode.LineTo(160.0f, 96.0f),
                    PathNode.CurveTo(160.0f, 91.58172f, 163.58173f, 88.0f, 168.0f, 88.0f),
                    PathNode.CurveTo(172.41827f, 88.0f, 176.0f, 91.58172f, 176.0f, 96.0f),
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
        return _cameraRotate!!
    }

private var _cameraRotate: ImageVector? = null
