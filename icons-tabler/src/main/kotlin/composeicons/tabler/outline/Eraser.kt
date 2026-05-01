package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Eraser: ImageVector
    get() {
        if (_eraser != null) return _eraser!!
        _eraser = tablerOutlineIcon(
            name = "Eraser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 20.0f),
                    PathNode.LineTo(8.5f, 20.0f),
                    PathNode.LineTo(4.29f, 15.7f),
                    PathNode.CurveTo(3.902277f, 15.309962f, 3.902277f, 14.680037f, 4.29f, 14.29f),
                    PathNode.LineTo(14.29f, 4.29f),
                    PathNode.CurveTo(14.680037f, 3.902277f, 15.309962f, 3.902277f, 15.7f, 4.29f),
                    PathNode.LineTo(20.7f, 9.29f),
                    PathNode.CurveTo(21.087723f, 9.680037f, 21.087723f, 10.309962f, 20.7f, 10.7f),
                    PathNode.LineTo(11.5f, 20.0f)
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
                    PathNode.MoveTo(18.0f, 13.3f),
                    PathNode.LineTo(11.7f, 7.0f)
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
        return _eraser!!
    }

private var _eraser: ImageVector? = null
