package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PencilRuler: ImageVector
    get() {
        if (_pencilRuler != null) return _pencilRuler!!
        _pencilRuler = phosphorBoldIcon(
            name = "PencilRuler",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 28.0f),
                    PathNode.LineTo(160.0f, 28.0f),
                    PathNode.CurveTo(148.9543f, 28.0f, 140.0f, 36.954304f, 140.0f, 48.0f),
                    PathNode.LineTo(140.0f, 208.0f),
                    PathNode.CurveTo(140.0f, 219.0457f, 148.9543f, 228.0f, 160.0f, 228.0f),
                    PathNode.LineTo(208.0f, 228.0f),
                    PathNode.CurveTo(219.0457f, 228.0f, 228.0f, 219.0457f, 228.0f, 208.0f),
                    PathNode.LineTo(228.0f, 48.0f),
                    PathNode.CurveTo(228.0f, 36.954304f, 219.0457f, 28.0f, 208.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 204.0f),
                    PathNode.LineTo(164.0f, 204.0f),
                    PathNode.LineTo(164.0f, 180.0f),
                    PathNode.LineTo(180.0f, 180.0f),
                    PathNode.CurveTo(186.62741f, 180.0f, 192.0f, 174.62741f, 192.0f, 168.0f),
                    PathNode.CurveTo(192.0f, 161.37259f, 186.62741f, 156.0f, 180.0f, 156.0f),
                    PathNode.LineTo(164.0f, 156.0f),
                    PathNode.LineTo(164.0f, 140.0f),
                    PathNode.LineTo(180.0f, 140.0f),
                    PathNode.CurveTo(186.62741f, 140.0f, 192.0f, 134.62741f, 192.0f, 128.0f),
                    PathNode.CurveTo(192.0f, 121.37258f, 186.62741f, 116.0f, 180.0f, 116.0f),
                    PathNode.LineTo(164.0f, 116.0f),
                    PathNode.LineTo(164.0f, 100.0f),
                    PathNode.LineTo(180.0f, 100.0f),
                    PathNode.CurveTo(186.62741f, 100.0f, 192.0f, 94.62742f, 192.0f, 88.0f),
                    PathNode.CurveTo(192.0f, 81.37258f, 186.62741f, 76.0f, 180.0f, 76.0f),
                    PathNode.LineTo(164.0f, 76.0f),
                    PathNode.LineTo(164.0f, 52.0f),
                    PathNode.LineTo(204.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.49f, 23.51f),
                    PathNode.CurveTo(78.23838f, 21.250546f, 75.17982f, 19.980537f, 71.99f, 19.980537f),
                    PathNode.CurveTo(68.80018f, 19.980537f, 65.74162f, 21.250546f, 63.49f, 23.51f),
                    PathNode.LineTo(31.49f, 55.51f),
                    PathNode.CurveTo(29.247469f, 57.765636f, 27.992188f, 60.819313f, 28.0f, 64.0f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 219.0457f, 36.954304f, 228.0f, 48.0f, 228.0f),
                    PathNode.LineTo(96.0f, 228.0f),
                    PathNode.CurveTo(107.04569f, 228.0f, 116.0f, 219.0457f, 116.0f, 208.0f),
                    PathNode.LineTo(116.0f, 64.0f),
                    PathNode.CurveTo(116.0025f, 60.816444f, 114.73986f, 57.762363f, 112.49f, 55.51f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 92.0f),
                    PathNode.LineTo(92.0f, 92.0f),
                    PathNode.LineTo(92.0f, 164.0f),
                    PathNode.LineTo(52.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 49.0f),
                    PathNode.LineTo(91.0f, 68.0f),
                    PathNode.LineTo(53.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 204.0f),
                    PathNode.LineTo(52.0f, 188.0f),
                    PathNode.LineTo(92.0f, 188.0f),
                    PathNode.LineTo(92.0f, 204.0f),
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
        return _pencilRuler!!
    }

private var _pencilRuler: ImageVector? = null
