package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Egg: ImageVector
    get() {
        if (_egg != null) return _egg!!
        _egg = phosphorDuotoneIcon(
            name = "Egg",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 152.0f),
                    PathNode.CurveTo(208.0f, 196.18279f, 172.18279f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(83.81722f, 232.0f, 48.0f, 196.18279f, 48.0f, 152.0f),
                    PathNode.CurveTo(48.0f, 88.0f, 96.0f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(160.0f, 24.0f, 208.0f, 88.0f, 208.0f, 152.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(186.66f, 59.56f),
                    PathNode.CurveTo(168.47f, 32.29f, 146.54f, 16.0f, 128.0f, 16.0f),
                    PathNode.CurveTo(109.46f, 16.0f, 87.53f, 32.29f, 69.34f, 59.56f),
                    PathNode.CurveTo(50.7f, 87.54f, 40.0f, 121.23f, 40.0f, 152.0f),
                    PathNode.CurveTo(40.0f, 200.60106f, 79.39894f, 240.0f, 128.0f, 240.0f),
                    PathNode.CurveTo(176.60106f, 240.0f, 216.0f, 200.60106f, 216.0f, 152.0f),
                    PathNode.CurveTo(216.0f, 121.23f, 205.3f, 87.54f, 186.66f, 59.56f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 224.0f),
                    PathNode.CurveTo(88.25378f, 223.95592f, 56.04409f, 191.74623f, 56.0f, 152.0f),
                    PathNode.CurveTo(56.0f, 124.31f, 65.72f, 93.85f, 82.66f, 68.44f),
                    PathNode.CurveTo(97.19f, 46.64f, 115.41f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(140.59f, 32.0f, 158.81f, 46.64f, 173.34f, 68.44f),
                    PathNode.CurveTo(190.28f, 93.85f, 200.0f, 124.31f, 200.0f, 152.0f),
                    PathNode.CurveTo(199.95592f, 191.74623f, 167.74623f, 223.95592f, 128.0f, 224.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _egg!!
    }

private var _egg: ImageVector? = null
