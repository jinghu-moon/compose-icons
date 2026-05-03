package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.UserGear: ImageVector
    get() {
        if (_userGear != null) return _userGear!!
        _userGear = phosphorThinIcon(
            name = "UserGear",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(133.17f, 158.84f),
                    PathNode.CurveTo(161.11523f, 146.88643f, 176.7984f, 116.92664f, 170.69743f, 87.15078f),
                    PathNode.CurveTo(164.59648f, 57.37491f, 138.39447f, 35.997234f, 108.0f, 35.997234f),
                    PathNode.CurveTo(77.60553f, 35.997234f, 51.403522f, 57.37491f, 45.302563f, 87.15078f),
                    PathNode.CurveTo(39.201607f, 116.92664f, 54.88477f, 146.88643f, 82.83f, 158.84f),
                    PathNode.CurveTo(59.07f, 164.3f, 37.65f, 177.53f, 20.94f, 197.43f),
                    PathNode.CurveTo(19.944609f, 198.51366f, 19.624542f, 200.05632f, 20.106665f, 201.44652f),
                    PathNode.CurveTo(20.588785f, 202.83673f, 21.79524f, 203.84999f, 23.247835f, 204.0847f),
                    PathNode.CurveTo(24.70043f, 204.3194f, 26.164598f, 203.73764f, 27.06f, 202.57f),
                    PathNode.CurveTo(48.0f, 177.7f, 76.7f, 164.0f, 108.0f, 164.0f),
                    PathNode.CurveTo(139.3f, 164.0f, 168.0f, 177.7f, 188.94f, 202.57f),
                    PathNode.CurveTo(190.38774f, 204.14612f, 192.81958f, 204.3035f, 194.45839f, 202.92711f),
                    PathNode.CurveTo(196.0972f, 201.55072f, 196.3623f, 199.12827f, 195.06f, 197.43f),
                    PathNode.CurveTo(178.35f, 177.53f, 156.93f, 164.3f, 133.17f, 158.84f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 100.0f),
                    PathNode.CurveTo(52.0f, 69.07206f, 77.07206f, 44.0f, 108.0f, 44.0f),
                    PathNode.CurveTo(138.92795f, 44.0f, 164.0f, 69.07206f, 164.0f, 100.0f),
                    PathNode.CurveTo(164.0f, 130.92795f, 138.92795f, 156.0f, 108.0f, 156.0f),
                    PathNode.CurveTo(77.08576f, 155.96693f, 52.03307f, 130.91423f, 52.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(250.25f, 146.54f),
                    PathNode.LineTo(243.0f, 142.33f),
                    PathNode.CurveTo(244.38695f, 138.22395f, 244.38695f, 133.77605f, 243.0f, 129.67f),
                    PathNode.LineTo(250.29f, 125.46f),
                    PathNode.CurveTo(251.59192f, 124.778946f, 252.41565f, 123.43896f, 252.43553f, 121.9698f),
                    PathNode.CurveTo(252.45541f, 120.50065f, 251.66826f, 119.13885f, 250.38525f, 118.422806f),
                    PathNode.CurveTo(249.10225f, 117.706764f, 247.52995f, 117.75176f, 246.29f, 118.54f),
                    PathNode.LineTo(238.98f, 122.75f),
                    PathNode.CurveTo(236.10591f, 119.49808f, 232.25203f, 117.26928f, 228.0f, 116.4f),
                    PathNode.LineTo(228.0f, 108.0f),
                    PathNode.CurveTo(228.0f, 105.79086f, 226.20914f, 104.0f, 224.0f, 104.0f),
                    PathNode.CurveTo(221.79086f, 104.0f, 220.0f, 105.79086f, 220.0f, 108.0f),
                    PathNode.LineTo(220.0f, 116.4f),
                    PathNode.CurveTo(215.76237f, 117.27736f, 211.92365f, 119.50551f, 209.06f, 122.75f),
                    PathNode.LineTo(201.75f, 118.54f),
                    PathNode.CurveTo(200.51006f, 117.75176f, 198.93776f, 117.706764f, 197.65475f, 118.422806f),
                    PathNode.CurveTo(196.37175f, 119.13885f, 195.58458f, 120.50065f, 195.60446f, 121.9698f),
                    PathNode.CurveTo(195.62433f, 123.43896f, 196.44809f, 124.778946f, 197.75f, 125.46f),
                    PathNode.LineTo(205.04f, 129.67f),
                    PathNode.CurveTo(203.65305f, 133.77605f, 203.65305f, 138.22395f, 205.04f, 142.33f),
                    PathNode.LineTo(197.75f, 146.54f),
                    PathNode.CurveTo(196.18643f, 147.44699f, 195.42543f, 149.28989f, 195.89351f, 151.03581f),
                    PathNode.CurveTo(196.36159f, 152.78174f, 197.94241f, 153.9968f, 199.75f, 154.0f),
                    PathNode.CurveTo(200.45303f, 154.00261f, 201.14381f, 153.81609f, 201.75f, 153.46f),
                    PathNode.LineTo(209.06f, 149.25f),
                    PathNode.CurveTo(211.92365f, 152.49449f, 215.76237f, 154.72264f, 220.0f, 155.6f),
                    PathNode.LineTo(220.0f, 164.0f),
                    PathNode.CurveTo(220.0f, 166.20914f, 221.79086f, 168.0f, 224.0f, 168.0f),
                    PathNode.CurveTo(226.20914f, 168.0f, 228.0f, 166.20914f, 228.0f, 164.0f),
                    PathNode.LineTo(228.0f, 155.6f),
                    PathNode.CurveTo(232.23763f, 154.72264f, 236.07635f, 152.49449f, 238.94f, 149.25f),
                    PathNode.LineTo(246.25f, 153.46f),
                    PathNode.CurveTo(246.85619f, 153.81609f, 247.54697f, 154.00261f, 248.25f, 154.0f),
                    PathNode.CurveTo(250.05759f, 153.9968f, 251.63841f, 152.78174f, 252.10649f, 151.03581f),
                    PathNode.CurveTo(252.57457f, 149.28989f, 251.81357f, 147.44699f, 250.25f, 146.54f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 148.0f),
                    PathNode.CurveTo(217.37259f, 148.0f, 212.0f, 142.62741f, 212.0f, 136.0f),
                    PathNode.CurveTo(212.0f, 129.37259f, 217.37259f, 124.0f, 224.0f, 124.0f),
                    PathNode.CurveTo(230.62741f, 124.0f, 236.0f, 129.37259f, 236.0f, 136.0f),
                    PathNode.CurveTo(236.0f, 142.62741f, 230.62741f, 148.0f, 224.0f, 148.0f),
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
        return _userGear!!
    }

private var _userGear: ImageVector? = null
