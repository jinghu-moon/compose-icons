package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CarBattery: ImageVector
    get() {
        if (_carBattery != null) return _carBattery!!
        _carBattery = phosphorLightIcon(
            name = "CarBattery",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(190.0f, 136.0f),
                    PathNode.CurveTo(190.0f, 139.3137f, 187.3137f, 142.0f, 184.0f, 142.0f),
                    PathNode.LineTo(174.0f, 142.0f),
                    PathNode.LineTo(174.0f, 152.0f),
                    PathNode.CurveTo(174.0f, 155.3137f, 171.3137f, 158.0f, 168.0f, 158.0f),
                    PathNode.CurveTo(164.6863f, 158.0f, 162.0f, 155.3137f, 162.0f, 152.0f),
                    PathNode.LineTo(162.0f, 142.0f),
                    PathNode.LineTo(152.0f, 142.0f),
                    PathNode.CurveTo(148.6863f, 142.0f, 146.0f, 139.3137f, 146.0f, 136.0f),
                    PathNode.CurveTo(146.0f, 132.6863f, 148.6863f, 130.0f, 152.0f, 130.0f),
                    PathNode.LineTo(162.0f, 130.0f),
                    PathNode.LineTo(162.0f, 120.0f),
                    PathNode.CurveTo(162.0f, 116.686295f, 164.6863f, 114.0f, 168.0f, 114.0f),
                    PathNode.CurveTo(171.3137f, 114.0f, 174.0f, 116.686295f, 174.0f, 120.0f),
                    PathNode.LineTo(174.0f, 130.0f),
                    PathNode.LineTo(184.0f, 130.0f),
                    PathNode.CurveTo(187.3137f, 130.0f, 190.0f, 132.6863f, 190.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 130.0f),
                    PathNode.LineTo(72.0f, 130.0f),
                    PathNode.CurveTo(68.686295f, 130.0f, 66.0f, 132.6863f, 66.0f, 136.0f),
                    PathNode.CurveTo(66.0f, 139.3137f, 68.686295f, 142.0f, 72.0f, 142.0f),
                    PathNode.LineTo(104.0f, 142.0f),
                    PathNode.CurveTo(107.313705f, 142.0f, 110.0f, 139.3137f, 110.0f, 136.0f),
                    PathNode.CurveTo(110.0f, 132.6863f, 107.313705f, 130.0f, 104.0f, 130.0f),
                    PathNode.Close,
                    PathNode.MoveTo(238.0f, 88.0f),
                    PathNode.LineTo(238.0f, 184.0f),
                    PathNode.CurveTo(238.0f, 191.73198f, 231.73198f, 198.0f, 224.0f, 198.0f),
                    PathNode.LineTo(32.0f, 198.0f),
                    PathNode.CurveTo(24.268015f, 198.0f, 18.0f, 191.73198f, 18.0f, 184.0f),
                    PathNode.LineTo(18.0f, 88.0f),
                    PathNode.CurveTo(18.0f, 80.26801f, 24.268015f, 74.0f, 32.0f, 74.0f),
                    PathNode.LineTo(50.0f, 74.0f),
                    PathNode.LineTo(50.0f, 56.0f),
                    PathNode.CurveTo(50.0f, 48.268013f, 56.268013f, 42.0f, 64.0f, 42.0f),
                    PathNode.LineTo(96.0f, 42.0f),
                    PathNode.CurveTo(103.73199f, 42.0f, 110.0f, 48.268013f, 110.0f, 56.0f),
                    PathNode.LineTo(110.0f, 74.0f),
                    PathNode.LineTo(146.0f, 74.0f),
                    PathNode.LineTo(146.0f, 56.0f),
                    PathNode.CurveTo(146.0f, 48.268013f, 152.26802f, 42.0f, 160.0f, 42.0f),
                    PathNode.LineTo(192.0f, 42.0f),
                    PathNode.CurveTo(199.73198f, 42.0f, 206.0f, 48.268013f, 206.0f, 56.0f),
                    PathNode.LineTo(206.0f, 74.0f),
                    PathNode.LineTo(224.0f, 74.0f),
                    PathNode.CurveTo(231.73198f, 74.0f, 238.0f, 80.26801f, 238.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(158.0f, 74.0f),
                    PathNode.LineTo(194.0f, 74.0f),
                    PathNode.LineTo(194.0f, 56.0f),
                    PathNode.CurveTo(194.0f, 54.89543f, 193.10457f, 54.0f, 192.0f, 54.0f),
                    PathNode.LineTo(160.0f, 54.0f),
                    PathNode.CurveTo(158.89543f, 54.0f, 158.0f, 54.89543f, 158.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(62.0f, 74.0f),
                    PathNode.LineTo(98.0f, 74.0f),
                    PathNode.LineTo(98.0f, 56.0f),
                    PathNode.CurveTo(98.0f, 54.89543f, 97.10457f, 54.0f, 96.0f, 54.0f),
                    PathNode.LineTo(64.0f, 54.0f),
                    PathNode.CurveTo(62.89543f, 54.0f, 62.0f, 54.89543f, 62.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(226.0f, 88.0f),
                    PathNode.CurveTo(226.0f, 86.89543f, 225.10457f, 86.0f, 224.0f, 86.0f),
                    PathNode.LineTo(32.0f, 86.0f),
                    PathNode.CurveTo(30.89543f, 86.0f, 30.0f, 86.89543f, 30.0f, 88.0f),
                    PathNode.LineTo(30.0f, 184.0f),
                    PathNode.CurveTo(30.0f, 185.10457f, 30.89543f, 186.0f, 32.0f, 186.0f),
                    PathNode.LineTo(224.0f, 186.0f),
                    PathNode.CurveTo(225.10457f, 186.0f, 226.0f, 185.10457f, 226.0f, 184.0f),
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
        return _carBattery!!
    }

private var _carBattery: ImageVector? = null
