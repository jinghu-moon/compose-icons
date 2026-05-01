package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleChevronsLeft: ImageVector
    get() {
        if (_circleChevronsLeft != null) return _circleChevronsLeft!!
        _circleChevronsLeft = tablerFilledIcon(
            name = "CircleChevronsLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.927f, 2.133f),
                    PathNode.CurveTo(17.421f, 2.093f, 21.919f, 6.492f, 22.0f, 11.985f),
                    PathNode.LineTo(22.0f, 12.28f),
                    PathNode.CurveTo(21.919f, 17.773f, 17.421f, 22.173f, 11.927f, 22.132f),
                    PathNode.CurveTo(6.433f, 22.092f, 2.001f, 17.627f, 2.001f, 12.132f),
                    PathNode.CurveTo(2.001f, 6.638f, 6.433f, 2.173f, 11.927f, 2.132f),
                    PathNode.MoveTo(15.707f, 8.292f),
                    PathNode.CurveTo(15.3165f, 7.901618f, 14.6835f, 7.901618f, 14.293f, 8.292f),
                    PathNode.LineTo(11.293f, 11.292f),
                    PathNode.CurveTo(10.902618f, 11.6825f, 10.902618f, 12.3155f, 11.293f, 12.706f),
                    PathNode.LineTo(14.293f, 15.706f),
                    PathNode.CurveTo(14.6835f, 16.096382f, 15.3165f, 16.096382f, 15.707f, 15.706f),
                    PathNode.LineTo(15.79f, 15.612f),
                    PathNode.CurveTo(16.098803f, 15.213915f, 16.063234f, 14.648269f, 15.707f, 14.292f),
                    PathNode.LineTo(13.415f, 12.0f),
                    PathNode.LineTo(15.707f, 9.707f),
                    PathNode.CurveTo(16.097382f, 9.3165f, 16.097382f, 8.6835f, 15.707f, 8.293f),
                    PathNode.MoveTo(11.707f, 8.293f),
                    PathNode.CurveTo(11.3165f, 7.902618f, 10.6835f, 7.902618f, 10.293f, 8.293f),
                    PathNode.LineTo(7.293f, 11.293f),
                    PathNode.CurveTo(6.902618f, 11.6835f, 6.902618f, 12.3165f, 7.293f, 12.707f),
                    PathNode.LineTo(10.293f, 15.707f),
                    PathNode.CurveTo(10.6835f, 16.097382f, 11.3165f, 16.097382f, 11.707f, 15.707f),
                    PathNode.LineTo(11.79f, 15.613f),
                    PathNode.CurveTo(12.098803f, 15.214914f, 12.063235f, 14.649268f, 11.707f, 14.293f),
                    PathNode.LineTo(9.415f, 12.0f),
                    PathNode.LineTo(11.707f, 9.707f),
                    PathNode.CurveTo(12.097382f, 9.3165f, 12.097382f, 8.6835f, 11.707f, 8.293f)
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
        return _circleChevronsLeft!!
    }

private var _circleChevronsLeft: ImageVector? = null
