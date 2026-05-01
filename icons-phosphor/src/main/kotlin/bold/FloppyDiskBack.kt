package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FloppyDiskBack: ImageVector
    get() {
        if (_floppyDiskBack != null) return _floppyDiskBack!!
        _floppyDiskBack = phosphorBoldIcon(
            name = "FloppyDiskBack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 28.0f),
                    PathNode.LineTo(83.31f, 28.0f),
                    PathNode.CurveTo(78.00303f, 27.98563f, 72.911064f, 30.095879f, 69.17f, 33.86f),
                    PathNode.LineTo(33.86f, 69.17f),
                    PathNode.CurveTo(30.095879f, 72.911064f, 27.98563f, 78.00303f, 28.0f, 83.31f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 219.0457f, 36.954304f, 228.0f, 48.0f, 228.0f),
                    PathNode.LineTo(208.0f, 228.0f),
                    PathNode.CurveTo(219.0457f, 228.0f, 228.0f, 219.0457f, 228.0f, 208.0f),
                    PathNode.LineTo(228.0f, 48.0f),
                    PathNode.CurveTo(228.0f, 36.954304f, 219.0457f, 28.0f, 208.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 52.0f),
                    PathNode.LineTo(164.0f, 52.0f),
                    PathNode.LineTo(164.0f, 72.0f),
                    PathNode.LineTo(92.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 204.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.LineTo(52.0f, 85.0f),
                    PathNode.LineTo(68.0f, 69.0f),
                    PathNode.LineTo(68.0f, 76.0f),
                    PathNode.CurveTo(68.0f, 87.04569f, 76.95431f, 96.0f, 88.0f, 96.0f),
                    PathNode.LineTo(168.0f, 96.0f),
                    PathNode.CurveTo(179.0457f, 96.0f, 188.0f, 87.04569f, 188.0f, 76.0f),
                    PathNode.LineTo(188.0f, 52.0f),
                    PathNode.LineTo(204.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 108.0f),
                    PathNode.CurveTo(104.80404f, 108.0f, 86.0f, 126.80404f, 86.0f, 150.0f),
                    PathNode.CurveTo(86.0f, 173.19595f, 104.80404f, 192.0f, 128.0f, 192.0f),
                    PathNode.CurveTo(151.19595f, 192.0f, 170.0f, 173.19595f, 170.0f, 150.0f),
                    PathNode.CurveTo(170.0f, 126.80404f, 151.19595f, 108.0f, 128.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 168.0f),
                    PathNode.CurveTo(118.05888f, 168.0f, 110.0f, 159.94113f, 110.0f, 150.0f),
                    PathNode.CurveTo(110.0f, 140.05887f, 118.05888f, 132.0f, 128.0f, 132.0f),
                    PathNode.CurveTo(137.94113f, 132.0f, 146.0f, 140.05887f, 146.0f, 150.0f),
                    PathNode.CurveTo(146.0f, 159.94113f, 137.94113f, 168.0f, 128.0f, 168.0f),
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
        return _floppyDiskBack!!
    }

private var _floppyDiskBack: ImageVector? = null
