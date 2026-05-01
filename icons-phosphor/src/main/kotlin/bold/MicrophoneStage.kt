package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MicrophoneStage: ImageVector
    get() {
        if (_microphoneStage != null) return _microphoneStage!!
        _microphoneStage = phosphorBoldIcon(
            name = "MicrophoneStage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 12.0f),
                    PathNode.CurveTo(146.38843f, 11.977333f, 125.79204f, 21.168617f, 111.37552f, 37.269066f),
                    PathNode.CurveTo(96.95901f, 53.36951f, 90.08965f, 74.852135f, 92.49f, 96.33f),
                    PathNode.LineTo(23.91f, 189.85f),
                    PathNode.CurveTo(18.009983f, 197.80574f, 18.862637f, 208.89021f, 25.91f, 215.85f),
                    PathNode.LineTo(40.2f, 230.14f),
                    PathNode.CurveTo(47.159786f, 237.18736f, 58.24426f, 238.04001f, 66.2f, 232.14f),
                    PathNode.LineTo(159.72f, 163.56f),
                    PathNode.CurveTo(187.67238f, 166.58066f, 215.0088f, 153.92291f, 230.78773f, 130.65308f),
                    PathNode.CurveTo(246.56668f, 107.38324f, 248.20999f, 77.303375f, 235.05995f, 52.45309f),
                    PathNode.CurveTo(221.90993f, 27.602808f, 196.1151f, 12.042404f, 168.0f, 12.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 88.0f),
                    PathNode.CurveTo(220.01021f, 97.63485f, 217.32579f, 107.08057f, 212.25f, 115.27f),
                    PathNode.LineTo(140.74f, 43.75f),
                    PathNode.CurveTo(156.77893f, 33.87642f, 176.90312f, 33.44744f, 193.34824f, 42.62857f),
                    PathNode.CurveTo(209.79335f, 51.8097f, 219.98842f, 69.1656f, 220.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(54.72f, 210.71f),
                    PathNode.LineTo(45.29f, 201.28f),
                    PathNode.LineTo(101.48f, 124.65f),
                    PathNode.CurveTo(108.43411f, 137.21411f, 118.78589f, 147.56589f, 131.35f, 154.52f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 88.0f),
                    PathNode.CurveTo(115.98819f, 78.36493f, 118.67274f, 68.918785f, 123.75f, 60.73f),
                    PathNode.LineTo(195.26f, 132.24f),
                    PathNode.CurveTo(179.2226f, 142.11264f, 159.10057f, 142.54254f, 142.65613f, 133.36388f),
                    PathNode.CurveTo(126.21169f, 124.18519f, 116.0152f, 106.83261f, 116.0f, 88.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _microphoneStage!!
    }

private var _microphoneStage: ImageVector? = null
