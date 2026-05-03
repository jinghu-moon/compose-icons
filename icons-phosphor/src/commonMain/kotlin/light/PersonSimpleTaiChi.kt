package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PersonSimpleTaiChi: ImageVector
    get() {
        if (_personSimpleTaiChi != null) return _personSimpleTaiChi!!
        _personSimpleTaiChi = phosphorLightIcon(
            name = "PersonSimpleTaiChi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 78.0f),
                    PathNode.CurveTo(144.56854f, 78.0f, 158.0f, 64.56854f, 158.0f, 48.0f),
                    PathNode.CurveTo(158.0f, 31.431458f, 144.56854f, 18.0f, 128.0f, 18.0f),
                    PathNode.CurveTo(111.43146f, 18.0f, 98.0f, 31.431458f, 98.0f, 48.0f),
                    PathNode.CurveTo(98.0f, 64.56854f, 111.43146f, 78.0f, 128.0f, 78.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 30.0f),
                    PathNode.CurveTo(137.94113f, 30.0f, 146.0f, 38.058876f, 146.0f, 48.0f),
                    PathNode.CurveTo(146.0f, 57.941124f, 137.94113f, 66.0f, 128.0f, 66.0f),
                    PathNode.CurveTo(118.05888f, 66.0f, 110.0f, 57.941124f, 110.0f, 48.0f),
                    PathNode.CurveTo(110.0f, 38.058876f, 118.05888f, 30.0f, 128.0f, 30.0f),
                    PathNode.Close,
                    PathNode.MoveTo(222.0f, 104.0f),
                    PathNode.CurveTo(222.0f, 107.313705f, 219.3137f, 110.0f, 216.0f, 110.0f),
                    PathNode.LineTo(134.0f, 110.0f),
                    PathNode.LineTo(134.0f, 140.0f),
                    PathNode.LineTo(186.36f, 162.45f),
                    PathNode.CurveTo(188.57925f, 163.3994f, 190.0135f, 165.58623f, 190.0f, 168.0f),
                    PathNode.LineTo(190.0f, 216.0f),
                    PathNode.CurveTo(190.0f, 219.3137f, 187.3137f, 222.0f, 184.0f, 222.0f),
                    PathNode.CurveTo(180.6863f, 222.0f, 178.0f, 219.3137f, 178.0f, 216.0f),
                    PathNode.LineTo(178.0f, 172.0f),
                    PathNode.LineTo(129.16f, 151.0f),
                    PathNode.LineTo(52.0f, 220.46f),
                    PathNode.CurveTo(49.51518f, 222.45374f, 45.905437f, 222.15788f, 43.778374f, 219.78621f),
                    PathNode.CurveTo(41.651314f, 217.41454f, 41.74862f, 213.794f, 44.0f, 211.54f),
                    PathNode.LineTo(122.0f, 141.33f),
                    PathNode.LineTo(122.0f, 110.0f),
                    PathNode.LineTo(40.0f, 110.0f),
                    PathNode.CurveTo(36.68629f, 110.0f, 34.0f, 107.313705f, 34.0f, 104.0f),
                    PathNode.CurveTo(34.0f, 100.686295f, 36.68629f, 98.0f, 40.0f, 98.0f),
                    PathNode.LineTo(216.0f, 98.0f),
                    PathNode.CurveTo(219.3137f, 98.0f, 222.0f, 100.686295f, 222.0f, 104.0f),
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
        return _personSimpleTaiChi!!
    }

private var _personSimpleTaiChi: ImageVector? = null
