package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CameraSlash: ImageVector
    get() {
        if (_cameraSlash != null) return _cameraSlash!!
        _cameraSlash = phosphorBoldIcon(
            name = "CameraSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(56.88f, 31.93f),
                    PathNode.CurveTo(54.012154f, 28.697262f, 49.6276f, 27.25621f, 45.401115f, 28.157282f),
                    PathNode.CurveTo(41.174625f, 29.058353f, 37.759064f, 32.16236f, 36.459072f, 36.283665f),
                    PathNode.CurveTo(35.15908f, 40.404972f, 36.175465f, 44.906956f, 39.12f, 48.07f),
                    PathNode.LineTo(43.12f, 52.44f),
                    PathNode.CurveTo(29.750742f, 54.806286f, 20.005558f, 66.42295f, 20.0f, 80.0f),
                    PathNode.LineTo(20.0f, 192.0f),
                    PathNode.CurveTo(20.0f, 207.46397f, 32.536026f, 220.0f, 48.0f, 220.0f),
                    PathNode.LineTo(195.42f, 220.0f),
                    PathNode.LineTo(199.12f, 224.07f),
                    PathNode.CurveTo(203.5975f, 228.87978f, 211.1107f, 229.19368f, 215.9738f, 224.77417f),
                    PathNode.CurveTo(220.83693f, 220.35464f, 221.24089f, 212.84575f, 216.88f, 207.93f),
                    PathNode.Close,
                    PathNode.MoveTo(106.23f, 121.93f),
                    PathNode.LineTo(136.0f, 154.64f),
                    PathNode.CurveTo(126.88872f, 157.8663f, 116.73119f, 155.3121f, 110.22971f, 148.1598f),
                    PathNode.CurveTo(103.72823f, 141.00752f, 102.15172f, 130.6531f, 106.23f, 121.89f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 196.0f),
                    PathNode.CurveTo(45.79086f, 196.0f, 44.0f, 194.20914f, 44.0f, 192.0f),
                    PathNode.LineTo(44.0f, 80.0f),
                    PathNode.CurveTo(44.0f, 77.79086f, 45.79086f, 76.0f, 48.0f, 76.0f),
                    PathNode.LineTo(64.51f, 76.0f),
                    PathNode.LineTo(89.43f, 103.41f),
                    PathNode.CurveTo(75.81177f, 121.82415f, 77.09991f, 147.29437f, 92.50646f, 164.2406f),
                    PathNode.CurveTo(107.913025f, 181.18686f, 133.1458f, 184.88797f, 152.77f, 173.08f),
                    PathNode.LineTo(173.6f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 80.0f),
                    PathNode.LineTo(236.0f, 174.14f),
                    PathNode.CurveTo(236.0f, 180.76741f, 230.62741f, 186.14f, 224.0f, 186.14f),
                    PathNode.CurveTo(217.37259f, 186.14f, 212.0f, 180.76741f, 212.0f, 174.14f),
                    PathNode.LineTo(212.0f, 80.0f),
                    PathNode.CurveTo(212.0f, 77.79086f, 210.20914f, 76.0f, 208.0f, 76.0f),
                    PathNode.LineTo(176.0f, 76.0f),
                    PathNode.CurveTo(171.98299f, 76.00595f, 168.22943f, 74.00156f, 166.0f, 70.66f),
                    PathNode.LineTo(153.57f, 52.0f),
                    PathNode.LineTo(102.06f, 52.0f),
                    PathNode.CurveTo(95.43259f, 52.0f, 90.06f, 46.62742f, 90.06f, 40.0f),
                    PathNode.CurveTo(90.06f, 33.37258f, 95.43259f, 28.0f, 102.06f, 28.0f),
                    PathNode.LineTo(160.0f, 28.0f),
                    PathNode.CurveTo(164.01701f, 27.994045f, 167.77057f, 29.998442f, 170.0f, 33.34f),
                    PathNode.LineTo(182.42f, 52.0f),
                    PathNode.LineTo(208.0f, 52.0f),
                    PathNode.CurveTo(223.46397f, 52.0f, 236.0f, 64.536026f, 236.0f, 80.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _cameraSlash!!
    }

private var _cameraSlash: ImageVector? = null
