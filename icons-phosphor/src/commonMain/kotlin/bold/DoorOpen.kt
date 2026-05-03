package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DoorOpen: ImageVector
    get() {
        if (_doorOpen != null) return _doorOpen!!
        _doorOpen = phosphorBoldIcon(
            name = "DoorOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 212.0f),
                    PathNode.LineTo(212.0f, 212.0f),
                    PathNode.LineTo(212.0f, 40.0f),
                    PathNode.CurveTo(212.0f, 28.954306f, 203.0457f, 20.0f, 192.0f, 20.0f),
                    PathNode.LineTo(64.0f, 20.0f),
                    PathNode.CurveTo(52.954304f, 20.0f, 44.0f, 28.954306f, 44.0f, 40.0f),
                    PathNode.LineTo(44.0f, 212.0f),
                    PathNode.LineTo(24.0f, 212.0f),
                    PathNode.CurveTo(17.372583f, 212.0f, 12.0f, 217.37259f, 12.0f, 224.0f),
                    PathNode.CurveTo(12.0f, 230.62741f, 17.372583f, 236.0f, 24.0f, 236.0f),
                    PathNode.LineTo(232.0f, 236.0f),
                    PathNode.CurveTo(238.62741f, 236.0f, 244.0f, 230.62741f, 244.0f, 224.0f),
                    PathNode.CurveTo(244.0f, 217.37259f, 238.62741f, 212.0f, 232.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 212.0f),
                    PathNode.LineTo(172.0f, 212.0f),
                    PathNode.LineTo(172.0f, 44.0f),
                    PathNode.LineTo(188.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 44.0f),
                    PathNode.LineTo(148.0f, 44.0f),
                    PathNode.LineTo(148.0f, 212.0f),
                    PathNode.LineTo(68.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 128.0f),
                    PathNode.CurveTo(136.0f, 136.83656f, 128.83656f, 144.0f, 120.0f, 144.0f),
                    PathNode.CurveTo(111.163445f, 144.0f, 104.0f, 136.83656f, 104.0f, 128.0f),
                    PathNode.CurveTo(104.0f, 119.163445f, 111.163445f, 112.0f, 120.0f, 112.0f),
                    PathNode.CurveTo(128.83656f, 112.0f, 136.0f, 119.163445f, 136.0f, 128.0f),
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
        return _doorOpen!!
    }

private var _doorOpen: ImageVector? = null
