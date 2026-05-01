package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Helicopter: ImageVector
    get() {
        if (_helicopter != null) return _helicopter!!
        _helicopter = tablerFilledIcon(
            name = "Helicopter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.0f, 5.0f),
                    PathNode.CurveTo(20.552284f, 5.0f, 21.0f, 5.447716f, 21.0f, 6.0f),
                    PathNode.CurveTo(21.0f, 6.552285f, 20.552284f, 7.0f, 20.0f, 7.0f),
                    PathNode.LineTo(14.0f, 7.0f),
                    PathNode.LineTo(14.0f, 8.0f),
                    PathNode.CurveTo(18.642f, 8.0f, 22.0f, 10.218f, 22.0f, 14.0f),
                    PathNode.CurveTo(22.0f, 15.656855f, 20.656855f, 17.0f, 19.0f, 17.0f),
                    PathNode.LineTo(16.0f, 17.0f),
                    PathNode.LineTo(16.0f, 18.0f),
                    PathNode.LineTo(19.0f, 18.0f),
                    PathNode.CurveTo(19.552284f, 18.0f, 20.0f, 18.447716f, 20.0f, 19.0f),
                    PathNode.CurveTo(20.0f, 19.552284f, 19.552284f, 20.0f, 19.0f, 20.0f),
                    PathNode.LineTo(11.0f, 20.0f),
                    PathNode.CurveTo(10.447715f, 20.0f, 10.0f, 19.552284f, 10.0f, 19.0f),
                    PathNode.CurveTo(10.0f, 18.447716f, 10.447715f, 18.0f, 11.0f, 18.0f),
                    PathNode.LineTo(14.0f, 18.0f),
                    PathNode.LineTo(14.0f, 17.0f),
                    PathNode.LineTo(12.0f, 17.0f),
                    PathNode.CurveTo(10.348f, 17.0f, 9.0f, 15.652f, 9.0f, 14.0f),
                    PathNode.LineTo(9.0f, 12.999f),
                    PathNode.LineTo(3.0f, 13.0f),
                    PathNode.CurveTo(2.621334f, 12.999798f, 2.275264f, 12.785729f, 2.106f, 12.447f),
                    PathNode.LineTo(1.106f, 10.447f),
                    PathNode.CurveTo(0.87944f, 9.956548f, 1.08339f, 9.374822f, 1.566607f, 9.133213f),
                    PathNode.CurveTo(2.049823f, 8.891605f, 2.637574f, 9.07748f, 2.894f, 9.553f),
                    PathNode.LineTo(3.618f, 11.0f),
                    PathNode.LineTo(9.0f, 10.999f),
                    PathNode.LineTo(9.005f, 10.824f),
                    PathNode.CurveTo(9.098195f, 9.238178f, 10.411443f, 7.999912f, 12.0f, 8.0f),
                    PathNode.LineTo(12.0f, 7.0f),
                    PathNode.LineTo(5.0f, 7.0f),
                    PathNode.CurveTo(4.447716f, 7.0f, 4.0f, 6.552285f, 4.0f, 6.0f),
                    PathNode.CurveTo(4.0f, 5.447716f, 4.447716f, 5.0f, 5.0f, 5.0f),
                    PathNode.Close,
                    PathNode.MoveTo(16.001f, 10.174f),
                    PathNode.LineTo(16.0f, 12.0f),
                    PathNode.LineTo(19.36f, 12.0f),
                    PathNode.CurveTo(18.695f, 11.094f, 17.535f, 10.461f, 16.001f, 10.174f)
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
        return _helicopter!!
    }

private var _helicopter: ImageVector? = null
