package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BatteryVertical4: ImageVector
    get() {
        if (_batteryVertical4 != null) return _batteryVertical4!!
        _batteryVertical4 = tablerFilledIcon(
            name = "BatteryVertical4",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.5f, 3.0f),
                    PathNode.CurveTo(14.115449f, 2.999893f, 14.668515f, 3.37574f, 14.895f, 3.948f),
                    PathNode.LineTo(14.913f, 4.0f),
                    PathNode.LineTo(15.0f, 4.0f),
                    PathNode.CurveTo(16.588558f, 3.999912f, 17.901804f, 5.238179f, 17.995f, 6.824f),
                    PathNode.LineTo(18.0f, 7.0f),
                    PathNode.LineTo(18.0f, 18.0f),
                    PathNode.CurveTo(18.0f, 19.656855f, 16.656855f, 21.0f, 15.0f, 21.0f),
                    PathNode.LineTo(9.0f, 21.0f),
                    PathNode.CurveTo(7.343146f, 21.0f, 6.0f, 19.656855f, 6.0f, 18.0f),
                    PathNode.LineTo(6.0f, 7.0f),
                    PathNode.CurveTo(6.0f, 5.343146f, 7.343146f, 4.0f, 9.0f, 4.0f),
                    PathNode.LineTo(9.086f, 4.0f),
                    PathNode.LineTo(9.105f, 3.948f),
                    PathNode.CurveTo(9.312124f, 3.424659f, 9.794788f, 3.06131f, 10.355f, 3.007f),
                    PathNode.LineTo(10.5f, 3.0f),
                    PathNode.Close,
                    PathNode.MoveTo(14.0f, 16.0f),
                    PathNode.LineTo(10.0f, 16.0f),
                    PathNode.CurveTo(9.447715f, 16.0f, 9.0f, 16.447716f, 9.0f, 17.0f),
                    PathNode.CurveTo(9.0f, 17.552284f, 9.447715f, 18.0f, 10.0f, 18.0f),
                    PathNode.LineTo(14.0f, 18.0f),
                    PathNode.CurveTo(14.552285f, 18.0f, 15.0f, 17.552284f, 15.0f, 17.0f),
                    PathNode.CurveTo(15.0f, 16.447716f, 14.552285f, 16.0f, 14.0f, 16.0f),
                    PathNode.MoveTo(14.0f, 13.0f),
                    PathNode.LineTo(10.0f, 13.0f),
                    PathNode.CurveTo(9.447715f, 13.0f, 9.0f, 13.447715f, 9.0f, 14.0f),
                    PathNode.CurveTo(9.0f, 14.552285f, 9.447715f, 15.0f, 10.0f, 15.0f),
                    PathNode.LineTo(14.0f, 15.0f),
                    PathNode.CurveTo(14.552285f, 15.0f, 15.0f, 14.552285f, 15.0f, 14.0f),
                    PathNode.CurveTo(15.0f, 13.447715f, 14.552285f, 13.0f, 14.0f, 13.0f),
                    PathNode.MoveTo(14.0f, 10.0f),
                    PathNode.LineTo(10.0f, 10.0f),
                    PathNode.CurveTo(9.447715f, 10.0f, 9.0f, 10.447715f, 9.0f, 11.0f),
                    PathNode.CurveTo(9.0f, 11.552285f, 9.447715f, 12.0f, 10.0f, 12.0f),
                    PathNode.LineTo(14.0f, 12.0f),
                    PathNode.CurveTo(14.552285f, 12.0f, 15.0f, 11.552285f, 15.0f, 11.0f),
                    PathNode.CurveTo(15.0f, 10.447715f, 14.552285f, 10.0f, 14.0f, 10.0f),
                    PathNode.MoveTo(14.0f, 7.0f),
                    PathNode.LineTo(10.0f, 7.0f),
                    PathNode.CurveTo(9.447715f, 7.0f, 9.0f, 7.447716f, 9.0f, 8.0f),
                    PathNode.CurveTo(9.0f, 8.552285f, 9.447715f, 9.0f, 10.0f, 9.0f),
                    PathNode.LineTo(14.0f, 9.0f),
                    PathNode.CurveTo(14.552285f, 9.0f, 15.0f, 8.552285f, 15.0f, 8.0f),
                    PathNode.CurveTo(15.0f, 7.447716f, 14.552285f, 7.0f, 14.0f, 7.0f)
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
        return _batteryVertical4!!
    }

private var _batteryVertical4: ImageVector? = null
