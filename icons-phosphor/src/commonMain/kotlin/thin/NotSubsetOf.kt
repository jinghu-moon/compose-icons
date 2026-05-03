package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NotSubsetOf: ImageVector
    get() {
        if (_notSubsetOf != null) return _notSubsetOf!!
        _notSubsetOf = phosphorThinIcon(
            name = "NotSubsetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(210.69f, 37.0f),
                    PathNode.CurveTo(209.05516f, 35.514515f, 206.52573f, 35.63539f, 205.04f, 37.27f),
                    PathNode.LineTo(199.0f, 44.0f),
                    PathNode.LineTo(128.0f, 44.0f),
                    PathNode.CurveTo(94.04632f, 44.025826f, 63.44712f, 64.48993f, 50.45578f, 95.859955f),
                    PathNode.CurveTo(37.46444f, 127.22998f, 44.636047f, 163.33618f, 68.63f, 187.36f),
                    PathNode.LineTo(45.0f, 213.31f),
                    PathNode.CurveTo(43.514355f, 214.96686f, 43.653145f, 217.51436f, 45.31f, 219.0f),
                    PathNode.CurveTo(46.966854f, 220.48564f, 49.514355f, 220.34685f, 51.0f, 218.69f),
                    PathNode.LineTo(74.58f, 192.75f),
                    PathNode.CurveTo(89.59711f, 205.19968f, 108.493385f, 212.00899f, 128.0f, 212.0f),
                    PathNode.LineTo(200.0f, 212.0f),
                    PathNode.CurveTo(202.20914f, 212.0f, 204.0f, 210.20914f, 204.0f, 208.0f),
                    PathNode.CurveTo(204.0f, 205.79086f, 202.20914f, 204.0f, 200.0f, 204.0f),
                    PathNode.LineTo(128.0f, 204.0f),
                    PathNode.CurveTo(110.47027f, 204.01494f, 93.47928f, 197.94244f, 79.93f, 186.82f),
                    PathNode.LineTo(211.0f, 42.69f),
                    PathNode.CurveTo(211.72092f, 41.89784f, 212.09402f, 40.849636f, 212.03575f, 39.780125f),
                    PathNode.CurveTo(211.97748f, 38.710617f, 211.49272f, 37.709152f, 210.69f, 37.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 128.0f),
                    PathNode.CurveTo(52.044098f, 86.04464f, 86.04464f, 52.044098f, 128.0f, 52.0f),
                    PathNode.LineTo(191.69f, 52.0f),
                    PathNode.LineTo(74.0f, 181.43f),
                    PathNode.CurveTo(59.895172f, 167.22636f, 51.98574f, 148.01723f, 52.0f, 128.0f),
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
        return _notSubsetOf!!
    }

private var _notSubsetOf: ImageVector? = null
