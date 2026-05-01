package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CaretLineLeft: ImageVector
    get() {
        if (_caretLineLeft != null) return _caretLineLeft!!
        _caretLineLeft = phosphorLightIcon(
            name = "CaretLineLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(196.24f, 203.76f),
                    PathNode.CurveTo(197.84523f, 205.25575f, 198.506f, 207.50844f, 197.96309f, 209.63431f),
                    PathNode.CurveTo(197.42018f, 211.76018f, 195.76018f, 213.42018f, 193.63431f, 213.96309f),
                    PathNode.CurveTo(191.50844f, 214.506f, 189.25575f, 213.84523f, 187.76f, 212.24f),
                    PathNode.LineTo(107.76f, 132.24f),
                    PathNode.CurveTo(105.42038f, 129.89746f, 105.42038f, 126.10254f, 107.76f, 123.76f),
                    PathNode.LineTo(187.76f, 43.76f),
                    PathNode.CurveTo(190.12408f, 41.55713f, 193.80807f, 41.622128f, 196.09297f, 43.907024f),
                    PathNode.CurveTo(198.37787f, 46.19192f, 198.44287f, 49.875923f, 196.24f, 52.24f),
                    PathNode.LineTo(120.49f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 42.0f),
                    PathNode.CurveTo(68.686295f, 42.0f, 66.0f, 44.68629f, 66.0f, 48.0f),
                    PathNode.LineTo(66.0f, 208.0f),
                    PathNode.CurveTo(66.0f, 211.3137f, 68.686295f, 214.0f, 72.0f, 214.0f),
                    PathNode.CurveTo(75.313705f, 214.0f, 78.0f, 211.3137f, 78.0f, 208.0f),
                    PathNode.LineTo(78.0f, 48.0f),
                    PathNode.CurveTo(78.0f, 44.68629f, 75.313705f, 42.0f, 72.0f, 42.0f),
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
        return _caretLineLeft!!
    }

private var _caretLineLeft: ImageVector? = null
