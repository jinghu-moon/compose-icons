package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CaretDoubleDown: ImageVector
    get() {
        if (_caretDoubleDown != null) return _caretDoubleDown!!
        _caretDoubleDown = phosphorLightIcon(
            name = "CaretDoubleDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.24f, 131.76f),
                    PathNode.CurveTo(214.57962f, 134.10254f, 214.57962f, 137.89746f, 212.24f, 140.24f),
                    PathNode.LineTo(132.24f, 220.24f),
                    PathNode.CurveTo(129.89746f, 222.57962f, 126.10254f, 222.57962f, 123.76f, 220.24f),
                    PathNode.LineTo(43.76f, 140.24f),
                    PathNode.CurveTo(41.55713f, 137.87592f, 41.622128f, 134.19193f, 43.907024f, 131.90703f),
                    PathNode.CurveTo(46.19192f, 129.62213f, 49.875923f, 129.55713f, 52.24f, 131.76f),
                    PathNode.LineTo(128.0f, 207.51f),
                    PathNode.LineTo(203.76f, 131.76f),
                    PathNode.CurveTo(206.10254f, 129.42038f, 209.89746f, 129.42038f, 212.24f, 131.76f),
                    PathNode.Close,
                    PathNode.MoveTo(123.76f, 140.24f),
                    PathNode.CurveTo(126.10254f, 142.57962f, 129.89746f, 142.57962f, 132.24f, 140.24f),
                    PathNode.LineTo(212.24f, 60.24f),
                    PathNode.CurveTo(214.44287f, 57.875923f, 214.37787f, 54.19192f, 212.09297f, 51.907024f),
                    PathNode.CurveTo(209.80807f, 49.622128f, 206.12408f, 49.55713f, 203.76f, 51.76f),
                    PathNode.LineTo(128.0f, 127.51f),
                    PathNode.LineTo(52.24f, 51.76f),
                    PathNode.CurveTo(49.875923f, 49.55713f, 46.19192f, 49.622128f, 43.907024f, 51.907024f),
                    PathNode.CurveTo(41.622128f, 54.19192f, 41.55713f, 57.875923f, 43.76f, 60.24f),
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
        return _caretDoubleDown!!
    }

private var _caretDoubleDown: ImageVector? = null
