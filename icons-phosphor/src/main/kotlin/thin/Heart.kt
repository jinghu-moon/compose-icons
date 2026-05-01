package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Heart: ImageVector
    get() {
        if (_heart != null) return _heart!!
        _heart = phosphorThinIcon(
            name = "Heart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(178.0f, 44.0f),
                    PathNode.CurveTo(156.56f, 44.0f, 138.08f, 54.19f, 128.0f, 71.07f),
                    PathNode.CurveTo(117.92f, 54.19f, 99.44f, 44.0f, 78.0f, 44.0f),
                    PathNode.CurveTo(45.983475f, 44.03857f, 20.03857f, 69.983475f, 20.0f, 102.0f),
                    PathNode.CurveTo(20.0f, 130.59f, 38.0f, 160.47f, 73.4f, 190.79f),
                    PathNode.CurveTo(89.745056f, 204.69902f, 107.39342f, 216.9993f, 126.1f, 227.52f),
                    PathNode.CurveTo(127.285805f, 228.16008f, 128.71419f, 228.16008f, 129.9f, 227.52f),
                    PathNode.CurveTo(148.60658f, 216.9993f, 166.25494f, 204.69902f, 182.6f, 190.79f),
                    PathNode.CurveTo(218.0f, 160.47f, 236.0f, 130.59f, 236.0f, 102.0f),
                    PathNode.CurveTo(235.96143f, 69.983475f, 210.01653f, 44.03857f, 178.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 219.42f),
                    PathNode.CurveTo(114.0f, 211.42f, 28.0f, 160.07f, 28.0f, 102.0f),
                    PathNode.CurveTo(28.033062f, 74.39947f, 50.399467f, 52.03306f, 78.0f, 52.0f),
                    PathNode.CurveTo(99.11f, 52.0f, 116.85f, 63.31f, 124.3f, 81.51f),
                    PathNode.CurveTo(124.91636f, 83.01047f, 126.37787f, 83.990135f, 128.0f, 83.990135f),
                    PathNode.CurveTo(129.62213f, 83.990135f, 131.08365f, 83.01047f, 131.7f, 81.51f),
                    PathNode.CurveTo(139.15f, 63.31f, 156.89f, 52.0f, 178.0f, 52.0f),
                    PathNode.CurveTo(205.60052f, 52.03306f, 227.96693f, 74.39947f, 228.0f, 102.0f),
                    PathNode.CurveTo(228.0f, 160.0f, 142.0f, 211.46f, 128.0f, 219.42f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _heart!!
    }

private var _heart: ImageVector? = null
