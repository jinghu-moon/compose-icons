package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LabelOff: ImageVector
    get() {
        if (_labelOff != null) return _labelOff!!
        _labelOff = tablerOutlineIcon(
            name = "LabelOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 7.0f),
                    PathNode.LineTo(6.0f, 7.0f),
                    PathNode.CurveTo(4.895431f, 7.0f, 4.0f, 7.895431f, 4.0f, 9.0f),
                    PathNode.LineTo(4.0f, 15.0f),
                    PathNode.CurveTo(4.0f, 16.10457f, 4.895431f, 17.0f, 6.0f, 17.0f),
                    PathNode.LineTo(16.52f, 17.0f),
                    PathNode.CurveTo(16.655464f, 16.999966f, 16.789509f, 16.972408f, 16.914f, 16.919f),
                    PathNode.MoveTo(18.774f, 14.782f),
                    PathNode.LineTo(21.0f, 12.0f),
                    PathNode.LineTo(17.3f, 7.375f),
                    PathNode.CurveTo(17.110357f, 7.138137f, 16.823427f, 7.00019f, 16.52f, 7.0f),
                    PathNode.LineTo(11.0f, 7.0f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _labelOff!!
    }

private var _labelOff: ImageVector? = null
