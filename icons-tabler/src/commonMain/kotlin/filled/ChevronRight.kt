package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChevronRight: ImageVector
    get() {
        if (_chevronRight != null) return _chevronRight!!
        _chevronRight = tablerFilledIcon(
            name = "ChevronRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.707f, 5.293f),
                    PathNode.LineTo(15.707f, 11.293f),
                    PathNode.CurveTo(16.097382f, 11.6835f, 16.097382f, 12.3165f, 15.707f, 12.707f),
                    PathNode.LineTo(9.707f, 18.707f),
                    PathNode.CurveTo(9.455926f, 18.966957f, 9.084122f, 19.071213f, 8.734492f, 18.979696f),
                    PathNode.CurveTo(8.384863f, 18.888182f, 8.111819f, 18.615137f, 8.020303f, 18.265507f),
                    PathNode.CurveTo(7.928787f, 17.915878f, 8.033044f, 17.544077f, 8.293f, 17.293f),
                    PathNode.LineTo(13.586f, 12.0f),
                    PathNode.LineTo(8.293f, 6.707f),
                    PathNode.CurveTo(7.914028f, 6.314621f, 7.919448f, 5.690915f, 8.305182f, 5.305182f),
                    PathNode.CurveTo(8.690915f, 4.919448f, 9.314621f, 4.914028f, 9.707f, 5.293f)
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
        return _chevronRight!!
    }

private var _chevronRight: ImageVector? = null
