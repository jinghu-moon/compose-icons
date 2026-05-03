package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DnaOff: ImageVector
    get() {
        if (_dnaOff != null) return _dnaOff!!
        _dnaOff = tablerOutlineIcon(
            name = "DnaOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 12.0f),
                    PathNode.CurveTo(16.01132f, 10.936954f, 15.587963f, 9.915405f, 14.828f, 9.172f),
                    PathNode.CurveTo(14.076364f, 8.424298f, 13.060191f, 8.003169f, 12.0f, 8.0f),
                    PathNode.MoveTo(9.172f, 9.172f),
                    PathNode.CurveTo(8.132174f, 10.176298f, 7.71515f, 11.663511f, 8.081211f, 13.062029f),
                    PathNode.CurveTo(8.447273f, 14.460547f, 9.539453f, 15.552727f, 10.937971f, 15.918789f),
                    PathNode.CurveTo(12.336489f, 16.284851f, 13.823702f, 15.867826f, 14.828f, 14.828f)
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
                    PathNode.MoveTo(9.172f, 20.485f),
                    PathNode.CurveTo(10.734138f, 18.922865f, 10.734138f, 16.390137f, 9.172f, 14.828f),
                    PathNode.CurveTo(7.609863f, 13.265862f, 5.077138f, 13.265862f, 3.515f, 14.828f)
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
                    PathNode.MoveTo(14.828f, 3.515f),
                    PathNode.CurveTo(13.265862f, 5.077138f, 13.265862f, 7.609863f, 14.828f, 9.172f),
                    PathNode.CurveTo(16.390137f, 10.734138f, 18.922865f, 10.734138f, 20.485f, 9.172f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _dnaOff!!
    }

private var _dnaOff: ImageVector? = null
