package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AirConditioningDisabled: ImageVector
    get() {
        if (_airConditioningDisabled != null) return _airConditioningDisabled!!
        _airConditioningDisabled = tablerOutlineIcon(
            name = "AirConditioningDisabled",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 10.0f),
                    PathNode.CurveTo(3.0f, 8.895431f, 3.895431f, 8.0f, 5.0f, 8.0f),
                    PathNode.LineTo(19.0f, 8.0f),
                    PathNode.CurveTo(20.10457f, 8.0f, 21.0f, 8.895431f, 21.0f, 10.0f),
                    PathNode.LineTo(21.0f, 14.0f),
                    PathNode.CurveTo(21.0f, 15.104569f, 20.10457f, 16.0f, 19.0f, 16.0f),
                    PathNode.LineTo(5.0f, 16.0f),
                    PathNode.CurveTo(3.895431f, 16.0f, 3.0f, 15.104569f, 3.0f, 14.0f),
                    PathNode.LineTo(3.0f, 10.0f)
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
                    PathNode.MoveTo(7.0f, 16.0f),
                    PathNode.LineTo(7.0f, 13.0f),
                    PathNode.CurveTo(7.0f, 12.447715f, 7.447716f, 12.0f, 8.0f, 12.0f),
                    PathNode.LineTo(16.0f, 12.0f),
                    PathNode.CurveTo(16.552284f, 12.0f, 17.0f, 12.447715f, 17.0f, 13.0f),
                    PathNode.LineTo(17.0f, 16.0f)
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
        return _airConditioningDisabled!!
    }

private var _airConditioningDisabled: ImageVector? = null
