package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Pennant2: ImageVector
    get() {
        if (_pennant2 != null) return _pennant2!!
        _pennant2 = tablerFilledIcon(
            name = "Pennant2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 2.0f),
                    PathNode.CurveTo(14.506975f, 2.000067f, 14.933684f, 2.379507f, 14.993f, 2.883f),
                    PathNode.LineTo(15.0f, 3.0f),
                    PathNode.LineTo(15.0f, 20.0f),
                    PathNode.LineTo(16.0f, 20.0f),
                    PathNode.CurveTo(16.529093f, 20.000587f, 16.966166f, 20.41321f, 16.997171f, 20.941395f),
                    PathNode.CurveTo(17.02818f, 21.46958f, 16.642391f, 21.93051f, 16.117f, 21.993f),
                    PathNode.LineTo(16.0f, 22.0f),
                    PathNode.LineTo(12.0f, 22.0f),
                    PathNode.CurveTo(11.470906f, 21.999413f, 11.033835f, 21.58679f, 11.002828f, 21.058605f),
                    PathNode.CurveTo(10.971821f, 20.53042f, 11.35761f, 20.06949f, 11.883f, 20.007f),
                    PathNode.LineTo(12.0f, 20.0f),
                    PathNode.LineTo(13.0f, 20.0f),
                    PathNode.LineTo(13.0f, 12.649f),
                    PathNode.LineTo(4.594f, 8.914f),
                    PathNode.CurveTo(3.842f, 8.579f, 3.804f, 7.549f, 4.481f, 7.144f),
                    PathNode.LineTo(4.594f, 7.086f),
                    PathNode.LineTo(13.0f, 3.35f),
                    PathNode.LineTo(13.0f, 3.0f),
                    PathNode.CurveTo(13.0f, 2.447715f, 13.447715f, 2.0f, 14.0f, 2.0f),
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
        return _pennant2!!
    }

private var _pennant2: ImageVector? = null
