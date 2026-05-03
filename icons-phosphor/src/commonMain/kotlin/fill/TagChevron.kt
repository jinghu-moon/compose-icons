package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TagChevron: ImageVector
    get() {
        if (_tagChevron != null) return _tagChevron!!
        _tagChevron = phosphorFillIcon(
            name = "TagChevron",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(246.66f, 132.44f),
                    PathNode.LineTo(201.0f, 200.88f),
                    PathNode.CurveTo(198.0379f, 205.3197f, 193.05711f, 207.99011f, 187.72f, 208.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(29.048187f, 208.00192f, 26.335163f, 206.37822f, 24.94195f, 203.77588f),
                    PathNode.CurveTo(23.548738f, 201.17355f, 23.701742f, 198.01547f, 25.34f, 195.56f),
                    PathNode.LineTo(70.39f, 128.0f),
                    PathNode.LineTo(25.39f, 60.44f),
                    PathNode.CurveTo(23.756653f, 57.99199f, 23.599215f, 54.84488f, 24.980087f, 52.24608f),
                    PathNode.CurveTo(26.360962f, 49.64728f, 29.057161f, 48.01645f, 32.0f, 48.0f),
                    PathNode.LineTo(187.72f, 48.0f),
                    PathNode.CurveTo(193.05711f, 48.00988f, 198.0379f, 50.680305f, 201.0f, 55.12f),
                    PathNode.LineTo(246.63f, 123.56f),
                    PathNode.CurveTo(248.4327f, 126.24223f, 248.44452f, 129.74565f, 246.66f, 132.44f),
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
        return _tagChevron!!
    }

private var _tagChevron: ImageVector? = null
