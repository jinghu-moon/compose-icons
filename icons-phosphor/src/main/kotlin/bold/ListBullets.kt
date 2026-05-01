package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ListBullets: ImageVector
    get() {
        if (_listBullets != null) return _listBullets!!
        _listBullets = phosphorBoldIcon(
            name = "ListBullets",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(76.0f, 64.0f),
                    PathNode.CurveTo(76.0f, 57.37258f, 81.37258f, 52.0f, 88.0f, 52.0f),
                    PathNode.LineTo(216.0f, 52.0f),
                    PathNode.CurveTo(222.62741f, 52.0f, 228.0f, 57.37258f, 228.0f, 64.0f),
                    PathNode.CurveTo(228.0f, 70.62742f, 222.62741f, 76.0f, 216.0f, 76.0f),
                    PathNode.LineTo(88.0f, 76.0f),
                    PathNode.CurveTo(81.37258f, 76.0f, 76.0f, 70.62742f, 76.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 116.0f),
                    PathNode.LineTo(88.0f, 116.0f),
                    PathNode.CurveTo(81.37258f, 116.0f, 76.0f, 121.37258f, 76.0f, 128.0f),
                    PathNode.CurveTo(76.0f, 134.62741f, 81.37258f, 140.0f, 88.0f, 140.0f),
                    PathNode.LineTo(216.0f, 140.0f),
                    PathNode.CurveTo(222.62741f, 140.0f, 228.0f, 134.62741f, 228.0f, 128.0f),
                    PathNode.CurveTo(228.0f, 121.37258f, 222.62741f, 116.0f, 216.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 180.0f),
                    PathNode.LineTo(88.0f, 180.0f),
                    PathNode.CurveTo(81.37258f, 180.0f, 76.0f, 185.37259f, 76.0f, 192.0f),
                    PathNode.CurveTo(76.0f, 198.62741f, 81.37258f, 204.0f, 88.0f, 204.0f),
                    PathNode.LineTo(216.0f, 204.0f),
                    PathNode.CurveTo(222.62741f, 204.0f, 228.0f, 198.62741f, 228.0f, 192.0f),
                    PathNode.CurveTo(228.0f, 185.37259f, 222.62741f, 180.0f, 216.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 112.0f),
                    PathNode.CurveTo(35.163445f, 112.0f, 28.0f, 119.163445f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 136.83656f, 35.163445f, 144.0f, 44.0f, 144.0f),
                    PathNode.CurveTo(52.836555f, 144.0f, 60.0f, 136.83656f, 60.0f, 128.0f),
                    PathNode.CurveTo(60.0f, 119.163445f, 52.836555f, 112.0f, 44.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 48.0f),
                    PathNode.CurveTo(35.163445f, 48.0f, 28.0f, 55.163445f, 28.0f, 64.0f),
                    PathNode.CurveTo(28.0f, 72.836555f, 35.163445f, 80.0f, 44.0f, 80.0f),
                    PathNode.CurveTo(52.836555f, 80.0f, 60.0f, 72.836555f, 60.0f, 64.0f),
                    PathNode.CurveTo(60.0f, 55.163445f, 52.836555f, 48.0f, 44.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 176.0f),
                    PathNode.CurveTo(35.163445f, 176.0f, 28.0f, 183.16344f, 28.0f, 192.0f),
                    PathNode.CurveTo(28.0f, 200.83656f, 35.163445f, 208.0f, 44.0f, 208.0f),
                    PathNode.CurveTo(52.836555f, 208.0f, 60.0f, 200.83656f, 60.0f, 192.0f),
                    PathNode.CurveTo(60.0f, 183.16344f, 52.836555f, 176.0f, 44.0f, 176.0f),
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
        return _listBullets!!
    }

private var _listBullets: ImageVector? = null
