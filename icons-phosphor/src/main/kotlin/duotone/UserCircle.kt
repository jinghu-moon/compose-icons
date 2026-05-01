package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.UserCircle: ImageVector
    get() {
        if (_userCircle != null) return _userCircle!!
        _userCircle = phosphorDuotoneIcon(
            name = "UserCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 128.0f),
                    PathNode.CurveTo(224.02905f, 155.22916f, 212.46487f, 181.1831f, 192.2f, 199.37f),
                    PathNode.CurveTo(179.91637f, 175.20868f, 155.10455f, 159.99309f, 128.0f, 160.0f),
                    PathNode.CurveTo(150.09138f, 160.0f, 168.0f, 142.09138f, 168.0f, 120.0f),
                    PathNode.CurveTo(168.0f, 97.90861f, 150.09138f, 80.0f, 128.0f, 80.0f),
                    PathNode.CurveTo(105.90861f, 80.0f, 88.0f, 97.90861f, 88.0f, 120.0f),
                    PathNode.CurveTo(88.0f, 142.09138f, 105.90861f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(100.89545f, 159.99309f, 76.08363f, 175.20868f, 63.8f, 199.37f),
                    PathNode.LineTo(63.8f, 199.37f),
                    PathNode.CurveTo(31.026604f, 169.89107f, 22.540434f, 121.88109f, 43.2224f, 82.95347f),
                    PathNode.CurveTo(63.904366f, 44.02586f, 108.43899f, 24.18544f, 151.2117f, 34.843636f),
                    PathNode.CurveTo(193.98442f, 45.501827f, 224.0022f, 83.919365f, 224.0f, 128.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(74.08f, 197.5f),
                    PathNode.CurveTo(85.8411f, 179.1061f, 106.16747f, 167.97656f, 128.0f, 167.97656f),
                    PathNode.CurveTo(149.83252f, 167.97656f, 170.1589f, 179.1061f, 181.92f, 197.5f),
                    PathNode.CurveTo(150.2046f, 222.16577f, 105.795395f, 222.16577f, 74.08f, 197.5f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 120.0f),
                    PathNode.CurveTo(96.0f, 102.32689f, 110.32689f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(145.67311f, 88.0f, 160.0f, 102.32689f, 160.0f, 120.0f),
                    PathNode.CurveTo(160.0f, 137.67311f, 145.67311f, 152.0f, 128.0f, 152.0f),
                    PathNode.CurveTo(110.32689f, 152.0f, 96.0f, 137.67311f, 96.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(193.76f, 186.41f),
                    PathNode.CurveTo(184.83769f, 173.48077f, 172.29182f, 163.47818f, 157.7f, 157.66f),
                    PathNode.CurveTo(173.7668f, 145.00536f, 180.05058f, 123.56005f, 173.35413f, 104.23546f),
                    PathNode.CurveTo(166.65768f, 84.91087f, 148.45195f, 71.951775f, 128.0f, 71.951775f),
                    PathNode.CurveTo(107.54806f, 71.951775f, 89.342316f, 84.91087f, 82.64587f, 104.23546f),
                    PathNode.CurveTo(75.949425f, 123.56005f, 82.2332f, 145.00536f, 98.3f, 157.66f),
                    PathNode.CurveTo(83.708176f, 163.47818f, 71.16231f, 173.48077f, 62.24f, 186.41f),
                    PathNode.CurveTo(30.83159f, 151.09016f, 32.93355f, 97.26735f, 67.00082f, 64.504555f),
                    PathNode.CurveTo(101.06808f, 31.741764f, 154.93193f, 31.741764f, 188.99919f, 64.504555f),
                    PathNode.CurveTo(223.06645f, 97.26735f, 225.16841f, 151.09016f, 193.76f, 186.41f),
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
        return _userCircle!!
    }

private var _userCircle: ImageVector? = null
