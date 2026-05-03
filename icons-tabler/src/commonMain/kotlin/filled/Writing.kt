package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Writing: ImageVector
    get() {
        if (_writing != null) return _writing!!
        _writing = tablerFilledIcon(
            name = "Writing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 8.0f),
                    PathNode.LineTo(21.0f, 17.0f),
                    PathNode.CurveTo(20.999943f, 17.265194f, 20.89455f, 17.519506f, 20.707f, 17.707f),
                    PathNode.LineTo(18.707f, 19.707f),
                    PathNode.CurveTo(18.672117f, 19.742058f, 18.63468f, 19.77448f, 18.595f, 19.804f),
                    PathNode.LineTo(18.485f, 19.875f),
                    PathNode.LineTo(18.371f, 19.929f),
                    PathNode.LineTo(18.266f, 19.964f),
                    PathNode.LineTo(18.117f, 19.994f),
                    PathNode.LineTo(18.0f, 20.0f),
                    PathNode.LineTo(5.0f, 20.0f),
                    PathNode.CurveTo(3.343146f, 20.0f, 2.0f, 18.656855f, 2.0f, 17.0f),
                    PathNode.CurveTo(2.0f, 15.343145f, 3.343146f, 14.0f, 5.0f, 14.0f),
                    PathNode.LineTo(9.0f, 14.0f),
                    PathNode.CurveTo(9.552285f, 14.0f, 10.0f, 13.552285f, 10.0f, 13.0f),
                    PathNode.CurveTo(10.0f, 12.447715f, 9.552285f, 12.0f, 9.0f, 12.0f),
                    PathNode.LineTo(6.0f, 12.0f),
                    PathNode.CurveTo(5.447716f, 12.0f, 5.0f, 11.552285f, 5.0f, 11.0f),
                    PathNode.CurveTo(5.0f, 10.447715f, 5.447716f, 10.0f, 6.0f, 10.0f),
                    PathNode.LineTo(9.0f, 10.0f),
                    PathNode.CurveTo(10.656855f, 10.0f, 12.0f, 11.343145f, 12.0f, 13.0f),
                    PathNode.CurveTo(12.0f, 14.656855f, 10.656855f, 16.0f, 9.0f, 16.0f),
                    PathNode.LineTo(5.0f, 16.0f),
                    PathNode.CurveTo(4.447716f, 16.0f, 4.0f, 16.447716f, 4.0f, 17.0f),
                    PathNode.CurveTo(4.0f, 17.552284f, 4.447716f, 18.0f, 5.0f, 18.0f),
                    PathNode.LineTo(15.585f, 18.0f),
                    PathNode.LineTo(15.293f, 17.707f),
                    PathNode.CurveTo(15.105451f, 17.519506f, 15.000056f, 17.265194f, 15.0f, 17.0f),
                    PathNode.LineTo(15.0f, 8.0f),
                    PathNode.Close,
                    PathNode.MoveTo(18.0f, 2.0f),
                    PathNode.CurveTo(19.673f, 2.0f, 21.0f, 3.327f, 21.0f, 5.0f),
                    PathNode.LineTo(21.0f, 6.0f),
                    PathNode.LineTo(15.0f, 6.0f),
                    PathNode.LineTo(15.0f, 5.0f),
                    PathNode.CurveTo(15.0f, 3.327f, 16.327f, 2.0f, 18.0f, 2.0f)
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
        return _writing!!
    }

private var _writing: ImageVector? = null
