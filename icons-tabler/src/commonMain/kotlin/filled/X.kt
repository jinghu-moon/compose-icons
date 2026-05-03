package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.X: ImageVector
    get() {
        if (_x != null) return _x!!
        _x = tablerFilledIcon(
            name = "X",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.707f, 5.293f),
                    PathNode.LineTo(12.0f, 10.585f),
                    PathNode.LineTo(17.293f, 5.293f),
                    PathNode.CurveTo(17.68538f, 4.914028f, 18.309084f, 4.919448f, 18.694818f, 5.305182f),
                    PathNode.CurveTo(19.080553f, 5.690915f, 19.085972f, 6.314621f, 18.707f, 6.707f),
                    PathNode.LineTo(13.415f, 12.0f),
                    PathNode.LineTo(18.707f, 17.293f),
                    PathNode.CurveTo(19.085972f, 17.68538f, 19.080553f, 18.309084f, 18.694818f, 18.694818f),
                    PathNode.CurveTo(18.309084f, 19.080553f, 17.68538f, 19.085972f, 17.293f, 18.707f),
                    PathNode.LineTo(12.0f, 13.415f),
                    PathNode.LineTo(6.707f, 18.707f),
                    PathNode.CurveTo(6.455926f, 18.966957f, 6.084122f, 19.071213f, 5.734493f, 18.979696f),
                    PathNode.CurveTo(5.384864f, 18.888182f, 5.111819f, 18.615137f, 5.020303f, 18.265507f),
                    PathNode.CurveTo(4.928787f, 17.915878f, 5.033044f, 17.544077f, 5.293f, 17.293f),
                    PathNode.LineTo(10.585f, 12.0f),
                    PathNode.LineTo(5.293f, 6.707f),
                    PathNode.CurveTo(4.914028f, 6.314621f, 4.919448f, 5.690915f, 5.305182f, 5.305182f),
                    PathNode.CurveTo(5.690915f, 4.919448f, 6.314621f, 4.914028f, 6.707f, 5.293f)
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
        return _x!!
    }

private var _x: ImageVector? = null
