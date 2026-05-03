package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareNumber7: ImageVector
    get() {
        if (_squareNumber7 != null) return _squareNumber7!!
        _squareNumber7 = tablerFilledIcon(
            name = "SquareNumber7",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.333f, 2.0f),
                    PathNode.CurveTo(20.293f, 2.0f, 21.893f, 3.537f, 21.995f, 5.472f),
                    PathNode.LineTo(22.0f, 5.667f),
                    PathNode.LineTo(22.0f, 18.333f),
                    PathNode.CurveTo(22.0f, 20.293f, 20.463f, 21.893f, 18.528f, 21.995f),
                    PathNode.LineTo(18.333f, 22.0f),
                    PathNode.LineTo(5.667f, 22.0f),
                    PathNode.CurveTo(3.717474f, 22.000101f, 2.10867f, 20.474768f, 2.005f, 18.528f),
                    PathNode.LineTo(2.0f, 18.333f),
                    PathNode.LineTo(2.0f, 5.667f),
                    PathNode.CurveTo(2.0f, 3.707f, 3.537f, 2.107f, 5.472f, 2.005f),
                    PathNode.LineTo(5.667f, 2.0f),
                    PathNode.LineTo(18.333f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(14.0f, 7.0f),
                    PathNode.LineTo(10.0f, 7.0f),
                    PathNode.LineTo(9.883f, 7.007f),
                    PathNode.CurveTo(9.423509f, 7.061188f, 9.061188f, 7.423509f, 9.007f, 7.883f),
                    PathNode.LineTo(9.0f, 8.0f),
                    PathNode.LineTo(9.007f, 8.117f),
                    PathNode.CurveTo(9.061188f, 8.576491f, 9.423509f, 8.938812f, 9.883f, 8.993f),
                    PathNode.LineTo(10.0f, 9.0f),
                    PathNode.LineTo(12.718f, 9.0f),
                    PathNode.LineTo(11.03f, 15.757f),
                    PathNode.LineTo(11.008f, 15.872f),
                    PathNode.CurveTo(10.943119f, 16.375027f, 11.265096f, 16.846962f, 11.757131f, 16.970034f),
                    PathNode.CurveTo(12.249165f, 17.093107f, 12.755414f, 16.828335f, 12.935f, 16.354f),
                    PathNode.LineTo(12.97f, 16.243f),
                    PathNode.LineTo(14.97f, 8.243f),
                    PathNode.LineTo(14.991f, 8.131f),
                    PathNode.CurveTo(15.026277f, 7.864948f, 14.95313f, 7.595882f, 14.788009f, 7.384309f),
                    PathNode.CurveTo(14.622888f, 7.172735f, 14.379652f, 7.036414f, 14.113f, 7.006f),
                    PathNode.LineTo(14.0f, 7.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _squareNumber7!!
    }

private var _squareNumber7: ImageVector? = null
