package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DeviceMobileSlash: ImageVector
    get() {
        if (_deviceMobileSlash != null) return _deviceMobileSlash!!
        _deviceMobileSlash = phosphorBoldIcon(
            name = "DeviceMobileSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.88f, 207.93f),
                    PathNode.LineTo(56.88f, 31.93f),
                    PathNode.CurveTo(54.012154f, 28.697262f, 49.6276f, 27.25621f, 45.401115f, 28.157282f),
                    PathNode.CurveTo(41.174625f, 29.058353f, 37.759064f, 32.16236f, 36.459072f, 36.283665f),
                    PathNode.CurveTo(35.15908f, 40.404972f, 36.175465f, 44.906956f, 39.12f, 48.07f),
                    PathNode.LineTo(52.0f, 62.24f),
                    PathNode.LineTo(52.0f, 216.0f),
                    PathNode.CurveTo(52.0f, 231.46397f, 64.536026f, 244.0f, 80.0f, 244.0f),
                    PathNode.LineTo(176.0f, 244.0f),
                    PathNode.CurveTo(187.4525f, 243.99962f, 197.7503f, 237.02484f, 202.0f, 226.39f),
                    PathNode.CurveTo(207.1201f, 229.3416f, 213.62695f, 228.12584f, 217.33586f, 223.5246f),
                    PathNode.CurveTo(221.04477f, 218.92336f, 220.85135f, 212.30673f, 216.88f, 207.93f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 220.0f),
                    PathNode.LineTo(80.0f, 220.0f),
                    PathNode.CurveTo(77.79086f, 220.0f, 76.0f, 218.20914f, 76.0f, 216.0f),
                    PathNode.LineTo(76.0f, 88.64f),
                    PathNode.LineTo(180.0f, 203.0f),
                    PathNode.LineTo(180.0f, 216.0f),
                    PathNode.CurveTo(180.0f, 218.20914f, 178.20914f, 220.0f, 176.0f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(75.51f, 24.0f),
                    PathNode.CurveTo(75.51f, 17.372583f, 80.88258f, 12.0f, 87.51f, 12.0f),
                    PathNode.LineTo(176.0f, 12.0f),
                    PathNode.CurveTo(191.46397f, 12.0f, 204.0f, 24.536028f, 204.0f, 40.0f),
                    PathNode.LineTo(204.0f, 138.94f),
                    PathNode.CurveTo(204.0f, 145.56741f, 198.62741f, 150.94f, 192.0f, 150.94f),
                    PathNode.CurveTo(185.37259f, 150.94f, 180.0f, 145.56741f, 180.0f, 138.94f),
                    PathNode.LineTo(180.0f, 40.0f),
                    PathNode.CurveTo(180.0f, 37.79086f, 178.20914f, 36.0f, 176.0f, 36.0f),
                    PathNode.LineTo(87.51f, 36.0f),
                    PathNode.CurveTo(80.88258f, 36.0f, 75.51f, 30.627417f, 75.51f, 24.0f),
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
        return _deviceMobileSlash!!
    }

private var _deviceMobileSlash: ImageVector? = null
