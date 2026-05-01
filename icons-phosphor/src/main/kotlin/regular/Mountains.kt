package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Mountains: ImageVector
    get() {
        if (_mountains != null) return _mountains!!
        _mountains = phosphorRegularIcon(
            name = "Mountains",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(164.0f, 80.0f),
                    PathNode.CurveTo(179.46397f, 80.0f, 192.0f, 67.463974f, 192.0f, 52.0f),
                    PathNode.CurveTo(192.0f, 36.53603f, 179.46397f, 24.0f, 164.0f, 24.0f),
                    PathNode.CurveTo(148.53603f, 24.0f, 136.0f, 36.53603f, 136.0f, 52.0f),
                    PathNode.CurveTo(136.0f, 67.463974f, 148.53603f, 80.0f, 164.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 40.0f),
                    PathNode.CurveTo(170.62741f, 40.0f, 176.0f, 45.37258f, 176.0f, 52.0f),
                    PathNode.CurveTo(176.0f, 58.62742f, 170.62741f, 64.0f, 164.0f, 64.0f),
                    PathNode.CurveTo(157.37259f, 64.0f, 152.0f, 58.62742f, 152.0f, 52.0f),
                    PathNode.CurveTo(152.0f, 45.37258f, 157.37259f, 40.0f, 164.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(254.88f, 195.92f),
                    PathNode.LineTo(200.32f, 103.84f),
                    PathNode.CurveTo(197.45634f, 98.958244f, 192.20961f, 95.97099f, 186.55f, 96.0f),
                    PathNode.LineTo(186.55f, 96.0f),
                    PathNode.CurveTo(180.89287f, 95.97045f, 175.64886f, 98.95831f, 172.79f, 103.84f),
                    PathNode.LineTo(146.63f, 148.0f),
                    PathNode.LineTo(101.79f, 71.9f),
                    PathNode.CurveTo(98.91505f, 67.01389f, 93.66916f, 64.01393f, 88.0f, 64.01393f),
                    PathNode.CurveTo(82.33084f, 64.01393f, 77.08495f, 67.01389f, 74.21f, 71.9f),
                    PathNode.LineTo(1.11f, 195.94f),
                    PathNode.CurveTo(-0.346506f, 198.4129f, -0.366763f, 201.47655f, 1.056914f, 203.96849f),
                    PathNode.CurveTo(2.480591f, 206.46045f, 5.130039f, 207.99886f, 8.0f, 208.0f),
                    PathNode.LineTo(248.0f, 208.0f),
                    PathNode.CurveTo(250.87444f, 207.9995f, 253.52765f, 206.45694f, 254.95021f, 203.9592f),
                    PathNode.CurveTo(256.37277f, 201.46144f, 256.34598f, 198.39252f, 254.88f, 195.92f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 80.0f),
                    PathNode.LineTo(111.57f, 120.0f),
                    PathNode.LineTo(64.43f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(22.0f, 192.0f),
                    PathNode.LineTo(55.0f, 136.0f),
                    PathNode.LineTo(121.0f, 136.0f),
                    PathNode.LineTo(139.74f, 167.8f),
                    PathNode.LineTo(139.74f, 167.8f),
                    PathNode.LineTo(154.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.57f, 192.0f),
                    PathNode.LineTo(155.91f, 163.72f),
                    PathNode.LineTo(186.55f, 112.0f),
                    PathNode.LineTo(234.0f, 192.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _mountains!!
    }

private var _mountains: ImageVector? = null
