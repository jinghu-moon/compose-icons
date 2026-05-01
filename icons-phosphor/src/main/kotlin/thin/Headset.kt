package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Headset: ImageVector
    get() {
        if (_headset != null) return _headset!!
        _headset = phosphorThinIcon(
            name = "Headset",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(199.05f, 57.48f),
                    PathNode.CurveTo(170.48193f, 28.733608f, 127.39609f, 20.056522f, 89.92783f, 35.503826f),
                    PathNode.CurveTo(52.459583f, 50.951126f, 28.007963f, 87.47237f, 28.0f, 128.0f),
                    PathNode.LineTo(28.0f, 184.0f),
                    PathNode.CurveTo(28.0f, 195.0457f, 36.954304f, 204.0f, 48.0f, 204.0f),
                    PathNode.LineTo(64.0f, 204.0f),
                    PathNode.CurveTo(75.04569f, 204.0f, 84.0f, 195.0457f, 84.0f, 184.0f),
                    PathNode.LineTo(84.0f, 144.0f),
                    PathNode.CurveTo(84.0f, 132.9543f, 75.04569f, 124.0f, 64.0f, 124.0f),
                    PathNode.LineTo(36.08f, 124.0f),
                    PathNode.CurveTo(38.22162f, 74.789314f, 78.74274f, 35.99625f, 128.0f, 36.0f),
                    PathNode.LineTo(128.7f, 36.0f),
                    PathNode.CurveTo(177.73772f, 36.24232f, 217.9163f, 75.00264f, 219.92f, 124.0f),
                    PathNode.LineTo(192.0f, 124.0f),
                    PathNode.CurveTo(180.9543f, 124.0f, 172.0f, 132.9543f, 172.0f, 144.0f),
                    PathNode.LineTo(172.0f, 184.0f),
                    PathNode.CurveTo(172.0f, 195.0457f, 180.9543f, 204.0f, 192.0f, 204.0f),
                    PathNode.LineTo(220.0f, 204.0f),
                    PathNode.LineTo(220.0f, 208.0f),
                    PathNode.CurveTo(220.0f, 223.46397f, 207.46397f, 236.0f, 192.0f, 236.0f),
                    PathNode.LineTo(136.0f, 236.0f),
                    PathNode.CurveTo(133.79086f, 236.0f, 132.0f, 237.79086f, 132.0f, 240.0f),
                    PathNode.CurveTo(132.0f, 242.20914f, 133.79086f, 244.0f, 136.0f, 244.0f),
                    PathNode.LineTo(192.0f, 244.0f),
                    PathNode.CurveTo(211.88223f, 244.0f, 228.0f, 227.88223f, 228.0f, 208.0f),
                    PathNode.LineTo(228.0f, 128.0f),
                    PathNode.CurveTo(228.10104f, 101.58093f, 217.68474f, 76.20762f, 199.05f, 57.48f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 132.0f),
                    PathNode.CurveTo(70.62742f, 132.0f, 76.0f, 137.37259f, 76.0f, 144.0f),
                    PathNode.LineTo(76.0f, 184.0f),
                    PathNode.CurveTo(76.0f, 190.62741f, 70.62742f, 196.0f, 64.0f, 196.0f),
                    PathNode.LineTo(48.0f, 196.0f),
                    PathNode.CurveTo(41.37258f, 196.0f, 36.0f, 190.62741f, 36.0f, 184.0f),
                    PathNode.LineTo(36.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 184.0f),
                    PathNode.LineTo(180.0f, 144.0f),
                    PathNode.CurveTo(180.0f, 137.37259f, 185.37259f, 132.0f, 192.0f, 132.0f),
                    PathNode.LineTo(220.0f, 132.0f),
                    PathNode.LineTo(220.0f, 196.0f),
                    PathNode.LineTo(192.0f, 196.0f),
                    PathNode.CurveTo(185.37259f, 196.0f, 180.0f, 190.62741f, 180.0f, 184.0f),
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
        return _headset!!
    }

private var _headset: ImageVector? = null
