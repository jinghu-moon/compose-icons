package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Wall: ImageVector
    get() {
        if (_wall != null) return _wall!!
        _wall = phosphorLightIcon(
            name = "Wall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 50.0f),
                    PathNode.LineTo(32.0f, 50.0f),
                    PathNode.CurveTo(28.68629f, 50.0f, 26.0f, 52.68629f, 26.0f, 56.0f),
                    PathNode.LineTo(26.0f, 200.0f),
                    PathNode.CurveTo(26.0f, 203.3137f, 28.68629f, 206.0f, 32.0f, 206.0f),
                    PathNode.LineTo(224.0f, 206.0f),
                    PathNode.CurveTo(227.3137f, 206.0f, 230.0f, 203.3137f, 230.0f, 200.0f),
                    PathNode.LineTo(230.0f, 56.0f),
                    PathNode.CurveTo(230.0f, 52.68629f, 227.3137f, 50.0f, 224.0f, 50.0f),
                    PathNode.Close,
                    PathNode.MoveTo(86.0f, 146.0f),
                    PathNode.LineTo(86.0f, 110.0f),
                    PathNode.LineTo(170.0f, 110.0f),
                    PathNode.LineTo(170.0f, 146.0f),
                    PathNode.Close,
                    PathNode.MoveTo(38.0f, 146.0f),
                    PathNode.LineTo(38.0f, 110.0f),
                    PathNode.LineTo(74.0f, 110.0f),
                    PathNode.LineTo(74.0f, 146.0f),
                    PathNode.Close,
                    PathNode.MoveTo(182.0f, 110.0f),
                    PathNode.LineTo(218.0f, 110.0f),
                    PathNode.LineTo(218.0f, 146.0f),
                    PathNode.LineTo(182.0f, 146.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 98.0f),
                    PathNode.LineTo(134.0f, 98.0f),
                    PathNode.LineTo(134.0f, 62.0f),
                    PathNode.LineTo(218.0f, 62.0f),
                    PathNode.Close,
                    PathNode.MoveTo(122.0f, 62.0f),
                    PathNode.LineTo(122.0f, 98.0f),
                    PathNode.LineTo(38.0f, 98.0f),
                    PathNode.LineTo(38.0f, 62.0f),
                    PathNode.Close,
                    PathNode.MoveTo(38.0f, 158.0f),
                    PathNode.LineTo(122.0f, 158.0f),
                    PathNode.LineTo(122.0f, 194.0f),
                    PathNode.LineTo(38.0f, 194.0f),
                    PathNode.Close,
                    PathNode.MoveTo(134.0f, 194.0f),
                    PathNode.LineTo(134.0f, 158.0f),
                    PathNode.LineTo(218.0f, 158.0f),
                    PathNode.LineTo(218.0f, 194.0f),
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
        return _wall!!
    }

private var _wall: ImageVector? = null
