package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleChevronLeft: ImageVector
    get() {
        if (_circleChevronLeft != null) return _circleChevronLeft!!
        _circleChevronLeft = tablerFilledIcon(
            name = "CircleChevronLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 3.34f),
                    PathNode.CurveTo(20.093933f, 5.126283f, 21.999908f, 8.427435f, 22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f),
                    PathNode.CurveTo(2.000091f, 8.427389f, 3.906116f, 5.126203f, 7.00011f, 3.339937f),
                    PathNode.CurveTo(10.094104f, 1.553671f, 13.906029f, 1.553695f, 17.0f, 3.34f),
                    PathNode.MoveTo(13.707f, 8.293f),
                    PathNode.CurveTo(13.3165f, 7.902618f, 12.6835f, 7.902618f, 12.293f, 8.293f),
                    PathNode.LineTo(9.293f, 11.293f),
                    PathNode.CurveTo(8.902618f, 11.6835f, 8.902618f, 12.3165f, 9.293f, 12.707f),
                    PathNode.LineTo(12.293f, 15.707f),
                    PathNode.CurveTo(12.6835f, 16.097382f, 13.3165f, 16.097382f, 13.707f, 15.707f),
                    PathNode.LineTo(13.79f, 15.613f),
                    PathNode.CurveTo(14.098803f, 15.214914f, 14.063235f, 14.649268f, 13.707f, 14.293f),
                    PathNode.LineTo(11.415f, 12.0f),
                    PathNode.LineTo(13.707f, 9.707f),
                    PathNode.CurveTo(14.097382f, 9.3165f, 14.097382f, 8.6835f, 13.707f, 8.293f)
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
        return _circleChevronLeft!!
    }

private var _circleChevronLeft: ImageVector? = null
