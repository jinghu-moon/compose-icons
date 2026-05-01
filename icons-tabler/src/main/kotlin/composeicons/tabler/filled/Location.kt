package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Location: ImageVector
    get() {
        if (_location != null) return _location!!
        _location = tablerFilledIcon(
            name = "Location",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.891f, 2.006f),
                    PathNode.LineTo(20.997f, 2.0f),
                    PathNode.LineTo(21.127f, 2.008f),
                    PathNode.LineTo(21.217f, 2.024f),
                    PathNode.LineTo(21.34f, 2.059f),
                    PathNode.LineTo(21.447f, 2.105f),
                    PathNode.LineTo(21.547f, 2.162f),
                    PathNode.LineTo(21.637f, 2.229f),
                    PathNode.LineTo(21.719f, 2.304f),
                    PathNode.LineTo(21.771f, 2.363f),
                    PathNode.LineTo(21.853f, 2.479f),
                    PathNode.LineTo(21.905f, 2.575f),
                    PathNode.CurveTo(21.952f, 2.675f, 21.982f, 2.781f, 21.995f, 2.891f),
                    PathNode.LineTo(22.0f, 2.997f),
                    PathNode.CurveTo(22.0f, 3.072f, 21.992f, 3.146f, 21.976f, 3.217f),
                    PathNode.LineTo(21.941f, 3.34f),
                    PathNode.LineTo(15.409f, 21.417f),
                    PathNode.CurveTo(15.15614f, 21.967472f, 14.605769f, 22.320192f, 14.0f, 22.32f),
                    PathNode.CurveTo(13.456542f, 22.321724f, 12.952037f, 22.038153f, 12.671f, 21.573f),
                    PathNode.LineTo(12.606f, 21.446f),
                    PathNode.LineTo(9.254f, 14.744f),
                    PathNode.LineTo(2.584f, 11.408f),
                    PathNode.CurveTo(2.081741f, 11.178292f, 1.739653f, 10.698683f, 1.686f, 10.149f),
                    PathNode.LineTo(1.68f, 10.0f),
                    PathNode.CurveTo(1.68f, 9.44f, 1.981f, 8.928f, 2.521f, 8.63f),
                    PathNode.LineTo(2.661f, 8.56f),
                    PathNode.LineTo(20.678f, 2.054f),
                    PathNode.LineTo(20.784f, 2.024f),
                    PathNode.LineTo(20.892f, 2.006f),
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
        return _location!!
    }

private var _location: ImageVector? = null
