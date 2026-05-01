package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Users: ImageVector
    get() {
        if (_users != null) return _users!!
        _users = phosphorBoldIcon(
            name = "Users",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(125.18f, 156.94f),
                    PathNode.CurveTo(145.76851f, 139.6344f, 153.34058f, 111.30292f, 144.13103f, 86.03328f),
                    PathNode.CurveTo(134.9215f, 60.76364f, 110.895546f, 43.948086f, 84.0f, 43.948086f),
                    PathNode.CurveTo(57.104458f, 43.948086f, 33.078506f, 60.76364f, 23.868967f, 86.03328f),
                    PathNode.CurveTo(14.659425f, 111.30292f, 22.231497f, 139.6344f, 42.82f, 156.94f),
                    PathNode.CurveTo(27.125805f, 164.0364f, 13.525158f, 175.05743f, 3.33f, 188.94f),
                    PathNode.CurveTo(-0.591222f, 194.28336f, 0.561645f, 201.79378f, 5.905f, 205.715f),
                    PathNode.CurveTo(11.248355f, 209.63622f, 18.758778f, 208.48335f, 22.68f, 203.14f),
                    PathNode.CurveTo(36.993763f, 183.59093f, 59.770885f, 172.0383f, 84.0f, 172.0383f),
                    PathNode.CurveTo(108.22911f, 172.0383f, 131.00624f, 183.59093f, 145.32f, 203.14f),
                    PathNode.CurveTo(149.24123f, 208.48611f, 156.75389f, 209.64122f, 162.1f, 205.72f),
                    PathNode.CurveTo(167.44612f, 201.79878f, 168.60123f, 194.28612f, 164.68f, 188.94f),
                    PathNode.CurveTo(154.47879f, 175.05923f, 140.87546f, 164.03882f, 125.18f, 156.94f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 108.0f),
                    PathNode.CurveTo(44.0f, 85.90861f, 61.90861f, 68.0f, 84.0f, 68.0f),
                    PathNode.CurveTo(106.09139f, 68.0f, 124.0f, 85.90861f, 124.0f, 108.0f),
                    PathNode.CurveTo(124.0f, 130.09138f, 106.09139f, 148.0f, 84.0f, 148.0f),
                    PathNode.CurveTo(61.90861f, 148.0f, 44.0f, 130.09138f, 44.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(250.1f, 205.67f),
                    PathNode.CurveTo(247.53436f, 207.55531f, 244.32466f, 208.34375f, 241.1775f, 207.86172f),
                    PathNode.CurveTo(238.03036f, 207.37971f, 235.20377f, 205.66678f, 233.32f, 203.1f),
                    PathNode.CurveTo(218.9727f, 183.59068f, 196.21686f, 172.04947f, 172.0f, 172.0f),
                    PathNode.CurveTo(165.37259f, 172.0f, 160.0f, 166.62741f, 160.0f, 160.0f),
                    PathNode.CurveTo(160.0f, 153.37259f, 165.37259f, 148.0f, 172.0f, 148.0f),
                    PathNode.CurveTo(187.52115f, 147.97234f, 201.62514f, 138.96825f, 208.18301f, 124.9005f),
                    PathNode.CurveTo(214.74088f, 110.83276f, 212.5686f, 94.24127f, 202.61017f, 82.33595f),
                    PathNode.CurveTo(192.65175f, 70.43063f, 176.70512f, 65.36096f, 161.7f, 69.33f),
                    PathNode.CurveTo(157.52129f, 70.53893f, 153.01553f, 69.39175f, 149.92372f, 66.3317f),
                    PathNode.CurveTo(146.83191f, 63.27166f, 145.63824f, 58.777996f, 146.80396f, 54.58702f),
                    PathNode.CurveTo(147.96967f, 50.39604f, 151.3122f, 47.164104f, 155.54f, 46.14f),
                    PathNode.CurveTo(184.48964f, 38.4693f, 214.88765f, 51.9003f, 228.70906f, 78.46888f),
                    PathNode.CurveTo(242.53049f, 105.03746f, 236.07895f, 137.6382f, 213.18f, 156.94f),
                    PathNode.CurveTo(228.87419f, 164.0364f, 242.47484f, 175.05743f, 252.67f, 188.94f),
                    PathNode.CurveTo(256.56207f, 194.27397f, 255.4136f, 201.75015f, 250.1f, 205.67f),
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
        return _users!!
    }

private var _users: ImageVector? = null
