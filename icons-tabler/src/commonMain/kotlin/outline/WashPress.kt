package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WashPress: ImageVector
    get() {
        if (_washPress != null) return _washPress!!
        _washPress = tablerOutlineIcon(
            name = "WashPress",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.486f, 7.965f),
                    PathNode.CurveTo(3.654f, 7.985f, 3.826f, 7.998f, 4.0f, 8.0f),
                    PathNode.CurveTo(4.79f, 8.009f, 5.539f, 7.822f, 6.0f, 7.5f),
                    PathNode.CurveTo(6.461f, 7.18f, 7.21f, 6.993f, 8.0f, 7.0f),
                    PathNode.CurveTo(8.79f, 6.993f, 9.539f, 7.18f, 10.0f, 7.5f),
                    PathNode.CurveTo(10.461f, 7.822f, 11.21f, 8.009f, 12.0f, 8.0f),
                    PathNode.CurveTo(12.79f, 8.009f, 13.539f, 7.822f, 14.0f, 7.5f),
                    PathNode.CurveTo(14.461f, 7.18f, 15.21f, 6.993f, 16.0f, 7.0f),
                    PathNode.CurveTo(16.79f, 6.993f, 17.539f, 7.18f, 18.0f, 7.5f),
                    PathNode.CurveTo(18.461f, 7.822f, 19.21f, 8.009f, 20.0f, 8.0f),
                    PathNode.CurveTo(20.17f, 8.0f, 20.339f, 7.986f, 20.503f, 7.966f)
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
                    PathNode.MoveTo(3.0f, 5.0f),
                    PathNode.LineTo(4.721f, 15.329f),
                    PathNode.CurveTo(4.881831f, 16.293375f, 5.716306f, 17.00012f, 6.694f, 17.0f),
                    PathNode.LineTo(17.306f, 17.0f),
                    PathNode.CurveTo(18.283693f, 17.00012f, 19.11817f, 16.293375f, 19.279f, 15.329f),
                    PathNode.LineTo(21.0f, 5.0f)
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
                    PathNode.MoveTo(5.0f, 20.0f),
                    PathNode.LineTo(19.0f, 20.0f)
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
        return _washPress!!
    }

private var _washPress: ImageVector? = null
