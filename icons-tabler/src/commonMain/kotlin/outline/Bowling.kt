package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bowling: ImageVector
    get() {
        if (_bowling != null) return _bowling!!
        _bowling = tablerOutlineIcon(
            name = "Bowling",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 11.0f),
                    PathNode.LineTo(7.0f, 11.01f)
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
                    PathNode.MoveTo(11.0f, 10.0f),
                    PathNode.LineTo(11.0f, 10.01f)
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
                    PathNode.MoveTo(10.0f, 14.0f),
                    PathNode.LineTo(10.0f, 14.01f)
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
                    PathNode.MoveTo(11.059f, 6.07f),
                    PathNode.CurveTo(7.935101f, 5.652999f, 4.857466f, 7.10895f, 3.198511f, 9.788596f),
                    PathNode.CurveTo(1.539557f, 12.468243f, 1.608454f, 15.872194f, 3.374479f, 18.482517f),
                    PathNode.CurveTo(5.140505f, 21.09284f, 8.274534f, 22.423065f, 11.379f, 21.88f)
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
                    PathNode.MoveTo(15.969f, 9.0f),
                    PathNode.LineTo(19.969f, 9.0f)
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
                    PathNode.MoveTo(14.969f, 5.0f),
                    PathNode.CurveTo(14.969f, 6.5f, 15.969f, 7.0f, 15.969f, 9.0f),
                    PathNode.CurveTo(15.969f, 11.5f, 13.969f, 13.5f, 13.969f, 16.0f),
                    PathNode.CurveTo(13.969f, 18.6f, 15.869f, 22.0f, 15.869f, 22.0f),
                    PathNode.LineTo(19.969f, 22.0f),
                    PathNode.CurveTo(19.969f, 22.0f, 21.969f, 18.6f, 21.969f, 16.0f),
                    PathNode.CurveTo(21.969f, 13.5f, 19.969f, 11.5f, 19.969f, 9.0f),
                    PathNode.CurveTo(19.969f, 7.0f, 20.969f, 6.5f, 20.969f, 5.0f),
                    PathNode.CurveTo(20.969f, 3.343146f, 19.625854f, 2.0f, 17.969f, 2.0f),
                    PathNode.CurveTo(16.312145f, 2.0f, 14.969f, 3.343146f, 14.969f, 5.0f)
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
        return _bowling!!
    }

private var _bowling: ImageVector? = null
