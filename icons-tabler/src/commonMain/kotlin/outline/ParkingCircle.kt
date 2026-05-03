package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ParkingCircle: ImageVector
    get() {
        if (_parkingCircle != null) return _parkingCircle!!
        _parkingCircle = tablerOutlineIcon(
            name = "ParkingCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 16.0f),
                    PathNode.LineTo(10.0f, 8.0f),
                    PathNode.LineTo(13.334f, 8.0f),
                    PathNode.CurveTo(14.254f, 8.0f, 15.0f, 8.895f, 15.0f, 10.0f),
                    PathNode.CurveTo(15.0f, 11.105f, 14.254f, 12.0f, 13.334f, 12.0f),
                    PathNode.LineTo(10.0f, 12.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 12.0f),
                    PathNode.CurveTo(3.0f, 16.970562f, 7.029437f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(16.970562f, 21.0f, 21.0f, 16.970562f, 21.0f, 12.0f),
                    PathNode.CurveTo(21.0f, 7.029437f, 16.970562f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(7.029437f, 3.0f, 3.0f, 7.029437f, 3.0f, 12.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _parkingCircle!!
    }

private var _parkingCircle: ImageVector? = null
