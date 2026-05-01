package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MoneybagEdit: ImageVector
    get() {
        if (_moneybagEdit != null) return _moneybagEdit!!
        _moneybagEdit = tablerOutlineIcon(
            name = "MoneybagEdit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.5f, 3.0f),
                    PathNode.LineTo(14.5f, 3.0f),
                    PathNode.CurveTo(15.328427f, 3.0f, 16.0f, 3.671573f, 16.0f, 4.5f),
                    PathNode.CurveTo(16.0f, 6.432997f, 14.432997f, 8.0f, 12.5f, 8.0f),
                    PathNode.LineTo(11.5f, 8.0f),
                    PathNode.CurveTo(9.567003f, 8.0f, 8.0f, 6.432997f, 8.0f, 4.5f),
                    PathNode.CurveTo(8.0f, 3.671573f, 8.671573f, 3.0f, 9.5f, 3.0f)
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
                    PathNode.MoveTo(11.0f, 21.0f),
                    PathNode.LineTo(8.0f, 21.0f),
                    PathNode.CurveTo(5.790861f, 21.0f, 4.0f, 19.209139f, 4.0f, 17.0f),
                    PathNode.LineTo(4.0f, 16.0f),
                    PathNode.CurveTo(3.999499f, 12.563678f, 6.193539f, 9.510899f, 9.450723f, 8.415881f),
                    PathNode.CurveTo(12.707906f, 7.320863f, 16.300533f, 8.428251f, 18.376f, 11.167f)
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
                    PathNode.MoveTo(18.42f, 15.61f),
                    PathNode.CurveTo(19.240143f, 14.789857f, 20.569857f, 14.789857f, 21.39f, 15.61f),
                    PathNode.CurveTo(22.210142f, 16.430143f, 22.210142f, 17.759857f, 21.39f, 18.58f),
                    PathNode.LineTo(18.0f, 22.0f),
                    PathNode.LineTo(15.0f, 22.0f),
                    PathNode.LineTo(15.0f, 19.0f),
                    PathNode.LineTo(18.42f, 15.61f)
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
        return _moneybagEdit!!
    }

private var _moneybagEdit: ImageVector? = null
