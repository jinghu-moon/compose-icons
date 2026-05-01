package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Rotate360: ImageVector
    get() {
        if (_rotate360 != null) return _rotate360!!
        _rotate360 = tablerOutlineIcon(
            name = "Rotate360",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 16.0f),
                    PathNode.LineTo(16.0f, 16.0f),
                    PathNode.LineTo(16.0f, 20.0f)
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
                    PathNode.MoveTo(19.458f, 11.042f),
                    PathNode.CurveTo(20.318f, 8.676f, 20.18f, 6.462f, 18.858f, 5.142f),
                    PathNode.CurveTo(16.586f, 2.868f, 11.673f, 4.097f, 7.885f, 7.885f),
                    PathNode.CurveTo(4.097f, 11.673f, 2.868f, 16.586f, 5.141f, 18.859f),
                    PathNode.CurveTo(7.368f, 21.085f, 12.128f, 19.952f, 15.881f, 16.344f)
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
        return _rotate360!!
    }

private var _rotate360: ImageVector? = null
