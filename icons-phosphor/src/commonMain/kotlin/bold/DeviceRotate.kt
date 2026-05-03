package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DeviceRotate: ImageVector
    get() {
        if (_deviceRotate != null) return _deviceRotate!!
        _deviceRotate = phosphorBoldIcon(
            name = "DeviceRotate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.49f, 224.49f),
                    PathNode.LineTo(184.49f, 248.49f),
                    PathNode.CurveTo(179.79558f, 253.18442f, 172.18442f, 253.18442f, 167.49f, 248.49f),
                    PathNode.CurveTo(162.79558f, 243.79558f, 162.79558f, 236.18442f, 167.49f, 231.49f),
                    PathNode.LineTo(171.0f, 228.0f),
                    PathNode.LineTo(80.0f, 228.0f),
                    PathNode.CurveTo(64.536026f, 228.0f, 52.0f, 215.46397f, 52.0f, 200.0f),
                    PathNode.LineTo(52.0f, 108.0f),
                    PathNode.CurveTo(52.0f, 101.37258f, 57.37258f, 96.0f, 64.0f, 96.0f),
                    PathNode.CurveTo(70.62742f, 96.0f, 76.0f, 101.37258f, 76.0f, 108.0f),
                    PathNode.LineTo(76.0f, 200.0f),
                    PathNode.CurveTo(76.0f, 202.20914f, 77.79086f, 204.0f, 80.0f, 204.0f),
                    PathNode.LineTo(171.0f, 204.0f),
                    PathNode.LineTo(167.48f, 200.49f),
                    PathNode.CurveTo(162.78558f, 195.79558f, 162.78558f, 188.18442f, 167.48f, 183.49f),
                    PathNode.CurveTo(172.17442f, 178.79558f, 179.78558f, 178.79558f, 184.48f, 183.49f),
                    PathNode.LineTo(208.48f, 207.49f),
                    PathNode.CurveTo(210.74078f, 209.7403f, 212.01259f, 212.79811f, 212.01447f, 215.98793f),
                    PathNode.CurveTo(212.01634f, 219.17773f, 210.74812f, 222.23705f, 208.49f, 224.49f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 76.0f),
                    PathNode.CurveTo(84.85648f, 76.00382f, 89.23646f, 73.08007f, 91.09547f, 68.59348f),
                    PathNode.CurveTo(92.95448f, 64.10689f, 91.925964f, 58.94214f, 88.49f, 55.51f),
                    PathNode.LineTo(85.0f, 52.0f),
                    PathNode.LineTo(176.0f, 52.0f),
                    PathNode.CurveTo(178.20914f, 52.0f, 180.0f, 53.79086f, 180.0f, 56.0f),
                    PathNode.LineTo(180.0f, 148.0f),
                    PathNode.CurveTo(180.0f, 154.62741f, 185.37259f, 160.0f, 192.0f, 160.0f),
                    PathNode.CurveTo(198.62741f, 160.0f, 204.0f, 154.62741f, 204.0f, 148.0f),
                    PathNode.LineTo(204.0f, 56.0f),
                    PathNode.CurveTo(204.0f, 40.53603f, 191.46397f, 28.0f, 176.0f, 28.0f),
                    PathNode.LineTo(85.0f, 28.0f),
                    PathNode.LineTo(88.52f, 24.48f),
                    PathNode.CurveTo(93.21442f, 19.78558f, 93.21442f, 12.17442f, 88.52f, 7.48f),
                    PathNode.CurveTo(83.82558f, 2.78558f, 76.214424f, 2.78558f, 71.52f, 7.48f),
                    PathNode.LineTo(47.52f, 31.48f),
                    PathNode.CurveTo(45.260548f, 33.73162f, 43.990536f, 36.790184f, 43.990536f, 39.98f),
                    PathNode.CurveTo(43.990536f, 43.16982f, 45.260548f, 46.22838f, 47.52f, 48.48f),
                    PathNode.LineTo(71.52f, 72.48f),
                    PathNode.CurveTo(73.76828f, 74.73108f, 76.818474f, 75.9972f, 80.0f, 76.0f),
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
        return _deviceRotate!!
    }

private var _deviceRotate: ImageVector? = null
