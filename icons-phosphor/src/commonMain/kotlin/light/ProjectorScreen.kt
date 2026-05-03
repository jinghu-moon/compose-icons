package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ProjectorScreen: ImageVector
    get() {
        if (_projectorScreen != null) return _projectorScreen!!
        _projectorScreen = phosphorLightIcon(
            name = "ProjectorScreen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 78.0f),
                    PathNode.CurveTo(223.73198f, 78.0f, 230.0f, 71.73199f, 230.0f, 64.0f),
                    PathNode.LineTo(230.0f, 48.0f),
                    PathNode.CurveTo(230.0f, 40.268013f, 223.73198f, 34.0f, 216.0f, 34.0f),
                    PathNode.LineTo(40.0f, 34.0f),
                    PathNode.CurveTo(32.268013f, 34.0f, 26.0f, 40.268013f, 26.0f, 48.0f),
                    PathNode.LineTo(26.0f, 64.0f),
                    PathNode.CurveTo(26.0f, 71.73199f, 32.268013f, 78.0f, 40.0f, 78.0f),
                    PathNode.LineTo(42.0f, 78.0f),
                    PathNode.LineTo(42.0f, 178.0f),
                    PathNode.LineTo(32.0f, 178.0f),
                    PathNode.CurveTo(28.68629f, 178.0f, 26.0f, 180.6863f, 26.0f, 184.0f),
                    PathNode.CurveTo(26.0f, 187.3137f, 28.68629f, 190.0f, 32.0f, 190.0f),
                    PathNode.LineTo(122.0f, 190.0f),
                    PathNode.LineTo(122.0f, 210.84f),
                    PathNode.CurveTo(111.4363f, 213.83453f, 104.69784f, 224.15947f, 106.209496f, 235.03485f),
                    PathNode.CurveTo(107.72115f, 245.91023f, 117.020065f, 254.00601f, 128.0f, 254.00601f),
                    PathNode.CurveTo(138.97993f, 254.00601f, 148.27885f, 245.91023f, 149.79051f, 235.03485f),
                    PathNode.CurveTo(151.30217f, 224.15947f, 144.5637f, 213.83453f, 134.0f, 210.84f),
                    PathNode.LineTo(134.0f, 190.0f),
                    PathNode.LineTo(224.0f, 190.0f),
                    PathNode.CurveTo(227.3137f, 190.0f, 230.0f, 187.3137f, 230.0f, 184.0f),
                    PathNode.CurveTo(230.0f, 180.6863f, 227.3137f, 178.0f, 224.0f, 178.0f),
                    PathNode.LineTo(214.0f, 178.0f),
                    PathNode.LineTo(214.0f, 78.0f),
                    PathNode.Close,
                    PathNode.MoveTo(138.0f, 232.0f),
                    PathNode.CurveTo(138.0f, 237.52284f, 133.52284f, 242.0f, 128.0f, 242.0f),
                    PathNode.CurveTo(122.47715f, 242.0f, 118.0f, 237.52284f, 118.0f, 232.0f),
                    PathNode.CurveTo(118.0f, 226.47716f, 122.47715f, 222.0f, 128.0f, 222.0f),
                    PathNode.CurveTo(133.52284f, 222.0f, 138.0f, 226.47716f, 138.0f, 232.0f),
                    PathNode.Close,
                    PathNode.MoveTo(38.0f, 64.0f),
                    PathNode.LineTo(38.0f, 48.0f),
                    PathNode.CurveTo(38.0f, 46.89543f, 38.89543f, 46.0f, 40.0f, 46.0f),
                    PathNode.LineTo(216.0f, 46.0f),
                    PathNode.CurveTo(217.10457f, 46.0f, 218.0f, 46.89543f, 218.0f, 48.0f),
                    PathNode.LineTo(218.0f, 64.0f),
                    PathNode.CurveTo(218.0f, 65.10457f, 217.10457f, 66.0f, 216.0f, 66.0f),
                    PathNode.LineTo(40.0f, 66.0f),
                    PathNode.CurveTo(38.89543f, 66.0f, 38.0f, 65.10457f, 38.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(202.0f, 178.0f),
                    PathNode.LineTo(54.0f, 178.0f),
                    PathNode.LineTo(54.0f, 78.0f),
                    PathNode.LineTo(202.0f, 78.0f),
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
        return _projectorScreen!!
    }

private var _projectorScreen: ImageVector? = null
