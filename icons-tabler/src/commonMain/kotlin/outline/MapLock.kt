package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapLock: ImageVector
    get() {
        if (_mapLock != null) return _mapLock!!
        _mapLock = tablerOutlineIcon(
            name = "MapLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 11.0f),
                    PathNode.CurveTo(9.0f, 12.656855f, 10.343145f, 14.0f, 12.0f, 14.0f),
                    PathNode.CurveTo(13.656855f, 14.0f, 15.0f, 12.656855f, 15.0f, 11.0f),
                    PathNode.CurveTo(15.0f, 9.343145f, 13.656855f, 8.0f, 12.0f, 8.0f),
                    PathNode.CurveTo(10.343145f, 8.0f, 9.0f, 9.343145f, 9.0f, 11.0f)
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
                    PathNode.MoveTo(13.004f, 21.216f),
                    PathNode.CurveTo(12.219808f, 21.670525f, 11.227983f, 21.540854f, 10.587f, 20.9f),
                    PathNode.LineTo(6.343f, 16.657f),
                    PathNode.CurveTo(3.218725f, 13.532725f, 3.218725f, 8.467275f, 6.343f, 5.343f),
                    PathNode.CurveTo(9.467275f, 2.218725f, 14.532725f, 2.218725f, 17.657f, 5.343f),
                    PathNode.CurveTo(19.163855f, 6.838945f, 20.007847f, 8.8767f, 20.0f, 11.0f)
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
                    PathNode.MoveTo(17.0f, 19.0f),
                    PathNode.CurveTo(17.0f, 18.447716f, 17.447716f, 18.0f, 18.0f, 18.0f),
                    PathNode.LineTo(21.0f, 18.0f),
                    PathNode.CurveTo(21.552284f, 18.0f, 22.0f, 18.447716f, 22.0f, 19.0f),
                    PathNode.LineTo(22.0f, 21.0f),
                    PathNode.CurveTo(22.0f, 21.552284f, 21.552284f, 22.0f, 21.0f, 22.0f),
                    PathNode.LineTo(18.0f, 22.0f),
                    PathNode.CurveTo(17.447716f, 22.0f, 17.0f, 21.552284f, 17.0f, 21.0f),
                    PathNode.LineTo(17.0f, 19.0f)
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
                    PathNode.MoveTo(18.0f, 18.0f),
                    PathNode.LineTo(18.0f, 16.5f),
                    PathNode.CurveTo(18.0f, 15.671573f, 18.671574f, 15.0f, 19.5f, 15.0f),
                    PathNode.CurveTo(20.328426f, 15.0f, 21.0f, 15.671573f, 21.0f, 16.5f),
                    PathNode.LineTo(21.0f, 18.0f)
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
        return _mapLock!!
    }

private var _mapLock: ImageVector? = null
