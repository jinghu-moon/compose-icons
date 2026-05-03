package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TagSimple: ImageVector
    get() {
        if (_tagSimple != null) return _tagSimple!!
        _tagSimple = phosphorBoldIcon(
            name = "TagSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(250.0f, 121.34f),
                    PathNode.LineTo(204.36f, 52.91f),
                    PathNode.CurveTo(200.6518f, 47.3448f, 194.40747f, 44.00123f, 187.72f, 44.0f),
                    PathNode.LineTo(40.0f, 44.0f),
                    PathNode.CurveTo(28.954306f, 44.0f, 20.0f, 52.954304f, 20.0f, 64.0f),
                    PathNode.LineTo(20.0f, 192.0f),
                    PathNode.CurveTo(20.0f, 203.0457f, 28.954306f, 212.0f, 40.0f, 212.0f),
                    PathNode.LineTo(187.72f, 212.0f),
                    PathNode.CurveTo(194.40747f, 211.99876f, 200.6518f, 208.6552f, 204.36f, 203.09f),
                    PathNode.LineTo(250.0f, 134.66f),
                    PathNode.CurveTo(252.6904f, 130.62756f, 252.6904f, 125.37245f, 250.0f, 121.34f),
                    PathNode.Close,
                    PathNode.MoveTo(185.58f, 188.0f),
                    PathNode.LineTo(44.0f, 188.0f),
                    PathNode.LineTo(44.0f, 68.0f),
                    PathNode.LineTo(185.58f, 68.0f),
                    PathNode.LineTo(225.58f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _tagSimple!!
    }

private var _tagSimple: ImageVector? = null
