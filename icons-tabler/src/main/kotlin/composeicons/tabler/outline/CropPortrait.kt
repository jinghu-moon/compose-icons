package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CropPortrait: ImageVector
    get() {
        if (_cropPortrait != null) return _cropPortrait!!
        _cropPortrait = tablerOutlineIcon(
            name = "CropPortrait",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 6.0f),
                    PathNode.CurveTo(6.0f, 4.895431f, 6.895431f, 4.0f, 8.0f, 4.0f),
                    PathNode.LineTo(16.0f, 4.0f),
                    PathNode.CurveTo(17.10457f, 4.0f, 18.0f, 4.895431f, 18.0f, 6.0f),
                    PathNode.LineTo(18.0f, 18.0f),
                    PathNode.CurveTo(18.0f, 19.10457f, 17.10457f, 20.0f, 16.0f, 20.0f),
                    PathNode.LineTo(8.0f, 20.0f),
                    PathNode.CurveTo(6.895431f, 20.0f, 6.0f, 19.10457f, 6.0f, 18.0f),
                    PathNode.LineTo(6.0f, 6.0f)
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
        return _cropPortrait!!
    }

private var _cropPortrait: ImageVector? = null
