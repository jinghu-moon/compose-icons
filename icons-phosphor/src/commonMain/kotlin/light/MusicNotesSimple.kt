package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MusicNotesSimple: ImageVector
    get() {
        if (_musicNotesSimple != null) return _musicNotesSimple!!
        _musicNotesSimple = phosphorLightIcon(
            name = "MusicNotesSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(211.69f, 19.27f),
                    PathNode.CurveTo(210.23286f, 18.132805f, 208.33292f, 17.73068f, 206.54f, 18.18f),
                    PathNode.LineTo(78.54f, 50.18f),
                    PathNode.CurveTo(75.87121f, 50.84953f, 73.99984f, 53.248505f, 74.0f, 56.0f),
                    PathNode.LineTo(74.0f, 170.11f),
                    PathNode.CurveTo(61.829132f, 159.78098f, 44.111404f, 159.30984f, 31.4088f, 168.97745f),
                    PathNode.CurveTo(18.706196f, 178.64505f, 14.439607f, 195.84784f, 21.152452f, 210.33081f),
                    PathNode.CurveTo(27.8653f, 224.81377f, 43.74977f, 232.67656f, 59.336735f, 229.23196f),
                    PathNode.CurveTo(74.9237f, 225.78737f, 86.01548f, 211.96303f, 86.0f, 196.0f),
                    PathNode.LineTo(86.0f, 60.68f),
                    PathNode.LineTo(202.0f, 31.68f),
                    PathNode.LineTo(202.0f, 138.11f),
                    PathNode.CurveTo(189.82913f, 127.78098f, 172.1114f, 127.309845f, 159.4088f, 136.97745f),
                    PathNode.CurveTo(146.70619f, 146.64505f, 142.4396f, 163.84784f, 149.15245f, 178.33081f),
                    PathNode.CurveTo(155.8653f, 192.81377f, 171.74977f, 200.67656f, 187.33673f, 197.23196f),
                    PathNode.CurveTo(202.92369f, 193.78737f, 214.01549f, 179.96303f, 214.0f, 164.0f),
                    PathNode.LineTo(214.0f, 24.0f),
                    PathNode.CurveTo(213.99965f, 22.151695f, 213.14745f, 20.406708f, 211.69f, 19.27f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 218.0f),
                    PathNode.CurveTo(39.849735f, 218.0f, 30.0f, 208.15027f, 30.0f, 196.0f),
                    PathNode.CurveTo(30.0f, 183.84973f, 39.849735f, 174.0f, 52.0f, 174.0f),
                    PathNode.CurveTo(64.15026f, 174.0f, 74.0f, 183.84973f, 74.0f, 196.0f),
                    PathNode.CurveTo(74.0f, 208.15027f, 64.15026f, 218.0f, 52.0f, 218.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 186.0f),
                    PathNode.CurveTo(167.84973f, 186.0f, 158.0f, 176.15027f, 158.0f, 164.0f),
                    PathNode.CurveTo(158.0f, 151.84973f, 167.84973f, 142.0f, 180.0f, 142.0f),
                    PathNode.CurveTo(192.15027f, 142.0f, 202.0f, 151.84973f, 202.0f, 164.0f),
                    PathNode.CurveTo(202.0f, 176.15027f, 192.15027f, 186.0f, 180.0f, 186.0f),
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
        return _musicNotesSimple!!
    }

private var _musicNotesSimple: ImageVector? = null
