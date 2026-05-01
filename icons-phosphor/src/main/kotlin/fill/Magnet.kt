package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Magnet: ImageVector
    get() {
        if (_magnet != null) return _magnet!!
        _magnet = phosphorFillIcon(
            name = "Magnet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(207.0f, 50.25f),
                    PathNode.CurveTo(190.56696f, 33.478485f, 168.08038f, 24.018986f, 144.6f, 24.0f),
                    PathNode.LineTo(144.27f, 24.0f),
                    PathNode.CurveTo(120.89898f, 23.939922f, 98.47564f, 33.234066f, 82.0f, 49.81f),
                    PathNode.LineTo(20.61f, 112.0f),
                    PathNode.CurveTo(14.422989f, 118.25709f, 14.449794f, 128.3359f, 20.67f, 134.56f),
                    PathNode.LineTo(49.33f, 163.22f),
                    PathNode.CurveTo(52.326496f, 166.23099f, 56.40207f, 167.91954f, 60.65f, 167.91f),
                    PathNode.LineTo(60.74f, 167.91f),
                    PathNode.CurveTo(65.01884f, 167.88698f, 69.110176f, 166.15105f, 72.1f, 163.09f),
                    PathNode.LineTo(133.0f, 100.69f),
                    PathNode.CurveTo(139.18301f, 94.56874f, 149.11336f, 94.475685f, 155.41f, 100.48f),
                    PathNode.CurveTo(158.43394f, 103.41762f, 160.14014f, 107.454094f, 160.14f, 111.67f),
                    PathNode.CurveTo(160.18091f, 116.15532f, 158.43596f, 120.4727f, 155.29f, 123.67f),
                    PathNode.LineTo(93.0f, 183.88f),
                    PathNode.CurveTo(89.926834f, 186.86412f, 88.17859f, 190.95593f, 88.14664f, 195.23943f),
                    PathNode.CurveTo(88.114685f, 199.52293f, 89.80169f, 203.64037f, 92.83f, 206.67f),
                    PathNode.LineTo(121.49f, 235.33f),
                    PathNode.CurveTo(127.706406f, 241.50813f, 137.72809f, 241.56154f, 144.01f, 235.45f),
                    PathNode.LineTo(205.81f, 175.0f),
                    PathNode.CurveTo(240.26f, 140.5f, 240.79f, 84.56f, 207.0f, 50.25f),
                    PathNode.Close,
                    PathNode.MoveTo(60.65f, 151.89f),
                    PathNode.LineTo(32.0f, 123.24f),
                    PathNode.LineTo(61.42f, 93.43f),
                    PathNode.LineTo(89.9f, 121.91f),
                    PathNode.Close,
                    PathNode.MoveTo(132.79f, 224.0f),
                    PathNode.LineTo(104.11f, 195.35f),
                    PathNode.LineTo(134.24f, 166.22f),
                    PathNode.LineTo(162.73f, 194.7f),
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
        return _magnet!!
    }

private var _magnet: ImageVector? = null
