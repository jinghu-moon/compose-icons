package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Code: ImageVector
    get() {
        if (_code != null) return _code!!
        _code = phosphorLightIcon(
            name = "Code",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(67.84f, 92.61f),
                    PathNode.LineTo(25.37f, 128.0f),
                    PathNode.LineTo(67.84f, 163.39f),
                    PathNode.CurveTo(69.5068f, 164.75598f, 70.31301f, 166.91092f, 69.95211f, 169.0355f),
                    PathNode.CurveTo(69.59122f, 171.1601f, 68.118645f, 172.92795f, 66.094284f, 173.66692f),
                    PathNode.CurveTo(64.06992f, 174.40588f, 61.80475f, 174.00244f, 60.16f, 172.61f),
                    PathNode.LineTo(12.16f, 132.61f),
                    PathNode.CurveTo(10.791563f, 131.47005f, 10.000299f, 129.78105f, 10.000299f, 128.0f),
                    PathNode.CurveTo(10.000299f, 126.21895f, 10.791563f, 124.52996f, 12.16f, 123.39f),
                    PathNode.LineTo(60.16f, 83.39f),
                    PathNode.CurveTo(62.70851f, 81.30144f, 66.46443f, 81.65884f, 68.573296f, 84.190575f),
                    PathNode.CurveTo(70.68216f, 86.722305f, 70.3548f, 90.480965f, 67.84f, 92.61f),
                    PathNode.Close,
                    PathNode.MoveTo(243.84f, 123.39f),
                    PathNode.LineTo(195.84f, 83.39f),
                    PathNode.CurveTo(194.19525f, 81.99755f, 191.93008f, 81.59412f, 189.90572f, 82.33309f),
                    PathNode.CurveTo(187.88136f, 83.07206f, 186.40878f, 84.839905f, 186.04788f, 86.96449f),
                    PathNode.CurveTo(185.68698f, 89.08908f, 186.4932f, 91.24402f, 188.16f, 92.61f),
                    PathNode.LineTo(230.63f, 128.0f),
                    PathNode.LineTo(188.16f, 163.39f),
                    PathNode.CurveTo(186.4932f, 164.75598f, 185.68698f, 166.91092f, 186.04788f, 169.0355f),
                    PathNode.CurveTo(186.40878f, 171.1601f, 187.88136f, 172.92795f, 189.90572f, 173.66692f),
                    PathNode.CurveTo(191.93008f, 174.40588f, 194.19525f, 174.00244f, 195.84f, 172.61f),
                    PathNode.LineTo(243.84f, 132.61f),
                    PathNode.CurveTo(245.20844f, 131.47005f, 245.9997f, 129.78105f, 245.9997f, 128.0f),
                    PathNode.CurveTo(245.9997f, 126.21895f, 245.20844f, 124.52996f, 243.84f, 123.39f),
                    PathNode.Close,
                    PathNode.MoveTo(162.05f, 34.39f),
                    PathNode.CurveTo(160.55162f, 33.847015f, 158.89879f, 33.92247f, 157.45612f, 34.599716f),
                    PathNode.CurveTo(156.01344f, 35.276966f, 154.89949f, 36.50036f, 154.36f, 38.0f),
                    PathNode.LineTo(90.36f, 214.0f),
                    PathNode.CurveTo(89.26487f, 217.1144f, 90.89145f, 220.52841f, 94.0f, 221.64f),
                    PathNode.CurveTo(94.64209f, 221.87007f, 95.317986f, 221.99173f, 96.0f, 222.0f),
                    PathNode.CurveTo(98.52361f, 222.00046f, 100.77776f, 220.42174f, 101.64f, 218.05f),
                    PathNode.LineTo(165.64f, 42.05f),
                    PathNode.CurveTo(166.18398f, 40.55419f, 166.11131f, 38.903538f, 165.43803f, 37.46131f),
                    PathNode.CurveTo(164.76474f, 36.01908f, 163.54599f, 34.90347f, 162.05f, 34.36f),
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
        return _code!!
    }

private var _code: ImageVector? = null
