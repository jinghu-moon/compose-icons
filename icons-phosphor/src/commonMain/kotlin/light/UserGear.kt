package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UserGear: ImageVector
    get() {
        if (_userGear != null) return _userGear!!
        _userGear = phosphorLightIcon(
            name = "UserGear",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(139.0f, 158.25f),
                    PathNode.CurveTo(165.74763f, 144.01926f, 179.37091f, 113.405136f, 172.03748f, 84.008354f),
                    PathNode.CurveTo(164.70404f, 54.61157f, 138.29768f, 33.98337f, 108.0f, 33.98337f),
                    PathNode.CurveTo(77.70231f, 33.98337f, 51.295948f, 54.61157f, 43.96252f, 84.008354f),
                    PathNode.CurveTo(36.629093f, 113.405136f, 50.25236f, 144.01926f, 77.0f, 158.25f),
                    PathNode.CurveTo(55.0f, 164.48f, 35.12f, 177.41f, 19.39f, 196.14f),
                    PathNode.CurveTo(17.377563f, 198.68399f, 17.751375f, 202.36678f, 20.23394f, 204.45451f),
                    PathNode.CurveTo(22.716505f, 206.54225f, 26.40884f, 206.27892f, 28.57f, 203.86f),
                    PathNode.CurveTo(49.1f, 179.44f, 77.31f, 166.0f, 108.0f, 166.0f),
                    PathNode.CurveTo(138.69f, 166.0f, 166.9f, 179.44f, 187.41f, 203.86f),
                    PathNode.CurveTo(188.7665f, 205.5748f, 190.94841f, 206.41594f, 193.10495f, 206.05544f),
                    PathNode.CurveTo(195.26149f, 205.69493f, 197.0512f, 204.18985f, 197.77621f, 202.12709f),
                    PathNode.CurveTo(198.50122f, 200.06433f, 198.04675f, 197.7705f, 196.59f, 196.14f),
                    PathNode.CurveTo(180.86f, 177.41f, 161.0f, 164.48f, 139.0f, 158.25f),
                    PathNode.Close,
                    PathNode.MoveTo(54.0f, 100.0f),
                    PathNode.CurveTo(54.0f, 70.17662f, 78.17662f, 46.0f, 108.0f, 46.0f),
                    PathNode.CurveTo(137.82338f, 46.0f, 162.0f, 70.17662f, 162.0f, 100.0f),
                    PathNode.CurveTo(162.0f, 129.82338f, 137.82338f, 154.0f, 108.0f, 154.0f),
                    PathNode.CurveTo(78.19033f, 153.96693f, 54.033066f, 129.80966f, 54.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(251.25f, 144.8f),
                    PathNode.LineTo(245.33f, 141.39f),
                    PathNode.CurveTo(246.22398f, 137.85226f, 246.22398f, 134.14774f, 245.33f, 130.61f),
                    PathNode.LineTo(251.25f, 127.2f),
                    PathNode.CurveTo(254.12189f, 125.543144f, 255.10686f, 121.87188f, 253.45f, 119.0f),
                    PathNode.CurveTo(251.79315f, 116.12812f, 248.12189f, 115.14314f, 245.25f, 116.8f),
                    PathNode.LineTo(239.32f, 120.23f),
                    PathNode.CurveTo(236.70769f, 117.68916f, 233.50513f, 115.83704f, 230.0f, 114.84f),
                    PathNode.LineTo(230.0f, 108.0f),
                    PathNode.CurveTo(230.0f, 104.686295f, 227.3137f, 102.0f, 224.0f, 102.0f),
                    PathNode.CurveTo(220.6863f, 102.0f, 218.0f, 104.686295f, 218.0f, 108.0f),
                    PathNode.LineTo(218.0f, 114.84f),
                    PathNode.CurveTo(214.49487f, 115.83704f, 211.29231f, 117.68916f, 208.68f, 120.23f),
                    PathNode.LineTo(202.75f, 116.8f),
                    PathNode.CurveTo(199.87811f, 115.14314f, 196.20685f, 116.12812f, 194.55f, 119.0f),
                    PathNode.CurveTo(192.89314f, 121.87188f, 193.87811f, 125.543144f, 196.75f, 127.2f),
                    PathNode.LineTo(202.67f, 130.61f),
                    PathNode.CurveTo(201.77602f, 134.14774f, 201.77602f, 137.85226f, 202.67f, 141.39f),
                    PathNode.LineTo(196.75f, 144.8f),
                    PathNode.CurveTo(193.87811f, 146.45685f, 192.89314f, 150.12811f, 194.55f, 153.0f),
                    PathNode.CurveTo(196.20685f, 155.87189f, 199.87811f, 156.85686f, 202.75f, 155.2f),
                    PathNode.LineTo(208.68f, 151.77f),
                    PathNode.CurveTo(211.29231f, 154.31084f, 214.49487f, 156.16296f, 218.0f, 157.16f),
                    PathNode.LineTo(218.0f, 164.0f),
                    PathNode.CurveTo(218.0f, 167.3137f, 220.6863f, 170.0f, 224.0f, 170.0f),
                    PathNode.CurveTo(227.3137f, 170.0f, 230.0f, 167.3137f, 230.0f, 164.0f),
                    PathNode.LineTo(230.0f, 157.16f),
                    PathNode.CurveTo(233.50513f, 156.16296f, 236.70769f, 154.31084f, 239.32f, 151.77f),
                    PathNode.LineTo(245.25f, 155.2f),
                    PathNode.CurveTo(248.12189f, 156.85686f, 251.79315f, 155.87189f, 253.45f, 153.0f),
                    PathNode.CurveTo(255.10686f, 150.12811f, 254.12189f, 146.45685f, 251.25f, 144.8f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 146.0f),
                    PathNode.CurveTo(218.47716f, 146.0f, 214.0f, 141.52284f, 214.0f, 136.0f),
                    PathNode.CurveTo(214.0f, 130.47716f, 218.47716f, 126.0f, 224.0f, 126.0f),
                    PathNode.CurveTo(229.52284f, 126.0f, 234.0f, 130.47716f, 234.0f, 136.0f),
                    PathNode.CurveTo(234.0f, 141.52284f, 229.52284f, 146.0f, 224.0f, 146.0f),
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
        return _userGear!!
    }

private var _userGear: ImageVector? = null
