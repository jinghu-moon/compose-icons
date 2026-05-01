package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GenderFemale: ImageVector
    get() {
        if (_genderFemale != null) return _genderFemale!!
        _genderFemale = phosphorLightIcon(
            name = "GenderFemale",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(206.0f, 96.0f),
                    PathNode.CurveTo(206.01024f, 53.699104f, 172.30113f, 19.099545f, 130.01434f, 18.007126f),
                    PathNode.CurveTo(87.72756f, 16.914707f, 52.27695f, 49.727623f, 50.10307f, 91.972626f),
                    PathNode.CurveTo(47.92919f, 134.21762f, 79.82444f, 170.49608f, 122.0f, 173.75f),
                    PathNode.LineTo(122.0f, 202.0f),
                    PathNode.LineTo(88.0f, 202.0f),
                    PathNode.CurveTo(84.686295f, 202.0f, 82.0f, 204.6863f, 82.0f, 208.0f),
                    PathNode.CurveTo(82.0f, 211.3137f, 84.686295f, 214.0f, 88.0f, 214.0f),
                    PathNode.LineTo(122.0f, 214.0f),
                    PathNode.LineTo(122.0f, 240.0f),
                    PathNode.CurveTo(122.0f, 243.3137f, 124.686295f, 246.0f, 128.0f, 246.0f),
                    PathNode.CurveTo(131.3137f, 246.0f, 134.0f, 243.3137f, 134.0f, 240.0f),
                    PathNode.LineTo(134.0f, 214.0f),
                    PathNode.LineTo(168.0f, 214.0f),
                    PathNode.CurveTo(171.3137f, 214.0f, 174.0f, 211.3137f, 174.0f, 208.0f),
                    PathNode.CurveTo(174.0f, 204.6863f, 171.3137f, 202.0f, 168.0f, 202.0f),
                    PathNode.LineTo(134.0f, 202.0f),
                    PathNode.LineTo(134.0f, 173.75f),
                    PathNode.CurveTo(174.60272f, 170.57388f, 205.94672f, 136.72672f, 206.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(62.0f, 96.0f),
                    PathNode.CurveTo(62.0f, 59.549206f, 91.54921f, 30.0f, 128.0f, 30.0f),
                    PathNode.CurveTo(164.45079f, 30.0f, 194.0f, 59.549206f, 194.0f, 96.0f),
                    PathNode.CurveTo(194.0f, 132.45079f, 164.45079f, 162.0f, 128.0f, 162.0f),
                    PathNode.CurveTo(91.56748f, 161.95592f, 62.04408f, 132.43253f, 62.0f, 96.0f),
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
        return _genderFemale!!
    }

private var _genderFemale: ImageVector? = null
