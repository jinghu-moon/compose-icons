package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowSquareUp: ImageVector
    get() {
        if (_arrowSquareUp != null) return _arrowSquareUp!!
        _arrowSquareUp = phosphorLightIcon(
            name = "ArrowSquareUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 34.0f),
                    PathNode.LineTo(48.0f, 34.0f),
                    PathNode.CurveTo(40.268013f, 34.0f, 34.0f, 40.268013f, 34.0f, 48.0f),
                    PathNode.LineTo(34.0f, 208.0f),
                    PathNode.CurveTo(34.0f, 215.73198f, 40.268013f, 222.0f, 48.0f, 222.0f),
                    PathNode.LineTo(208.0f, 222.0f),
                    PathNode.CurveTo(215.73198f, 222.0f, 222.0f, 215.73198f, 222.0f, 208.0f),
                    PathNode.LineTo(222.0f, 48.0f),
                    PathNode.CurveTo(222.0f, 40.268013f, 215.73198f, 34.0f, 208.0f, 34.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 208.0f),
                    PathNode.CurveTo(210.0f, 209.10457f, 209.10457f, 210.0f, 208.0f, 210.0f),
                    PathNode.LineTo(48.0f, 210.0f),
                    PathNode.CurveTo(46.89543f, 210.0f, 46.0f, 209.10457f, 46.0f, 208.0f),
                    PathNode.LineTo(46.0f, 48.0f),
                    PathNode.CurveTo(46.0f, 46.89543f, 46.89543f, 46.0f, 48.0f, 46.0f),
                    PathNode.LineTo(208.0f, 46.0f),
                    PathNode.CurveTo(209.10457f, 46.0f, 210.0f, 46.89543f, 210.0f, 48.0f),
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
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowSquareUp!!
    }

private var _arrowSquareUp: ImageVector? = null
