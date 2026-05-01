package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Point: ImageVector
    get() {
        if (_point != null) return _point!!
        _point = tablerFilledIcon(
            name = "Point",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 7.0f),
                    PathNode.CurveTo(14.733247f, 6.999842f, 16.960106f, 9.194495f, 16.999763f, 11.927454f),
                    PathNode.CurveTo(17.03942f, 14.660413f, 14.877177f, 16.918755f, 12.145077f, 16.997904f),
                    PathNode.CurveTo(9.412976f, 17.077051f, 7.123623f, 14.947671f, 7.005f, 12.217f),
                    PathNode.LineTo(7.0f, 12.0f),
                    PathNode.LineTo(7.005f, 11.783f),
                    PathNode.CurveTo(7.121178f, 9.108604f, 9.323082f, 7.000155f, 12.0f, 7.0f),
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
        return _point!!
    }

private var _point: ImageVector? = null
