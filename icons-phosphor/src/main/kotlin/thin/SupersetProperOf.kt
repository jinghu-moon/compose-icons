package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SupersetProperOf: ImageVector
    get() {
        if (_supersetProperOf != null) return _supersetProperOf!!
        _supersetProperOf = phosphorThinIcon(
            name = "SupersetProperOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 128.0f),
                    PathNode.CurveTo(219.9504f, 174.37135f, 182.37135f, 211.9504f, 136.0f, 212.0f),
                    PathNode.LineTo(64.0f, 212.0f),
                    PathNode.CurveTo(61.79086f, 212.0f, 60.0f, 210.20914f, 60.0f, 208.0f),
                    PathNode.CurveTo(60.0f, 205.79086f, 61.79086f, 204.0f, 64.0f, 204.0f),
                    PathNode.LineTo(136.0f, 204.0f),
                    PathNode.CurveTo(177.97365f, 204.0f, 212.0f, 169.97365f, 212.0f, 128.0f),
                    PathNode.CurveTo(212.0f, 86.02636f, 177.97365f, 52.0f, 136.0f, 52.0f),
                    PathNode.LineTo(64.0f, 52.0f),
                    PathNode.CurveTo(61.79086f, 52.0f, 60.0f, 50.20914f, 60.0f, 48.0f),
                    PathNode.CurveTo(60.0f, 45.79086f, 61.79086f, 44.0f, 64.0f, 44.0f),
                    PathNode.LineTo(136.0f, 44.0f),
                    PathNode.CurveTo(182.37135f, 44.049603f, 219.9504f, 81.62865f, 220.0f, 128.0f),
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
        return _supersetProperOf!!
    }

private var _supersetProperOf: ImageVector? = null
