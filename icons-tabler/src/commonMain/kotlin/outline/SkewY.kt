package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SkewY: ImageVector
    get() {
        if (_skewY != null) return _skewY!!
        _skewY = tablerOutlineIcon(
            name = "SkewY",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.326f, 19.0f),
                    PathNode.LineTo(19.674f, 19.0f),
                    PathNode.CurveTo(19.98794f, 19.000174f, 20.28374f, 18.85291f, 20.472824f, 18.602303f),
                    PathNode.CurveTo(20.661913f, 18.351694f, 20.722334f, 18.026834f, 20.636f, 17.725f),
                    PathNode.LineTo(17.207f, 5.725f),
                    PathNode.CurveTo(17.084293f, 5.295996f, 16.692207f, 5.000199f, 16.246f, 5.0f),
                    PathNode.LineTo(7.754f, 5.0f),
                    PathNode.CurveTo(7.307792f, 5.000199f, 6.915707f, 5.295996f, 6.793f, 5.725f),
                    PathNode.LineTo(3.364f, 17.725f),
                    PathNode.CurveTo(3.277667f, 18.026834f, 3.338089f, 18.351694f, 3.527176f, 18.602303f),
                    PathNode.CurveTo(3.716262f, 18.85291f, 4.012061f, 19.000174f, 4.326f, 19.0f)
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
        return _skewY!!
    }

private var _skewY: ImageVector? = null
