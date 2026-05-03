package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SupersetOf: ImageVector
    get() {
        if (_supersetOf != null) return _supersetOf!!
        _supersetOf = phosphorLightIcon(
            name = "SupersetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(214.0f, 200.0f),
                    PathNode.CurveTo(214.0f, 203.3137f, 211.3137f, 206.0f, 208.0f, 206.0f),
                    PathNode.LineTo(56.0f, 206.0f),
                    PathNode.CurveTo(52.68629f, 206.0f, 50.0f, 203.3137f, 50.0f, 200.0f),
                    PathNode.CurveTo(50.0f, 196.6863f, 52.68629f, 194.0f, 56.0f, 194.0f),
                    PathNode.LineTo(208.0f, 194.0f),
                    PathNode.CurveTo(211.3137f, 194.0f, 214.0f, 196.6863f, 214.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 154.0f),
                    PathNode.LineTo(56.0f, 154.0f),
                    PathNode.CurveTo(52.68629f, 154.0f, 50.0f, 156.6863f, 50.0f, 160.0f),
                    PathNode.CurveTo(50.0f, 163.3137f, 52.68629f, 166.0f, 56.0f, 166.0f),
                    PathNode.LineTo(152.0f, 166.0f),
                    PathNode.CurveTo(186.24165f, 166.0f, 214.0f, 138.24165f, 214.0f, 104.0f),
                    PathNode.CurveTo(214.0f, 69.75835f, 186.24165f, 42.0f, 152.0f, 42.0f),
                    PathNode.LineTo(56.0f, 42.0f),
                    PathNode.CurveTo(52.68629f, 42.0f, 50.0f, 44.68629f, 50.0f, 48.0f),
                    PathNode.CurveTo(50.0f, 51.31371f, 52.68629f, 54.0f, 56.0f, 54.0f),
                    PathNode.LineTo(152.0f, 54.0f),
                    PathNode.CurveTo(179.61424f, 54.0f, 202.0f, 76.385765f, 202.0f, 104.0f),
                    PathNode.CurveTo(202.0f, 131.61424f, 179.61424f, 154.0f, 152.0f, 154.0f),
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
        return _supersetOf!!
    }

private var _supersetOf: ImageVector? = null
