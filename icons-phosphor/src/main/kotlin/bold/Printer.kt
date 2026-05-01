package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Printer: ImageVector
    get() {
        if (_printer != null) return _printer!!
        _printer = phosphorBoldIcon(
            name = "Printer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(214.67f, 68.0f),
                    PathNode.LineTo(204.0f, 68.0f),
                    PathNode.LineTo(204.0f, 40.0f),
                    PathNode.CurveTo(204.0f, 33.37258f, 198.62741f, 28.0f, 192.0f, 28.0f),
                    PathNode.LineTo(64.0f, 28.0f),
                    PathNode.CurveTo(57.37258f, 28.0f, 52.0f, 33.37258f, 52.0f, 40.0f),
                    PathNode.LineTo(52.0f, 68.0f),
                    PathNode.LineTo(41.33f, 68.0f),
                    PathNode.CurveTo(25.16f, 68.0f, 12.0f, 80.56f, 12.0f, 96.0f),
                    PathNode.LineTo(12.0f, 176.0f),
                    PathNode.CurveTo(12.0f, 182.62741f, 17.372583f, 188.0f, 24.0f, 188.0f),
                    PathNode.LineTo(52.0f, 188.0f),
                    PathNode.LineTo(52.0f, 216.0f),
                    PathNode.CurveTo(52.0f, 222.62741f, 57.37258f, 228.0f, 64.0f, 228.0f),
                    PathNode.LineTo(192.0f, 228.0f),
                    PathNode.CurveTo(198.62741f, 228.0f, 204.0f, 222.62741f, 204.0f, 216.0f),
                    PathNode.LineTo(204.0f, 188.0f),
                    PathNode.LineTo(232.0f, 188.0f),
                    PathNode.CurveTo(238.62741f, 188.0f, 244.0f, 182.62741f, 244.0f, 176.0f),
                    PathNode.LineTo(244.0f, 96.0f),
                    PathNode.CurveTo(244.0f, 80.56f, 230.84f, 68.0f, 214.67f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 52.0f),
                    PathNode.LineTo(180.0f, 52.0f),
                    PathNode.LineTo(180.0f, 68.0f),
                    PathNode.LineTo(76.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 204.0f),
                    PathNode.LineTo(76.0f, 204.0f),
                    PathNode.LineTo(76.0f, 172.0f),
                    PathNode.LineTo(180.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 164.0f),
                    PathNode.LineTo(204.0f, 164.0f),
                    PathNode.LineTo(204.0f, 160.0f),
                    PathNode.CurveTo(204.0f, 153.37259f, 198.62741f, 148.0f, 192.0f, 148.0f),
                    PathNode.LineTo(64.0f, 148.0f),
                    PathNode.CurveTo(57.37258f, 148.0f, 52.0f, 153.37259f, 52.0f, 160.0f),
                    PathNode.LineTo(52.0f, 164.0f),
                    PathNode.LineTo(36.0f, 164.0f),
                    PathNode.LineTo(36.0f, 96.0f),
                    PathNode.CurveTo(36.0f, 93.83f, 38.44f, 92.0f, 41.33f, 92.0f),
                    PathNode.LineTo(214.67f, 92.0f),
                    PathNode.CurveTo(217.56f, 92.0f, 220.0f, 93.83f, 220.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 120.0f),
                    PathNode.CurveTo(204.0f, 128.83656f, 196.83656f, 136.0f, 188.0f, 136.0f),
                    PathNode.CurveTo(179.16344f, 136.0f, 172.0f, 128.83656f, 172.0f, 120.0f),
                    PathNode.CurveTo(172.0f, 111.163445f, 179.16344f, 104.0f, 188.0f, 104.0f),
                    PathNode.CurveTo(196.83656f, 104.0f, 204.0f, 111.163445f, 204.0f, 120.0f),
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
        return _printer!!
    }

private var _printer: ImageVector? = null
