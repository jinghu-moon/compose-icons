package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Camera: ImageVector
    get() {
        if (_camera != null) return _camera!!
        _camera = phosphorThinIcon(
            name = "Camera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 60.0f),
                    PathNode.LineTo(178.13f, 60.0f),
                    PathNode.LineTo(163.32f, 37.78f),
                    PathNode.CurveTo(162.57948f, 36.670074f, 161.33427f, 36.002472f, 160.0f, 36.0f),
                    PathNode.LineTo(96.0f, 36.0f),
                    PathNode.CurveTo(94.66572f, 36.002472f, 93.420525f, 36.670074f, 92.68f, 37.78f),
                    PathNode.LineTo(77.85f, 60.0f),
                    PathNode.LineTo(48.0f, 60.0f),
                    PathNode.CurveTo(36.954304f, 60.0f, 28.0f, 68.95431f, 28.0f, 80.0f),
                    PathNode.LineTo(28.0f, 192.0f),
                    PathNode.CurveTo(28.0f, 203.0457f, 36.954304f, 212.0f, 48.0f, 212.0f),
                    PathNode.LineTo(208.0f, 212.0f),
                    PathNode.CurveTo(219.0457f, 212.0f, 228.0f, 203.0457f, 228.0f, 192.0f),
                    PathNode.LineTo(228.0f, 80.0f),
                    PathNode.CurveTo(228.0f, 68.95431f, 219.0457f, 60.0f, 208.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 192.0f),
                    PathNode.CurveTo(220.0f, 198.62741f, 214.62741f, 204.0f, 208.0f, 204.0f),
                    PathNode.LineTo(48.0f, 204.0f),
                    PathNode.CurveTo(41.37258f, 204.0f, 36.0f, 198.62741f, 36.0f, 192.0f),
                    PathNode.LineTo(36.0f, 80.0f),
                    PathNode.CurveTo(36.0f, 73.37258f, 41.37258f, 68.0f, 48.0f, 68.0f),
                    PathNode.LineTo(80.0f, 68.0f),
                    PathNode.CurveTo(81.33782f, 68.00087f, 82.58751f, 67.33287f, 83.33f, 66.22f),
                    PathNode.LineTo(98.13f, 44.0f),
                    PathNode.LineTo(157.85f, 44.0f),
                    PathNode.LineTo(172.67f, 66.22f),
                    PathNode.CurveTo(173.41249f, 67.33287f, 174.66217f, 68.00087f, 176.0f, 68.0f),
                    PathNode.LineTo(208.0f, 68.0f),
                    PathNode.CurveTo(214.62741f, 68.0f, 220.0f, 73.37258f, 220.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 92.0f),
                    PathNode.CurveTo(105.90861f, 92.0f, 88.0f, 109.90861f, 88.0f, 132.0f),
                    PathNode.CurveTo(88.0f, 154.09138f, 105.90861f, 172.0f, 128.0f, 172.0f),
                    PathNode.CurveTo(150.09138f, 172.0f, 168.0f, 154.09138f, 168.0f, 132.0f),
                    PathNode.CurveTo(168.0f, 109.90861f, 150.09138f, 92.0f, 128.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 164.0f),
                    PathNode.CurveTo(110.32689f, 164.0f, 96.0f, 149.67311f, 96.0f, 132.0f),
                    PathNode.CurveTo(96.0f, 114.32689f, 110.32689f, 100.0f, 128.0f, 100.0f),
                    PathNode.CurveTo(145.67311f, 100.0f, 160.0f, 114.32689f, 160.0f, 132.0f),
                    PathNode.CurveTo(160.0f, 149.67311f, 145.67311f, 164.0f, 128.0f, 164.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _camera!!
    }

private var _camera: ImageVector? = null
