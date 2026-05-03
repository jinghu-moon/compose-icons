package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CaretDoubleRight: ImageVector
    get() {
        if (_caretDoubleRight != null) return _caretDoubleRight!!
        _caretDoubleRight = phosphorLightIcon(
            name = "CaretDoubleRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(140.24f, 132.24f),
                    PathNode.LineTo(60.24f, 212.24f),
                    PathNode.CurveTo(57.875923f, 214.44287f, 54.19192f, 214.37787f, 51.907024f, 212.09297f),
                    PathNode.CurveTo(49.622128f, 209.80807f, 49.55713f, 206.12408f, 51.76f, 203.76f),
                    PathNode.LineTo(127.51f, 128.0f),
                    PathNode.LineTo(51.76f, 52.24f),
                    PathNode.CurveTo(49.55713f, 49.875923f, 49.622128f, 46.19192f, 51.907024f, 43.907024f),
                    PathNode.CurveTo(54.19192f, 41.622128f, 57.875923f, 41.55713f, 60.24f, 43.76f),
                    PathNode.LineTo(140.24f, 123.76f),
                    PathNode.CurveTo(142.57962f, 126.10254f, 142.57962f, 129.89746f, 140.24f, 132.24f),
                    PathNode.Close,
                    PathNode.MoveTo(220.24f, 123.76f),
                    PathNode.LineTo(140.24f, 43.76f),
                    PathNode.CurveTo(137.87592f, 41.55713f, 134.19193f, 41.622128f, 131.90703f, 43.907024f),
                    PathNode.CurveTo(129.62213f, 46.19192f, 129.55713f, 49.875923f, 131.76f, 52.24f),
                    PathNode.LineTo(207.51f, 128.0f),
                    PathNode.LineTo(131.76f, 203.76f),
                    PathNode.CurveTo(130.15477f, 205.25575f, 129.494f, 207.50844f, 130.03691f, 209.63431f),
                    PathNode.CurveTo(130.57982f, 211.76018f, 132.23982f, 213.42018f, 134.36569f, 213.96309f),
                    PathNode.CurveTo(136.49156f, 214.506f, 138.74425f, 213.84523f, 140.24f, 212.24f),
                    PathNode.LineTo(220.24f, 132.24f),
                    PathNode.CurveTo(222.57962f, 129.89746f, 222.57962f, 126.10254f, 220.24f, 123.76f),
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
        return _caretDoubleRight!!
    }

private var _caretDoubleRight: ImageVector? = null
