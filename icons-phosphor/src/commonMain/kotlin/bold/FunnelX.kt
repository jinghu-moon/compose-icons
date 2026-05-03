package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FunnelX: ImageVector
    get() {
        if (_funnelX != null) return _funnelX!!
        _funnelX = phosphorBoldIcon(
            name = "FunnelX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.78f, 69.45f),
                    PathNode.CurveTo(236.10051f, 63.594704f, 237.46936f, 55.153404f, 234.27185f, 47.916817f),
                    PathNode.CurveTo(231.07434f, 40.68023f, 223.91153f, 36.008675f, 216.0f, 36.0f),
                    PathNode.LineTo(40.0f, 36.0f),
                    PathNode.CurveTo(32.08485f, 36.00077f, 24.914804f, 40.66938f, 21.712208f, 47.90768f),
                    PathNode.CurveTo(18.509615f, 55.14598f, 19.877062f, 63.59202f, 25.2f, 69.45f),
                    PathNode.LineTo(25.32f, 69.59f),
                    PathNode.LineTo(92.0f, 140.75f),
                    PathNode.LineTo(92.0f, 216.0f),
                    PathNode.CurveTo(91.997665f, 223.37617f, 96.05551f, 230.15488f, 102.55793f, 233.63718f),
                    PathNode.CurveTo(109.06035f, 237.1195f, 116.95167f, 236.7401f, 123.09f, 232.65f),
                    PathNode.LineTo(155.09f, 211.31f),
                    PathNode.CurveTo(160.6514f, 207.5995f, 163.991f, 201.35558f, 163.99f, 194.67f),
                    PathNode.LineTo(163.99f, 140.75f),
                    PathNode.LineTo(230.66f, 69.59f),
                    PathNode.Close,
                    PathNode.MoveTo(143.23f, 127.8f),
                    PathNode.CurveTo(141.15225f, 130.02472f, 139.99763f, 132.95592f, 140.0f, 136.0f),
                    PathNode.LineTo(140.0f, 192.52f),
                    PathNode.LineTo(116.0f, 208.52f),
                    PathNode.LineTo(116.0f, 136.0f),
                    PathNode.CurveTo(115.99966f, 132.95456f, 114.8414f, 130.02318f, 112.76f, 127.8f),
                    PathNode.LineTo(49.23f, 60.0f),
                    PathNode.LineTo(206.75f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(248.49f, 207.52f),
                    PathNode.CurveTo(253.18442f, 212.21442f, 253.18442f, 219.82558f, 248.49f, 224.52f),
                    PathNode.CurveTo(243.79558f, 229.21442f, 236.18442f, 229.21442f, 231.49f, 224.52f),
                    PathNode.LineTo(216.0f, 209.0f),
                    PathNode.LineTo(200.48f, 224.51f),
                    PathNode.CurveTo(195.78558f, 229.20442f, 188.17442f, 229.20442f, 183.48f, 224.51f),
                    PathNode.CurveTo(178.78558f, 219.81558f, 178.78558f, 212.20442f, 183.48f, 207.51f),
                    PathNode.LineTo(199.0f, 192.0f),
                    PathNode.LineTo(183.48f, 176.48f),
                    PathNode.CurveTo(178.78558f, 171.78558f, 178.78558f, 164.17442f, 183.48f, 159.48f),
                    PathNode.CurveTo(188.17442f, 154.78558f, 195.78558f, 154.78558f, 200.48f, 159.48f),
                    PathNode.LineTo(216.0f, 175.0f),
                    PathNode.LineTo(231.51f, 159.48f),
                    PathNode.CurveTo(236.20442f, 154.78558f, 243.81558f, 154.78558f, 248.51f, 159.48f),
                    PathNode.CurveTo(253.20442f, 164.17442f, 253.20442f, 171.78558f, 248.51f, 176.48f),
                    PathNode.LineTo(233.0f, 192.0f),
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
        return _funnelX!!
    }

private var _funnelX: ImageVector? = null
