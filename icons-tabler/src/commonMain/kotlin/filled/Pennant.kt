package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Pennant: ImageVector
    get() {
        if (_pennant != null) return _pennant!!
        _pennant = tablerFilledIcon(
            name = "Pennant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 2.0f),
                    PathNode.CurveTo(10.506975f, 2.000067f, 10.933684f, 2.379507f, 10.993f, 2.883f),
                    PathNode.LineTo(11.0f, 3.0f),
                    PathNode.LineTo(11.0f, 3.35f),
                    PathNode.LineTo(19.406f, 7.086f),
                    PathNode.CurveTo(20.158f, 7.421f, 20.196f, 8.451f, 19.519f, 8.856f),
                    PathNode.LineTo(19.406f, 8.914f),
                    PathNode.LineTo(11.0f, 12.649f),
                    PathNode.LineTo(11.0f, 20.0f),
                    PathNode.LineTo(12.0f, 20.0f),
                    PathNode.CurveTo(12.529094f, 20.000587f, 12.966165f, 20.41321f, 12.997172f, 20.941395f),
                    PathNode.CurveTo(13.028179f, 21.46958f, 12.64239f, 21.93051f, 12.117f, 21.993f),
                    PathNode.LineTo(12.0f, 22.0f),
                    PathNode.LineTo(8.0f, 22.0f),
                    PathNode.CurveTo(7.470907f, 21.999413f, 7.033836f, 21.58679f, 7.002828f, 21.058605f),
                    PathNode.CurveTo(6.971821f, 20.53042f, 7.35761f, 20.06949f, 7.883f, 20.007f),
                    PathNode.LineTo(8.0f, 20.0f),
                    PathNode.LineTo(9.0f, 20.0f),
                    PathNode.LineTo(9.0f, 3.0f),
                    PathNode.CurveTo(9.0f, 2.447715f, 9.447715f, 2.0f, 10.0f, 2.0f),
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
        return _pennant!!
    }

private var _pennant: ImageVector? = null
