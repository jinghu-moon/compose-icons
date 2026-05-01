package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PointerDollar: ImageVector
    get() {
        if (_pointerDollar != null) return _pointerDollar!!
        _pointerDollar = tablerOutlineIcon(
            name = "PointerDollar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.778f, 12.222f),
                    PathNode.LineTo(17.891f, 10.132f),
                    PathNode.CurveTo(18.332384f, 9.894277f, 18.579472f, 9.407218f, 18.510603f, 8.910641f),
                    PathNode.CurveTo(18.44173f, 8.414063f, 18.071419f, 8.012631f, 17.582f, 7.904f),
                    PathNode.LineTo(4.0f, 4.0f),
                    PathNode.LineTo(7.904f, 17.563f),
                    PathNode.CurveTo(8.012911f, 18.052284f, 8.414471f, 18.422323f, 8.911007f, 18.490965f),
                    PathNode.CurveTo(9.407543f, 18.559607f, 9.894433f, 18.312386f, 10.132f, 17.871f),
                    PathNode.LineTo(12.222f, 14.778f),
                    PathNode.LineTo(13.009f, 15.565f)
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
                    PathNode.MoveTo(19.0f, 21.0f),
                    PathNode.LineTo(19.0f, 22.0f),
                    PathNode.MoveTo(19.0f, 14.0f),
                    PathNode.LineTo(19.0f, 15.0f)
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
        return _pointerDollar!!
    }

private var _pointerDollar: ImageVector? = null
