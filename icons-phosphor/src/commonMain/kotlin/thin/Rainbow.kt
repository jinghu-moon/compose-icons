package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Rainbow: ImageVector
    get() {
        if (_rainbow != null) return _rainbow!!
        _rainbow = phosphorThinIcon(
            name = "Rainbow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(180.0f, 168.0f),
                    PathNode.LineTo(180.0f, 184.0f),
                    PathNode.CurveTo(180.0f, 186.20914f, 178.20914f, 188.0f, 176.0f, 188.0f),
                    PathNode.CurveTo(173.79086f, 188.0f, 172.0f, 186.20914f, 172.0f, 184.0f),
                    PathNode.LineTo(172.0f, 168.0f),
                    PathNode.CurveTo(172.0f, 143.69948f, 152.30052f, 124.0f, 128.0f, 124.0f),
                    PathNode.CurveTo(103.69947f, 124.0f, 84.0f, 143.69948f, 84.0f, 168.0f),
                    PathNode.LineTo(84.0f, 184.0f),
                    PathNode.CurveTo(84.0f, 186.20914f, 82.20914f, 188.0f, 80.0f, 188.0f),
                    PathNode.CurveTo(77.79086f, 188.0f, 76.0f, 186.20914f, 76.0f, 184.0f),
                    PathNode.LineTo(76.0f, 168.0f),
                    PathNode.CurveTo(76.0f, 139.28119f, 99.2812f, 116.0f, 128.0f, 116.0f),
                    PathNode.CurveTo(156.71881f, 116.0f, 180.0f, 139.28119f, 180.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 84.0f),
                    PathNode.CurveTo(81.62865f, 84.04961f, 44.049603f, 121.62865f, 44.0f, 168.0f),
                    PathNode.LineTo(44.0f, 184.0f),
                    PathNode.CurveTo(44.0f, 186.20914f, 45.79086f, 188.0f, 48.0f, 188.0f),
                    PathNode.CurveTo(50.20914f, 188.0f, 52.0f, 186.20914f, 52.0f, 184.0f),
                    PathNode.LineTo(52.0f, 168.0f),
                    PathNode.CurveTo(52.0f, 126.02636f, 86.02636f, 92.0f, 128.0f, 92.0f),
                    PathNode.CurveTo(169.97365f, 92.0f, 204.0f, 126.02636f, 204.0f, 168.0f),
                    PathNode.LineTo(204.0f, 184.0f),
                    PathNode.CurveTo(204.0f, 186.20914f, 205.79086f, 188.0f, 208.0f, 188.0f),
                    PathNode.CurveTo(210.20914f, 188.0f, 212.0f, 186.20914f, 212.0f, 184.0f),
                    PathNode.LineTo(212.0f, 168.0f),
                    PathNode.CurveTo(211.9504f, 121.62865f, 174.37135f, 84.04961f, 128.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 52.0f),
                    PathNode.CurveTo(63.96467f, 52.071644f, 12.071644f, 103.96467f, 12.0f, 168.0f),
                    PathNode.LineTo(12.0f, 184.0f),
                    PathNode.CurveTo(12.0f, 186.20914f, 13.790861f, 188.0f, 16.0f, 188.0f),
                    PathNode.CurveTo(18.209139f, 188.0f, 20.0f, 186.20914f, 20.0f, 184.0f),
                    PathNode.LineTo(20.0f, 168.0f),
                    PathNode.CurveTo(20.0f, 108.35325f, 68.35325f, 60.0f, 128.0f, 60.0f),
                    PathNode.CurveTo(187.64676f, 60.0f, 236.0f, 108.35325f, 236.0f, 168.0f),
                    PathNode.LineTo(236.0f, 184.0f),
                    PathNode.CurveTo(236.0f, 186.20914f, 237.79086f, 188.0f, 240.0f, 188.0f),
                    PathNode.CurveTo(242.20914f, 188.0f, 244.0f, 186.20914f, 244.0f, 184.0f),
                    PathNode.LineTo(244.0f, 168.0f),
                    PathNode.CurveTo(243.92834f, 103.96467f, 192.03534f, 52.071644f, 128.0f, 52.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _rainbow!!
    }

private var _rainbow: ImageVector? = null
