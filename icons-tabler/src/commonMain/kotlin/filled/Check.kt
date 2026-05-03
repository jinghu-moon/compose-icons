package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Check: ImageVector
    get() {
        if (_check != null) return _check!!
        _check = tablerFilledIcon(
            name = "Check",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.707f, 6.293f),
                    PathNode.CurveTo(21.097382f, 6.6835f, 21.097382f, 7.3165f, 20.707f, 7.707f),
                    PathNode.LineTo(10.707f, 17.707f),
                    PathNode.CurveTo(10.3165f, 18.097382f, 9.6835f, 18.097382f, 9.293f, 17.707f),
                    PathNode.LineTo(4.293f, 12.707f),
                    PathNode.CurveTo(3.914028f, 12.314621f, 3.919448f, 11.690915f, 4.305182f, 11.305182f),
                    PathNode.CurveTo(4.690915f, 10.919448f, 5.314621f, 10.914028f, 5.707f, 11.293f),
                    PathNode.LineTo(10.0f, 15.586f),
                    PathNode.LineTo(19.293f, 6.293f),
                    PathNode.CurveTo(19.6835f, 5.902618f, 20.3165f, 5.902618f, 20.707f, 6.293f)
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
        return _check!!
    }

private var _check: ImageVector? = null
