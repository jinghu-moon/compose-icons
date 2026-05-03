package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BowlFood: ImageVector
    get() {
        if (_bowlFood != null) return _bowlFood!!
        _bowlFood = phosphorLightIcon(
            name = "BowlFood",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 106.0f),
                    PathNode.LineTo(213.77f, 106.0f),
                    PathNode.CurveTo(210.47687f, 61.062634f, 173.05788f, 26.285467f, 128.0f, 26.285467f),
                    PathNode.CurveTo(82.94213f, 26.285467f, 45.523136f, 61.062634f, 42.23f, 106.0f),
                    PathNode.LineTo(32.0f, 106.0f),
                    PathNode.CurveTo(28.68629f, 106.0f, 26.0f, 108.686295f, 26.0f, 112.0f),
                    PathNode.CurveTo(26.072752f, 150.46472f, 47.705414f, 185.64098f, 82.0f, 203.06f),
                    PathNode.LineTo(82.0f, 208.0f),
                    PathNode.CurveTo(82.0f, 215.73198f, 88.26801f, 222.0f, 96.0f, 222.0f),
                    PathNode.LineTo(160.0f, 222.0f),
                    PathNode.CurveTo(167.73198f, 222.0f, 174.0f, 215.73198f, 174.0f, 208.0f),
                    PathNode.LineTo(174.0f, 203.06f),
                    PathNode.CurveTo(208.29459f, 185.64098f, 229.92725f, 150.46472f, 230.0f, 112.0f),
                    PathNode.CurveTo(230.0f, 108.686295f, 227.3137f, 106.0f, 224.0f, 106.0f),
                    PathNode.Close,
                    PathNode.MoveTo(174.24f, 54.29f),
                    PathNode.CurveTo(177.14343f, 56.61532f, 179.86781f, 59.155827f, 182.39f, 61.89f),
                    PathNode.CurveTo(159.88148f, 68.89601f, 141.24194f, 84.8454f, 130.84f, 106.0f),
                    PathNode.LineTo(97.34f, 106.0f),
                    PathNode.CurveTo(107.03739f, 75.11522f, 135.62866f, 54.07437f, 168.0f, 54.0f),
                    PathNode.CurveTo(170.08f, 54.0f, 172.17f, 54.11f, 174.24f, 54.29f),
                    PathNode.Close,
                    PathNode.MoveTo(190.3f, 72.14f),
                    PathNode.CurveTo(196.84157f, 82.3133f, 200.7711f, 93.9439f, 201.74f, 106.0f),
                    PathNode.LineTo(144.48f, 106.0f),
                    PathNode.CurveTo(154.61296f, 89.04207f, 171.11447f, 76.84782f, 190.3f, 72.14f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 38.0f),
                    PathNode.CurveTo(137.16658f, 37.98505f, 146.25548f, 39.680737f, 154.8f, 43.0f),
                    PathNode.CurveTo(121.08022f, 48.322807f, 93.664925f, 73.017746f, 84.86f, 106.0f),
                    PathNode.LineTo(54.26f, 106.0f),
                    PathNode.CurveTo(57.426163f, 67.61087f, 89.48056f, 38.05162f, 128.0f, 38.0f),
                    PathNode.Close,
                    PathNode.MoveTo(165.5f, 193.84f),
                    PathNode.CurveTo(163.36546f, 194.81836f, 161.99779f, 196.95193f, 162.0f, 199.3f),
                    PathNode.LineTo(162.0f, 208.0f),
                    PathNode.CurveTo(162.0f, 209.10457f, 161.10457f, 210.0f, 160.0f, 210.0f),
                    PathNode.LineTo(96.0f, 210.0f),
                    PathNode.CurveTo(94.89543f, 210.0f, 94.0f, 209.10457f, 94.0f, 208.0f),
                    PathNode.LineTo(94.0f, 199.3f),
                    PathNode.CurveTo(94.002205f, 196.95193f, 92.63453f, 194.81836f, 90.5f, 193.84f),
                    PathNode.CurveTo(60.51972f, 180.01416f, 40.467655f, 150.93674f, 38.2f, 118.0f),
                    PathNode.LineTo(217.8f, 118.0f),
                    PathNode.CurveTo(215.53235f, 150.93674f, 195.48027f, 180.01416f, 165.5f, 193.84f),
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
        return _bowlFood!!
    }

private var _bowlFood: ImageVector? = null
