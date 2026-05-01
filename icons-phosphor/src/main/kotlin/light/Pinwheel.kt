package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Pinwheel: ImageVector
    get() {
        if (_pinwheel != null) return _pinwheel!!
        _pinwheel = phosphorLightIcon(
            name = "Pinwheel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.24f, 219.76f),
                    PathNode.LineTo(177.38f, 168.9f),
                    PathNode.CurveTo(179.56412f, 168.38078f, 181.71748f, 167.73979f, 183.83f, 166.98f),
                    PathNode.CurveTo(213.9291f, 156.0222f, 229.44669f, 122.739494f, 218.49f, 92.64f),
                    PathNode.CurveTo(217.35419f, 89.52867f, 213.91208f, 87.92624f, 210.8f, 89.06f),
                    PathNode.LineTo(161.5f, 107.0f),
                    PathNode.CurveTo(162.81085f, 104.921f, 163.99307f, 102.763626f, 165.04f, 100.54f),
                    PathNode.CurveTo(174.94426f, 79.281f, 171.07083f, 54.14947f, 155.22508f, 36.859234f),
                    PathNode.CurveTo(139.37935f, 19.568998f, 114.68023f, 13.523283f, 92.64f, 21.54f),
                    PathNode.CurveTo(89.52867f, 22.675816f, 87.92624f, 26.117926f, 89.06f, 29.23f),
                    PathNode.LineTo(107.0f, 78.52f),
                    PathNode.CurveTo(104.920494f, 77.21598f, 102.76312f, 76.04045f, 100.54f, 75.0f),
                    PathNode.CurveTo(79.281f, 65.09573f, 54.14947f, 68.96918f, 36.859234f, 84.81491f),
                    PathNode.CurveTo(19.568998f, 100.660645f, 13.523283f, 125.35977f, 21.54f, 147.4f),
                    PathNode.CurveTo(22.084967f, 148.89273f, 23.199842f, 150.1083f, 24.64f, 150.78f),
                    PathNode.CurveTo(26.082867f, 151.453f, 27.734062f, 151.52495f, 29.23f, 150.98f),
                    PathNode.LineTo(78.52f, 133.0f),
                    PathNode.CurveTo(77.2111f, 135.08356f, 76.035416f, 137.24788f, 75.0f, 139.48f),
                    PathNode.CurveTo(66.65945f, 157.4349f, 68.04267f, 178.4022f, 78.66966f, 195.10582f),
                    PathNode.CurveTo(89.29665f, 211.80943f, 107.70251f, 221.94678f, 127.5f, 222.0f),
                    PathNode.CurveTo(134.28163f, 221.98955f, 141.00934f, 220.79494f, 147.38f, 218.47f),
                    PathNode.CurveTo(150.49655f, 217.35039f, 152.11671f, 213.91757f, 151.0f, 210.8f),
                    PathNode.LineTo(133.0f, 161.5f),
                    PathNode.CurveTo(141.69687f, 167.01328f, 151.70868f, 170.10312f, 162.0f, 170.45f),
                    PathNode.LineTo(219.79f, 228.24f),
                    PathNode.CurveTo(222.15408f, 230.44287f, 225.83807f, 230.37787f, 228.12297f, 228.09297f),
                    PathNode.CurveTo(230.40787f, 225.80807f, 230.47287f, 222.12408f, 228.27f, 219.76f),
                    PathNode.Close,
                    PathNode.MoveTo(102.52f, 31.11f),
                    PathNode.CurveTo(125.06565f, 26.09474f, 147.83464f, 38.575516f, 155.7343f, 60.27931f),
                    PathNode.CurveTo(163.63394f, 81.9831f, 154.21461f, 106.17965f, 133.72f, 116.83f),
                    PathNode.Close,
                    PathNode.MoveTo(31.11f, 137.5f),
                    PathNode.CurveTo(26.09474f, 114.95435f, 38.575516f, 92.18536f, 60.27931f, 84.285706f),
                    PathNode.CurveTo(81.9831f, 76.386055f, 106.17965f, 85.80539f, 116.83f, 106.3f),
                    PathNode.Close,
                    PathNode.MoveTo(137.5f, 208.9f),
                    PathNode.CurveTo(114.95435f, 213.91527f, 92.18536f, 201.43448f, 84.285706f, 179.7307f),
                    PathNode.CurveTo(76.386055f, 158.0269f, 85.80539f, 133.83035f, 106.3f, 123.18f),
                    PathNode.Close,
                    PathNode.MoveTo(164.45f, 158.49f),
                    PathNode.CurveTo(147.13092f, 158.64737f, 131.18692f, 149.07788f, 123.18f, 133.72f),
                    PathNode.LineTo(208.9f, 102.52f),
                    PathNode.CurveTo(211.89217f, 116.05314f, 208.63121f, 130.21422f, 200.02153f, 141.07573f),
                    PathNode.CurveTo(191.41185f, 151.93723f, 178.36887f, 158.34431f, 164.51f, 158.52f),
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
        return _pinwheel!!
    }

private var _pinwheel: ImageVector? = null
