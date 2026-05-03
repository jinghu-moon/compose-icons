package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MilitaryAward: ImageVector
    get() {
        if (_militaryAward != null) return _militaryAward!!
        _militaryAward = tablerOutlineIcon(
            name = "MilitaryAward",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 13.0f),
                    PathNode.CurveTo(8.0f, 15.209139f, 9.790861f, 17.0f, 12.0f, 17.0f),
                    PathNode.CurveTo(14.209139f, 17.0f, 16.0f, 15.209139f, 16.0f, 13.0f),
                    PathNode.CurveTo(16.0f, 10.790861f, 14.209139f, 9.0f, 12.0f, 9.0f),
                    PathNode.CurveTo(9.790861f, 9.0f, 8.0f, 10.790861f, 8.0f, 13.0f)
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
                    PathNode.MoveTo(8.5f, 10.5f),
                    PathNode.LineTo(7.5f, 8.0f),
                    PathNode.LineTo(2.0f, 8.0f),
                    PathNode.LineTo(4.48f, 13.788f),
                    PathNode.CurveTo(4.795452f, 14.523876f, 5.519361f, 15.000712f, 6.32f, 15.0f),
                    PathNode.LineTo(8.5f, 15.0f)
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
                    PathNode.MoveTo(15.5f, 10.5f),
                    PathNode.LineTo(16.5f, 8.0f),
                    PathNode.LineTo(22.0f, 8.0f),
                    PathNode.LineTo(19.52f, 13.788f),
                    PathNode.CurveTo(19.204548f, 14.523876f, 18.480639f, 15.000712f, 17.68f, 15.0f),
                    PathNode.LineTo(15.5f, 15.0f)
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
        return _militaryAward!!
    }

private var _militaryAward: ImageVector? = null
