package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FloppyDisk: ImageVector
    get() {
        if (_floppyDisk != null) return _floppyDisk!!
        _floppyDisk = phosphorBoldIcon(
            name = "FloppyDisk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.14f, 69.17f),
                    PathNode.LineTo(186.83f, 33.86f),
                    PathNode.CurveTo(183.08894f, 30.095879f, 177.99698f, 27.98563f, 172.69f, 28.0f),
                    PathNode.LineTo(48.0f, 28.0f),
                    PathNode.CurveTo(36.954304f, 28.0f, 28.0f, 36.954304f, 28.0f, 48.0f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 219.0457f, 36.954304f, 228.0f, 48.0f, 228.0f),
                    PathNode.LineTo(208.0f, 228.0f),
                    PathNode.CurveTo(219.0457f, 228.0f, 228.0f, 219.0457f, 228.0f, 208.0f),
                    PathNode.LineTo(228.0f, 83.31f),
                    PathNode.CurveTo(228.01437f, 78.00303f, 225.90411f, 72.911064f, 222.14f, 69.17f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 204.0f),
                    PathNode.LineTo(92.0f, 204.0f),
                    PathNode.LineTo(92.0f, 160.0f),
                    PathNode.LineTo(164.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 204.0f),
                    PathNode.LineTo(188.0f, 204.0f),
                    PathNode.LineTo(188.0f, 156.0f),
                    PathNode.CurveTo(188.0f, 144.9543f, 179.0457f, 136.0f, 168.0f, 136.0f),
                    PathNode.LineTo(88.0f, 136.0f),
                    PathNode.CurveTo(76.95431f, 136.0f, 68.0f, 144.9543f, 68.0f, 156.0f),
                    PathNode.LineTo(68.0f, 204.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.LineTo(52.0f, 52.0f),
                    PathNode.LineTo(171.0f, 52.0f),
                    PathNode.LineTo(204.0f, 85.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 84.0f),
                    PathNode.CurveTo(164.0f, 90.62742f, 158.62741f, 96.0f, 152.0f, 96.0f),
                    PathNode.LineTo(96.0f, 96.0f),
                    PathNode.CurveTo(89.37258f, 96.0f, 84.0f, 90.62742f, 84.0f, 84.0f),
                    PathNode.CurveTo(84.0f, 77.37258f, 89.37258f, 72.0f, 96.0f, 72.0f),
                    PathNode.LineTo(152.0f, 72.0f),
                    PathNode.CurveTo(158.62741f, 72.0f, 164.0f, 77.37258f, 164.0f, 84.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _floppyDisk!!
    }

private var _floppyDisk: ImageVector? = null
