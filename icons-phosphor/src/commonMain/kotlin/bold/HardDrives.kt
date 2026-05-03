package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HardDrives: ImageVector
    get() {
        if (_hardDrives != null) return _hardDrives!!
        _hardDrives = phosphorBoldIcon(
            name = "HardDrives",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 36.0f),
                    PathNode.LineTo(48.0f, 36.0f),
                    PathNode.CurveTo(36.954304f, 36.0f, 28.0f, 44.954304f, 28.0f, 56.0f),
                    PathNode.LineTo(28.0f, 200.0f),
                    PathNode.CurveTo(28.0f, 211.0457f, 36.954304f, 220.0f, 48.0f, 220.0f),
                    PathNode.LineTo(208.0f, 220.0f),
                    PathNode.CurveTo(219.0457f, 220.0f, 228.0f, 211.0457f, 228.0f, 200.0f),
                    PathNode.LineTo(228.0f, 56.0f),
                    PathNode.CurveTo(228.0f, 44.954304f, 219.0457f, 36.0f, 208.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 60.0f),
                    PathNode.LineTo(204.0f, 116.0f),
                    PathNode.LineTo(52.0f, 116.0f),
                    PathNode.LineTo(52.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 196.0f),
                    PathNode.LineTo(52.0f, 140.0f),
                    PathNode.LineTo(204.0f, 140.0f),
                    PathNode.LineTo(204.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 88.0f),
                    PathNode.CurveTo(160.0f, 79.163445f, 167.16344f, 72.0f, 176.0f, 72.0f),
                    PathNode.CurveTo(184.83656f, 72.0f, 192.0f, 79.163445f, 192.0f, 88.0f),
                    PathNode.CurveTo(192.0f, 96.836555f, 184.83656f, 104.0f, 176.0f, 104.0f),
                    PathNode.CurveTo(167.16344f, 104.0f, 160.0f, 96.836555f, 160.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 168.0f),
                    PathNode.CurveTo(192.0f, 176.83656f, 184.83656f, 184.0f, 176.0f, 184.0f),
                    PathNode.CurveTo(167.16344f, 184.0f, 160.0f, 176.83656f, 160.0f, 168.0f),
                    PathNode.CurveTo(160.0f, 159.16344f, 167.16344f, 152.0f, 176.0f, 152.0f),
                    PathNode.CurveTo(184.83656f, 152.0f, 192.0f, 159.16344f, 192.0f, 168.0f),
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
        return _hardDrives!!
    }

private var _hardDrives: ImageVector? = null
