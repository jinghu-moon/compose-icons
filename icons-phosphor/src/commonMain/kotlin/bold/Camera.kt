package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Camera: ImageVector
    get() {
        if (_camera != null) return _camera!!
        _camera = phosphorBoldIcon(
            name = "Camera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 52.0f),
                    PathNode.LineTo(182.42f, 52.0f),
                    PathNode.LineTo(170.0f, 33.34f),
                    PathNode.CurveTo(167.77057f, 29.998442f, 164.01701f, 27.994045f, 160.0f, 28.0f),
                    PathNode.LineTo(96.0f, 28.0f),
                    PathNode.CurveTo(91.982994f, 27.994045f, 88.22944f, 29.998442f, 86.0f, 33.34f),
                    PathNode.LineTo(73.57f, 52.0f),
                    PathNode.LineTo(48.0f, 52.0f),
                    PathNode.CurveTo(32.536026f, 52.0f, 20.0f, 64.536026f, 20.0f, 80.0f),
                    PathNode.LineTo(20.0f, 192.0f),
                    PathNode.CurveTo(20.0f, 207.46397f, 32.536026f, 220.0f, 48.0f, 220.0f),
                    PathNode.LineTo(208.0f, 220.0f),
                    PathNode.CurveTo(223.46397f, 220.0f, 236.0f, 207.46397f, 236.0f, 192.0f),
                    PathNode.LineTo(236.0f, 80.0f),
                    PathNode.CurveTo(236.0f, 64.536026f, 223.46397f, 52.0f, 208.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 192.0f),
                    PathNode.CurveTo(212.0f, 194.20914f, 210.20914f, 196.0f, 208.0f, 196.0f),
                    PathNode.LineTo(48.0f, 196.0f),
                    PathNode.CurveTo(45.79086f, 196.0f, 44.0f, 194.20914f, 44.0f, 192.0f),
                    PathNode.LineTo(44.0f, 80.0f),
                    PathNode.CurveTo(44.0f, 77.79086f, 45.79086f, 76.0f, 48.0f, 76.0f),
                    PathNode.LineTo(80.0f, 76.0f),
                    PathNode.CurveTo(84.017006f, 76.00595f, 87.77056f, 74.00156f, 90.0f, 70.66f),
                    PathNode.LineTo(102.42f, 52.0f),
                    PathNode.LineTo(153.57f, 52.0f),
                    PathNode.LineTo(166.0f, 70.66f),
                    PathNode.CurveTo(168.22943f, 74.00156f, 171.98299f, 76.00595f, 176.0f, 76.0f),
                    PathNode.LineTo(208.0f, 76.0f),
                    PathNode.CurveTo(210.20914f, 76.0f, 212.0f, 77.79086f, 212.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 84.0f),
                    PathNode.CurveTo(101.49033f, 84.0f, 80.0f, 105.49033f, 80.0f, 132.0f),
                    PathNode.CurveTo(80.0f, 158.50967f, 101.49033f, 180.0f, 128.0f, 180.0f),
                    PathNode.CurveTo(154.50967f, 180.0f, 176.0f, 158.50967f, 176.0f, 132.0f),
                    PathNode.CurveTo(175.97244f, 105.501755f, 154.49825f, 84.02756f, 128.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 156.0f),
                    PathNode.CurveTo(114.74516f, 156.0f, 104.0f, 145.25484f, 104.0f, 132.0f),
                    PathNode.CurveTo(104.0f, 118.74516f, 114.74516f, 108.0f, 128.0f, 108.0f),
                    PathNode.CurveTo(141.25484f, 108.0f, 152.0f, 118.74516f, 152.0f, 132.0f),
                    PathNode.CurveTo(152.0f, 145.25484f, 141.25484f, 156.0f, 128.0f, 156.0f),
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
        return _camera!!
    }

private var _camera: ImageVector? = null
