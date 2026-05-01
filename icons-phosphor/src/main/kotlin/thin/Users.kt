package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Users: ImageVector
    get() {
        if (_users != null) return _users!!
        _users = phosphorThinIcon(
            name = "Users",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(107.19f, 159.0f),
                    PathNode.CurveTo(131.17996f, 148.08582f, 144.31262f, 121.920586f, 138.72874f, 96.162895f),
                    PathNode.CurveTo(133.14491f, 70.405205f, 110.35599f, 52.027225f, 84.0f, 52.027225f),
                    PathNode.CurveTo(57.644012f, 52.027225f, 34.85509f, 70.405205f, 29.271235f, 96.162895f),
                    PathNode.CurveTo(23.687376f, 121.920586f, 36.82004f, 148.08582f, 60.81f, 159.0f),
                    PathNode.CurveTo(38.619312f, 164.75177f, 19.382347f, 178.5954f, 6.88f, 197.81f),
                    PathNode.CurveTo(6.074636f, 199.00699f, 5.976249f, 200.54492f, 6.62252f, 201.83476f),
                    PathNode.CurveTo(7.26879f, 203.12462f, 8.55957f, 203.96652f, 10.000499f, 204.03802f),
                    PathNode.CurveTo(11.441428f, 204.10953f, 12.809213f, 203.39954f, 13.58f, 202.18f),
                    PathNode.CurveTo(29.076622f, 178.3496f, 55.574066f, 163.97327f, 84.0f, 163.97327f),
                    PathNode.CurveTo(112.425934f, 163.97327f, 138.92337f, 178.3496f, 154.42f, 202.18f),
                    PathNode.CurveTo(155.19078f, 203.39954f, 156.55858f, 204.10953f, 157.9995f, 204.03802f),
                    PathNode.CurveTo(159.44043f, 203.96652f, 160.73122f, 203.12462f, 161.37749f, 201.83476f),
                    PathNode.CurveTo(162.02376f, 200.54492f, 161.92537f, 199.00699f, 161.12f, 197.81f),
                    PathNode.CurveTo(148.61765f, 178.5954f, 129.38069f, 164.75177f, 107.19f, 159.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 108.0f),
                    PathNode.CurveTo(36.0f, 81.49033f, 57.490334f, 60.0f, 84.0f, 60.0f),
                    PathNode.CurveTo(110.50967f, 60.0f, 132.0f, 81.49033f, 132.0f, 108.0f),
                    PathNode.CurveTo(132.0f, 134.50967f, 110.50967f, 156.0f, 84.0f, 156.0f),
                    PathNode.CurveTo(57.501755f, 155.97244f, 36.02756f, 134.49825f, 36.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(248.0f, 203.35f),
                    PathNode.CurveTo(246.1495f, 204.55214f, 243.67503f, 204.02861f, 242.47f, 202.18f),
                    PathNode.CurveTo(226.98198f, 178.31836f, 200.44737f, 163.94217f, 172.0f, 164.0f),
                    PathNode.CurveTo(169.79086f, 164.0f, 168.0f, 162.20914f, 168.0f, 160.0f),
                    PathNode.CurveTo(168.0f, 157.79086f, 169.79086f, 156.0f, 172.0f, 156.0f),
                    PathNode.CurveTo(191.33574f, 155.98949f, 208.77734f, 144.37827f, 216.24727f, 126.54373f),
                    PathNode.CurveTo(223.7172f, 108.709175f, 219.7568f, 88.13383f, 206.20023f, 74.346504f),
                    PathNode.CurveTo(192.64366f, 60.559177f, 172.13808f, 56.252117f, 154.18f, 63.42f),
                    PathNode.CurveTo(152.12827f, 64.24843f, 149.79343f, 63.256737f, 148.965f, 61.205f),
                    PathNode.CurveTo(148.13657f, 59.153263f, 149.12827f, 56.818428f, 151.18f, 55.99f),
                    PathNode.CurveTo(179.62267f, 43.839737f, 212.52974f, 57.047337f, 224.68f, 85.49f),
                    PathNode.CurveTo(236.83026f, 113.93266f, 223.62267f, 146.83974f, 195.18f, 158.99f),
                    PathNode.CurveTo(217.37863f, 164.75426f, 236.61678f, 178.61658f, 249.11f, 197.85f),
                    PathNode.CurveTo(250.30347f, 199.67894f, 249.80939f, 202.12709f, 248.0f, 203.35f),
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
        return _users!!
    }

private var _users: ImageVector? = null
