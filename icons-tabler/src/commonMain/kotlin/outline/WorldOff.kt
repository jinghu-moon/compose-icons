package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WorldOff: ImageVector
    get() {
        if (_worldOff != null) return _worldOff!!
        _worldOff = tablerOutlineIcon(
            name = "WorldOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.657f, 5.615f),
                    PathNode.CurveTo(2.139222f, 9.126702f, 2.134297f, 14.825222f, 5.646f, 18.343f),
                    PathNode.CurveTo(9.157702f, 21.860779f, 14.856222f, 21.865704f, 18.374f, 18.354f),
                    PathNode.MoveTo(20.046f, 16.032f),
                    PathNode.CurveTo(21.78132f, 12.568322f, 21.105434f, 8.382812f, 18.368097f, 5.641391f),
                    PathNode.CurveTo(15.630759f, 2.89997f, 11.44626f, 2.217844f, 7.98f, 3.948f)
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
                    PathNode.MoveTo(3.6f, 9.0f),
                    PathNode.LineTo(9.0f, 9.0f),
                    PathNode.MoveTo(13.0f, 9.0f),
                    PathNode.LineTo(20.4f, 9.0f)
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
                    PathNode.MoveTo(3.6f, 15.0f),
                    PathNode.LineTo(15.0f, 15.0f),
                    PathNode.MoveTo(19.0f, 15.0f),
                    PathNode.LineTo(20.4f, 15.0f)
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
                    PathNode.MoveTo(11.5f, 3.0f),
                    PathNode.CurveTo(10.903457f, 3.95539f, 10.403333f, 4.967697f, 10.007f, 6.022f),
                    PathNode.MoveTo(9.16f, 9.167f),
                    PathNode.CurveTo(8.48f, 13.194f, 9.26f, 17.411f, 11.5f, 21.0f)
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
                    PathNode.MoveTo(12.5f, 3.0f),
                    PathNode.CurveTo(14.006689f, 5.412738f, 14.883175f, 8.165296f, 15.049f, 11.005f),
                    PathNode.MoveTo(14.842f, 14.823f),
                    PathNode.CurveTo(14.473277f, 17.015474f, 13.677552f, 19.114191f, 12.5f, 21.0f)
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
        return _worldOff!!
    }

private var _worldOff: ImageVector? = null
