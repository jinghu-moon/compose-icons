package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ZodiacLibra: ImageVector
    get() {
        if (_zodiacLibra != null) return _zodiacLibra!!
        _zodiacLibra = tablerOutlineIcon(
            name = "ZodiacLibra",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 20.0f),
                    PathNode.LineTo(19.0f, 20.0f)
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
                    PathNode.MoveTo(5.0f, 17.0f),
                    PathNode.LineTo(10.0f, 17.0f),
                    PathNode.LineTo(10.0f, 16.7f),
                    PathNode.CurveTo(6.669246f, 15.706961f, 4.571557f, 12.420434f, 5.073334f, 8.981209f),
                    PathNode.CurveTo(5.57511f, 5.541984f, 8.524364f, 2.991796f, 12.0f, 2.991796f),
                    PathNode.CurveTo(15.475636f, 2.991796f, 18.42489f, 5.541984f, 18.926666f, 8.981209f),
                    PathNode.CurveTo(19.428444f, 12.420434f, 17.330753f, 15.706961f, 14.0f, 16.7f),
                    PathNode.LineTo(14.0f, 17.0f),
                    PathNode.LineTo(19.0f, 17.0f)
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
        return _zodiacLibra!!
    }

private var _zodiacLibra: ImageVector? = null
