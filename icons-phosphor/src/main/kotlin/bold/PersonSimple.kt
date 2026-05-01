package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PersonSimple: ImageVector
    get() {
        if (_personSimple != null) return _personSimple!!
        _personSimple = phosphorBoldIcon(
            name = "PersonSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 84.0f),
                    PathNode.CurveTo(147.88223f, 84.0f, 164.0f, 67.88225f, 164.0f, 48.0f),
                    PathNode.CurveTo(164.0f, 28.117748f, 147.88223f, 12.0f, 128.0f, 12.0f),
                    PathNode.CurveTo(108.11775f, 12.0f, 92.0f, 28.117748f, 92.0f, 48.0f),
                    PathNode.CurveTo(92.0f, 67.88225f, 108.11775f, 84.0f, 128.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 36.0f),
                    PathNode.CurveTo(134.62741f, 36.0f, 140.0f, 41.37258f, 140.0f, 48.0f),
                    PathNode.CurveTo(140.0f, 54.62742f, 134.62741f, 60.0f, 128.0f, 60.0f),
                    PathNode.CurveTo(121.37258f, 60.0f, 116.0f, 54.62742f, 116.0f, 48.0f),
                    PathNode.CurveTo(116.0f, 41.37258f, 121.37258f, 36.0f, 128.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(234.29f, 138.17f),
                    PathNode.CurveTo(232.6532f, 140.90141f, 229.99788f, 142.87027f, 226.90877f, 143.64302f),
                    PathNode.CurveTo(223.81966f, 144.41577f, 220.55008f, 143.92903f, 217.82f, 142.29f),
                    PathNode.CurveTo(217.5f, 142.1f, 185.45f, 123.37f, 140.0f, 120.41f),
                    PathNode.LineTo(140.0f, 147.41f),
                    PathNode.LineTo(201.0f, 216.0f),
                    PathNode.CurveTo(205.41827f, 220.97057f, 204.97057f, 228.58173f, 200.0f, 233.0f),
                    PathNode.CurveTo(195.02943f, 237.41827f, 187.41827f, 236.97057f, 183.0f, 232.0f),
                    PathNode.LineTo(128.0f, 170.09f),
                    PathNode.LineTo(73.0f, 232.0f),
                    PathNode.CurveTo(68.58172f, 236.97057f, 60.97056f, 237.41827f, 56.0f, 233.0f),
                    PathNode.CurveTo(51.02944f, 228.58173f, 50.581722f, 220.97057f, 55.0f, 216.0f),
                    PathNode.LineTo(116.0f, 147.41f),
                    PathNode.LineTo(116.0f, 120.41f),
                    PathNode.CurveTo(70.28f, 123.36f, 38.52f, 142.09f, 38.18f, 142.3f),
                    PathNode.CurveTo(32.49699f, 145.71036f, 25.125359f, 143.86801f, 21.715f, 138.185f),
                    PathNode.CurveTo(18.304642f, 132.50198f, 20.14699f, 125.13035f, 25.83f, 121.72f),
                    PathNode.CurveTo(27.58f, 120.66f, 69.35f, 96.0f, 128.0f, 96.0f),
                    PathNode.CurveTo(186.65f, 96.0f, 228.42f, 120.66f, 230.17f, 121.71f),
                    PathNode.CurveTo(235.85207f, 125.11829f, 237.69644f, 132.48682f, 234.29f, 138.17f),
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
        return _personSimple!!
    }

private var _personSimple: ImageVector? = null
