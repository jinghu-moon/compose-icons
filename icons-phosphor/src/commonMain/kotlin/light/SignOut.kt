package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SignOut: ImageVector
    get() {
        if (_signOut != null) return _signOut!!
        _signOut = phosphorLightIcon(
            name = "SignOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(118.0f, 216.0f),
                    PathNode.CurveTo(118.0f, 219.3137f, 115.313705f, 222.0f, 112.0f, 222.0f),
                    PathNode.LineTo(48.0f, 222.0f),
                    PathNode.CurveTo(44.68629f, 222.0f, 42.0f, 219.3137f, 42.0f, 216.0f),
                    PathNode.LineTo(42.0f, 40.0f),
                    PathNode.CurveTo(42.0f, 36.68629f, 44.68629f, 34.0f, 48.0f, 34.0f),
                    PathNode.LineTo(112.0f, 34.0f),
                    PathNode.CurveTo(115.313705f, 34.0f, 118.0f, 36.68629f, 118.0f, 40.0f),
                    PathNode.CurveTo(118.0f, 43.31371f, 115.313705f, 46.0f, 112.0f, 46.0f),
                    PathNode.LineTo(54.0f, 46.0f),
                    PathNode.LineTo(54.0f, 210.0f),
                    PathNode.LineTo(112.0f, 210.0f),
                    PathNode.CurveTo(115.313705f, 210.0f, 118.0f, 212.6863f, 118.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.24f, 123.76f),
                    PathNode.LineTo(188.24f, 83.76f),
                    PathNode.CurveTo(185.87592f, 81.55713f, 182.19193f, 81.62213f, 179.90703f, 83.90703f),
                    PathNode.CurveTo(177.62213f, 86.191925f, 177.55713f, 89.87592f, 179.76f, 92.24f),
                    PathNode.LineTo(209.51f, 122.0f),
                    PathNode.LineTo(112.0f, 122.0f),
                    PathNode.CurveTo(108.686295f, 122.0f, 106.0f, 124.686295f, 106.0f, 128.0f),
                    PathNode.CurveTo(106.0f, 131.3137f, 108.686295f, 134.0f, 112.0f, 134.0f),
                    PathNode.LineTo(209.51f, 134.0f),
                    PathNode.LineTo(179.76f, 163.76f),
                    PathNode.CurveTo(178.15477f, 165.25575f, 177.494f, 167.50844f, 178.03691f, 169.63431f),
                    PathNode.CurveTo(178.57982f, 171.76018f, 180.23982f, 173.42018f, 182.36569f, 173.96309f),
                    PathNode.CurveTo(184.49156f, 174.506f, 186.74425f, 173.84523f, 188.24f, 172.24f),
                    PathNode.LineTo(228.24f, 132.24f),
                    PathNode.CurveTo(230.57962f, 129.89746f, 230.57962f, 126.10254f, 228.24f, 123.76f),
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
        return _signOut!!
    }

private var _signOut: ImageVector? = null
