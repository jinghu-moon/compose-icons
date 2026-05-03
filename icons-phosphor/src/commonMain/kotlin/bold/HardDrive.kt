package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HardDrive: ImageVector
    get() {
        if (_hardDrive != null) return _hardDrive!!
        _hardDrive = phosphorBoldIcon(
            name = "HardDrive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 60.0f),
                    PathNode.LineTo(32.0f, 60.0f),
                    PathNode.CurveTo(20.954306f, 60.0f, 12.0f, 68.95431f, 12.0f, 80.0f),
                    PathNode.LineTo(12.0f, 176.0f),
                    PathNode.CurveTo(12.0f, 187.0457f, 20.954306f, 196.0f, 32.0f, 196.0f),
                    PathNode.LineTo(224.0f, 196.0f),
                    PathNode.CurveTo(235.0457f, 196.0f, 244.0f, 187.0457f, 244.0f, 176.0f),
                    PathNode.LineTo(244.0f, 80.0f),
                    PathNode.CurveTo(244.0f, 68.95431f, 235.0457f, 60.0f, 224.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 172.0f),
                    PathNode.LineTo(36.0f, 172.0f),
                    PathNode.LineTo(36.0f, 84.0f),
                    PathNode.LineTo(220.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 128.0f),
                    PathNode.CurveTo(164.0f, 119.163445f, 171.16344f, 112.0f, 180.0f, 112.0f),
                    PathNode.CurveTo(188.83656f, 112.0f, 196.0f, 119.163445f, 196.0f, 128.0f),
                    PathNode.CurveTo(196.0f, 136.83656f, 188.83656f, 144.0f, 180.0f, 144.0f),
                    PathNode.CurveTo(171.16344f, 144.0f, 164.0f, 136.83656f, 164.0f, 128.0f),
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
        return _hardDrive!!
    }

private var _hardDrive: ImageVector? = null
