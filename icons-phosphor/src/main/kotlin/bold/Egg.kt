package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Egg: ImageVector
    get() {
        if (_egg != null) return _egg!!
        _egg = phosphorBoldIcon(
            name = "Egg",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(190.0f, 57.34f),
                    PathNode.CurveTo(171.06f, 29.0f, 147.88f, 12.0f, 128.0f, 12.0f),
                    PathNode.CurveTo(108.12f, 12.0f, 84.94f, 29.0f, 66.0f, 57.34f),
                    PathNode.CurveTo(46.94f, 86.0f, 36.0f, 120.46f, 36.0f, 152.0f),
                    PathNode.CurveTo(36.0f, 202.8102f, 77.18981f, 244.0f, 128.0f, 244.0f),
                    PathNode.CurveTo(178.8102f, 244.0f, 220.0f, 202.8102f, 220.0f, 152.0f),
                    PathNode.CurveTo(220.0f, 120.46f, 209.06f, 86.0f, 190.0f, 57.34f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.0f),
                    PathNode.CurveTo(90.46063f, 219.96141f, 60.038586f, 189.53935f, 60.0f, 152.0f),
                    PathNode.CurveTo(60.0f, 90.88f, 106.19f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(149.81f, 36.0f, 196.0f, 90.88f, 196.0f, 152.0f),
                    PathNode.CurveTo(195.96141f, 189.53935f, 165.53935f, 219.96141f, 128.0f, 220.0f),
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
        return _egg!!
    }

private var _egg: ImageVector? = null
