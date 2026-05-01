package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowCircleUp: ImageVector
    get() {
        if (_arrowCircleUp != null) return _arrowCircleUp!!
        _arrowCircleUp = phosphorLightIcon(
            name = "ArrowCircleUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 26.0f),
                    PathNode.CurveTo(71.666954f, 26.0f, 26.0f, 71.666954f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 184.33304f, 71.666954f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(184.33304f, 230.0f, 230.0f, 184.33304f, 230.0f, 128.0f),
                    PathNode.CurveTo(229.93387f, 71.69437f, 184.30563f, 26.066126f, 128.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 218.0f),
                    PathNode.CurveTo(78.29437f, 218.0f, 38.0f, 177.70563f, 38.0f, 128.0f),
                    PathNode.CurveTo(38.0f, 78.29437f, 78.29437f, 38.0f, 128.0f, 38.0f),
                    PathNode.CurveTo(177.70563f, 38.0f, 218.0f, 78.29437f, 218.0f, 128.0f),
                    PathNode.CurveTo(217.94489f, 177.68279f, 177.68279f, 217.94489f, 128.0f, 218.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.24f, 115.76f),
                    PathNode.CurveTo(165.84523f, 117.25577f, 166.506f, 119.508446f, 165.96309f, 121.6343f),
                    PathNode.CurveTo(165.42018f, 123.76018f, 163.76018f, 125.42017f, 161.63431f, 125.96308f),
                    PathNode.CurveTo(159.50844f, 126.506f, 157.25575f, 125.84522f, 155.76f, 124.24f),
                    PathNode.LineTo(134.0f, 102.49f),
                    PathNode.LineTo(134.0f, 168.0f),
                    PathNode.CurveTo(134.0f, 171.3137f, 131.3137f, 174.0f, 128.0f, 174.0f),
                    PathNode.CurveTo(124.686295f, 174.0f, 122.0f, 171.3137f, 122.0f, 168.0f),
                    PathNode.LineTo(122.0f, 102.49f),
                    PathNode.LineTo(100.24f, 124.24f),
                    PathNode.CurveTo(97.87592f, 126.44287f, 94.191925f, 126.37787f, 91.90703f, 124.09297f),
                    PathNode.CurveTo(89.62213f, 121.808075f, 89.55713f, 118.12408f, 91.76f, 115.76f),
                    PathNode.LineTo(123.76f, 83.76f),
                    PathNode.CurveTo(126.10254f, 81.42038f, 129.89746f, 81.42038f, 132.24f, 83.76f),
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
        return _arrowCircleUp!!
    }

private var _arrowCircleUp: ImageVector? = null
