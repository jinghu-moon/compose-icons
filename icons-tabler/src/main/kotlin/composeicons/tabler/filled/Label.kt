package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Label: ImageVector
    get() {
        if (_label != null) return _label!!
        _label = tablerFilledIcon(
            name = "Label",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.52f, 6.0f),
                    PathNode.CurveTo(17.127207f, 6.000076f, 17.701496f, 6.276f, 18.081f, 6.75f),
                    PathNode.LineTo(21.781f, 11.375f),
                    PathNode.CurveTo(22.0735f, 11.740333f, 22.0735f, 12.259667f, 21.781f, 12.625f),
                    PathNode.LineTo(18.081f, 17.249f),
                    PathNode.CurveTo(17.701694f, 17.723375f, 17.127375f, 17.999681f, 16.52f, 18.0f),
                    PathNode.LineTo(6.0f, 18.0f),
                    PathNode.CurveTo(4.343146f, 18.0f, 3.0f, 16.656855f, 3.0f, 15.0f),
                    PathNode.LineTo(3.0f, 9.0f),
                    PathNode.CurveTo(3.0f, 7.343146f, 4.343146f, 6.0f, 6.0f, 6.0f),
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
        return _label!!
    }

private var _label: ImageVector? = null
