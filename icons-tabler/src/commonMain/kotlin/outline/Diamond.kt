package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Diamond: ImageVector
    get() {
        if (_diamond != null) return _diamond!!
        _diamond = tablerOutlineIcon(
            name = "Diamond",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 5.0f),
                    PathNode.LineTo(18.0f, 5.0f),
                    PathNode.LineTo(21.0f, 10.0f),
                    PathNode.LineTo(12.5f, 19.5f),
                    PathNode.CurveTo(12.368338f, 19.634377f, 12.188128f, 19.710102f, 12.0f, 19.710102f),
                    PathNode.CurveTo(11.811872f, 19.710102f, 11.631662f, 19.634377f, 11.5f, 19.5f),
                    PathNode.LineTo(3.0f, 10.0f),
                    PathNode.LineTo(6.0f, 5.0f)
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
                    PathNode.MoveTo(10.0f, 12.0f),
                    PathNode.LineTo(8.0f, 9.8f),
                    PathNode.LineTo(8.6f, 8.8f)
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
        return _diamond!!
    }

private var _diamond: ImageVector? = null
