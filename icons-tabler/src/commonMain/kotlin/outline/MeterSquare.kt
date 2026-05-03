package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MeterSquare: ImageVector
    get() {
        if (_meterSquare != null) return _meterSquare!!
        _meterSquare = tablerOutlineIcon(
            name = "MeterSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 5.0f),
                    PathNode.LineTo(19.0f, 5.0f),
                    PathNode.CurveTo(19.552284f, 5.0f, 20.0f, 5.447716f, 20.0f, 6.0f),
                    PathNode.LineTo(20.0f, 7.0f),
                    PathNode.CurveTo(20.0f, 7.552285f, 19.552284f, 8.0f, 19.0f, 8.0f),
                    PathNode.LineTo(18.0f, 8.0f),
                    PathNode.CurveTo(17.447716f, 8.0f, 17.0f, 8.447715f, 17.0f, 9.0f),
                    PathNode.LineTo(17.0f, 10.0f),
                    PathNode.CurveTo(17.0f, 10.552285f, 17.447716f, 11.0f, 18.0f, 11.0f),
                    PathNode.LineTo(20.0f, 11.0f)
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
                    PathNode.MoveTo(4.0f, 12.0f),
                    PathNode.LineTo(4.0f, 18.0f)
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
                    PathNode.MoveTo(4.0f, 14.0f),
                    PathNode.CurveTo(4.0f, 12.895431f, 4.895431f, 12.0f, 6.0f, 12.0f),
                    PathNode.LineTo(6.5f, 12.0f),
                    PathNode.CurveTo(7.880712f, 12.0f, 9.0f, 13.119288f, 9.0f, 14.5f),
                    PathNode.LineTo(9.0f, 18.0f)
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
                    PathNode.MoveTo(9.0f, 15.5f),
                    PathNode.LineTo(9.0f, 14.5f),
                    PathNode.CurveTo(9.0f, 13.119288f, 10.119288f, 12.0f, 11.5f, 12.0f),
                    PathNode.CurveTo(12.880712f, 12.0f, 14.0f, 13.119288f, 14.0f, 14.5f),
                    PathNode.LineTo(14.0f, 18.0f)
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
        return _meterSquare!!
    }

private var _meterSquare: ImageVector? = null
