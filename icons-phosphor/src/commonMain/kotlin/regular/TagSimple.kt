package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TagSimple: ImageVector
    get() {
        if (_tagSimple != null) return _tagSimple!!
        _tagSimple = phosphorRegularIcon(
            name = "TagSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(246.66f, 123.56f),
                    PathNode.LineTo(201.0f, 55.13f),
                    PathNode.CurveTo(198.04764f, 50.67831f, 193.06172f, 48.001377f, 187.72f, 48.0f),
                    PathNode.LineTo(40.0f, 48.0f),
                    PathNode.CurveTo(31.163445f, 48.0f, 24.0f, 55.163445f, 24.0f, 64.0f),
                    PathNode.LineTo(24.0f, 192.0f),
                    PathNode.CurveTo(24.0f, 200.83656f, 31.163445f, 208.0f, 40.0f, 208.0f),
                    PathNode.LineTo(187.72f, 208.0f),
                    PathNode.CurveTo(193.05711f, 207.99011f, 198.0379f, 205.3197f, 201.0f, 200.88f),
                    PathNode.LineTo(246.63f, 132.44f),
                    PathNode.CurveTo(248.4327f, 129.75777f, 248.44452f, 126.25435f, 246.66f, 123.56f),
                    PathNode.Close,
                    PathNode.MoveTo(187.72f, 192.0f),
                    PathNode.LineTo(40.0f, 192.0f),
                    PathNode.LineTo(40.0f, 64.0f),
                    PathNode.LineTo(187.72f, 64.0f),
                    PathNode.LineTo(230.38f, 128.0f),
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
        return _tagSimple!!
    }

private var _tagSimple: ImageVector? = null
