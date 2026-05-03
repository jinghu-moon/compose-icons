package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Magnet: ImageVector
    get() {
        if (_magnet != null) return _magnet!!
        _magnet = phosphorRegularIcon(
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
                    PathNode.LineTo(55.8f, 99.12f),
                    PathNode.LineTo(84.32f, 127.64f),
                    PathNode.Close,
                    PathNode.MoveTo(132.79f, 224.0f),
                    PathNode.LineTo(104.11f, 195.35f),
                    PathNode.LineTo(128.49f, 171.78f),
                    PathNode.LineTo(157.0f, 200.32f),
                    PathNode.Close,
                    PathNode.MoveTo(194.55f, 163.56f),
                    PathNode.LineTo(168.44f, 189.1f),
                    PathNode.LineTo(140.0f, 160.68f),
                    PathNode.LineTo(166.44f, 135.11f),
                    PathNode.LineTo(166.54f, 135.02f),
                    PathNode.CurveTo(172.73442f, 128.77513f, 176.17938f, 120.315704f, 176.11f, 111.52f),
                    PathNode.CurveTo(176.07352f, 103.01874f, 172.59587f, 94.894615f, 166.47f, 89.0f),
                    PathNode.CurveTo(153.83653f, 76.98249f, 133.93272f, 77.20414f, 121.57f, 89.5f),
                    PathNode.LineTo(95.49f, 116.18f),
                    PathNode.LineTo(67.0f, 87.74f),
                    PathNode.LineTo(93.35f, 61.09f),
                    PathNode.CurveTo(106.8236f, 47.53874f, 125.16054f, 39.943962f, 144.27f, 40.0f),
                    PathNode.LineTo(144.54f, 40.0f),
                    PathNode.CurveTo(163.75023f, 40.016552f, 182.14687f, 47.7572f, 195.59f, 61.48f),
                    PathNode.CurveTo(223.25f, 89.55f, 222.75f, 135.38f, 194.55f, 163.58f),
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
        return _magnet!!
    }

private var _magnet: ImageVector? = null
