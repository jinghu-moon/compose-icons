package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SmileyWink: ImageVector
    get() {
        if (_smileyWink != null) return _smileyWink!!
        _smileyWink = phosphorLightIcon(
            name = "SmileyWink",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 26.0f),
                    PathNode.CurveTo(71.666954f, 26.0f, 26.0f, 71.666954f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 184.33304f, 71.666954f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(184.33304f, 230.0f, 230.0f, 184.33304f, 230.0f, 128.0f),
                    PathNode.CurveTo(229.93387f, 71.69437f, 184.30563f, 26.066126f, 128.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 218.0f),
                    PathNode.CurveTo(78.29437f, 218.0f, 38.0f, 177.70563f, 38.0f, 128.0f),
                    PathNode.CurveTo(38.0f, 78.29437f, 78.29437f, 38.0f, 128.0f, 38.0f),
                    PathNode.CurveTo(177.70563f, 38.0f, 218.0f, 78.29437f, 218.0f, 128.0f),
                    PathNode.CurveTo(217.94489f, 177.68279f, 177.68279f, 217.94489f, 128.0f, 218.0f),
                    PathNode.Close,
                    PathNode.MoveTo(82.0f, 108.0f),
                    PathNode.CurveTo(82.0f, 102.47715f, 86.47715f, 98.0f, 92.0f, 98.0f),
                    PathNode.CurveTo(97.52285f, 98.0f, 102.0f, 102.47715f, 102.0f, 108.0f),
                    PathNode.CurveTo(102.0f, 113.52285f, 97.52285f, 118.0f, 92.0f, 118.0f),
                    PathNode.CurveTo(86.47715f, 118.0f, 82.0f, 113.52285f, 82.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(182.0f, 108.0f),
                    PathNode.CurveTo(182.0f, 111.313705f, 179.3137f, 114.0f, 176.0f, 114.0f),
                    PathNode.LineTo(152.0f, 114.0f),
                    PathNode.CurveTo(148.6863f, 114.0f, 146.0f, 111.313705f, 146.0f, 108.0f),
                    PathNode.CurveTo(146.0f, 104.686295f, 148.6863f, 102.0f, 152.0f, 102.0f),
                    PathNode.LineTo(176.0f, 102.0f),
                    PathNode.CurveTo(179.3137f, 102.0f, 182.0f, 104.686295f, 182.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(173.19f, 155.0f),
                    PathNode.CurveTo(163.27f, 172.16f, 146.8f, 182.0f, 128.0f, 182.0f),
                    PathNode.CurveTo(109.2f, 182.0f, 92.73f, 172.16f, 82.81f, 155.0f),
                    PathNode.CurveTo(81.31959f, 152.1509f, 82.34006f, 148.63336f, 85.12384f, 147.02425f),
                    PathNode.CurveTo(87.907616f, 145.41512f, 91.46503f, 146.28648f, 93.19f, 149.0f),
                    PathNode.CurveTo(101.03f, 162.54f, 113.39f, 170.0f, 128.0f, 170.0f),
                    PathNode.CurveTo(142.61f, 170.0f, 155.0f, 162.54f, 162.81f, 149.0f),
                    PathNode.CurveTo(163.83157f, 147.04713f, 165.84157f, 145.81152f, 168.0453f, 145.7817f),
                    PathNode.CurveTo(170.24904f, 145.75186f, 172.29173f, 146.93262f, 173.36577f, 148.85712f),
                    PathNode.CurveTo(174.43985f, 150.78163f, 174.37238f, 153.14006f, 173.19f, 155.0f),
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
        return _smileyWink!!
    }

private var _smileyWink: ImageVector? = null
