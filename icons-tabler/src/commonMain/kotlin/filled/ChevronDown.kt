package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChevronDown: ImageVector
    get() {
        if (_chevronDown != null) return _chevronDown!!
        _chevronDown = tablerFilledIcon(
            name = "ChevronDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.707f, 8.293f),
                    PathNode.CurveTo(19.097382f, 8.6835f, 19.097382f, 9.3165f, 18.707f, 9.707f),
                    PathNode.LineTo(12.707f, 15.707f),
                    PathNode.CurveTo(12.3165f, 16.097382f, 11.6835f, 16.097382f, 11.293f, 15.707f),
                    PathNode.LineTo(5.293f, 9.707f),
                    PathNode.CurveTo(4.914028f, 9.314621f, 4.919448f, 8.690915f, 5.305182f, 8.305182f),
                    PathNode.CurveTo(5.690915f, 7.919448f, 6.314621f, 7.914028f, 6.707f, 8.293f),
                    PathNode.LineTo(12.0f, 13.586f),
                    PathNode.LineTo(17.293f, 8.293f),
                    PathNode.CurveTo(17.6835f, 7.902618f, 18.3165f, 7.902618f, 18.707f, 8.293f)
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
        return _chevronDown!!
    }

private var _chevronDown: ImageVector? = null
