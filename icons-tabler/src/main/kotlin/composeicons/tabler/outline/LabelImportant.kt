package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LabelImportant: ImageVector
    get() {
        if (_labelImportant != null) return _labelImportant!!
        _labelImportant = tablerOutlineIcon(
            name = "LabelImportant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.52f, 7.0f),
                    PathNode.LineTo(4.0f, 7.0f),
                    PathNode.LineTo(8.0f, 12.0f),
                    PathNode.LineTo(4.0f, 17.0f),
                    PathNode.LineTo(16.52f, 17.0f),
                    PathNode.CurveTo(16.823427f, 16.999811f, 17.110357f, 16.861864f, 17.3f, 16.625f),
                    PathNode.LineTo(21.0f, 12.0f),
                    PathNode.LineTo(17.3f, 7.375f),
                    PathNode.CurveTo(17.110357f, 7.138137f, 16.823427f, 7.00019f, 16.52f, 7.0f)
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
        return _labelImportant!!
    }

private var _labelImportant: ImageVector? = null
