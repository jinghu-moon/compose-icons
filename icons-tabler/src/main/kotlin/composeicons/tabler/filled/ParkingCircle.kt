package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ParkingCircle: ImageVector
    get() {
        if (_parkingCircle != null) return _parkingCircle!!
        _parkingCircle = tablerFilledIcon(
            name = "ParkingCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 17.522848f, 17.522848f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(6.477153f, 22.0f, 2.0f, 17.522848f, 2.0f, 12.0f),
                    PathNode.LineTo(2.004f, 11.72f),
                    PathNode.CurveTo(2.152f, 6.327f, 6.57f, 2.0f, 12.0f, 2.0f),
                    PathNode.MoveTo(13.334f, 7.0f),
                    PathNode.LineTo(10.0f, 7.0f),
                    PathNode.CurveTo(9.447715f, 7.0f, 9.0f, 7.447716f, 9.0f, 8.0f),
                    PathNode.LineTo(9.0f, 16.0f),
                    PathNode.CurveTo(9.0f, 16.552284f, 9.447715f, 17.0f, 10.0f, 17.0f),
                    PathNode.LineTo(10.117f, 16.993f),
                    PathNode.CurveTo(10.620493f, 16.933683f, 10.999933f, 16.506975f, 11.0f, 16.0f),
                    PathNode.LineTo(11.0f, 13.0f),
                    PathNode.LineTo(13.334f, 13.0f),
                    PathNode.CurveTo(14.85f, 13.0f, 16.0f, 11.62f, 16.0f, 10.0f),
                    PathNode.CurveTo(16.0f, 8.38f, 14.85f, 7.0f, 13.334f, 7.0f),
                    PathNode.MoveTo(13.334f, 9.0f),
                    PathNode.CurveTo(13.657f, 9.0f, 14.0f, 9.411f, 14.0f, 10.0f),
                    PathNode.CurveTo(14.0f, 10.589f, 13.657f, 11.0f, 13.334f, 11.0f),
                    PathNode.LineTo(11.0f, 11.0f),
                    PathNode.LineTo(11.0f, 9.0f),
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
        return _parkingCircle!!
    }

private var _parkingCircle: ImageVector? = null
