package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BluetoothConnected: ImageVector
    get() {
        if (_bluetoothConnected != null) return _bluetoothConnected!!
        _bluetoothConnected = phosphorThinIcon(
            name = "BluetoothConnected",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(194.4f, 172.8f),
                    PathNode.LineTo(134.67f, 128.0f),
                    PathNode.LineTo(194.4f, 83.2f),
                    PathNode.CurveTo(195.40723f, 82.44459f, 196.0f, 81.259026f, 196.0f, 80.0f),
                    PathNode.CurveTo(196.0f, 78.740974f, 195.40723f, 77.55541f, 194.4f, 76.8f),
                    PathNode.LineTo(130.4f, 28.8f),
                    PathNode.CurveTo(129.18793f, 27.890947f, 127.56629f, 27.744722f, 126.21114f, 28.42229f),
                    PathNode.CurveTo(124.85601f, 29.09986f, 124.0f, 30.48491f, 124.0f, 32.0f),
                    PathNode.LineTo(124.0f, 120.0f),
                    PathNode.LineTo(66.4f, 76.8f),
                    PathNode.CurveTo(64.63269f, 75.47452f, 62.125484f, 75.83269f, 60.8f, 77.6f),
                    PathNode.CurveTo(59.474518f, 79.36731f, 59.832687f, 81.87452f, 61.6f, 83.2f),
                    PathNode.LineTo(121.33f, 128.0f),
                    PathNode.LineTo(61.6f, 172.8f),
                    PathNode.CurveTo(59.832687f, 174.12549f, 59.474518f, 176.63269f, 60.8f, 178.4f),
                    PathNode.CurveTo(62.125484f, 180.16731f, 64.63269f, 180.52548f, 66.4f, 179.2f),
                    PathNode.LineTo(124.0f, 136.0f),
                    PathNode.LineTo(124.0f, 224.0f),
                    PathNode.CurveTo(124.0f, 225.51509f, 124.85601f, 226.90015f, 126.21114f, 227.57771f),
                    PathNode.CurveTo(127.56629f, 228.25528f, 129.18793f, 228.10905f, 130.4f, 227.2f),
                    PathNode.LineTo(194.4f, 179.2f),
                    PathNode.CurveTo(195.40723f, 178.44458f, 196.0f, 177.25903f, 196.0f, 176.0f),
                    PathNode.CurveTo(196.0f, 174.74097f, 195.40723f, 173.55542f, 194.4f, 172.8f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 40.0f),
                    PathNode.LineTo(185.33f, 80.0f),
                    PathNode.LineTo(132.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 216.0f),
                    PathNode.LineTo(132.0f, 136.0f),
                    PathNode.LineTo(185.33f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 136.0f),
                    PathNode.CurveTo(55.581722f, 136.0f, 52.0f, 132.41827f, 52.0f, 128.0f),
                    PathNode.CurveTo(52.0f, 123.58172f, 55.581722f, 120.0f, 60.0f, 120.0f),
                    PathNode.CurveTo(64.41828f, 120.0f, 68.0f, 123.58172f, 68.0f, 128.0f),
                    PathNode.CurveTo(68.0f, 132.41827f, 64.41828f, 136.0f, 60.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 128.0f),
                    PathNode.CurveTo(212.0f, 132.41827f, 208.41827f, 136.0f, 204.0f, 136.0f),
                    PathNode.CurveTo(199.58173f, 136.0f, 196.0f, 132.41827f, 196.0f, 128.0f),
                    PathNode.CurveTo(196.0f, 123.58172f, 199.58173f, 120.0f, 204.0f, 120.0f),
                    PathNode.CurveTo(208.41827f, 120.0f, 212.0f, 123.58172f, 212.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _bluetoothConnected!!
    }

private var _bluetoothConnected: ImageVector? = null
