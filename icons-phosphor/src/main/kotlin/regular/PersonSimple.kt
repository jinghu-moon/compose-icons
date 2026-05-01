package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PersonSimple: ImageVector
    get() {
        if (_personSimple != null) return _personSimple!!
        _personSimple = phosphorRegularIcon(
            name = "PersonSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 80.0f),
                    PathNode.CurveTo(145.67311f, 80.0f, 160.0f, 65.67311f, 160.0f, 48.0f),
                    PathNode.CurveTo(160.0f, 30.326887f, 145.67311f, 16.0f, 128.0f, 16.0f),
                    PathNode.CurveTo(110.32689f, 16.0f, 96.0f, 30.326887f, 96.0f, 48.0f),
                    PathNode.CurveTo(96.0f, 65.67311f, 110.32689f, 80.0f, 128.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 32.0f),
                    PathNode.CurveTo(136.83656f, 32.0f, 144.0f, 39.163445f, 144.0f, 48.0f),
                    PathNode.CurveTo(144.0f, 56.836555f, 136.83656f, 64.0f, 128.0f, 64.0f),
                    PathNode.CurveTo(119.163445f, 64.0f, 112.0f, 56.836555f, 112.0f, 48.0f),
                    PathNode.CurveTo(112.0f, 39.163445f, 119.163445f, 32.0f, 128.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(230.86f, 132.12f),
                    PathNode.CurveTo(229.76761f, 133.94531f, 227.99323f, 135.2604f, 225.92906f, 135.77457f),
                    PathNode.CurveTo(223.86491f, 136.28873f, 221.68097f, 135.95963f, 219.86f, 134.86f),
                    PathNode.CurveTo(219.51f, 134.65f, 184.75f, 114.27f, 135.98f, 112.19f),
                    PathNode.LineTo(135.98f, 149.0f),
                    PathNode.LineTo(197.98f, 218.73f),
                    PathNode.CurveTo(200.91263f, 222.0437f, 200.60371f, 227.10736f, 197.29f, 230.04f),
                    PathNode.CurveTo(193.97629f, 232.97263f, 188.91263f, 232.66371f, 185.98f, 229.35f),
                    PathNode.LineTo(128.0f, 164.0f),
                    PathNode.LineTo(70.0f, 229.31f),
                    PathNode.CurveTo(67.06737f, 232.6237f, 62.003708f, 232.93263f, 58.69f, 230.0f),
                    PathNode.CurveTo(55.376293f, 227.06737f, 55.067368f, 222.00371f, 58.0f, 218.69f),
                    PathNode.LineTo(120.0f, 149.0f),
                    PathNode.LineTo(120.0f, 112.18f),
                    PathNode.CurveTo(71.0f, 114.26f, 36.48f, 134.64f, 36.12f, 134.86f),
                    PathNode.CurveTo(33.667526f, 136.36667f, 30.594728f, 136.43973f, 28.073418f, 135.05133f),
                    PathNode.CurveTo(25.552109f, 133.66292f, 23.971003f, 131.0271f, 23.933056f, 128.14905f),
                    PathNode.CurveTo(23.89511f, 125.27098f, 25.406172f, 122.5944f, 27.89f, 121.14f),
                    PathNode.CurveTo(29.6f, 120.11f, 70.45f, 96.0f, 128.0f, 96.0f),
                    PathNode.CurveTo(185.55f, 96.0f, 226.4f, 120.11f, 228.12f, 121.14f),
                    PathNode.CurveTo(229.93982f, 122.2323f, 231.25099f, 124.003f, 231.7649f, 126.06232f),
                    PathNode.CurveTo(232.27878f, 128.12163f, 231.95326f, 130.30075f, 230.86f, 132.12f),
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
        return _personSimple!!
    }

private var _personSimple: ImageVector? = null
