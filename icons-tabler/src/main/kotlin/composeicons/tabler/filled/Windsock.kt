package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Windsock: ImageVector
    get() {
        if (_windsock != null) return _windsock!!
        _windsock = tablerFilledIcon(
            name = "Windsock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 2.0f),
                    PathNode.CurveTo(6.552285f, 2.0f, 7.0f, 2.447715f, 7.0f, 3.0f),
                    PathNode.LineTo(7.0f, 4.079f),
                    PathNode.LineTo(18.083f, 5.003f),
                    PathNode.CurveTo(18.601484f, 5.046183f, 19.000235f, 5.479721f, 19.0f, 6.0f),
                    PathNode.LineTo(19.0f, 10.0f),
                    PathNode.CurveTo(19.000235f, 10.520279f, 18.601484f, 10.953816f, 18.083f, 10.997f),
                    PathNode.LineTo(7.0f, 11.92f),
                    PathNode.LineTo(7.0f, 20.0f),
                    PathNode.LineTo(8.0f, 20.0f),
                    PathNode.CurveTo(8.552285f, 20.0f, 9.0f, 20.447716f, 9.0f, 21.0f),
                    PathNode.CurveTo(9.0f, 21.552284f, 8.552285f, 22.0f, 8.0f, 22.0f),
                    PathNode.LineTo(4.0f, 22.0f),
                    PathNode.CurveTo(3.447715f, 22.0f, 3.0f, 21.552284f, 3.0f, 21.0f),
                    PathNode.CurveTo(3.0f, 20.447716f, 3.447715f, 20.0f, 4.0f, 20.0f),
                    PathNode.LineTo(5.0f, 20.0f),
                    PathNode.LineTo(5.0f, 3.0f),
                    PathNode.CurveTo(5.0f, 2.447715f, 5.447716f, 2.0f, 6.0f, 2.0f),
                    PathNode.MoveTo(7.0f, 6.086f),
                    PathNode.LineTo(7.0f, 9.913f),
                    PathNode.LineTo(10.0f, 9.663f),
                    PathNode.LineTo(10.0f, 6.336f),
                    PathNode.Close,
                    PathNode.MoveTo(14.0f, 6.67f),
                    PathNode.LineTo(14.0f, 9.329f),
                    PathNode.LineTo(17.0f, 9.079f),
                    PathNode.LineTo(17.0f, 6.92f),
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
        return _windsock!!
    }

private var _windsock: ImageVector? = null
