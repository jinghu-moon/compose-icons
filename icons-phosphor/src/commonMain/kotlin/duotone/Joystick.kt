package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Joystick: ImageVector
    get() {
        if (_joystick != null) return _joystick!!
        _joystick = phosphorDuotoneIcon(
            name = "Joystick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 160.0f),
                    PathNode.LineTo(216.0f, 208.0f),
                    PathNode.CurveTo(216.0f, 212.41827f, 212.41827f, 216.0f, 208.0f, 216.0f),
                    PathNode.LineTo(48.0f, 216.0f),
                    PathNode.CurveTo(43.581722f, 216.0f, 40.0f, 212.41827f, 40.0f, 208.0f),
                    PathNode.LineTo(40.0f, 160.0f),
                    PathNode.CurveTo(40.0f, 155.58173f, 43.581722f, 152.0f, 48.0f, 152.0f),
                    PathNode.LineTo(208.0f, 152.0f),
                    PathNode.CurveTo(212.41827f, 152.0f, 216.0f, 155.58173f, 216.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 88.0f),
                    PathNode.CurveTo(145.67311f, 88.0f, 160.0f, 73.67311f, 160.0f, 56.0f),
                    PathNode.CurveTo(160.0f, 38.32689f, 145.67311f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(110.32689f, 24.0f, 96.0f, 38.32689f, 96.0f, 56.0f),
                    PathNode.CurveTo(96.0f, 73.67311f, 110.32689f, 88.0f, 128.0f, 88.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 144.0f),
                    PathNode.LineTo(136.0f, 144.0f),
                    PathNode.LineTo(136.0f, 95.19f),
                    PathNode.CurveTo(156.1197f, 91.08309f, 169.86136f, 72.40841f, 167.79744f, 51.97781f),
                    PathNode.CurveTo(165.73354f, 31.547201f, 148.53459f, 15.998164f, 128.0f, 15.998164f),
                    PathNode.CurveTo(107.46541f, 15.998164f, 90.266464f, 31.547201f, 88.20255f, 51.97781f),
                    PathNode.CurveTo(86.13864f, 72.40841f, 99.880295f, 91.08309f, 120.0f, 95.19f),
                    PathNode.LineTo(120.0f, 144.0f),
                    PathNode.LineTo(48.0f, 144.0f),
                    PathNode.CurveTo(39.163445f, 144.0f, 32.0f, 151.16344f, 32.0f, 160.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 160.0f),
                    PathNode.CurveTo(224.0f, 151.16344f, 216.83656f, 144.0f, 208.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 56.0f),
                    PathNode.CurveTo(104.0f, 42.745167f, 114.74516f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(141.25484f, 32.0f, 152.0f, 42.745167f, 152.0f, 56.0f),
                    PathNode.CurveTo(152.0f, 69.25484f, 141.25484f, 80.0f, 128.0f, 80.0f),
                    PathNode.CurveTo(114.74516f, 80.0f, 104.0f, 69.25484f, 104.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 160.0f),
                    PathNode.LineTo(208.0f, 160.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 112.0f),
                    PathNode.LineTo(200.0f, 112.0f),
                    PathNode.CurveTo(204.41827f, 112.0f, 208.0f, 115.58172f, 208.0f, 120.0f),
                    PathNode.CurveTo(208.0f, 124.41828f, 204.41827f, 128.0f, 200.0f, 128.0f),
                    PathNode.LineTo(168.0f, 128.0f),
                    PathNode.CurveTo(163.58173f, 128.0f, 160.0f, 124.41828f, 160.0f, 120.0f),
                    PathNode.CurveTo(160.0f, 115.58172f, 163.58173f, 112.0f, 168.0f, 112.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _joystick!!
    }

private var _joystick: ImageVector? = null
