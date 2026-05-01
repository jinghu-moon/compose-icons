package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapPinSearch: ImageVector
    get() {
        if (_mapPinSearch != null) return _mapPinSearch!!
        _mapPinSearch = tablerOutlineIcon(
            name = "MapPinSearch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.916f, 11.707f),
                    PathNode.CurveTo(15.21732f, 10.464423f, 14.697984f, 9.167417f, 13.622346f, 8.476192f),
                    PathNode.CurveTo(12.546707f, 7.784966f, 11.151172f, 7.851439f, 10.146105f, 8.641775f),
                    PathNode.CurveTo(9.141038f, 9.432111f, 8.747333f, 10.772608f, 9.165397f, 11.980918f),
                    PathNode.CurveTo(9.583461f, 13.189228f, 10.721411f, 13.999787f, 12.0f, 14.0f)
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
                    PathNode.MoveTo(11.991f, 21.485f),
                    PathNode.CurveTo(11.464089f, 21.483162f, 10.959325f, 21.272844f, 10.587f, 20.9f),
                    PathNode.LineTo(6.343f, 16.657f),
                    PathNode.CurveTo(3.755838f, 14.069842f, 3.253556f, 10.057193f, 5.123194f, 6.912157f),
                    PathNode.CurveTo(6.992832f, 3.767121f, 10.757873f, 2.291278f, 14.266711f, 3.328026f),
                    PathNode.CurveTo(17.775549f, 4.364775f, 20.133884f, 7.649878f, 19.994f, 11.306f)
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
                    PathNode.MoveTo(15.0f, 18.0f),
                    PathNode.CurveTo(15.0f, 19.656855f, 16.343145f, 21.0f, 18.0f, 21.0f),
                    PathNode.CurveTo(19.656855f, 21.0f, 21.0f, 19.656855f, 21.0f, 18.0f),
                    PathNode.CurveTo(21.0f, 16.343145f, 19.656855f, 15.0f, 18.0f, 15.0f),
                    PathNode.CurveTo(16.343145f, 15.0f, 15.0f, 16.343145f, 15.0f, 18.0f)
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
                    PathNode.MoveTo(20.2f, 20.2f),
                    PathNode.LineTo(22.0f, 22.0f)
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
        return _mapPinSearch!!
    }

private var _mapPinSearch: ImageVector? = null
