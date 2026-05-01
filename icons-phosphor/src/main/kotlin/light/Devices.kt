package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Devices: ImageVector
    get() {
        if (_devices != null) return _devices!!
        _devices = phosphorLightIcon(
            name = "Devices",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 74.0f),
                    PathNode.LineTo(206.0f, 74.0f),
                    PathNode.LineTo(206.0f, 64.0f),
                    PathNode.CurveTo(206.0f, 51.849735f, 196.15027f, 42.0f, 184.0f, 42.0f),
                    PathNode.LineTo(40.0f, 42.0f),
                    PathNode.CurveTo(27.849735f, 42.0f, 18.0f, 51.849735f, 18.0f, 64.0f),
                    PathNode.LineTo(18.0f, 160.0f),
                    PathNode.CurveTo(18.0f, 172.15027f, 27.849735f, 182.0f, 40.0f, 182.0f),
                    PathNode.LineTo(154.0f, 182.0f),
                    PathNode.LineTo(154.0f, 192.0f),
                    PathNode.CurveTo(154.0f, 204.15027f, 163.84973f, 214.0f, 176.0f, 214.0f),
                    PathNode.LineTo(224.0f, 214.0f),
                    PathNode.CurveTo(236.15027f, 214.0f, 246.0f, 204.15027f, 246.0f, 192.0f),
                    PathNode.LineTo(246.0f, 96.0f),
                    PathNode.CurveTo(246.0f, 83.84974f, 236.15027f, 74.0f, 224.0f, 74.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 170.0f),
                    PathNode.CurveTo(34.477154f, 170.0f, 30.0f, 165.52284f, 30.0f, 160.0f),
                    PathNode.LineTo(30.0f, 64.0f),
                    PathNode.CurveTo(30.0f, 58.477154f, 34.477154f, 54.0f, 40.0f, 54.0f),
                    PathNode.LineTo(184.0f, 54.0f),
                    PathNode.CurveTo(189.52284f, 54.0f, 194.0f, 58.477154f, 194.0f, 64.0f),
                    PathNode.LineTo(194.0f, 74.0f),
                    PathNode.LineTo(176.0f, 74.0f),
                    PathNode.CurveTo(163.84973f, 74.0f, 154.0f, 83.84974f, 154.0f, 96.0f),
                    PathNode.LineTo(154.0f, 170.0f),
                    PathNode.Close,
                    PathNode.MoveTo(234.0f, 192.0f),
                    PathNode.CurveTo(234.0f, 197.52284f, 229.52284f, 202.0f, 224.0f, 202.0f),
                    PathNode.LineTo(176.0f, 202.0f),
                    PathNode.CurveTo(170.47716f, 202.0f, 166.0f, 197.52284f, 166.0f, 192.0f),
                    PathNode.LineTo(166.0f, 96.0f),
                    PathNode.CurveTo(166.0f, 90.47715f, 170.47716f, 86.0f, 176.0f, 86.0f),
                    PathNode.LineTo(224.0f, 86.0f),
                    PathNode.CurveTo(229.52284f, 86.0f, 234.0f, 90.47715f, 234.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(134.0f, 208.0f),
                    PathNode.CurveTo(134.0f, 211.3137f, 131.3137f, 214.0f, 128.0f, 214.0f),
                    PathNode.LineTo(88.0f, 214.0f),
                    PathNode.CurveTo(84.686295f, 214.0f, 82.0f, 211.3137f, 82.0f, 208.0f),
                    PathNode.CurveTo(82.0f, 204.6863f, 84.686295f, 202.0f, 88.0f, 202.0f),
                    PathNode.LineTo(128.0f, 202.0f),
                    PathNode.CurveTo(131.3137f, 202.0f, 134.0f, 204.6863f, 134.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(214.0f, 112.0f),
                    PathNode.CurveTo(214.0f, 115.313705f, 211.3137f, 118.0f, 208.0f, 118.0f),
                    PathNode.LineTo(192.0f, 118.0f),
                    PathNode.CurveTo(188.6863f, 118.0f, 186.0f, 115.313705f, 186.0f, 112.0f),
                    PathNode.CurveTo(186.0f, 108.686295f, 188.6863f, 106.0f, 192.0f, 106.0f),
                    PathNode.LineTo(208.0f, 106.0f),
                    PathNode.CurveTo(211.3137f, 106.0f, 214.0f, 108.686295f, 214.0f, 112.0f),
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
        return _devices!!
    }

private var _devices: ImageVector? = null
