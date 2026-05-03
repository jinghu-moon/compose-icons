package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChatCircle: ImageVector
    get() {
        if (_chatCircle != null) return _chatCircle!!
        _chatCircle = phosphorFillIcon(
            name = "ChatCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 128.0f),
                    PathNode.CurveTo(232.00797f, 164.52303f, 212.85693f, 198.37349f, 181.54701f, 217.17828f),
                    PathNode.CurveTo(150.23709f, 235.98308f, 111.35765f, 236.98582f, 79.12f, 219.82f),
                    PathNode.LineTo(45.07f, 231.17f),
                    PathNode.CurveTo(39.320145f, 233.08752f, 32.980404f, 231.59138f, 28.694513f, 227.30548f),
                    PathNode.CurveTo(24.408623f, 223.0196f, 22.912483f, 216.67986f, 24.83f, 210.93f),
                    PathNode.LineTo(36.18f, 176.88f),
                    PathNode.CurveTo(15.858562f, 138.67328f, 21.319912f, 91.87539f, 49.892963f, 59.374695f),
                    PathNode.CurveTo(78.46601f, 26.873999f, 124.17886f, 15.463294f, 164.67383f, 30.723438f),
                    PathNode.CurveTo(205.1688f, 45.98358f, 231.98225f, 84.725136f, 232.0f, 128.0f),
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
        return _chatCircle!!
    }

private var _chatCircle: ImageVector? = null
