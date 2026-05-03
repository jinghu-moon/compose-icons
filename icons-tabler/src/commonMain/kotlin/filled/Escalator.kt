package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Escalator: ImageVector
    get() {
        if (_escalator != null) return _escalator!!
        _escalator = tablerFilledIcon(
            name = "Escalator",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.5f, 4.0f),
                    PathNode.CurveTo(21.432997f, 4.0f, 23.0f, 5.567004f, 23.0f, 7.5f),
                    PathNode.CurveTo(23.0f, 9.432997f, 21.432997f, 11.0f, 19.5f, 11.0f),
                    PathNode.LineTo(18.414f, 11.0f),
                    PathNode.LineTo(10.294f, 19.121f),
                    PathNode.CurveTo(9.779593f, 19.635311f, 9.095841f, 19.945204f, 8.37f, 19.993f),
                    PathNode.LineTo(8.172f, 20.0f),
                    PathNode.LineTo(4.5f, 20.0f),
                    PathNode.CurveTo(2.567004f, 20.0f, 1.0f, 18.432997f, 1.0f, 16.5f),
                    PathNode.CurveTo(1.0f, 14.567003f, 2.567004f, 13.0f, 4.5f, 13.0f),
                    PathNode.LineTo(6.584f, 13.0f),
                    PathNode.LineTo(14.707f, 4.879f),
                    PathNode.CurveTo(15.221152f, 4.364908f, 15.90451f, 4.055034f, 16.63f, 4.007f),
                    PathNode.LineTo(16.828f, 4.0f),
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
        return _escalator!!
    }

private var _escalator: ImageVector? = null
