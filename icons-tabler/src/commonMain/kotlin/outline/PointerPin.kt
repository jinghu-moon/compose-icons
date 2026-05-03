package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PointerPin: ImageVector
    get() {
        if (_pointerPin != null) return _pointerPin!!
        _pointerPin = tablerOutlineIcon(
            name = "PointerPin",
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
                    PathNode.LineTo(12.603f, 15.159f)
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
                    PathNode.MoveTo(21.121f, 20.121f),
                    PathNode.CurveTo(21.979181f, 19.263077f, 22.236015f, 17.972652f, 21.771725f, 16.851519f),
                    PathNode.CurveTo(21.307436f, 15.730384f, 20.213469f, 14.999359f, 19.0f, 14.999359f),
                    PathNode.CurveTo(17.786531f, 14.999359f, 16.692564f, 15.730384f, 16.228275f, 16.851519f),
                    PathNode.CurveTo(15.763985f, 17.972652f, 16.020819f, 19.263077f, 16.879f, 20.121f),
                    PathNode.CurveTo(17.297f, 20.54f, 18.004f, 21.166f, 19.0f, 22.0f),
                    PathNode.CurveTo(20.051f, 21.11f, 20.759f, 20.484f, 21.121f, 20.121f)
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
                    PathNode.MoveTo(19.0f, 18.0f),
                    PathNode.LineTo(19.0f, 18.01f)
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
        return _pointerPin!!
    }

private var _pointerPin: ImageVector? = null
