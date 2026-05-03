package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Navigation: ImageVector
    get() {
        if (_navigation != null) return _navigation!!
        _navigation = tablerFilledIcon(
            name = "Navigation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.092f, 2.581f),
                    PathNode.CurveTo(11.245261f, 2.247853f, 11.568575f, 2.025316f, 11.934485f, 2.001117f),
                    PathNode.CurveTo(12.300396f, 1.976918f, 12.6502f, 2.154938f, 12.846f, 2.465f),
                    PathNode.LineTo(12.908f, 2.581f),
                    PathNode.LineTo(20.913f, 19.946f),
                    PathNode.CurveTo(21.111f, 20.512f, 20.963f, 21.142f, 20.535f, 21.561f),
                    PathNode.CurveTo(20.151793f, 21.939762f, 19.597607f, 22.089039f, 19.076f, 21.954f),
                    PathNode.LineTo(11.999f, 19.556f),
                    PathNode.LineTo(5.1f, 21.894f),
                    PathNode.CurveTo(4.588505f, 22.094572f, 4.008815f, 22.006474f, 3.58f, 21.663f),
                    PathNode.LineTo(3.468f, 21.563f),
                    PathNode.CurveTo(3.07f, 21.177f, 2.912f, 20.609f, 3.075f, 20.007f),
                    PathNode.LineTo(3.122f, 19.857f),
                    PathNode.LineTo(11.092f, 2.581f),
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
        return _navigation!!
    }

private var _navigation: ImageVector? = null
