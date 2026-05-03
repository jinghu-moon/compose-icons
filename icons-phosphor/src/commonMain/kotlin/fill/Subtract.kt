package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Subtract: ImageVector
    get() {
        if (_subtract != null) return _subtract!!
        _subtract = phosphorFillIcon(
            name = "Subtract",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(174.63f, 81.35f),
                    PathNode.CurveTo(167.24251f, 41.63174f, 131.40164f, 13.654274f, 91.07808f, 16.129156f),
                    PathNode.CurveTo(50.75451f, 18.604038f, 18.604038f, 50.75451f, 16.129156f, 91.07808f),
                    PathNode.CurveTo(13.654274f, 131.40164f, 41.63174f, 167.24251f, 81.35f, 174.63f),
                    PathNode.CurveTo(88.737495f, 214.34827f, 124.578354f, 242.32573f, 164.90192f, 239.85085f),
                    PathNode.CurveTo(205.2255f, 237.37596f, 237.37596f, 205.2255f, 239.85085f, 164.90192f),
                    PathNode.CurveTo(242.32573f, 124.578354f, 214.34827f, 88.737495f, 174.63f, 81.35f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 160.0f),
                    PathNode.CurveTo(60.653774f, 160.0f, 32.0f, 131.34622f, 32.0f, 96.0f),
                    PathNode.CurveTo(32.0f, 60.653774f, 60.653774f, 32.0f, 96.0f, 32.0f),
                    PathNode.CurveTo(131.34622f, 32.0f, 160.0f, 60.653774f, 160.0f, 96.0f),
                    PathNode.CurveTo(159.96143f, 131.33023f, 131.33023f, 159.96143f, 96.0f, 160.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _subtract!!
    }

private var _subtract: ImageVector? = null
