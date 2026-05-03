package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Seatbelt: ImageVector
    get() {
        if (_seatbelt != null) return _seatbelt!!
        _seatbelt = phosphorRegularIcon(
            name = "Seatbelt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(172.0f, 68.0f),
                    PathNode.CurveTo(172.0f, 43.69947f, 152.30052f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(103.69947f, 24.0f, 84.0f, 43.69947f, 84.0f, 68.0f),
                    PathNode.CurveTo(84.0f, 92.30053f, 103.69947f, 112.0f, 128.0f, 112.0f),
                    PathNode.CurveTo(152.28911f, 111.97244f, 171.97244f, 92.28911f, 172.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 96.0f),
                    PathNode.CurveTo(112.536026f, 96.0f, 100.0f, 83.463974f, 100.0f, 68.0f),
                    PathNode.CurveTo(100.0f, 52.53603f, 112.536026f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(143.46397f, 40.0f, 156.0f, 52.53603f, 156.0f, 68.0f),
                    PathNode.CurveTo(156.0f, 83.463974f, 143.46397f, 96.0f, 128.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 224.0f),
                    PathNode.CurveTo(208.0f, 228.41827f, 204.41827f, 232.0f, 200.0f, 232.0f),
                    PathNode.LineTo(56.0f, 232.0f),
                    PathNode.CurveTo(52.67312f, 231.99937f, 49.69386f, 229.93985f, 48.51792f, 226.82773f),
                    PathNode.CurveTo(47.341984f, 223.7156f, 48.214836f, 220.20053f, 50.71f, 218.0f),
                    PathNode.LineTo(148.78f, 131.46f),
                    PathNode.CurveTo(130.92403f, 125.318275f, 111.26722f, 127.37518f, 95.06948f, 137.08032f),
                    PathNode.CurveTo(78.87175f, 146.78546f, 67.78649f, 163.14818f, 64.78f, 181.79f),
                    PathNode.CurveTo(63.907413f, 185.97542f, 59.89813f, 188.735f, 55.677048f, 188.05559f),
                    PathNode.CurveTo(51.455967f, 187.37614f, 48.515144f, 183.49783f, 49.0f, 179.25f),
                    PathNode.CurveTo(53.005f, 154.42226f, 68.451645f, 132.9229f, 90.70359f, 121.20504f),
                    PathNode.CurveTo(112.95553f, 109.48718f, 139.42236f, 108.91491f, 162.16f, 119.66f),
                    PathNode.LineTo(186.71f, 98.0f),
                    PathNode.CurveTo(190.03238f, 95.16258f, 195.01672f, 95.515495f, 197.90616f, 98.79273f),
                    PathNode.CurveTo(200.7956f, 102.06998f, 200.52129f, 107.059265f, 197.29f, 110.0f),
                    PathNode.LineTo(77.16f, 216.0f),
                    PathNode.LineTo(200.0f, 216.0f),
                    PathNode.CurveTo(204.41827f, 216.0f, 208.0f, 219.58173f, 208.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(193.73f, 146.38f),
                    PathNode.CurveTo(203.04796f, 159.76566f, 208.02928f, 175.69052f, 208.0f, 192.0f),
                    PathNode.CurveTo(208.0f, 196.41827f, 204.41827f, 200.0f, 200.0f, 200.0f),
                    PathNode.CurveTo(195.58173f, 200.0f, 192.0f, 196.41827f, 192.0f, 192.0f),
                    PathNode.CurveTo(192.0246f, 178.955f, 188.04166f, 166.21725f, 180.59f, 155.51f),
                    PathNode.CurveTo(178.06882f, 151.88148f, 178.96649f, 146.89618f, 182.595f, 144.37502f),
                    PathNode.CurveTo(186.22351f, 141.85382f, 191.20882f, 142.7515f, 193.73f, 146.38f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _seatbelt!!
    }

private var _seatbelt: ImageVector? = null
