package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ShieldDollar: ImageVector
    get() {
        if (_shieldDollar != null) return _shieldDollar!!
        _shieldDollar = tablerOutlineIcon(
            name = "ShieldDollar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.018f, 20.687f),
                    PathNode.CurveTo(12.685f, 20.806f, 12.345f, 20.91f, 12.0f, 21.0f),
                    PathNode.CurveTo(8.854644f, 20.184156f, 6.174611f, 18.127613f, 4.572596f, 15.300529f),
                    PathNode.CurveTo(2.97058f, 12.473444f, 2.583555f, 9.11753f, 3.5f, 6.0f),
                    PathNode.CurveTo(6.615528f, 6.142566f, 9.664169f, 5.066576f, 12.0f, 3.0f),
                    PathNode.CurveTo(14.335831f, 5.066576f, 17.384472f, 6.142566f, 20.5f, 6.0f),
                    PathNode.CurveTo(20.933f, 7.472f, 21.075f, 8.998f, 20.936f, 10.495f)
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
                    PathNode.MoveTo(21.0f, 15.0f),
                    PathNode.LineTo(18.5f, 15.0f),
                    PathNode.CurveTo(17.671574f, 15.0f, 17.0f, 15.671573f, 17.0f, 16.5f),
                    PathNode.CurveTo(17.0f, 17.328426f, 17.671574f, 18.0f, 18.5f, 18.0f),
                    PathNode.LineTo(19.5f, 18.0f),
                    PathNode.CurveTo(20.328426f, 18.0f, 21.0f, 18.671574f, 21.0f, 19.5f),
                    PathNode.CurveTo(21.0f, 20.328426f, 20.328426f, 21.0f, 19.5f, 21.0f),
                    PathNode.LineTo(17.0f, 21.0f)
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
                    PathNode.MoveTo(19.0f, 21.0f),
                    PathNode.LineTo(19.0f, 22.0f),
                    PathNode.MoveTo(19.0f, 14.0f),
                    PathNode.LineTo(19.0f, 15.0f)
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
        return _shieldDollar!!
    }

private var _shieldDollar: ImageVector? = null
