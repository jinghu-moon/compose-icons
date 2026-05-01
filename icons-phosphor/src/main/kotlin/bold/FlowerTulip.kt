package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FlowerTulip: ImageVector
    get() {
        if (_flowerTulip != null) return _flowerTulip!!
        _flowerTulip = phosphorBoldIcon(
            name = "FlowerTulip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 44.0f),
                    PathNode.CurveTo(196.43895f, 43.98854f, 184.98033f, 46.166935f, 174.23f, 50.42f),
                    PathNode.CurveTo(158.43f, 26.02f, 134.51f, 13.84f, 133.37f, 13.27f),
                    PathNode.CurveTo(129.98979f, 11.578543f, 126.01021f, 11.578543f, 122.63f, 13.27f),
                    PathNode.CurveTo(121.49f, 13.84f, 97.57f, 26.02f, 81.77f, 50.42f),
                    PathNode.CurveTo(71.01967f, 46.166935f, 59.561054f, 43.98854f, 48.0f, 44.0f),
                    PathNode.CurveTo(41.37258f, 44.0f, 36.0f, 49.37258f, 36.0f, 56.0f),
                    PathNode.LineTo(36.0f, 96.0f),
                    PathNode.CurveTo(36.058475f, 142.1508f, 70.25149f, 181.13939f, 116.0f, 187.22f),
                    PathNode.LineTo(116.0f, 212.58f),
                    PathNode.LineTo(85.37f, 197.27f),
                    PathNode.CurveTo(79.46207f, 194.41951f, 72.36003f, 196.84117f, 69.42428f, 202.70721f),
                    PathNode.CurveTo(66.48853f, 208.57324f, 68.80709f, 215.70961f, 74.63f, 218.73f),
                    PathNode.LineTo(122.63f, 242.73f),
                    PathNode.CurveTo(126.01021f, 244.42146f, 129.98979f, 244.42146f, 133.37f, 242.73f),
                    PathNode.LineTo(181.37f, 218.73f),
                    PathNode.CurveTo(185.26855f, 216.849f, 187.85193f, 213.01419f, 188.13052f, 208.69456f),
                    PathNode.CurveTo(188.40912f, 204.37492f, 186.33977f, 200.24004f, 182.71512f, 197.87384f),
                    PathNode.CurveTo(179.0905f, 195.50763f, 174.47244f, 195.27689f, 170.63f, 197.27f),
                    PathNode.LineTo(140.0f, 212.58f),
                    PathNode.LineTo(140.0f, 187.22f),
                    PathNode.CurveTo(185.7485f, 181.13939f, 219.94154f, 142.1508f, 220.0f, 96.0f),
                    PathNode.LineTo(220.0f, 56.0f),
                    PathNode.CurveTo(220.0f, 49.37258f, 214.62741f, 44.0f, 208.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 37.94f),
                    PathNode.CurveTo(134.37f, 42.1f, 145.13f, 50.25f, 153.21f, 62.14f),
                    PathNode.CurveTo(142.92816f, 69.7844f, 134.34398f, 79.47865f, 128.0f, 90.61f),
                    PathNode.CurveTo(121.65295f, 79.48086f, 113.06927f, 69.787186f, 102.79f, 62.14f),
                    PathNode.CurveTo(110.87f, 50.25f, 121.63f, 42.1f, 128.0f, 37.94f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 96.0f),
                    PathNode.LineTo(60.0f, 69.06f),
                    PathNode.CurveTo(92.38857f, 74.91193f, 115.95903f, 103.08704f, 116.0f, 136.0f),
                    PathNode.LineTo(116.0f, 162.94f),
                    PathNode.CurveTo(83.61359f, 157.08437f, 60.045f, 128.9115f, 60.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 96.0f),
                    PathNode.CurveTo(195.955f, 128.9115f, 172.38641f, 157.08437f, 140.0f, 162.94f),
                    PathNode.LineTo(140.0f, 136.0f),
                    PathNode.CurveTo(140.04097f, 103.08704f, 163.61143f, 74.91193f, 196.0f, 69.06f),
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
        return _flowerTulip!!
    }

private var _flowerTulip: ImageVector? = null
