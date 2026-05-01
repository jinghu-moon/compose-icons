package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Swipe: ImageVector
    get() {
        if (_swipe != null) return _swipe!!
        _swipe = tablerOutlineIcon(
            name = "Swipe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 16.572f),
                    PathNode.LineTo(15.0f, 18.992f),
                    PathNode.CurveTo(14.998897f, 20.100922f, 14.099921f, 20.999449f, 12.991f, 21.0f),
                    PathNode.LineTo(5.01f, 21.0f),
                    PathNode.CurveTo(3.900298f, 21.0f, 3.000552f, 20.100702f, 3.0f, 18.991f),
                    PathNode.LineTo(3.0f, 11.01f),
                    PathNode.CurveTo(3.0f, 9.900298f, 3.899298f, 9.000552f, 5.009f, 9.0f),
                    PathNode.LineTo(7.963f, 9.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.167f, 4.511f),
                    PathNode.CurveTo(9.459299f, 3.424572f, 10.575987f, 2.779881f, 11.663f, 3.07f),
                    PathNode.LineTo(19.489f, 5.167f),
                    PathNode.CurveTo(20.575428f, 5.4593f, 21.22012f, 6.575988f, 20.93f, 7.663f),
                    PathNode.LineTo(18.833f, 15.489f),
                    PathNode.CurveTo(18.5407f, 16.575428f, 17.424013f, 17.22012f, 16.337f, 16.93f),
                    PathNode.LineTo(8.51f, 14.833f),
                    PathNode.CurveTo(7.423572f, 14.540701f, 6.778882f, 13.424013f, 7.069f, 12.337f),
                    PathNode.LineTo(9.167f, 4.51f),
                    PathNode.LineTo(9.167f, 4.511f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _swipe!!
    }

private var _swipe: ImageVector? = null
