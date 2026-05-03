package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GenderNeuter: ImageVector
    get() {
        if (_genderNeuter != null) return _genderNeuter!!
        _genderNeuter = phosphorLightIcon(
            name = "GenderNeuter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(206.0f, 104.0f),
                    PathNode.CurveTo(206.01024f, 61.699104f, 172.30113f, 27.099545f, 130.01434f, 26.007126f),
                    PathNode.CurveTo(87.72756f, 24.914707f, 52.27695f, 57.727623f, 50.10307f, 99.972626f),
                    PathNode.CurveTo(47.92919f, 142.21762f, 79.82444f, 178.49608f, 122.0f, 181.75f),
                    PathNode.LineTo(122.0f, 232.0f),
                    PathNode.CurveTo(122.0f, 235.3137f, 124.686295f, 238.0f, 128.0f, 238.0f),
                    PathNode.CurveTo(131.3137f, 238.0f, 134.0f, 235.3137f, 134.0f, 232.0f),
                    PathNode.LineTo(134.0f, 181.75f),
                    PathNode.CurveTo(174.60272f, 178.57388f, 205.94672f, 144.72672f, 206.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 170.0f),
                    PathNode.CurveTo(91.54921f, 170.0f, 62.0f, 140.45079f, 62.0f, 104.0f),
                    PathNode.CurveTo(62.0f, 67.54921f, 91.54921f, 38.0f, 128.0f, 38.0f),
                    PathNode.CurveTo(164.45079f, 38.0f, 194.0f, 67.54921f, 194.0f, 104.0f),
                    PathNode.CurveTo(193.95592f, 140.43253f, 164.43253f, 169.95592f, 128.0f, 170.0f),
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
        return _genderNeuter!!
    }

private var _genderNeuter: ImageVector? = null
