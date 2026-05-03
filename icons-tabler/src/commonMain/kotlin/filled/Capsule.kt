package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Capsule: ImageVector
    get() {
        if (_capsule != null) return _capsule!!
        _capsule = tablerFilledIcon(
            name = "Capsule",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.LineTo(11.757f, 2.004f),
                    PathNode.CurveTo(7.988686f, 2.136974f, 5.001961f, 5.229341f, 5.0f, 9.0f),
                    PathNode.LineTo(5.0f, 15.0f),
                    PathNode.CurveTo(5.0f, 18.865993f, 8.134007f, 22.0f, 12.0f, 22.0f),
                    PathNode.LineTo(12.243f, 21.996f),
                    PathNode.CurveTo(16.011314f, 21.863026f, 18.99804f, 18.770658f, 19.0f, 15.0f),
                    PathNode.LineTo(19.0f, 9.0f),
                    PathNode.CurveTo(19.0f, 5.134007f, 15.865993f, 2.0f, 12.0f, 2.0f),
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
        return _capsule!!
    }

private var _capsule: ImageVector? = null
