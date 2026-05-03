package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Edit: ImageVector
    get() {
        if (_edit != null) return _edit!!
        _edit = tablerFilledIcon(
            name = "Edit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 7.0f),
                    PathNode.CurveTo(8.0f, 7.552285f, 7.552285f, 8.0f, 7.0f, 8.0f),
                    PathNode.LineTo(6.0f, 8.0f),
                    PathNode.CurveTo(5.447716f, 8.0f, 5.0f, 8.447715f, 5.0f, 9.0f),
                    PathNode.LineTo(5.0f, 18.0f),
                    PathNode.CurveTo(5.0f, 18.552284f, 5.447716f, 19.0f, 6.0f, 19.0f),
                    PathNode.LineTo(15.0f, 19.0f),
                    PathNode.CurveTo(15.552285f, 19.0f, 16.0f, 18.552284f, 16.0f, 18.0f),
                    PathNode.LineTo(16.0f, 17.0f),
                    PathNode.CurveTo(16.0f, 16.447716f, 16.447716f, 16.0f, 17.0f, 16.0f),
                    PathNode.CurveTo(17.552284f, 16.0f, 18.0f, 16.447716f, 18.0f, 17.0f),
                    PathNode.LineTo(18.0f, 18.0f),
                    PathNode.CurveTo(18.0f, 19.656855f, 16.656855f, 21.0f, 15.0f, 21.0f),
                    PathNode.LineTo(6.0f, 21.0f),
                    PathNode.CurveTo(4.343146f, 21.0f, 3.0f, 19.656855f, 3.0f, 18.0f),
                    PathNode.LineTo(3.0f, 9.0f),
                    PathNode.CurveTo(3.0f, 7.343146f, 4.343146f, 6.0f, 6.0f, 6.0f),
                    PathNode.LineTo(7.0f, 6.0f),
                    PathNode.CurveTo(7.552285f, 6.0f, 8.0f, 6.447716f, 8.0f, 7.0f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.596f, 5.011f),
                    PathNode.LineTo(18.988f, 9.403f),
                    PathNode.LineTo(12.708f, 15.706f),
                    PathNode.CurveTo(12.520427f, 15.894161f, 12.265685f, 15.999944f, 12.0f, 16.0f),
                    PathNode.LineTo(9.0f, 16.0f),
                    PathNode.CurveTo(8.447715f, 16.0f, 8.0f, 15.552285f, 8.0f, 15.0f),
                    PathNode.LineTo(8.0f, 12.0f),
                    PathNode.CurveTo(8.000057f, 11.734315f, 8.105839f, 11.479573f, 8.294f, 11.292f),
                    PathNode.Close,
                    PathNode.MoveTo(21.092f, 2.908f),
                    PathNode.CurveTo(22.235867f, 4.051063f, 22.307737f, 5.881782f, 21.257f, 7.111f),
                    PathNode.LineTo(21.093f, 7.291f),
                    PathNode.LineTo(20.4f, 7.985f),
                    PathNode.LineTo(16.013f, 3.598f),
                    PathNode.LineTo(16.708f, 2.908f),
                    PathNode.CurveTo(17.91862f, 1.697416f, 19.881382f, 1.697416f, 21.092f, 2.908f)
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
        return _edit!!
    }

private var _edit: ImageVector? = null
