package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TagChevron: ImageVector
    get() {
        if (_tagChevron != null) return _tagChevron!!
        _tagChevron = phosphorDuotoneIcon(
            name = "TagChevron",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 128.0f),
                    PathNode.LineTo(194.38f, 196.44f),
                    PathNode.CurveTo(192.89502f, 198.66574f, 190.39565f, 200.00174f, 187.72f, 200.0f),
                    PathNode.LineTo(32.0f, 200.0f),
                    PathNode.LineTo(80.0f, 128.0f),
                    PathNode.LineTo(32.0f, 56.0f),
                    PathNode.LineTo(187.72f, 56.0f),
                    PathNode.CurveTo(190.39565f, 55.99826f, 192.89502f, 57.334263f, 194.38f, 59.56f),
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
                    PathNode.MoveTo(246.66f, 123.56f),
                    PathNode.LineTo(201.0f, 55.12f),
                    PathNode.CurveTo(198.0379f, 50.680305f, 193.05711f, 48.00988f, 187.72f, 48.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.CurveTo(29.048187f, 47.99808f, 26.335163f, 49.621777f, 24.94195f, 52.224113f),
                    PathNode.CurveTo(23.548738f, 54.826454f, 23.701742f, 57.984535f, 25.34f, 60.44f),
                    PathNode.LineTo(70.39f, 128.0f),
                    PathNode.LineTo(25.39f, 195.56f),
                    PathNode.CurveTo(23.756653f, 198.00801f, 23.599215f, 201.15512f, 24.980087f, 203.75392f),
                    PathNode.CurveTo(26.360962f, 206.35272f, 29.057161f, 207.98355f, 32.0f, 208.0f),
                    PathNode.LineTo(187.72f, 208.0f),
                    PathNode.CurveTo(193.05711f, 207.99011f, 198.0379f, 205.3197f, 201.0f, 200.88f),
                    PathNode.LineTo(246.63f, 132.44f),
                    PathNode.CurveTo(248.4327f, 129.75777f, 248.44452f, 126.25435f, 246.66f, 123.56f),
                    PathNode.Close,
                    PathNode.MoveTo(187.72f, 192.0f),
                    PathNode.LineTo(47.0f, 192.0f),
                    PathNode.LineTo(86.71f, 132.44f),
                    PathNode.CurveTo(88.50359f, 129.75171f, 88.50359f, 126.2483f, 86.71f, 123.56f),
                    PathNode.LineTo(47.0f, 64.0f),
                    PathNode.LineTo(187.72f, 64.0f),
                    PathNode.LineTo(230.39f, 128.0f),
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
        return _tagChevron!!
    }

private var _tagChevron: ImageVector? = null
