package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowBendDownLeft: ImageVector
    get() {
        if (_arrowBendDownLeft != null) return _arrowBendDownLeft!!
        _arrowBendDownLeft = phosphorLightIcon(
            name = "ArrowBendDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.0f, 56.0f),
                    PathNode.CurveTo(229.93387f, 112.30563f, 184.30563f, 157.93387f, 128.0f, 158.0f),
                    PathNode.LineTo(46.49f, 158.0f),
                    PathNode.LineTo(84.24f, 195.76f),
                    PathNode.CurveTo(85.84522f, 197.25575f, 86.506f, 199.50844f, 85.96308f, 201.63431f),
                    PathNode.CurveTo(85.42017f, 203.76018f, 83.76018f, 205.42018f, 81.6343f, 205.96309f),
                    PathNode.CurveTo(79.508446f, 206.506f, 77.25577f, 205.84523f, 75.76f, 204.24f),
                    PathNode.LineTo(27.76f, 156.24f),
                    PathNode.CurveTo(25.420374f, 153.89746f, 25.420374f, 150.10254f, 27.76f, 147.76f),
                    PathNode.LineTo(75.76f, 99.76f),
                    PathNode.CurveTo(78.12408f, 97.55713f, 81.808075f, 97.62213f, 84.09297f, 99.90703f),
                    PathNode.CurveTo(86.37787f, 102.191925f, 86.44287f, 105.87592f, 84.24f, 108.24f),
                    PathNode.LineTo(46.49f, 146.0f),
                    PathNode.LineTo(128.0f, 146.0f),
                    PathNode.CurveTo(177.68279f, 145.94489f, 217.94489f, 105.682785f, 218.0f, 56.0f),
                    PathNode.CurveTo(218.0f, 52.68629f, 220.6863f, 50.0f, 224.0f, 50.0f),
                    PathNode.CurveTo(227.3137f, 50.0f, 230.0f, 52.68629f, 230.0f, 56.0f),
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
        return _arrowBendDownLeft!!
    }

private var _arrowBendDownLeft: ImageVector? = null
