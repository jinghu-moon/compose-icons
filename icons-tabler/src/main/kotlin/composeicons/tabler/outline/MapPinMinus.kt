package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapPinMinus: ImageVector
    get() {
        if (_mapPinMinus != null) return _mapPinMinus!!
        _mapPinMinus = tablerOutlineIcon(
            name = "MapPinMinus",
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
                    PathNode.MoveTo(12.758f, 21.337f),
                    PathNode.CurveTo(12.012363f, 21.641834f, 11.156626f, 21.469582f, 10.587f, 20.9f),
                    PathNode.LineTo(6.343f, 16.657f),
                    PathNode.CurveTo(3.410694f, 13.722888f, 3.207536f, 9.034158f, 5.875066f, 5.857411f),
                    PathNode.CurveTo(8.542595f, 2.680664f, 13.195805f, 2.069849f, 16.592842f, 4.450517f),
                    PathNode.CurveTo(19.989878f, 6.831184f, 21.003706f, 11.413499f, 18.928f, 15.005f)
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
                    PathNode.MoveTo(16.0f, 19.0f),
                    PathNode.LineTo(22.0f, 19.0f)
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
        return _mapPinMinus!!
    }

private var _mapPinMinus: ImageVector? = null
