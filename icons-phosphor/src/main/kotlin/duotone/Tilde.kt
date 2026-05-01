package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Tilde: ImageVector
    get() {
        if (_tilde != null) return _tilde!!
        _tilde = phosphorDuotoneIcon(
            name = "Tilde",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 56.0f),
                    PathNode.LineTo(216.0f, 200.0f),
                    PathNode.CurveTo(216.0f, 208.83656f, 208.83656f, 216.0f, 200.0f, 216.0f),
                    PathNode.LineTo(56.0f, 216.0f),
                    PathNode.CurveTo(47.163445f, 216.0f, 40.0f, 208.83656f, 40.0f, 200.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.CurveTo(40.0f, 47.163445f, 47.163445f, 40.0f, 56.0f, 40.0f),
                    PathNode.LineTo(200.0f, 40.0f),
                    PathNode.CurveTo(208.83656f, 40.0f, 216.0f, 47.163445f, 216.0f, 56.0f),
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
                    PathNode.MoveTo(222.23f, 130.59f),
                    PathNode.CurveTo(207.72f, 148.59f, 193.39f, 158.19f, 178.43f, 159.76f),
                    PathNode.CurveTo(176.93523f, 159.9186f, 175.43317f, 159.9987f, 173.93f, 160.0f),
                    PathNode.CurveTo(154.63f, 160.0f, 138.54f, 146.9f, 122.93f, 134.2f),
                    PathNode.CurveTo(108.02f, 122.06f, 93.93f, 110.59f, 79.23f, 112.2f),
                    PathNode.CurveTo(68.72f, 113.3f, 57.92f, 120.92f, 46.23f, 135.48f),
                    PathNode.CurveTo(43.3944f, 138.64601f, 38.57811f, 139.04205f, 35.263416f, 136.38179f),
                    PathNode.CurveTo(31.94872f, 133.72151f, 31.292843f, 128.93369f, 33.77f, 125.48f),
                    PathNode.CurveTo(48.28f, 107.48f, 62.61f, 97.88f, 77.57f, 96.31f),
                    PathNode.CurveTo(98.89f, 94.06f, 116.26f, 108.2f, 133.05f, 121.87f),
                    PathNode.CurveTo(147.96f, 134.01f, 162.05f, 145.49f, 176.75f, 143.87f),
                    PathNode.CurveTo(187.26f, 142.77f, 198.06f, 135.15f, 209.75f, 120.59f),
                    PathNode.CurveTo(211.47603f, 118.18354f, 214.39024f, 116.92747f, 217.32487f, 117.325096f),
                    PathNode.CurveTo(220.25952f, 117.722725f, 222.73442f, 119.709f, 223.75784f, 122.48798f),
                    PathNode.CurveTo(224.78127f, 125.266975f, 224.18579f, 128.38399f, 222.21f, 130.59f),
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
        return _tilde!!
    }

private var _tilde: ImageVector? = null
