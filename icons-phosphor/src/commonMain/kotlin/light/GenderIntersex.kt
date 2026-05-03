package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GenderIntersex: ImageVector
    get() {
        if (_genderIntersex != null) return _genderIntersex!!
        _genderIntersex = phosphorLightIcon(
            name = "GenderIntersex",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 26.0f),
                    PathNode.LineTo(168.0f, 26.0f),
                    PathNode.CurveTo(164.6863f, 26.0f, 162.0f, 28.68629f, 162.0f, 32.0f),
                    PathNode.CurveTo(162.0f, 35.31371f, 164.6863f, 38.0f, 168.0f, 38.0f),
                    PathNode.LineTo(193.52f, 38.0f),
                    PathNode.LineTo(163.52f, 67.94f),
                    PathNode.CurveTo(144.12906f, 48.724472f, 114.45134f, 44.45318f, 90.42856f, 57.420498f),
                    PathNode.CurveTo(66.40578f, 70.38782f, 53.691338f, 97.54208f, 59.11494f, 124.29707f),
                    PathNode.CurveTo(64.53854f, 151.05206f, 86.82382f, 171.1114f, 114.0f, 173.7f),
                    PathNode.LineTo(114.0f, 194.0f),
                    PathNode.LineTo(88.0f, 194.0f),
                    PathNode.CurveTo(84.686295f, 194.0f, 82.0f, 196.6863f, 82.0f, 200.0f),
                    PathNode.CurveTo(82.0f, 203.3137f, 84.686295f, 206.0f, 88.0f, 206.0f),
                    PathNode.LineTo(114.0f, 206.0f),
                    PathNode.LineTo(114.0f, 232.0f),
                    PathNode.CurveTo(114.0f, 235.3137f, 116.686295f, 238.0f, 120.0f, 238.0f),
                    PathNode.CurveTo(123.313705f, 238.0f, 126.0f, 235.3137f, 126.0f, 232.0f),
                    PathNode.LineTo(126.0f, 206.0f),
                    PathNode.LineTo(152.0f, 206.0f),
                    PathNode.CurveTo(155.3137f, 206.0f, 158.0f, 203.3137f, 158.0f, 200.0f),
                    PathNode.CurveTo(158.0f, 196.6863f, 155.3137f, 194.0f, 152.0f, 194.0f),
                    PathNode.LineTo(126.0f, 194.0f),
                    PathNode.LineTo(126.0f, 173.7f),
                    PathNode.CurveTo(147.7669f, 171.57074f, 166.80177f, 158.1307f, 176.09216f, 138.33118f),
                    PathNode.CurveTo(185.38255f, 118.53166f, 183.55394f, 95.302f, 171.28f, 77.2f),
                    PathNode.LineTo(202.0f, 46.48f),
                    PathNode.LineTo(202.0f, 72.0f),
                    PathNode.CurveTo(202.0f, 75.313705f, 204.6863f, 78.0f, 208.0f, 78.0f),
                    PathNode.CurveTo(211.3137f, 78.0f, 214.0f, 75.313705f, 214.0f, 72.0f),
                    PathNode.LineTo(214.0f, 32.0f),
                    PathNode.CurveTo(214.0f, 28.68629f, 211.3137f, 26.0f, 208.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 162.0f),
                    PathNode.CurveTo(92.385765f, 162.0f, 70.0f, 139.61424f, 70.0f, 112.0f),
                    PathNode.CurveTo(70.0f, 84.385765f, 92.385765f, 62.0f, 120.0f, 62.0f),
                    PathNode.CurveTo(147.61424f, 62.0f, 170.0f, 84.385765f, 170.0f, 112.0f),
                    PathNode.CurveTo(169.96693f, 139.60052f, 147.60052f, 161.96693f, 120.0f, 162.0f),
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
        return _genderIntersex!!
    }

private var _genderIntersex: ImageVector? = null
