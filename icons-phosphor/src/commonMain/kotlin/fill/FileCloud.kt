package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FileCloud: ImageVector
    get() {
        if (_fileCloud != null) return _fileCloud!!
        _fileCloud = phosphorFillIcon(
            name = "FileCloud",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(160.0f, 181.0f),
                    PathNode.CurveTo(159.42339f, 209.31383f, 136.31969f, 231.97324f, 108.0f, 232.0f),
                    PathNode.LineTo(60.72f, 232.0f),
                    PathNode.CurveTo(40.87f, 232.0f, 24.0f, 215.77f, 24.0f, 195.92f),
                    PathNode.CurveTo(24.034027f, 182.56787f, 31.455267f, 170.3313f, 43.28f, 164.13f),
                    PathNode.CurveTo(44.64517f, 163.41924f, 46.29705f, 163.5548f, 47.528084f, 164.4786f),
                    PathNode.CurveTo(48.759117f, 165.4024f, 49.35092f, 166.95059f, 49.05f, 168.46f),
                    PathNode.CurveTo(48.389217f, 172.14f, 48.054585f, 175.87115f, 48.05f, 179.61f),
                    PathNode.CurveTo(47.9437f, 183.94785f, 51.227413f, 187.62123f, 55.55f, 188.0f),
                    PathNode.CurveTo(57.748566f, 188.12387f, 59.900974f, 187.33601f, 61.50006f, 185.8221f),
                    PathNode.CurveTo(63.099144f, 184.30817f, 64.00349f, 182.20206f, 64.0f, 180.0f),
                    PathNode.CurveTo(63.987255f, 173.09512f, 65.47848f, 166.2703f, 68.37f, 160.0f),
                    PathNode.LineTo(68.37f, 160.0f),
                    PathNode.CurveTo(77.84651f, 139.30875f, 100.55044f, 128.11632f, 122.733444f, 133.20027f),
                    PathNode.CurveTo(144.91646f, 138.28423f, 160.48016f, 158.24693f, 160.0f, 181.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 88.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(216.0f, 224.83656f, 208.83656f, 232.0f, 200.0f, 232.0f),
                    PathNode.LineTo(176.0f, 232.0f),
                    PathNode.CurveTo(171.58173f, 232.0f, 168.0f, 228.41827f, 168.0f, 224.0f),
                    PathNode.CurveTo(168.0f, 219.58173f, 171.58173f, 216.0f, 176.0f, 216.0f),
                    PathNode.LineTo(200.0f, 216.0f),
                    PathNode.LineTo(200.0f, 96.0f),
                    PathNode.LineTo(152.0f, 96.0f),
                    PathNode.CurveTo(147.58173f, 96.0f, 144.0f, 92.41828f, 144.0f, 88.0f),
                    PathNode.LineTo(144.0f, 40.0f),
                    PathNode.LineTo(56.0f, 40.0f),
                    PathNode.LineTo(56.0f, 128.0f),
                    PathNode.CurveTo(56.0f, 132.41827f, 52.418278f, 136.0f, 48.0f, 136.0f),
                    PathNode.CurveTo(43.581722f, 136.0f, 40.0f, 132.41827f, 40.0f, 128.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(40.0f, 31.163445f, 47.163445f, 24.0f, 56.0f, 24.0f),
                    PathNode.LineTo(152.0f, 24.0f),
                    PathNode.CurveTo(154.12238f, 23.998331f, 156.15842f, 24.840092f, 157.66f, 26.34f),
                    PathNode.LineTo(213.66f, 82.34f),
                    PathNode.CurveTo(215.15993f, 83.841576f, 216.00166f, 85.87763f, 216.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.69f, 80.0f),
                    PathNode.LineTo(160.0f, 51.31f),
                    PathNode.LineTo(160.0f, 80.0f),
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
        return _fileCloud!!
    }

private var _fileCloud: ImageVector? = null
