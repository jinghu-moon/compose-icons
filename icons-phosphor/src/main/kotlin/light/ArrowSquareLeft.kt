package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowSquareLeft: ImageVector
    get() {
        if (_arrowSquareLeft != null) return _arrowSquareLeft!!
        _arrowSquareLeft = phosphorLightIcon(
            name = "ArrowSquareLeft",
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
                    PathNode.MoveTo(174.0f, 128.0f),
                    PathNode.CurveTo(174.0f, 131.3137f, 171.3137f, 134.0f, 168.0f, 134.0f),
                    PathNode.LineTo(102.49f, 134.0f),
                    PathNode.LineTo(124.24f, 155.76f),
                    PathNode.CurveTo(125.84522f, 157.25575f, 126.506f, 159.50844f, 125.96308f, 161.63431f),
                    PathNode.CurveTo(125.42017f, 163.76018f, 123.76018f, 165.42018f, 121.6343f, 165.96309f),
                    PathNode.CurveTo(119.508446f, 166.506f, 117.25577f, 165.84523f, 115.76f, 164.24f),
                    PathNode.LineTo(83.76f, 132.24f),
                    PathNode.CurveTo(81.42038f, 129.89746f, 81.42038f, 126.10254f, 83.76f, 123.76f),
                    PathNode.LineTo(115.76f, 91.76f),
                    PathNode.CurveTo(118.12408f, 89.55713f, 121.808075f, 89.62213f, 124.09297f, 91.90703f),
                    PathNode.CurveTo(126.37787f, 94.191925f, 126.44287f, 97.87592f, 124.24f, 100.24f),
                    PathNode.LineTo(102.49f, 122.0f),
                    PathNode.LineTo(168.0f, 122.0f),
                    PathNode.CurveTo(171.3137f, 122.0f, 174.0f, 124.686295f, 174.0f, 128.0f),
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
        return _arrowSquareLeft!!
    }

private var _arrowSquareLeft: ImageVector? = null
