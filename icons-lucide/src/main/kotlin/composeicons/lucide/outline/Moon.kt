package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Moon: ImageVector
    get() {
        if (_moon != null) return _moon!!
        _moon = lucideOutlineIcon(
            name = "Moon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.985f, 12.486f),
                    PathNode.CurveTo(20.72386f, 17.323496f, 16.68038f, 21.086329f, 11.836619f, 20.999414f),
                    PathNode.CurveTo(6.992861f, 20.912502f, 3.086976f, 17.007029f, 2.999551f, 12.163279f),
                    PathNode.CurveTo(2.912125f, 7.319529f, 6.674532f, 3.275651f, 11.512f, 3.014f),
                    PathNode.CurveTo(11.917f, 2.992f, 12.129f, 3.474f, 11.914f, 3.817f),
                    PathNode.CurveTo(10.433187f, 6.186257f, 10.783697f, 9.264053f, 12.759321f, 11.239678f),
                    PathNode.CurveTo(14.734946f, 13.215303f, 17.812744f, 13.565814f, 20.182f, 12.085f),
                    PathNode.CurveTo(20.526f, 11.87f, 21.007f, 12.081f, 20.985f, 12.486f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _moon!!
    }

private var _moon: ImageVector? = null
