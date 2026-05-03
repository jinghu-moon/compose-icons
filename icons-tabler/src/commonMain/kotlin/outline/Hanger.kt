package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Hanger: ImageVector
    get() {
        if (_hanger != null) return _hanger!!
        _hanger = tablerOutlineIcon(
            name = "Hanger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 6.0f),
                    PathNode.CurveTo(14.0f, 4.895431f, 13.104569f, 4.0f, 12.0f, 4.0f),
                    PathNode.CurveTo(10.895431f, 4.0f, 10.0f, 4.895431f, 10.0f, 6.0f),
                    PathNode.CurveTo(10.0f, 7.667f, 10.67f, 9.0f, 12.0f, 10.0f),
                    PathNode.LineTo(11.992f, 10.0f),
                    PathNode.LineTo(19.963f, 14.428f),
                    PathNode.CurveTo(20.598255f, 14.780784f, 20.992191f, 15.45036f, 20.992f, 16.177f),
                    PathNode.LineTo(20.992f, 17.0f),
                    PathNode.CurveTo(20.992f, 18.10457f, 20.09657f, 19.0f, 18.992f, 19.0f),
                    PathNode.LineTo(4.992f, 19.0f),
                    PathNode.CurveTo(3.887431f, 19.0f, 2.992f, 18.10457f, 2.992f, 17.0f),
                    PathNode.LineTo(2.992f, 16.177f),
                    PathNode.CurveTo(2.991809f, 15.45036f, 3.385745f, 14.780784f, 4.021f, 14.428f),
                    PathNode.LineTo(11.992f, 10.0f)
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
        return _hanger!!
    }

private var _hanger: ImageVector? = null
