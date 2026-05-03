package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CameraRotate: ImageVector
    get() {
        if (_cameraRotate != null) return _cameraRotate!!
        _cameraRotate = phosphorBoldIcon(
            name = "CameraRotate",
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
                    PathNode.MoveTo(180.0f, 100.0f),
                    PathNode.LineTo(180.0f, 120.0f),
                    PathNode.CurveTo(180.0f, 126.62742f, 174.62741f, 132.0f, 168.0f, 132.0f),
                    PathNode.LineTo(148.0f, 132.0f),
                    PathNode.CurveTo(142.97299f, 131.99345f, 138.48286f, 128.85425f, 136.7506f, 124.13514f),
                    PathNode.CurveTo(135.01831f, 119.416016f, 136.41109f, 114.11735f, 140.24f, 110.86f),
                    PathNode.CurveTo(130.8206f, 106.29081f, 119.6412f, 107.343216f, 111.24f, 113.59f),
                    PathNode.CurveTo(105.94083f, 117.58025f, 98.410255f, 116.51917f, 94.42f, 111.22f),
                    PathNode.CurveTo(90.42974f, 105.92083f, 91.49083f, 98.39026f, 96.79f, 94.4f),
                    PathNode.CurveTo(114.84941f, 80.96752f, 139.47882f, 80.600945f, 157.93f, 93.49f),
                    PathNode.CurveTo(160.82f, 89.0309f, 166.29842f, 87.003395f, 171.39503f, 88.50675f),
                    PathNode.CurveTo(176.49165f, 90.0101f, 179.9927f, 94.68629f, 180.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(161.59f, 152.8f),
                    PathNode.CurveTo(165.57082f, 158.09671f, 164.50539f, 165.61742f, 159.21f, 169.6f),
                    PathNode.CurveTo(150.2305f, 176.33377f, 139.30386f, 179.96312f, 128.08f, 179.94f),
                    PathNode.CurveTo(117.34832f, 179.94579f, 106.87464f, 176.65005f, 98.08f, 170.5f),
                    PathNode.CurveTo(95.19446f, 174.96724f, 89.71284f, 177.00238f, 84.611176f, 175.50053f),
                    PathNode.CurveTo(79.509514f, 173.99867f, 76.00489f, 169.31813f, 76.0f, 164.0f),
                    PathNode.LineTo(76.0f, 144.0f),
                    PathNode.CurveTo(76.0f, 137.37259f, 81.37258f, 132.0f, 88.0f, 132.0f),
                    PathNode.LineTo(108.0f, 132.0f),
                    PathNode.CurveTo(113.02701f, 132.00655f, 117.51713f, 135.14574f, 119.249405f, 139.86487f),
                    PathNode.CurveTo(120.98168f, 144.58398f, 119.58891f, 149.88266f, 115.76f, 153.14f),
                    PathNode.CurveTo(125.17939f, 157.7092f, 136.3588f, 156.65678f, 144.76f, 150.41f),
                    PathNode.CurveTo(147.30684f, 148.4899f, 150.5133f, 147.66272f, 153.67116f, 148.11118f),
                    PathNode.CurveTo(156.82901f, 148.5596f, 159.6784f, 150.24677f, 161.59f, 152.8f),
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
        return _cameraRotate!!
    }

private var _cameraRotate: ImageVector? = null
