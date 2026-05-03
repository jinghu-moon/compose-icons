package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Play: ImageVector
    get() {
        if (_play != null) return _play!!
        _play = lucideOutlineIcon(
            name = "Play",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 5.0f),
                    PathNode.CurveTo(4.999788f, 4.283711f, 5.382653f, 3.621998f, 6.003751f, 3.265196f),
                    PathNode.CurveTo(6.62485f, 2.908395f, 7.389338f, 2.91099f, 8.008001f, 3.272f),
                    PathNode.LineTo(20.005f, 10.27f),
                    PathNode.CurveTo(20.621143f, 10.62752f, 21.000618f, 11.285779f, 21.001236f, 11.998137f),
                    PathNode.CurveTo(21.001854f, 12.710495f, 20.623524f, 13.369411f, 20.008f, 13.728f),
                    PathNode.LineTo(8.008001f, 20.728f),
                    PathNode.CurveTo(7.389338f, 21.08901f, 6.62485f, 21.091606f, 6.003751f, 20.734804f),
                    PathNode.CurveTo(5.382653f, 20.378002f, 4.999788f, 19.71629f, 5.0f, 19.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _play!!
    }

private var _play: ImageVector? = null
