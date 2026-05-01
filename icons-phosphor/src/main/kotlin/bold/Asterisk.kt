package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Asterisk: ImageVector
    get() {
        if (_asterisk != null) return _asterisk!!
        _asterisk = phosphorBoldIcon(
            name = "Asterisk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(218.29f, 182.17f),
                    PathNode.CurveTo(216.6532f, 184.90141f, 213.99788f, 186.87027f, 210.90877f, 187.64302f),
                    PathNode.CurveTo(207.81966f, 188.41577f, 204.55008f, 187.92903f, 201.82f, 186.29f),
                    PathNode.LineTo(140.0f, 149.19f),
                    PathNode.LineTo(140.0f, 216.0f),
                    PathNode.CurveTo(140.0f, 222.62741f, 134.62741f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(121.37258f, 228.0f, 116.0f, 222.62741f, 116.0f, 216.0f),
                    PathNode.LineTo(116.0f, 149.19f),
                    PathNode.LineTo(54.18f, 186.29f),
                    PathNode.CurveTo(48.49699f, 189.70036f, 41.12536f, 187.85802f, 37.715f, 182.175f),
                    PathNode.CurveTo(34.30464f, 176.49199f, 36.14699f, 169.12036f, 41.83f, 165.71f),
                    PathNode.LineTo(104.68f, 128.0f),
                    PathNode.LineTo(41.83f, 90.29f),
                    PathNode.CurveTo(36.14699f, 86.87964f, 34.30464f, 79.50801f, 37.715f, 73.825f),
                    PathNode.CurveTo(41.12536f, 68.14199f, 48.49699f, 66.299644f, 54.18f, 69.71f),
                    PathNode.LineTo(116.0f, 106.81f),
                    PathNode.LineTo(116.0f, 40.0f),
                    PathNode.CurveTo(116.0f, 33.37258f, 121.37258f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(134.62741f, 28.0f, 140.0f, 33.37258f, 140.0f, 40.0f),
                    PathNode.LineTo(140.0f, 106.81f),
                    PathNode.LineTo(201.82f, 69.71f),
                    PathNode.CurveTo(207.503f, 66.299644f, 214.87465f, 68.14199f, 218.285f, 73.825f),
                    PathNode.CurveTo(221.69536f, 79.50801f, 219.85301f, 86.87964f, 214.17f, 90.29f),
                    PathNode.LineTo(151.32f, 128.0f),
                    PathNode.LineTo(214.17f, 165.71f),
                    PathNode.CurveTo(219.85207f, 169.1183f, 221.69644f, 176.48682f, 218.29f, 182.17f),
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
        return _asterisk!!
    }

private var _asterisk: ImageVector? = null
