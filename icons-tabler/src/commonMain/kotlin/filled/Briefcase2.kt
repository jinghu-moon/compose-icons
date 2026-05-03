package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Briefcase2: ImageVector
    get() {
        if (_briefcase2 != null) return _briefcase2!!
        _briefcase2 = tablerFilledIcon(
            name = "Briefcase2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 2.0f),
                    PathNode.CurveTo(15.656855f, 2.0f, 17.0f, 3.343146f, 17.0f, 5.0f),
                    PathNode.LineTo(17.0f, 6.0f),
                    PathNode.LineTo(19.0f, 6.0f),
                    PathNode.CurveTo(20.656855f, 6.0f, 22.0f, 7.343146f, 22.0f, 9.0f),
                    PathNode.LineTo(22.0f, 18.0f),
                    PathNode.CurveTo(22.0f, 19.656855f, 20.656855f, 21.0f, 19.0f, 21.0f),
                    PathNode.LineTo(5.0f, 21.0f),
                    PathNode.CurveTo(3.343146f, 21.0f, 2.0f, 19.656855f, 2.0f, 18.0f),
                    PathNode.LineTo(2.0f, 9.0f),
                    PathNode.CurveTo(2.0f, 7.343146f, 3.343146f, 6.0f, 5.0f, 6.0f),
                    PathNode.LineTo(7.0f, 6.0f),
                    PathNode.LineTo(7.0f, 5.0f),
                    PathNode.CurveTo(7.0f, 3.343146f, 8.343146f, 2.0f, 10.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(14.0f, 4.0f),
                    PathNode.LineTo(10.0f, 4.0f),
                    PathNode.CurveTo(9.447715f, 4.0f, 9.0f, 4.447716f, 9.0f, 5.0f),
                    PathNode.LineTo(9.0f, 6.0f),
                    PathNode.LineTo(15.0f, 6.0f),
                    PathNode.LineTo(15.0f, 5.0f),
                    PathNode.CurveTo(15.0f, 4.447716f, 14.552285f, 4.0f, 14.0f, 4.0f)
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
        return _briefcase2!!
    }

private var _briefcase2: ImageVector? = null
