package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.UmbrellaSimple: ImageVector
    get() {
        if (_umbrellaSimple != null) return _umbrellaSimple!!
        _umbrellaSimple = phosphorThinIcon(
            name = "UmbrellaSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 127.0f),
                    PathNode.CurveTo(232.41039f, 85.79931f, 205.6985f, 50.227608f, 167.1331f, 35.291325f),
                    PathNode.CurveTo(128.5677f, 20.355042f, 84.86439f, 28.655098f, 54.46f, 56.69f),
                    PathNode.CurveTo(34.545303f, 74.96302f, 22.242231f, 100.06544f, 20.0f, 127.0f),
                    PathNode.CurveTo(19.719671f, 130.352f, 20.85908f, 133.66777f, 23.140614f, 136.13943f),
                    PathNode.CurveTo(25.422148f, 138.6111f, 28.636316f, 140.0117f, 32.0f, 140.0f),
                    PathNode.LineTo(124.0f, 140.0f),
                    PathNode.LineTo(124.0f, 200.0f),
                    PathNode.CurveTo(124.0f, 215.46397f, 136.53603f, 228.0f, 152.0f, 228.0f),
                    PathNode.CurveTo(167.46397f, 228.0f, 180.0f, 215.46397f, 180.0f, 200.0f),
                    PathNode.CurveTo(180.0f, 197.79086f, 178.20914f, 196.0f, 176.0f, 196.0f),
                    PathNode.CurveTo(173.79086f, 196.0f, 172.0f, 197.79086f, 172.0f, 200.0f),
                    PathNode.CurveTo(172.0f, 211.0457f, 163.0457f, 220.0f, 152.0f, 220.0f),
                    PathNode.CurveTo(140.9543f, 220.0f, 132.0f, 211.0457f, 132.0f, 200.0f),
                    PathNode.LineTo(132.0f, 140.0f),
                    PathNode.LineTo(224.0f, 140.0f),
                    PathNode.CurveTo(227.36368f, 140.0117f, 230.57785f, 138.6111f, 232.85939f, 136.13943f),
                    PathNode.CurveTo(235.14091f, 133.66777f, 236.28033f, 130.352f, 236.0f, 127.0f),
                    PathNode.Close,
                    PathNode.MoveTo(227.0f, 130.74f),
                    PathNode.CurveTo(226.23085f, 131.5809f, 225.13953f, 132.0538f, 224.0f, 132.04f),
                    PathNode.LineTo(32.0f, 132.04f),
                    PathNode.CurveTo(30.86989f, 132.0451f, 29.790352f, 131.57193f, 29.028255f, 130.73744f),
                    PathNode.CurveTo(28.26616f, 129.90294f, 27.892628f, 128.785f, 28.0f, 127.66f),
                    PathNode.CurveTo(31.37292f, 89.535774f, 56.121624f, 56.642803f, 91.819f, 42.83953f),
                    PathNode.CurveTo(127.51638f, 29.03626f, 167.95605f, 36.72254f, 196.1f, 62.66f),
                    PathNode.CurveTo(214.50934f, 79.55659f, 225.88954f, 102.75963f, 227.98f, 127.66f),
                    PathNode.CurveTo(228.07074f, 128.7756f, 227.68991f, 129.8782f, 226.93f, 130.7f),
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
        return _umbrellaSimple!!
    }

private var _umbrellaSimple: ImageVector? = null
