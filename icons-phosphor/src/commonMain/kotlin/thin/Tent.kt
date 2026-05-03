package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Tent: ImageVector
    get() {
        if (_tent != null) return _tent!!
        _tent = phosphorThinIcon(
            name = "Tent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(251.66f, 190.38f),
                    PathNode.LineTo(187.66f, 46.38f),
                    PathNode.CurveTo(187.01866f, 44.93213f, 185.58356f, 43.998917f, 184.0f, 44.0f),
                    PathNode.LineTo(72.0f, 44.0f),
                    PathNode.CurveTo(70.434364f, 44.005417f, 69.015816f, 44.92376f, 68.37f, 46.35f),
                    PathNode.CurveTo(68.37f, 46.35f, 68.37f, 46.35f, 68.37f, 46.35f),
                    PathNode.LineTo(68.37f, 46.41f),
                    PathNode.LineTo(68.37f, 46.41f),
                    PathNode.LineTo(4.37f, 190.34f),
                    PathNode.CurveTo(3.805894f, 191.5767f, 3.908433f, 193.01524f, 4.64225f, 194.15944f),
                    PathNode.CurveTo(5.376066f, 195.30362f, 6.640721f, 195.99684f, 8.0f, 196.0f),
                    PathNode.LineTo(248.0f, 196.0f),
                    PathNode.CurveTo(249.35364f, 196.00093f, 250.61589f, 195.31718f, 251.3546f, 194.18289f),
                    PathNode.CurveTo(252.0933f, 193.04857f, 252.20822f, 191.61765f, 251.66f, 190.38f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 66.85f),
                    PathNode.LineTo(68.0f, 188.0f),
                    PathNode.LineTo(14.16f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 188.0f),
                    PathNode.LineTo(76.0f, 66.85f),
                    PathNode.LineTo(129.84f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(138.6f, 188.0f),
                    PathNode.LineTo(78.16f, 52.0f),
                    PathNode.LineTo(181.4f, 52.0f),
                    PathNode.LineTo(241.84f, 188.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _tent!!
    }

private var _tent: ImageVector? = null
