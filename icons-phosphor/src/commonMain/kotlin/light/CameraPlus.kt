package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CameraPlus: ImageVector
    get() {
        if (_cameraPlus != null) return _cameraPlus!!
        _cameraPlus = phosphorLightIcon(
            name = "CameraPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(166.0f, 136.0f),
                    PathNode.CurveTo(166.0f, 139.3137f, 163.3137f, 142.0f, 160.0f, 142.0f),
                    PathNode.LineTo(134.0f, 142.0f),
                    PathNode.LineTo(134.0f, 168.0f),
                    PathNode.CurveTo(134.0f, 171.3137f, 131.3137f, 174.0f, 128.0f, 174.0f),
                    PathNode.CurveTo(124.686295f, 174.0f, 122.0f, 171.3137f, 122.0f, 168.0f),
                    PathNode.LineTo(122.0f, 142.0f),
                    PathNode.LineTo(96.0f, 142.0f),
                    PathNode.CurveTo(92.686295f, 142.0f, 90.0f, 139.3137f, 90.0f, 136.0f),
                    PathNode.CurveTo(90.0f, 132.6863f, 92.686295f, 130.0f, 96.0f, 130.0f),
                    PathNode.LineTo(122.0f, 130.0f),
                    PathNode.LineTo(122.0f, 104.0f),
                    PathNode.CurveTo(122.0f, 100.686295f, 124.686295f, 98.0f, 128.0f, 98.0f),
                    PathNode.CurveTo(131.3137f, 98.0f, 134.0f, 100.686295f, 134.0f, 104.0f),
                    PathNode.LineTo(134.0f, 130.0f),
                    PathNode.LineTo(160.0f, 130.0f),
                    PathNode.CurveTo(163.3137f, 130.0f, 166.0f, 132.6863f, 166.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(230.0f, 80.0f),
                    PathNode.LineTo(230.0f, 192.0f),
                    PathNode.CurveTo(230.0f, 204.15027f, 220.15027f, 214.0f, 208.0f, 214.0f),
                    PathNode.LineTo(48.0f, 214.0f),
                    PathNode.CurveTo(35.849735f, 214.0f, 26.0f, 204.15027f, 26.0f, 192.0f),
                    PathNode.LineTo(26.0f, 80.0f),
                    PathNode.CurveTo(26.0f, 67.84974f, 35.849735f, 58.0f, 48.0f, 58.0f),
                    PathNode.LineTo(76.79f, 58.0f),
                    PathNode.LineTo(88.63f, 40.23f),
                    PathNode.CurveTo(91.22774f, 36.336433f, 95.599396f, 33.99863f, 100.28f, 34.0f),
                    PathNode.LineTo(155.72f, 34.0f),
                    PathNode.CurveTo(160.4006f, 33.99863f, 164.77226f, 36.336433f, 167.37f, 40.23f),
                    PathNode.LineTo(179.21f, 58.0f),
                    PathNode.LineTo(208.0f, 58.0f),
                    PathNode.CurveTo(220.15027f, 58.0f, 230.0f, 67.84974f, 230.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 80.0f),
                    PathNode.CurveTo(218.0f, 74.47715f, 213.52284f, 70.0f, 208.0f, 70.0f),
                    PathNode.LineTo(176.0f, 70.0f),
                    PathNode.CurveTo(173.9915f, 70.002975f, 172.11472f, 69.00078f, 171.0f, 67.33f),
                    PathNode.LineTo(157.38f, 46.89f),
                    PathNode.CurveTo(157.00974f, 46.335037f, 156.38715f, 46.001236f, 155.72f, 46.0f),
                    PathNode.LineTo(100.28f, 46.0f),
                    PathNode.CurveTo(99.61286f, 46.001236f, 98.990265f, 46.335037f, 98.62f, 46.89f),
                    PathNode.LineTo(85.0f, 67.33f),
                    PathNode.CurveTo(83.885284f, 69.00078f, 82.00851f, 70.002975f, 80.0f, 70.0f),
                    PathNode.LineTo(48.0f, 70.0f),
                    PathNode.CurveTo(42.477154f, 70.0f, 38.0f, 74.47715f, 38.0f, 80.0f),
                    PathNode.LineTo(38.0f, 192.0f),
                    PathNode.CurveTo(38.0f, 197.52284f, 42.477154f, 202.0f, 48.0f, 202.0f),
                    PathNode.LineTo(208.0f, 202.0f),
                    PathNode.CurveTo(213.52284f, 202.0f, 218.0f, 197.52284f, 218.0f, 192.0f),
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
        return _cameraPlus!!
    }

private var _cameraPlus: ImageVector? = null
