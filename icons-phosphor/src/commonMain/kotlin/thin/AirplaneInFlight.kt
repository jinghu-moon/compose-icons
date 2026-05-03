package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AirplaneInFlight: ImageVector
    get() {
        if (_airplaneInFlight != null) return _airplaneInFlight!!
        _airplaneInFlight = phosphorThinIcon(
            name = "AirplaneInFlight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 216.0f),
                    PathNode.CurveTo(220.0f, 218.20914f, 218.20914f, 220.0f, 216.0f, 220.0f),
                    PathNode.LineTo(72.0f, 220.0f),
                    PathNode.CurveTo(69.79086f, 220.0f, 68.0f, 218.20914f, 68.0f, 216.0f),
                    PathNode.CurveTo(68.0f, 213.79086f, 69.79086f, 212.0f, 72.0f, 212.0f),
                    PathNode.LineTo(216.0f, 212.0f),
                    PathNode.CurveTo(218.20914f, 212.0f, 220.0f, 213.79086f, 220.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(244.0f, 136.0f),
                    PathNode.LineTo(244.0f, 160.0f),
                    PathNode.CurveTo(244.0f, 162.20914f, 242.20914f, 164.0f, 240.0f, 164.0f),
                    PathNode.LineTo(61.06f, 164.0f),
                    PathNode.CurveTo(45.138523f, 164.06825f, 31.08631f, 153.6106f, 26.58f, 138.34f),
                    PathNode.LineTo(12.52f, 91.45f),
                    PathNode.CurveTo(11.430012f, 87.81881f, 12.120113f, 83.88609f, 14.381292f, 80.84296f),
                    PathNode.CurveTo(16.642471f, 77.79981f, 20.208748f, 76.00422f, 24.0f, 76.0f),
                    PathNode.LineTo(32.0f, 76.0f),
                    PathNode.CurveTo(33.061184f, 75.99917f, 34.079212f, 76.42004f, 34.83f, 77.17f),
                    PathNode.LineTo(57.66f, 100.0f),
                    PathNode.LineTo(87.36f, 100.0f),
                    PathNode.LineTo(76.63f, 67.79f),
                    PathNode.CurveTo(75.41288f, 64.13359f, 76.02584f, 60.115112f, 78.27771f, 56.987846f),
                    PathNode.CurveTo(80.52958f, 53.86058f, 84.14634f, 52.005062f, 88.0f, 52.0f),
                    PathNode.LineTo(96.0f, 52.0f),
                    PathNode.CurveTo(97.06119f, 51.999165f, 98.07921f, 52.420044f, 98.83f, 53.17f),
                    PathNode.LineTo(145.66f, 100.0f),
                    PathNode.LineTo(208.0f, 100.0f),
                    PathNode.CurveTo(227.88223f, 100.0f, 244.0f, 116.11775f, 244.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 136.0f),
                    PathNode.CurveTo(236.0f, 120.536026f, 223.46397f, 108.0f, 208.0f, 108.0f),
                    PathNode.LineTo(144.0f, 108.0f),
                    PathNode.CurveTo(142.93881f, 108.00083f, 141.92079f, 107.57996f, 141.17f, 106.83f),
                    PathNode.LineTo(94.35f, 60.0f),
                    PathNode.LineTo(88.0f, 60.0f),
                    PathNode.CurveTo(86.7145f, 59.998833f, 85.50677f, 60.615562f, 84.753975f, 61.657585f),
                    PathNode.CurveTo(84.00118f, 62.69961f, 83.79507f, 64.03994f, 84.2f, 65.26f),
                    PathNode.LineTo(96.7f, 102.74f),
                    PathNode.CurveTo(97.10438f, 103.95839f, 96.899414f, 105.29683f, 96.14896f, 106.33836f),
                    PathNode.CurveTo(95.39849f, 107.3799f, 94.19374f, 107.997955f, 92.91f, 108.0f),
                    PathNode.LineTo(56.0f, 108.0f),
                    PathNode.CurveTo(54.94228f, 107.998184f, 53.928337f, 107.57751f, 53.18f, 106.83f),
                    PathNode.LineTo(30.35f, 84.0f),
                    PathNode.LineTo(24.0f, 84.0f),
                    PathNode.CurveTo(22.735662f, 84.00036f, 21.545925f, 84.59845f, 20.791426f, 85.61298f),
                    PathNode.CurveTo(20.036928f, 86.62752f, 19.806503f, 87.93904f, 20.17f, 89.15f),
                    PathNode.LineTo(34.24f, 136.05f),
                    PathNode.CurveTo(37.74606f, 147.9262f, 48.67723f, 156.05731f, 61.06f, 156.0f),
                    PathNode.LineTo(236.0f, 156.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _airplaneInFlight!!
    }

private var _airplaneInFlight: ImageVector? = null
