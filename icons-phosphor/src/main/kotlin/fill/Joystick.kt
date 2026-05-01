package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Joystick: ImageVector
    get() {
        if (_joystick != null) return _joystick!!
        _joystick = phosphorFillIcon(
            name = "Joystick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 160.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.CurveTo(224.0f, 216.83656f, 216.83656f, 224.0f, 208.0f, 224.0f),
                    PathNode.LineTo(48.0f, 224.0f),
                    PathNode.CurveTo(39.163445f, 224.0f, 32.0f, 216.83656f, 32.0f, 208.0f),
                    PathNode.LineTo(32.0f, 160.0f),
                    PathNode.CurveTo(32.0f, 151.16344f, 39.163445f, 144.0f, 48.0f, 144.0f),
                    PathNode.LineTo(120.0f, 144.0f),
                    PathNode.LineTo(120.0f, 95.19f),
                    PathNode.CurveTo(99.880295f, 91.08309f, 86.13864f, 72.40841f, 88.20255f, 51.97781f),
                    PathNode.CurveTo(90.266464f, 31.547201f, 107.46541f, 15.998164f, 128.0f, 15.998164f),
                    PathNode.CurveTo(148.53459f, 15.998164f, 165.73354f, 31.547201f, 167.79744f, 51.97781f),
                    PathNode.CurveTo(169.86136f, 72.40841f, 156.1197f, 91.08309f, 136.0f, 95.19f),
                    PathNode.LineTo(136.0f, 144.0f),
                    PathNode.LineTo(208.0f, 144.0f),
                    PathNode.CurveTo(216.83656f, 144.0f, 224.0f, 151.16344f, 224.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 120.0f),
                    PathNode.CurveTo(160.0f, 124.41828f, 163.58173f, 128.0f, 168.0f, 128.0f),
                    PathNode.LineTo(200.0f, 128.0f),
                    PathNode.CurveTo(204.41827f, 128.0f, 208.0f, 124.41828f, 208.0f, 120.0f),
                    PathNode.CurveTo(208.0f, 115.58172f, 204.41827f, 112.0f, 200.0f, 112.0f),
                    PathNode.LineTo(168.0f, 112.0f),
                    PathNode.CurveTo(163.58173f, 112.0f, 160.0f, 115.58172f, 160.0f, 120.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _joystick!!
    }

private var _joystick: ImageVector? = null
