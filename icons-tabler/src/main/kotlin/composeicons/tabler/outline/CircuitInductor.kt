package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircuitInductor: ImageVector
    get() {
        if (_circuitInductor != null) return _circuitInductor!!
        _circuitInductor = tablerOutlineIcon(
            name = "CircuitInductor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.0f, 14.0f),
                    PathNode.LineTo(5.0f, 14.0f),
                    PathNode.LineTo(5.0f, 12.0f),
                    PathNode.CurveTo(5.0f, 10.895431f, 5.895431f, 10.0f, 7.0f, 10.0f),
                    PathNode.CurveTo(8.10457f, 10.0f, 9.0f, 10.895431f, 9.0f, 12.0f),
                    PathNode.LineTo(9.0f, 14.0f),
                    PathNode.LineTo(9.0f, 12.5f),
                    PathNode.CurveTo(9.0f, 11.119288f, 10.119288f, 10.0f, 11.5f, 10.0f),
                    PathNode.CurveTo(12.880712f, 10.0f, 14.0f, 11.119288f, 14.0f, 12.5f),
                    PathNode.LineTo(14.0f, 14.0f),
                    PathNode.LineTo(14.0f, 12.5f),
                    PathNode.CurveTo(14.0f, 11.119288f, 15.119288f, 10.0f, 16.5f, 10.0f),
                    PathNode.CurveTo(17.880713f, 10.0f, 19.0f, 11.119288f, 19.0f, 12.5f),
                    PathNode.LineTo(19.0f, 14.0f),
                    PathNode.LineTo(22.0f, 14.0f)
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
        return _circuitInductor!!
    }

private var _circuitInductor: ImageVector? = null
