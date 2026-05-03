package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CaretDoubleUp: ImageVector
    get() {
        if (_caretDoubleUp != null) return _caretDoubleUp!!
        _caretDoubleUp = phosphorLightIcon(
            name = "CaretDoubleUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.24f, 195.76f),
                    PathNode.CurveTo(213.84523f, 197.25575f, 214.506f, 199.50844f, 213.96309f, 201.63431f),
                    PathNode.CurveTo(213.42018f, 203.76018f, 211.76018f, 205.42018f, 209.63431f, 205.96309f),
                    PathNode.CurveTo(207.50844f, 206.506f, 205.25575f, 205.84523f, 203.76f, 204.24f),
                    PathNode.LineTo(128.0f, 128.49f),
                    PathNode.LineTo(52.24f, 204.24f),
                    PathNode.CurveTo(49.875923f, 206.44287f, 46.19192f, 206.37787f, 43.907024f, 204.09297f),
                    PathNode.CurveTo(41.622128f, 201.80807f, 41.55713f, 198.12408f, 43.76f, 195.76f),
                    PathNode.LineTo(123.76f, 115.76f),
                    PathNode.CurveTo(126.10254f, 113.42038f, 129.89746f, 113.42038f, 132.24f, 115.76f),
                    PathNode.Close,
                    PathNode.MoveTo(52.24f, 124.24f),
                    PathNode.LineTo(128.0f, 48.49f),
                    PathNode.LineTo(203.76f, 124.24f),
                    PathNode.CurveTo(206.12408f, 126.44287f, 209.80807f, 126.37787f, 212.09297f, 124.09297f),
                    PathNode.CurveTo(214.37787f, 121.808075f, 214.44287f, 118.12408f, 212.24f, 115.76f),
                    PathNode.LineTo(132.24f, 35.76f),
                    PathNode.CurveTo(129.89746f, 33.420372f, 126.10254f, 33.420372f, 123.76f, 35.76f),
                    PathNode.LineTo(43.76f, 115.76f),
                    PathNode.CurveTo(41.55713f, 118.12408f, 41.622128f, 121.808075f, 43.907024f, 124.09297f),
                    PathNode.CurveTo(46.19192f, 126.37787f, 49.875923f, 126.44287f, 52.24f, 124.24f),
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
        return _caretDoubleUp!!
    }

private var _caretDoubleUp: ImageVector? = null
