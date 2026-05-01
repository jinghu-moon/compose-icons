package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowUDownLeft: ImageVector
    get() {
        if (_arrowUDownLeft != null) return _arrowUDownLeft!!
        _arrowUDownLeft = phosphorLightIcon(
            name = "ArrowUDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.0f, 112.0f),
                    PathNode.CurveTo(229.96143f, 146.22566f, 202.22566f, 173.96143f, 168.0f, 174.0f),
                    PathNode.LineTo(46.49f, 174.0f),
                    PathNode.LineTo(84.24f, 211.76f),
                    PathNode.CurveTo(85.84522f, 213.25575f, 86.506f, 215.50844f, 85.96308f, 217.63431f),
                    PathNode.CurveTo(85.42017f, 219.76018f, 83.76018f, 221.42018f, 81.6343f, 221.96309f),
                    PathNode.CurveTo(79.508446f, 222.506f, 77.25577f, 221.84523f, 75.76f, 220.24f),
                    PathNode.LineTo(27.76f, 172.24f),
                    PathNode.CurveTo(25.420374f, 169.89746f, 25.420374f, 166.10254f, 27.76f, 163.76f),
                    PathNode.LineTo(75.76f, 115.76f),
                    PathNode.CurveTo(78.12408f, 113.55713f, 81.808075f, 113.62213f, 84.09297f, 115.90703f),
                    PathNode.CurveTo(86.37787f, 118.191925f, 86.44287f, 121.87592f, 84.24f, 124.24f),
                    PathNode.LineTo(46.49f, 162.0f),
                    PathNode.LineTo(168.0f, 162.0f),
                    PathNode.CurveTo(195.61424f, 162.0f, 218.0f, 139.61424f, 218.0f, 112.0f),
                    PathNode.CurveTo(218.0f, 84.385765f, 195.61424f, 62.0f, 168.0f, 62.0f),
                    PathNode.LineTo(80.0f, 62.0f),
                    PathNode.CurveTo(76.686295f, 62.0f, 74.0f, 59.31371f, 74.0f, 56.0f),
                    PathNode.CurveTo(74.0f, 52.68629f, 76.686295f, 50.0f, 80.0f, 50.0f),
                    PathNode.LineTo(168.0f, 50.0f),
                    PathNode.CurveTo(202.22566f, 50.03858f, 229.96143f, 77.77434f, 230.0f, 112.0f),
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
        return _arrowUDownLeft!!
    }

private var _arrowUDownLeft: ImageVector? = null
