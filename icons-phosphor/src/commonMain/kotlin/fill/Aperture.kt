package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Aperture: ImageVector
    get() {
        if (_aperture != null) return _aperture!!
        _aperture = phosphorFillIcon(
            name = "Aperture",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 128.0f),
                    PathNode.CurveTo(232.00072f, 85.93537f, 206.66193f, 48.012375f, 167.79932f, 31.914839f),
                    PathNode.CurveTo(128.9367f, 15.817305f, 84.20382f, 24.715454f, 54.46f, 54.46f),
                    PathNode.CurveTo(24.715454f, 84.20382f, 15.817305f, 128.9367f, 31.914839f, 167.79932f),
                    PathNode.CurveTo(48.012375f, 206.66193f, 85.93537f, 232.00072f, 128.0f, 232.0f),
                    PathNode.LineTo(128.09f, 232.0f),
                    PathNode.CurveTo(185.49246f, 231.95032f, 232.00002f, 185.40248f, 232.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(49.18f, 88.92f),
                    PathNode.LineTo(100.39f, 98.27f),
                    PathNode.LineTo(46.65f, 161.53f),
                    PathNode.CurveTo(37.047356f, 138.08275f, 37.96865f, 111.64201f, 49.18f, 88.92f),
                    PathNode.Close,
                    PathNode.MoveTo(209.35f, 94.46f),
                    PathNode.CurveTo(218.95305f, 117.91061f, 218.0318f, 144.35455f, 206.82f, 167.08f),
                    PathNode.LineTo(155.61f, 157.73f),
                    PathNode.Close,
                    PathNode.MoveTo(201.27f, 79.26f),
                    PathNode.LineTo(167.55f, 119.0f),
                    PathNode.LineTo(139.63f, 40.78f),
                    PathNode.CurveTo(158.79768f, 43.286846f, 176.59302f, 52.079014f, 190.23f, 65.78f),
                    PathNode.CurveTo(194.34329f, 69.9003f, 198.0411f, 74.41539f, 201.27f, 79.26f),
                    PathNode.Close,
                    PathNode.MoveTo(122.43f, 40.19f),
                    PathNode.LineTo(139.94f, 89.19f),
                    PathNode.LineTo(58.3f, 74.32f),
                    PathNode.CurveTo(60.60608f, 71.3144f, 63.101124f, 68.458626f, 65.77f, 65.77f),
                    PathNode.CurveTo(80.88185f, 50.585213f, 101.04597f, 41.481823f, 122.43f, 40.19f),
                    PathNode.Close,
                    PathNode.MoveTo(54.73f, 176.74f),
                    PathNode.LineTo(88.45f, 137.0f),
                    PathNode.LineTo(116.37f, 215.18f),
                    PathNode.CurveTo(91.239624f, 211.83131f, 68.77442f, 197.80696f, 54.73f, 176.7f),
                    PathNode.Close,
                    PathNode.MoveTo(133.57f, 215.8f),
                    PathNode.LineTo(116.06f, 166.8f),
                    PathNode.LineTo(139.14f, 171.0f),
                    PathNode.LineTo(139.14f, 171.0f),
                    PathNode.LineTo(197.66f, 181.69f),
                    PathNode.CurveTo(182.23727f, 201.8186f, 158.84084f, 214.26654f, 133.53f, 215.81f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _aperture!!
    }

private var _aperture: ImageVector? = null
