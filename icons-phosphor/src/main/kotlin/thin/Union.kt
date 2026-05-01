package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Union: ImageVector
    get() {
        if (_union != null) return _union!!
        _union = phosphorThinIcon(
            name = "Union",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.0f, 64.0f),
                    PathNode.LineTo(204.0f, 144.0f),
                    PathNode.CurveTo(204.0f, 185.97365f, 169.97365f, 220.0f, 128.0f, 220.0f),
                    PathNode.CurveTo(86.02636f, 220.0f, 52.0f, 185.97365f, 52.0f, 144.0f),
                    PathNode.LineTo(52.0f, 64.0f),
                    PathNode.CurveTo(52.0f, 61.79086f, 53.79086f, 60.0f, 56.0f, 60.0f),
                    PathNode.CurveTo(58.20914f, 60.0f, 60.0f, 61.79086f, 60.0f, 64.0f),
                    PathNode.LineTo(60.0f, 144.0f),
                    PathNode.CurveTo(60.0f, 181.55536f, 90.44463f, 212.0f, 128.0f, 212.0f),
                    PathNode.CurveTo(165.55536f, 212.0f, 196.0f, 181.55536f, 196.0f, 144.0f),
                    PathNode.LineTo(196.0f, 64.0f),
                    PathNode.CurveTo(196.0f, 61.79086f, 197.79086f, 60.0f, 200.0f, 60.0f),
                    PathNode.CurveTo(202.20914f, 60.0f, 204.0f, 61.79086f, 204.0f, 64.0f),
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
        return _union!!
    }

private var _union: ImageVector? = null
