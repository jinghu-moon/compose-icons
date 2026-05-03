package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UserSound: ImageVector
    get() {
        if (_userSound != null) return _userSound!!
        _userSound = phosphorLightIcon(
            name = "UserSound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(139.0f, 166.26f),
                    PathNode.CurveTo(165.74763f, 152.02927f, 179.37091f, 121.41513f, 172.03748f, 92.01835f),
                    PathNode.CurveTo(164.70404f, 62.62157f, 138.29768f, 41.993374f, 108.0f, 41.993374f),
                    PathNode.CurveTo(77.70231f, 41.993374f, 51.295948f, 62.62157f, 43.96252f, 92.01835f),
                    PathNode.CurveTo(36.629093f, 121.41513f, 50.25236f, 152.02927f, 77.0f, 166.26f),
                    PathNode.CurveTo(55.0f, 172.48f, 35.12f, 185.41f, 19.39f, 204.14f),
                    PathNode.CurveTo(17.377563f, 206.68399f, 17.751375f, 210.36678f, 20.23394f, 212.45451f),
                    PathNode.CurveTo(22.716505f, 214.54225f, 26.40884f, 214.27892f, 28.57f, 211.86f),
                    PathNode.CurveTo(49.11f, 187.45f, 77.31f, 174.0f, 108.0f, 174.0f),
                    PathNode.CurveTo(138.69f, 174.0f, 166.9f, 187.45f, 187.41f, 211.86f),
                    PathNode.CurveTo(188.7665f, 213.5748f, 190.94841f, 214.41594f, 193.10495f, 214.05544f),
                    PathNode.CurveTo(195.26149f, 213.69493f, 197.0512f, 212.18985f, 197.77621f, 210.12709f),
                    PathNode.CurveTo(198.50122f, 208.06433f, 198.04675f, 205.7705f, 196.59f, 204.14f),
                    PathNode.CurveTo(180.86f, 185.41f, 161.0f, 172.48f, 139.0f, 166.26f),
                    PathNode.Close,
                    PathNode.MoveTo(54.0f, 108.0f),
                    PathNode.CurveTo(54.0f, 78.17662f, 78.17662f, 54.0f, 108.0f, 54.0f),
                    PathNode.CurveTo(137.82338f, 54.0f, 162.0f, 78.17662f, 162.0f, 108.0f),
                    PathNode.CurveTo(162.0f, 137.82338f, 137.82338f, 162.0f, 108.0f, 162.0f),
                    PathNode.CurveTo(78.19033f, 161.96693f, 54.033066f, 137.80966f, 54.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(205.52f, 66.39f),
                    PathNode.CurveTo(216.8263f, 92.97794f, 216.8263f, 123.02206f, 205.52f, 149.61f),
                    PathNode.CurveTo(204.07095f, 152.39398f, 200.72122f, 153.59084f, 197.83607f, 152.35547f),
                    PathNode.CurveTo(194.95091f, 151.1201f, 193.50531f, 147.86996f, 194.52f, 144.9f),
                    PathNode.CurveTo(204.54697f, 121.32175f, 204.54697f, 94.67825f, 194.52f, 71.1f),
                    PathNode.CurveTo(193.50531f, 68.13004f, 194.95091f, 64.8799f, 197.83607f, 63.64453f),
                    PathNode.CurveTo(200.72122f, 62.409157f, 204.07095f, 63.60602f, 205.52f, 66.39f),
                    PathNode.Close,
                    PathNode.MoveTo(246.0f, 108.0f),
                    PathNode.CurveTo(246.03674f, 126.69171f, 242.25264f, 145.1937f, 234.88f, 162.37f),
                    PathNode.CurveTo(233.44992f, 165.20137f, 230.06306f, 166.43042f, 227.14998f, 165.17516f),
                    PathNode.CurveTo(224.2369f, 163.91988f, 222.80417f, 160.61401f, 223.88f, 157.63f),
                    PathNode.CurveTo(237.41353f, 125.92725f, 237.41353f, 90.07275f, 223.88f, 58.37f),
                    PathNode.CurveTo(222.80417f, 55.385983f, 224.2369f, 52.080124f, 227.14998f, 50.824852f),
                    PathNode.CurveTo(230.06306f, 49.569576f, 233.44992f, 50.798634f, 234.88f, 53.63f),
                    PathNode.CurveTo(242.25264f, 70.80631f, 246.03674f, 89.30829f, 246.0f, 108.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _userSound!!
    }

private var _userSound: ImageVector? = null
