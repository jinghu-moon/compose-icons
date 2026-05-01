package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Crop32: ImageVector
    get() {
        if (_crop32 != null) return _crop32!!
        _crop32 = tablerOutlineIcon(
            name = "Crop32",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 9.0f),
                    PathNode.CurveTo(4.0f, 7.895431f, 4.895431f, 7.0f, 6.0f, 7.0f),
                    PathNode.LineTo(18.0f, 7.0f),
                    PathNode.CurveTo(19.10457f, 7.0f, 20.0f, 7.895431f, 20.0f, 9.0f),
                    PathNode.LineTo(20.0f, 15.0f),
                    PathNode.CurveTo(20.0f, 16.10457f, 19.10457f, 17.0f, 18.0f, 17.0f),
                    PathNode.LineTo(6.0f, 17.0f),
                    PathNode.CurveTo(4.895431f, 17.0f, 4.0f, 16.10457f, 4.0f, 15.0f),
                    PathNode.LineTo(4.0f, 9.0f)
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
        return _crop32!!
    }

private var _crop32: ImageVector? = null
