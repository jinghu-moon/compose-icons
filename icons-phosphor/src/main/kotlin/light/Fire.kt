package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Fire: ImageVector
    get() {
        if (_fire != null) return _fire!!
        _fire = phosphorLightIcon(
            name = "Fire",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(181.92f, 153.0f),
                    PathNode.CurveTo(177.82224f, 175.8982f, 159.8982f, 193.82224f, 137.0f, 197.92f),
                    PathNode.CurveTo(136.669f, 197.97055f, 136.33482f, 197.99728f, 136.0f, 198.0f),
                    PathNode.CurveTo(132.87164f, 198.01239f, 130.25877f, 195.61908f, 129.99724f, 192.50165f),
                    PathNode.CurveTo(129.73572f, 189.38423f, 131.91331f, 186.589f, 135.0f, 186.08f),
                    PathNode.CurveTo(152.38f, 183.16f, 167.13f, 168.4f, 170.08f, 151.0f),
                    PathNode.CurveTo(170.63228f, 147.73047f, 173.73047f, 145.52771f, 177.0f, 146.08f),
                    PathNode.CurveTo(180.26953f, 146.63228f, 182.47229f, 149.73047f, 181.92f, 153.0f),
                    PathNode.Close,
                    PathNode.MoveTo(214.0f, 144.0f),
                    PathNode.CurveTo(214.0f, 191.49649f, 175.49649f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(80.50351f, 230.0f, 42.0f, 191.49649f, 42.0f, 144.0f),
                    PathNode.CurveTo(42.0f, 116.53f, 52.85f, 88.39f, 74.25f, 60.36f),
                    PathNode.CurveTo(75.289604f, 58.978985f, 76.87433f, 58.113434f, 78.598145f, 57.985107f),
                    PathNode.CurveTo(80.32195f, 57.85678f, 82.017365f, 58.47814f, 83.25f, 59.69f),
                    PathNode.LineTo(109.59f, 85.25f),
                    PathNode.LineTo(132.68f, 21.94f),
                    PathNode.CurveTo(133.34866f, 20.106665f, 134.86717f, 18.713049f, 136.75102f, 18.203793f),
                    PathNode.CurveTo(138.63487f, 17.694536f, 140.6487f, 18.133265f, 142.15f, 19.38f),
                    PathNode.CurveTo(163.72f, 37.33f, 214.0f, 85.4f, 214.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(202.0f, 144.0f),
                    PathNode.CurveTo(202.0f, 95.6f, 163.35f, 54.16f, 140.93f, 34.2f),
                    PathNode.LineTo(117.64f, 98.06f),
                    PathNode.CurveTo(116.943825f, 99.97237f, 115.32572f, 101.40147f, 113.34199f, 101.85599f),
                    PathNode.CurveTo(111.35825f, 102.31051f, 109.27935f, 101.728485f, 107.82f, 100.31f),
                    PathNode.LineTo(79.82f, 73.09f),
                    PathNode.CurveTo(62.67f, 97.13f, 54.0f, 121.0f, 54.0f, 144.0f),
                    PathNode.CurveTo(54.0f, 184.86908f, 87.13093f, 218.0f, 128.0f, 218.0f),
                    PathNode.CurveTo(168.86908f, 218.0f, 202.0f, 184.86908f, 202.0f, 144.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _fire!!
    }

private var _fire: ImageVector? = null
