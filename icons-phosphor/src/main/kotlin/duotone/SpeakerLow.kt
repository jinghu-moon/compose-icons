package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SpeakerLow: ImageVector
    get() {
        if (_speakerLow != null) return _speakerLow!!
        _speakerLow = phosphorDuotoneIcon(
            name = "SpeakerLow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(80.0f, 88.0f),
                    PathNode.LineTo(80.0f, 168.0f),
                    PathNode.LineTo(32.0f, 168.0f),
                    PathNode.CurveTo(27.581722f, 168.0f, 24.0f, 164.41827f, 24.0f, 160.0f),
                    PathNode.LineTo(24.0f, 96.0f),
                    PathNode.CurveTo(24.0f, 91.58172f, 27.581722f, 88.0f, 32.0f, 88.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(155.51f, 24.81f),
                    PathNode.CurveTo(152.76537f, 23.472578f, 149.4988f, 23.813976f, 147.09f, 25.69f),
                    PathNode.LineTo(77.25f, 80.0f),
                    PathNode.LineTo(32.0f, 80.0f),
                    PathNode.CurveTo(23.163445f, 80.0f, 16.0f, 87.163445f, 16.0f, 96.0f),
                    PathNode.LineTo(16.0f, 160.0f),
                    PathNode.CurveTo(16.0f, 168.83656f, 23.163445f, 176.0f, 32.0f, 176.0f),
                    PathNode.LineTo(77.25f, 176.0f),
                    PathNode.LineTo(147.09f, 230.31f),
                    PathNode.CurveTo(149.50114f, 232.18442f, 152.76915f, 232.5225f, 155.51299f, 231.18141f),
                    PathNode.CurveTo(158.25682f, 229.84032f, 159.99771f, 227.05403f, 160.0f, 224.0f),
                    PathNode.LineTo(160.0f, 32.0f),
                    PathNode.CurveTo(160.00043f, 28.942192f, 158.25777f, 26.151613f, 155.51f, 24.81f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 96.0f),
                    PathNode.LineTo(72.0f, 96.0f),
                    PathNode.LineTo(72.0f, 160.0f),
                    PathNode.LineTo(32.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 207.64f),
                    PathNode.LineTo(88.0f, 164.09f),
                    PathNode.LineTo(88.0f, 91.91f),
                    PathNode.LineTo(144.0f, 48.36f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 128.0f),
                    PathNode.CurveTo(208.00706f, 137.74475f, 204.4504f, 147.15572f, 198.0f, 154.46f),
                    PathNode.CurveTo(195.05927f, 157.69128f, 190.06998f, 157.96559f, 186.79274f, 155.07616f),
                    PathNode.CurveTo(183.51549f, 152.18672f, 183.16258f, 147.20238f, 186.0f, 143.88f),
                    PathNode.CurveTo(193.98296f, 134.81346f, 193.98296f, 121.226524f, 186.0f, 112.16f),
                    PathNode.CurveTo(184.05605f, 110.02397f, 183.41435f, 107.005974f, 184.32109f, 104.263824f),
                    PathNode.CurveTo(185.22783f, 101.52167f, 187.54222f, 99.481155f, 190.37636f, 98.92509f),
                    PathNode.CurveTo(193.21051f, 98.369026f, 196.12433f, 99.38376f, 198.0f, 101.58f),
                    PathNode.CurveTo(204.43565f, 108.87734f, 207.99088f, 118.27021f, 208.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _speakerLow!!
    }

private var _speakerLow: ImageVector? = null
