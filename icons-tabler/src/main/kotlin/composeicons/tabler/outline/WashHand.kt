package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WashHand: ImageVector
    get() {
        if (_washHand != null) return _washHand!!
        _washHand = tablerOutlineIcon(
            name = "WashHand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.486f, 8.965f),
                    PathNode.CurveTo(3.654f, 8.985f, 3.826f, 8.998f, 4.0f, 9.0f),
                    PathNode.CurveTo(4.79f, 9.009f, 5.539f, 8.822f, 6.0f, 8.5f),
                    PathNode.CurveTo(6.426f, 8.204001f, 6.777f, 8.0f, 7.5f, 8.0f),
                    PathNode.LineTo(8.5f, 8.0f)
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
                    PathNode.MoveTo(16.0f, 8.0f),
                    PathNode.LineTo(16.615f, 8.034001f),
                    PathNode.CurveTo(17.167f, 8.101f, 17.661f, 8.264f, 18.0f, 8.5f),
                    PathNode.CurveTo(18.461f, 8.822f, 19.21f, 9.009f, 20.0f, 9.0f),
                    PathNode.CurveTo(20.17f, 9.0f, 20.339f, 8.986f, 20.503f, 8.966f)
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
                    PathNode.MoveTo(14.0f, 10.5f),
                    PathNode.LineTo(14.586f, 11.078f),
                    PathNode.CurveTo(15.15812f, 11.580119f, 16.01388f, 11.580119f, 16.586f, 11.078f),
                    PathNode.CurveTo(17.062f, 10.645f, 17.136f, 9.966f, 16.762f, 9.456f),
                    PathNode.LineTo(15.0f, 7.0f),
                    PathNode.CurveTo(14.63f, 6.494f, 13.669f, 6.0f, 13.0f, 6.0f),
                    PathNode.LineTo(9.883f, 6.0f),
                    PathNode.CurveTo(9.378771f, 6.000142f, 8.953525f, 6.375663f, 8.891f, 6.876f),
                    PathNode.LineTo(8.392f, 10.862f),
                    PathNode.CurveTo(8.163744f, 12.686677f, 9.255385f, 14.418736f, 11.0f, 15.0f),
                    PathNode.CurveTo(11.694989f, 15.231307f, 12.45879f, 15.11463f, 13.053027f, 14.686382f),
                    PathNode.CurveTo(13.647264f, 14.258136f, 13.999573f, 13.570471f, 14.0f, 12.838f),
                    PathNode.LineTo(14.0f, 10.5f)
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
                    PathNode.MoveTo(3.0f, 6.0f),
                    PathNode.LineTo(4.721f, 16.329f),
                    PathNode.CurveTo(4.881831f, 17.293377f, 5.716306f, 18.00012f, 6.694f, 18.0f),
                    PathNode.LineTo(17.306f, 18.0f),
                    PathNode.CurveTo(18.283693f, 18.00012f, 19.11817f, 17.293377f, 19.279f, 16.329f),
                    PathNode.LineTo(21.0f, 6.0f)
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
        return _washHand!!
    }

private var _washHand: ImageVector? = null
