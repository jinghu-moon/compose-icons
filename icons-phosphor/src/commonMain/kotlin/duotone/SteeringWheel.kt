package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SteeringWheel: ImageVector
    get() {
        if (_steeringWheel != null) return _steeringWheel!!
        _steeringWheel = phosphorDuotoneIcon(
            name = "SteeringWheel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.4f, 145.55f),
                    PathNode.CurveTo(221.48871f, 150.45918f, 220.19818f, 155.29033f, 218.54f, 160.0f),
                    PathNode.LineTo(165.54f, 160.0f),
                    PathNode.CurveTo(162.20209f, 159.99594f, 159.21245f, 162.06476f, 158.04f, 165.19f),
                    PathNode.LineTo(136.14f, 223.66f),
                    PathNode.CurveTo(133.45f, 223.88f, 130.73f, 224.0f, 127.99f, 224.0f),
                    PathNode.CurveTo(125.25f, 224.0f, 122.49f, 223.88f, 119.79f, 223.65f),
                    PathNode.LineTo(97.94f, 165.2f),
                    PathNode.CurveTo(96.77212f, 162.07425f, 93.786804f, 160.00166f, 90.45f, 160.0f),
                    PathNode.LineTo(37.45f, 160.0f),
                    PathNode.CurveTo(35.79182f, 155.29033f, 34.50129f, 150.45918f, 33.59f, 145.55f),
                    PathNode.CurveTo(57.83633f, 119.07226f, 92.087975f, 103.99443f, 127.99f, 103.99443f),
                    PathNode.CurveTo(163.89203f, 103.99443f, 198.14366f, 119.07226f, 222.39f, 145.55f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 152.0f),
                    PathNode.CurveTo(121.37258f, 152.0f, 116.0f, 146.62741f, 116.0f, 140.0f),
                    PathNode.CurveTo(116.0f, 133.37259f, 121.37258f, 128.0f, 128.0f, 128.0f),
                    PathNode.CurveTo(134.62741f, 128.0f, 140.0f, 133.37259f, 140.0f, 140.0f),
                    PathNode.CurveTo(140.0f, 146.62741f, 134.62741f, 152.0f, 128.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 128.0f),
                    PathNode.CurveTo(232.0f, 185.4376f, 185.4376f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(70.562386f, 232.0f, 24.0f, 185.4376f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 70.562386f, 70.562386f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(185.41248f, 24.060629f, 231.93938f, 70.58752f, 232.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 128.0f),
                    PathNode.LineTo(40.0f, 128.33f),
                    PathNode.CurveTo(90.748276f, 85.223366f, 165.25172f, 85.223366f, 216.0f, 128.33f),
                    PathNode.LineTo(216.0f, 128.0f),
                    PathNode.CurveTo(216.0f, 79.39894f, 176.60106f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(79.39894f, 40.0f, 40.0f, 79.39894f, 40.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(107.5f, 213.58f),
                    PathNode.LineTo(90.45f, 168.0f),
                    PathNode.LineTo(49.63f, 168.0f),
                    PathNode.CurveTo(61.36396f, 190.89409f, 82.49395f, 207.53664f, 107.5f, 213.58f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 216.0f),
                    PathNode.CurveTo(128.83f, 216.0f, 129.66f, 216.0f, 130.49f, 216.0f),
                    PathNode.LineTo(150.56f, 162.43f),
                    PathNode.CurveTo(152.91826f, 156.18858f, 158.88791f, 152.05359f, 165.56f, 152.04f),
                    PathNode.LineTo(212.68f, 152.04f),
                    PathNode.CurveTo(213.06f, 150.73f, 213.4f, 149.4f, 213.68f, 148.04f),
                    PathNode.CurveTo(191.11037f, 125.012794f, 160.22346f, 112.03709f, 127.98f, 112.03709f),
                    PathNode.CurveTo(95.73654f, 112.03709f, 64.84964f, 125.012794f, 42.28f, 148.04f),
                    PathNode.CurveTo(42.59f, 149.38f, 42.93f, 150.71f, 43.28f, 152.04f),
                    PathNode.LineTo(90.45f, 152.04f),
                    PathNode.CurveTo(97.12371f, 152.05803f, 103.09264f, 156.19649f, 105.45f, 162.44f),
                    PathNode.LineTo(125.45f, 216.0f),
                    PathNode.CurveTo(126.31f, 216.0f, 127.15f, 216.0f, 128.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(206.37f, 168.0f),
                    PathNode.LineTo(165.55f, 168.0f),
                    PathNode.LineTo(148.46f, 213.59f),
                    PathNode.CurveTo(173.48349f, 207.55608f, 194.63062f, 190.90787f, 206.37f, 168.0f),
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
        return _steeringWheel!!
    }

private var _steeringWheel: ImageVector? = null
