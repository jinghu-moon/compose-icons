package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CameraSlash: ImageVector
    get() {
        if (_cameraSlash != null) return _cameraSlash!!
        _cameraSlash = phosphorFillIcon(
            name = "CameraSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 80.0f),
                    PathNode.LineTo(232.0f, 192.0f),
                    PathNode.CurveTo(231.99834f, 193.56079f, 231.84767f, 195.11786f, 231.55f, 196.65f),
                    PathNode.CurveTo(231.2865f, 198.1538f, 230.18996f, 199.37645f, 228.72362f, 199.80147f),
                    PathNode.CurveTo(227.25726f, 200.2265f, 225.67686f, 199.77977f, 224.65f, 198.65f),
                    PathNode.LineTo(86.0f, 46.08f),
                    PathNode.CurveTo(84.76458f, 44.722145f, 84.61202f, 42.697662f, 85.63f, 41.17f),
                    PathNode.LineTo(89.37f, 35.56f),
                    PathNode.CurveTo(90.849075f, 33.34309f, 93.334984f, 32.00827f, 96.0f, 32.0f),
                    PathNode.LineTo(160.0f, 32.0f),
                    PathNode.CurveTo(162.67564f, 31.998262f, 165.17502f, 33.334263f, 166.66f, 35.56f),
                    PathNode.LineTo(180.28f, 56.0f),
                    PathNode.LineTo(208.0f, 56.0f),
                    PathNode.CurveTo(221.25484f, 56.0f, 232.0f, 66.74516f, 232.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(213.92f, 210.62f),
                    PathNode.CurveTo(215.88303f, 212.7287f, 216.56061f, 215.73003f, 215.69395f, 218.47755f),
                    PathNode.CurveTo(214.82729f, 221.2251f, 212.55025f, 223.29443f, 209.73259f, 223.89514f),
                    PathNode.CurveTo(206.91493f, 224.49586f, 203.9919f, 223.53516f, 202.08f, 221.38f),
                    PathNode.LineTo(197.19f, 216.0f),
                    PathNode.LineTo(48.0f, 216.0f),
                    PathNode.CurveTo(34.745167f, 216.0f, 24.0f, 205.25484f, 24.0f, 192.0f),
                    PathNode.LineTo(24.0f, 80.0f),
                    PathNode.CurveTo(24.0f, 66.74516f, 34.745167f, 56.0f, 48.0f, 56.0f),
                    PathNode.LineTo(51.73f, 56.0f),
                    PathNode.LineTo(42.08f, 45.38f),
                    PathNode.CurveTo(40.116978f, 43.271305f, 39.439384f, 40.26998f, 40.30605f, 37.52244f),
                    PathNode.CurveTo(41.17271f, 34.774906f, 43.44975f, 32.70557f, 46.26741f, 32.104855f),
                    PathNode.CurveTo(49.085068f, 31.50414f, 52.008102f, 32.46484f, 53.92f, 34.62f),
                    PathNode.Close,
                    PathNode.MoveTo(148.0f, 161.92f),
                    PathNode.LineTo(100.12f, 109.24f),
                    PathNode.CurveTo(88.88985f, 123.04999f, 89.43814f, 142.99403f, 101.41007f, 156.16615f),
                    PathNode.CurveTo(113.382f, 169.33827f, 133.18315f, 171.78372f, 148.0f, 161.92f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _cameraSlash!!
    }

private var _cameraSlash: ImageVector? = null
