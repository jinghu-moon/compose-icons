package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareCheck: ImageVector
    get() {
        if (_squareCheck != null) return _squareCheck!!
        _squareCheck = tablerFilledIcon(
            name = "SquareCheck",
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
                    PathNode.MoveTo(15.707f, 9.293f),
                    PathNode.CurveTo(15.3165f, 8.902618f, 14.6835f, 8.902618f, 14.293f, 9.293f),
                    PathNode.LineTo(11.0f, 12.585f),
                    PathNode.LineTo(9.707f, 11.293f),
                    PathNode.LineTo(9.613f, 11.21f),
                    PathNode.CurveTo(9.19587f, 10.887465f, 8.599978f, 10.94423f, 8.251249f, 11.339722f),
                    PathNode.CurveTo(7.902519f, 11.735212f, 7.920789f, 12.333524f, 8.293f, 12.707f),
                    PathNode.LineTo(10.293f, 14.707f),
                    PathNode.LineTo(10.387f, 14.79f),
                    PathNode.CurveTo(10.785086f, 15.098803f, 11.350732f, 15.063235f, 11.707f, 14.707f),
                    PathNode.LineTo(15.707f, 10.707f),
                    PathNode.LineTo(15.79f, 10.613f),
                    PathNode.CurveTo(16.098803f, 10.214914f, 16.063234f, 9.649268f, 15.707f, 9.293f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _squareCheck!!
    }

private var _squareCheck: ImageVector? = null
