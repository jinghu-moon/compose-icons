package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextH: ImageVector
    get() {
        if (_textH != null) return _textH!!
        _textH = phosphorThinIcon(
            name = "TextH",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.0f, 56.0f),
                    PathNode.LineTo(204.0f, 200.0f),
                    PathNode.CurveTo(204.0f, 202.20914f, 202.20914f, 204.0f, 200.0f, 204.0f),
                    PathNode.CurveTo(197.79086f, 204.0f, 196.0f, 202.20914f, 196.0f, 200.0f),
                    PathNode.LineTo(196.0f, 132.0f),
                    PathNode.LineTo(60.0f, 132.0f),
                    PathNode.LineTo(60.0f, 200.0f),
                    PathNode.CurveTo(60.0f, 202.20914f, 58.20914f, 204.0f, 56.0f, 204.0f),
                    PathNode.CurveTo(53.79086f, 204.0f, 52.0f, 202.20914f, 52.0f, 200.0f),
                    PathNode.LineTo(52.0f, 56.0f),
                    PathNode.CurveTo(52.0f, 53.79086f, 53.79086f, 52.0f, 56.0f, 52.0f),
                    PathNode.CurveTo(58.20914f, 52.0f, 60.0f, 53.79086f, 60.0f, 56.0f),
                    PathNode.LineTo(60.0f, 124.0f),
                    PathNode.LineTo(196.0f, 124.0f),
                    PathNode.LineTo(196.0f, 56.0f),
                    PathNode.CurveTo(196.0f, 53.79086f, 197.79086f, 52.0f, 200.0f, 52.0f),
                    PathNode.CurveTo(202.20914f, 52.0f, 204.0f, 53.79086f, 204.0f, 56.0f),
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
        return _textH!!
    }

private var _textH: ImageVector? = null
