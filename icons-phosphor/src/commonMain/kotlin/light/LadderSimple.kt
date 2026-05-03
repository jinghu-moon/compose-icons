package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LadderSimple: ImageVector
    get() {
        if (_ladderSimple != null) return _ladderSimple!!
        _ladderSimple = phosphorLightIcon(
            name = "LadderSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 26.0f),
                    PathNode.CurveTo(188.6863f, 26.0f, 186.0f, 28.68629f, 186.0f, 32.0f),
                    PathNode.LineTo(186.0f, 66.0f),
                    PathNode.LineTo(70.0f, 66.0f),
                    PathNode.LineTo(70.0f, 32.0f),
                    PathNode.CurveTo(70.0f, 28.68629f, 67.313705f, 26.0f, 64.0f, 26.0f),
                    PathNode.CurveTo(60.68629f, 26.0f, 58.0f, 28.68629f, 58.0f, 32.0f),
                    PathNode.LineTo(58.0f, 224.0f),
                    PathNode.CurveTo(58.0f, 227.3137f, 60.68629f, 230.0f, 64.0f, 230.0f),
                    PathNode.CurveTo(67.313705f, 230.0f, 70.0f, 227.3137f, 70.0f, 224.0f),
                    PathNode.LineTo(70.0f, 190.0f),
                    PathNode.LineTo(186.0f, 190.0f),
                    PathNode.LineTo(186.0f, 224.0f),
                    PathNode.CurveTo(186.0f, 227.3137f, 188.6863f, 230.0f, 192.0f, 230.0f),
                    PathNode.CurveTo(195.3137f, 230.0f, 198.0f, 227.3137f, 198.0f, 224.0f),
                    PathNode.LineTo(198.0f, 32.0f),
                    PathNode.CurveTo(198.0f, 28.68629f, 195.3137f, 26.0f, 192.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(186.0f, 78.0f),
                    PathNode.LineTo(186.0f, 122.0f),
                    PathNode.LineTo(70.0f, 122.0f),
                    PathNode.LineTo(70.0f, 78.0f),
                    PathNode.Close,
                    PathNode.MoveTo(70.0f, 178.0f),
                    PathNode.LineTo(70.0f, 134.0f),
                    PathNode.LineTo(186.0f, 134.0f),
                    PathNode.LineTo(186.0f, 178.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _ladderSimple!!
    }

private var _ladderSimple: ImageVector? = null
