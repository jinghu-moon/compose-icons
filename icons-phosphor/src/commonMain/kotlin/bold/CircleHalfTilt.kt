package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CircleHalfTilt: ImageVector
    get() {
        if (_circleHalfTilt != null) return _circleHalfTilt!!
        _circleHalfTilt = phosphorBoldIcon(
            name = "CircleHalfTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.37f, 51.6f),
                    PathNode.CurveTo(167.92007f, 15.125355f, 110.77971f, 9.480288f, 67.897194f, 38.117447f),
                    PathNode.CurveTo(25.014675f, 66.7546f, 8.334971f, 121.697075f, 28.059746f, 169.34087f),
                    PathNode.CurveTo(47.784523f, 216.98465f, 98.419426f, 244.05852f, 148.99506f, 234.00351f),
                    PathNode.CurveTo(199.57068f, 223.94852f, 235.99915f, 179.56546f, 236.0f, 128.0f),
                    PathNode.CurveTo(235.99937f, 99.34769f, 224.6226f, 71.86789f, 204.37f, 51.6f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 197.0f),
                    PathNode.CurveTo(171.00241f, 200.49254f, 165.63704f, 203.42673f, 160.0f, 205.75f),
                    PathNode.LineTo(160.0f, 113.0f),
                    PathNode.LineTo(176.0f, 97.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.6f, 68.58f),
                    PathNode.CurveTo(98.14051f, 39.08564f, 144.84723f, 35.73059f, 178.3f, 60.7f),
                    PathNode.LineTo(60.72f, 178.33f),
                    PathNode.CurveTo(35.721405f, 144.86778f, 39.077328f, 98.12761f, 68.6f, 68.58f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 177.0f),
                    PathNode.LineTo(96.0f, 205.69f),
                    PathNode.CurveTo(89.486855f, 203.01102f, 83.338196f, 199.52005f, 77.7f, 195.3f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 211.62f),
                    PathNode.LineTo(120.0f, 153.0f),
                    PathNode.LineTo(136.0f, 137.0f),
                    PathNode.LineTo(136.0f, 211.64f),
                    PathNode.CurveTo(130.678f, 212.13834f, 125.32075f, 212.13164f, 120.0f, 211.62f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 171.35f),
                    PathNode.LineTo(200.0f, 84.65f),
                    PathNode.CurveTo(216.0135f, 111.331726f, 216.0135f, 144.66827f, 200.0f, 171.35f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _circleHalfTilt!!
    }

private var _circleHalfTilt: ImageVector? = null
