package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Mug: ImageVector
    get() {
        if (_mug != null) return _mug!!
        _mug = tablerOutlineIcon(
            name = "Mug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.083f, 5.0f),
                    PathNode.LineTo(14.917f, 5.0f),
                    PathNode.CurveTo(15.203434f, 4.999203f, 15.478453f, 5.112225f, 15.681555f, 5.314203f),
                    PathNode.CurveTo(15.884657f, 5.516179f, 15.999206f, 5.790566f, 16.0f, 6.077f),
                    PathNode.LineTo(16.0f, 14.692f),
                    PathNode.CurveTo(16.0f, 17.072f, 14.06f, 19.0f, 11.667f, 19.0f),
                    PathNode.LineTo(7.333f, 19.0f),
                    PathNode.CurveTo(4.94f, 19.0f, 3.0f, 17.071f, 3.0f, 14.692f),
                    PathNode.LineTo(3.0f, 6.077f),
                    PathNode.CurveTo(3.000795f, 5.790566f, 3.115343f, 5.516179f, 3.318445f, 5.314203f),
                    PathNode.CurveTo(3.521547f, 5.112225f, 3.796566f, 4.999203f, 4.083f, 5.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 8.0f),
                    PathNode.LineTo(18.5f, 8.0f),
                    PathNode.CurveTo(19.88f, 8.0f, 21.0f, 9.045f, 21.0f, 10.333f),
                    PathNode.LineTo(21.0f, 12.667f),
                    PathNode.CurveTo(21.0f, 13.955f, 19.88f, 15.0f, 18.5f, 15.0f),
                    PathNode.LineTo(16.0f, 15.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _mug!!
    }

private var _mug: ImageVector? = null
