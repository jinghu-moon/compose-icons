package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Eye: ImageVector
    get() {
        if (_eye != null) return _eye!!
        _eye = phosphorFillIcon(
            name = "Eye",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(247.31f, 124.76f),
                    PathNode.CurveTo(246.96f, 123.97f, 238.49f, 105.18f, 219.66f, 86.35f),
                    PathNode.CurveTo(194.57f, 61.26f, 162.88f, 48.0f, 128.0f, 48.0f),
                    PathNode.CurveTo(93.12f, 48.0f, 61.43f, 61.26f, 36.34f, 86.35f),
                    PathNode.CurveTo(17.51f, 105.18f, 9.0f, 124.0f, 8.69f, 124.76f),
                    PathNode.CurveTo(7.770128f, 126.82903f, 7.770128f, 129.19096f, 8.69f, 131.26f),
                    PathNode.CurveTo(9.04f, 132.05f, 17.51f, 150.83f, 36.34f, 169.66f),
                    PathNode.CurveTo(61.43f, 194.74f, 93.12f, 208.0f, 128.0f, 208.0f),
                    PathNode.CurveTo(162.88f, 208.0f, 194.57f, 194.74f, 219.66f, 169.66f),
                    PathNode.CurveTo(238.49f, 150.83f, 246.96f, 132.05f, 247.31f, 131.26f),
                    PathNode.CurveTo(248.22987f, 129.19096f, 248.22987f, 126.82903f, 247.31f, 124.76f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 168.0f),
                    PathNode.CurveTo(105.90861f, 168.0f, 88.0f, 150.09138f, 88.0f, 128.0f),
                    PathNode.CurveTo(88.0f, 105.90861f, 105.90861f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(150.09138f, 88.0f, 168.0f, 105.90861f, 168.0f, 128.0f),
                    PathNode.CurveTo(168.0f, 150.09138f, 150.09138f, 168.0f, 128.0f, 168.0f),
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
        return _eye!!
    }

private var _eye: ImageVector? = null
