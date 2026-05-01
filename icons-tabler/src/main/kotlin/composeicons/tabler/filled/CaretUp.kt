package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CaretUp: ImageVector
    get() {
        if (_caretUp != null) return _caretUp!!
        _caretUp = tablerFilledIcon(
            name = "CaretUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.293f, 7.293f),
                    PathNode.CurveTo(11.649268f, 6.936765f, 12.214914f, 6.901198f, 12.613f, 7.21f),
                    PathNode.LineTo(12.707f, 7.293f),
                    PathNode.LineTo(18.707f, 13.293f),
                    PathNode.LineTo(18.79f, 13.387f),
                    PathNode.LineTo(18.844f, 13.464f),
                    PathNode.LineTo(18.898f, 13.56f),
                    PathNode.LineTo(18.915f, 13.596f),
                    PathNode.LineTo(18.942f, 13.663f),
                    PathNode.LineTo(18.974f, 13.771f),
                    PathNode.LineTo(18.984f, 13.824f),
                    PathNode.LineTo(18.994f, 13.884f),
                    PathNode.LineTo(18.998f, 13.941f),
                    PathNode.LineTo(19.0f, 14.0f),
                    PathNode.LineTo(18.998f, 14.059f),
                    PathNode.LineTo(18.993f, 14.117f),
                    PathNode.LineTo(18.984f, 14.177f),
                    PathNode.LineTo(18.974f, 14.229f),
                    PathNode.LineTo(18.942f, 14.337f),
                    PathNode.LineTo(18.915f, 14.404f),
                    PathNode.LineTo(18.845f, 14.536f),
                    PathNode.LineTo(18.78f, 14.626f),
                    PathNode.LineTo(18.707f, 14.707f),
                    PathNode.LineTo(18.613f, 14.79f),
                    PathNode.LineTo(18.536f, 14.844f),
                    PathNode.LineTo(18.44f, 14.898f),
                    PathNode.LineTo(18.404f, 14.915f),
                    PathNode.LineTo(18.337f, 14.942f),
                    PathNode.LineTo(18.229f, 14.974f),
                    PathNode.LineTo(18.176f, 14.984f),
                    PathNode.LineTo(18.116f, 14.994f),
                    PathNode.LineTo(18.059f, 14.998f),
                    PathNode.LineTo(18.0f, 15.0f),
                    PathNode.LineTo(6.0f, 15.0f),
                    PathNode.CurveTo(5.148f, 15.0f, 4.703f, 14.014f, 5.217f, 13.377f),
                    PathNode.LineTo(5.293f, 13.293f),
                    PathNode.LineTo(11.293f, 7.293f),
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
        return _caretUp!!
    }

private var _caretUp: ImageVector? = null
