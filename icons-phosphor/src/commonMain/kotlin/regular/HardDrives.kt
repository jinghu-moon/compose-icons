package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.HardDrives: ImageVector
    get() {
        if (_hardDrives != null) return _hardDrives!!
        _hardDrives = phosphorRegularIcon(
            name = "HardDrives",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 136.0f),
                    PathNode.LineTo(48.0f, 136.0f),
                    PathNode.CurveTo(39.163445f, 136.0f, 32.0f, 143.16344f, 32.0f, 152.0f),
                    PathNode.LineTo(32.0f, 200.0f),
                    PathNode.CurveTo(32.0f, 208.83656f, 39.163445f, 216.0f, 48.0f, 216.0f),
                    PathNode.LineTo(208.0f, 216.0f),
                    PathNode.CurveTo(216.83656f, 216.0f, 224.0f, 208.83656f, 224.0f, 200.0f),
                    PathNode.LineTo(224.0f, 152.0f),
                    PathNode.CurveTo(224.0f, 143.16344f, 216.83656f, 136.0f, 208.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 200.0f),
                    PathNode.LineTo(48.0f, 200.0f),
                    PathNode.LineTo(48.0f, 152.0f),
                    PathNode.LineTo(208.0f, 152.0f),
                    PathNode.LineTo(208.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 40.0f),
                    PathNode.LineTo(48.0f, 40.0f),
                    PathNode.CurveTo(39.163445f, 40.0f, 32.0f, 47.163445f, 32.0f, 56.0f),
                    PathNode.LineTo(32.0f, 104.0f),
                    PathNode.CurveTo(32.0f, 112.836555f, 39.163445f, 120.0f, 48.0f, 120.0f),
                    PathNode.LineTo(208.0f, 120.0f),
                    PathNode.CurveTo(216.83656f, 120.0f, 224.0f, 112.836555f, 224.0f, 104.0f),
                    PathNode.LineTo(224.0f, 56.0f),
                    PathNode.CurveTo(224.0f, 47.163445f, 216.83656f, 40.0f, 208.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 104.0f),
                    PathNode.LineTo(48.0f, 104.0f),
                    PathNode.LineTo(48.0f, 56.0f),
                    PathNode.LineTo(208.0f, 56.0f),
                    PathNode.LineTo(208.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 80.0f),
                    PathNode.CurveTo(192.0f, 86.62742f, 186.62741f, 92.0f, 180.0f, 92.0f),
                    PathNode.CurveTo(173.37259f, 92.0f, 168.0f, 86.62742f, 168.0f, 80.0f),
                    PathNode.CurveTo(168.0f, 73.37258f, 173.37259f, 68.0f, 180.0f, 68.0f),
                    PathNode.CurveTo(186.62741f, 68.0f, 192.0f, 73.37258f, 192.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 176.0f),
                    PathNode.CurveTo(192.0f, 182.62741f, 186.62741f, 188.0f, 180.0f, 188.0f),
                    PathNode.CurveTo(173.37259f, 188.0f, 168.0f, 182.62741f, 168.0f, 176.0f),
                    PathNode.CurveTo(168.0f, 169.37259f, 173.37259f, 164.0f, 180.0f, 164.0f),
                    PathNode.CurveTo(186.62741f, 164.0f, 192.0f, 169.37259f, 192.0f, 176.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _hardDrives!!
    }

private var _hardDrives: ImageVector? = null
