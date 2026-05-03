package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CubeTransparent: ImageVector
    get() {
        if (_cubeTransparent != null) return _cubeTransparent!!
        _cubeTransparent = phosphorFillIcon(
            name = "CubeTransparent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(104.0f, 152.0f),
                    PathNode.LineTo(104.0f, 104.0f),
                    PathNode.LineTo(152.0f, 104.0f),
                    PathNode.LineTo(152.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 53.0f),
                    PathNode.LineTo(32.0f, 148.0f),
                    PathNode.CurveTo(32.0f, 150.20914f, 33.79086f, 152.0f, 36.0f, 152.0f),
                    PathNode.LineTo(88.0f, 152.0f),
                    PathNode.LineTo(88.0f, 99.31f),
                    PathNode.LineTo(38.83f, 50.14f),
                    PathNode.CurveTo(37.68211f, 48.990715f, 35.953175f, 48.649734f, 34.45488f, 49.27713f),
                    PathNode.CurveTo(32.95659f, 49.904526f, 31.986483f, 51.375706f, 32.0f, 53.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 104.0f),
                    PathNode.LineTo(168.0f, 104.0f),
                    PathNode.LineTo(168.0f, 156.69f),
                    PathNode.LineTo(217.17f, 205.86f),
                    PathNode.CurveTo(218.31789f, 207.00928f, 220.04683f, 207.35027f, 221.54512f, 206.72287f),
                    PathNode.CurveTo(223.04341f, 206.09547f, 224.01352f, 204.6243f, 224.0f, 203.0f),
                    PathNode.LineTo(224.0f, 108.0f),
                    PathNode.CurveTo(224.0f, 105.79086f, 222.20914f, 104.0f, 220.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 36.0f),
                    PathNode.CurveTo(152.0f, 33.79086f, 150.20914f, 32.0f, 148.0f, 32.0f),
                    PathNode.LineTo(53.0f, 32.0f),
                    PathNode.CurveTo(51.381172f, 31.998726f, 49.92118f, 32.97331f, 49.30151f, 34.468838f),
                    PathNode.CurveTo(48.68184f, 35.96437f, 49.02468f, 37.685955f, 50.17f, 38.83f),
                    PathNode.LineTo(99.31f, 88.0f),
                    PathNode.LineTo(152.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.49f, 81.17f),
                    PathNode.LineTo(174.83f, 43.51f),
                    PathNode.CurveTo(173.68596f, 42.364677f, 171.96437f, 42.02184f, 170.46884f, 42.641514f),
                    PathNode.CurveTo(168.97331f, 43.26118f, 167.99873f, 44.721172f, 168.0f, 46.34f),
                    PathNode.LineTo(168.0f, 88.0f),
                    PathNode.LineTo(209.66f, 88.0f),
                    PathNode.CurveTo(211.27881f, 88.001274f, 212.73882f, 87.02669f, 213.35849f, 85.53116f),
                    PathNode.CurveTo(213.97816f, 84.03563f, 213.63531f, 82.31405f, 212.49f, 81.17f),
                    PathNode.Close,
                    PathNode.MoveTo(156.69f, 168.0f),
                    PathNode.LineTo(104.0f, 168.0f),
                    PathNode.LineTo(104.0f, 220.0f),
                    PathNode.CurveTo(104.0f, 222.20914f, 105.79086f, 224.0f, 108.0f, 224.0f),
                    PathNode.LineTo(203.0f, 224.0f),
                    PathNode.CurveTo(204.61882f, 224.00127f, 206.07881f, 223.02669f, 206.69849f, 221.53116f),
                    PathNode.CurveTo(207.31816f, 220.03563f, 206.97533f, 218.31404f, 205.83f, 217.17f),
                    PathNode.Close,
                    PathNode.MoveTo(43.51f, 174.83f),
                    PathNode.LineTo(81.17f, 212.49f),
                    PathNode.CurveTo(82.31405f, 213.63531f, 84.03563f, 213.97816f, 85.53116f, 213.35849f),
                    PathNode.CurveTo(87.02669f, 212.73882f, 88.001274f, 211.27881f, 88.0f, 209.66f),
                    PathNode.LineTo(88.0f, 168.0f),
                    PathNode.LineTo(46.34f, 168.0f),
                    PathNode.CurveTo(44.721172f, 167.99873f, 43.26118f, 168.97331f, 42.641514f, 170.46884f),
                    PathNode.CurveTo(42.02184f, 171.96437f, 42.364677f, 173.68596f, 43.51f, 174.83f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _cubeTransparent!!
    }

private var _cubeTransparent: ImageVector? = null
