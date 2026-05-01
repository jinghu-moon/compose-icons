package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Diaper: ImageVector
    get() {
        if (_diaper != null) return _diaper!!
        _diaper = tablerOutlineIcon(
            name = "Diaper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 8.323f),
                    PathNode.CurveTo(3.0f, 7.744f, 3.0f, 7.455f, 3.044f, 7.213f),
                    PathNode.CurveTo(3.246367f, 6.109334f, 4.11024f, 5.245858f, 5.214f, 5.044f),
                    PathNode.CurveTo(5.453f, 5.0f, 5.743f, 5.0f, 6.323f, 5.0f),
                    PathNode.LineTo(17.676f, 5.0f),
                    PathNode.CurveTo(18.255f, 5.0f, 18.544f, 5.0f, 18.786f, 5.044f),
                    PathNode.CurveTo(19.889668f, 5.246367f, 20.753141f, 6.11024f, 20.955f, 7.214f),
                    PathNode.CurveTo(20.999f, 7.454f, 20.999f, 7.744f, 20.999f, 8.324001f),
                    PathNode.LineTo(20.999f, 11.0f),
                    PathNode.CurveTo(20.999f, 15.970563f, 16.969563f, 20.0f, 11.999f, 20.0f),
                    PathNode.CurveTo(7.028437f, 20.0f, 2.999f, 15.970563f, 2.999f, 11.0f),
                    PathNode.LineTo(3.0f, 8.323f)
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
                    PathNode.MoveTo(17.0f, 9.0f),
                    PathNode.LineTo(21.0f, 9.0f)
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
                    PathNode.MoveTo(3.0f, 9.0f),
                    PathNode.LineTo(7.0f, 9.0f)
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
                    PathNode.MoveTo(14.25f, 19.7f),
                    PathNode.LineTo(14.25f, 18.3f),
                    PathNode.CurveTo(14.25f, 14.820606f, 17.070606f, 12.0f, 20.55f, 12.0f)
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
                    PathNode.MoveTo(9.75f, 19.7f),
                    PathNode.LineTo(9.75f, 18.3f),
                    PathNode.CurveTo(9.75f, 14.820606f, 6.929394f, 12.0f, 3.45f, 12.0f)
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
        return _diaper!!
    }

private var _diaper: ImageVector? = null
