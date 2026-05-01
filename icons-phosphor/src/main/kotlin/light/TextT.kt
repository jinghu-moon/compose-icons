package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextT: ImageVector
    get() {
        if (_textT != null) return _textT!!
        _textT = phosphorLightIcon(
            name = "TextT",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(206.0f, 56.0f),
                    PathNode.LineTo(206.0f, 88.0f),
                    PathNode.CurveTo(206.0f, 91.313705f, 203.3137f, 94.0f, 200.0f, 94.0f),
                    PathNode.CurveTo(196.6863f, 94.0f, 194.0f, 91.313705f, 194.0f, 88.0f),
                    PathNode.LineTo(194.0f, 62.0f),
                    PathNode.LineTo(134.0f, 62.0f),
                    PathNode.LineTo(134.0f, 194.0f),
                    PathNode.LineTo(160.0f, 194.0f),
                    PathNode.CurveTo(163.3137f, 194.0f, 166.0f, 196.6863f, 166.0f, 200.0f),
                    PathNode.CurveTo(166.0f, 203.3137f, 163.3137f, 206.0f, 160.0f, 206.0f),
                    PathNode.LineTo(96.0f, 206.0f),
                    PathNode.CurveTo(92.686295f, 206.0f, 90.0f, 203.3137f, 90.0f, 200.0f),
                    PathNode.CurveTo(90.0f, 196.6863f, 92.686295f, 194.0f, 96.0f, 194.0f),
                    PathNode.LineTo(122.0f, 194.0f),
                    PathNode.LineTo(122.0f, 62.0f),
                    PathNode.LineTo(62.0f, 62.0f),
                    PathNode.LineTo(62.0f, 88.0f),
                    PathNode.CurveTo(62.0f, 91.313705f, 59.31371f, 94.0f, 56.0f, 94.0f),
                    PathNode.CurveTo(52.68629f, 94.0f, 50.0f, 91.313705f, 50.0f, 88.0f),
                    PathNode.LineTo(50.0f, 56.0f),
                    PathNode.CurveTo(50.0f, 52.68629f, 52.68629f, 50.0f, 56.0f, 50.0f),
                    PathNode.LineTo(200.0f, 50.0f),
                    PathNode.CurveTo(203.3137f, 50.0f, 206.0f, 52.68629f, 206.0f, 56.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _textT!!
    }

private var _textT: ImageVector? = null
