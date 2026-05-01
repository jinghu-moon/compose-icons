package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LineVertical: ImageVector
    get() {
        if (_lineVertical != null) return _lineVertical!!
        _lineVertical = phosphorThinIcon(
            name = "LineVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(132.0f, 24.0f),
                    PathNode.LineTo(132.0f, 232.0f),
                    PathNode.CurveTo(132.0f, 234.20914f, 130.20914f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(125.79086f, 236.0f, 124.0f, 234.20914f, 124.0f, 232.0f),
                    PathNode.LineTo(124.0f, 24.0f),
                    PathNode.CurveTo(124.0f, 21.790861f, 125.79086f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(130.20914f, 20.0f, 132.0f, 21.790861f, 132.0f, 24.0f),
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
        return _lineVertical!!
    }

private var _lineVertical: ImageVector? = null
