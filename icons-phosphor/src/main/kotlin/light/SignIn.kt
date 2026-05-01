package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SignIn: ImageVector
    get() {
        if (_signIn != null) return _signIn!!
        _signIn = phosphorLightIcon(
            name = "SignIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(140.24f, 132.24f),
                    PathNode.LineTo(100.24f, 172.24f),
                    PathNode.CurveTo(97.87592f, 174.44287f, 94.191925f, 174.37787f, 91.90703f, 172.09297f),
                    PathNode.CurveTo(89.62213f, 169.80807f, 89.55713f, 166.12408f, 91.76f, 163.76f),
                    PathNode.LineTo(121.51f, 134.0f),
                    PathNode.LineTo(24.0f, 134.0f),
                    PathNode.CurveTo(20.68629f, 134.0f, 18.0f, 131.3137f, 18.0f, 128.0f),
                    PathNode.CurveTo(18.0f, 124.686295f, 20.68629f, 122.0f, 24.0f, 122.0f),
                    PathNode.LineTo(121.51f, 122.0f),
                    PathNode.LineTo(91.76f, 92.24f),
                    PathNode.CurveTo(89.55713f, 89.87592f, 89.62213f, 86.191925f, 91.90703f, 83.90703f),
                    PathNode.CurveTo(94.191925f, 81.62213f, 97.87592f, 81.55713f, 100.24f, 83.76f),
                    PathNode.LineTo(140.24f, 123.76f),
                    PathNode.CurveTo(142.57962f, 126.10254f, 142.57962f, 129.89746f, 140.24f, 132.24f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 34.0f),
                    PathNode.LineTo(136.0f, 34.0f),
                    PathNode.CurveTo(132.6863f, 34.0f, 130.0f, 36.68629f, 130.0f, 40.0f),
                    PathNode.CurveTo(130.0f, 43.31371f, 132.6863f, 46.0f, 136.0f, 46.0f),
                    PathNode.LineTo(194.0f, 46.0f),
                    PathNode.LineTo(194.0f, 210.0f),
                    PathNode.LineTo(136.0f, 210.0f),
                    PathNode.CurveTo(132.6863f, 210.0f, 130.0f, 212.6863f, 130.0f, 216.0f),
                    PathNode.CurveTo(130.0f, 219.3137f, 132.6863f, 222.0f, 136.0f, 222.0f),
                    PathNode.LineTo(200.0f, 222.0f),
                    PathNode.CurveTo(203.3137f, 222.0f, 206.0f, 219.3137f, 206.0f, 216.0f),
                    PathNode.LineTo(206.0f, 40.0f),
                    PathNode.CurveTo(206.0f, 36.68629f, 203.3137f, 34.0f, 200.0f, 34.0f),
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
        return _signIn!!
    }

private var _signIn: ImageVector? = null
