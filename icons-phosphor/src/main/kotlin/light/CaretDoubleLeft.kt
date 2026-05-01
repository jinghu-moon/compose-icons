package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CaretDoubleLeft: ImageVector
    get() {
        if (_caretDoubleLeft != null) return _caretDoubleLeft!!
        _caretDoubleLeft = phosphorLightIcon(
            name = "CaretDoubleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.24f, 203.76f),
                    PathNode.CurveTo(205.84523f, 205.25575f, 206.506f, 207.50844f, 205.96309f, 209.63431f),
                    PathNode.CurveTo(205.42018f, 211.76018f, 203.76018f, 213.42018f, 201.63431f, 213.96309f),
                    PathNode.CurveTo(199.50844f, 214.506f, 197.25575f, 213.84523f, 195.76f, 212.24f),
                    PathNode.LineTo(115.76f, 132.24f),
                    PathNode.CurveTo(113.42038f, 129.89746f, 113.42038f, 126.10254f, 115.76f, 123.76f),
                    PathNode.LineTo(195.76f, 43.76f),
                    PathNode.CurveTo(198.12408f, 41.55713f, 201.80807f, 41.622128f, 204.09297f, 43.907024f),
                    PathNode.CurveTo(206.37787f, 46.19192f, 206.44287f, 49.875923f, 204.24f, 52.24f),
                    PathNode.LineTo(128.49f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.49f, 128.0f),
                    PathNode.LineTo(124.24f, 52.24f),
                    PathNode.CurveTo(126.44287f, 49.875923f, 126.37787f, 46.19192f, 124.09297f, 43.907024f),
                    PathNode.CurveTo(121.808075f, 41.622128f, 118.12408f, 41.55713f, 115.76f, 43.76f),
                    PathNode.LineTo(35.76f, 123.76f),
                    PathNode.CurveTo(33.420372f, 126.10254f, 33.420372f, 129.89746f, 35.76f, 132.24f),
                    PathNode.LineTo(115.76f, 212.24f),
                    PathNode.CurveTo(117.25577f, 213.84523f, 119.508446f, 214.506f, 121.6343f, 213.96309f),
                    PathNode.CurveTo(123.76018f, 213.42018f, 125.42017f, 211.76018f, 125.96308f, 209.63431f),
                    PathNode.CurveTo(126.506f, 207.50844f, 125.84522f, 205.25575f, 124.24f, 203.76f),
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
        return _caretDoubleLeft!!
    }

private var _caretDoubleLeft: ImageVector? = null
