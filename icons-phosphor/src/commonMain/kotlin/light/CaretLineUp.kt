package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CaretLineUp: ImageVector
    get() {
        if (_caretLineUp != null) return _caretLineUp!!
        _caretLineUp = phosphorLightIcon(
            name = "CaretLineUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.24f, 196.24f),
                    PathNode.CurveTo(209.89746f, 198.57962f, 206.10254f, 198.57962f, 203.76f, 196.24f),
                    PathNode.LineTo(128.0f, 120.49f),
                    PathNode.LineTo(52.24f, 196.24f),
                    PathNode.CurveTo(49.875923f, 198.44287f, 46.19192f, 198.37787f, 43.907024f, 196.09297f),
                    PathNode.CurveTo(41.622128f, 193.80807f, 41.55713f, 190.12408f, 43.76f, 187.76f),
                    PathNode.LineTo(123.76f, 107.76f),
                    PathNode.CurveTo(126.10254f, 105.42038f, 129.89746f, 105.42038f, 132.24f, 107.76f),
                    PathNode.LineTo(212.24f, 187.76f),
                    PathNode.CurveTo(214.57962f, 190.10254f, 214.57962f, 193.89746f, 212.24f, 196.24f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 78.0f),
                    PathNode.LineTo(208.0f, 78.0f),
                    PathNode.CurveTo(211.3137f, 78.0f, 214.0f, 75.313705f, 214.0f, 72.0f),
                    PathNode.CurveTo(214.0f, 68.686295f, 211.3137f, 66.0f, 208.0f, 66.0f),
                    PathNode.LineTo(48.0f, 66.0f),
                    PathNode.CurveTo(44.68629f, 66.0f, 42.0f, 68.686295f, 42.0f, 72.0f),
                    PathNode.CurveTo(42.0f, 75.313705f, 44.68629f, 78.0f, 48.0f, 78.0f),
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
        return _caretLineUp!!
    }

private var _caretLineUp: ImageVector? = null
