package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceGamepad2: ImageVector
    get() {
        if (_deviceGamepad2 != null) return _deviceGamepad2!!
        _deviceGamepad2 = tablerFilledIcon(
            name = "DeviceGamepad2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.5f, 4.0f),
                    PathNode.CurveTo(18.49966f, 3.999832f, 21.038546f, 6.215004f, 21.445f, 9.187f),
                    PathNode.LineTo(22.977f, 17.07f),
                    PathNode.CurveTo(23.257206f, 18.509754f, 22.55348f, 19.96166f, 21.24972f, 20.633682f),
                    PathNode.CurveTo(19.945957f, 21.305702f, 18.355106f, 21.03653f, 17.345f, 19.973f),
                    PathNode.LineTo(13.569f, 15.999f),
                    PathNode.LineTo(10.429f, 16.0f),
                    PathNode.LineTo(6.71f, 19.916f),
                    PathNode.CurveTo(5.69775f, 20.98221f, 4.102258f, 21.250198f, 2.797211f, 20.573215f),
                    PathNode.CurveTo(1.492165f, 19.896233f, 0.792356f, 18.437574f, 1.081f, 16.996f),
                    PathNode.LineTo(2.715f, 8.823f),
                    PathNode.CurveTo(3.276147f, 6.018017f, 5.739438f, 3.999248f, 8.6f, 4.0f),
                    PathNode.Close,
                    PathNode.MoveTo(8.0f, 7.0f),
                    PathNode.CurveTo(7.447716f, 7.0f, 7.0f, 7.447716f, 7.0f, 8.0f),
                    PathNode.LineTo(7.0f, 9.0f),
                    PathNode.LineTo(6.0f, 9.0f),
                    PathNode.CurveTo(5.447716f, 9.0f, 5.0f, 9.447715f, 5.0f, 10.0f),
                    PathNode.CurveTo(5.0f, 10.552285f, 5.447716f, 11.0f, 6.0f, 11.0f),
                    PathNode.LineTo(7.0f, 11.0f),
                    PathNode.LineTo(7.0f, 12.0f),
                    PathNode.CurveTo(7.0f, 12.552285f, 7.447716f, 13.0f, 8.0f, 13.0f),
                    PathNode.CurveTo(8.552285f, 13.0f, 9.0f, 12.552285f, 9.0f, 12.0f),
                    PathNode.LineTo(9.0f, 11.0f),
                    PathNode.LineTo(10.0f, 11.0f),
                    PathNode.CurveTo(10.552285f, 11.0f, 11.0f, 10.552285f, 11.0f, 10.0f),
                    PathNode.CurveTo(11.0f, 9.447715f, 10.552285f, 9.0f, 10.0f, 9.0f),
                    PathNode.LineTo(9.0f, 9.0f),
                    PathNode.LineTo(9.0f, 8.0f),
                    PathNode.CurveTo(9.0f, 7.447716f, 8.552285f, 7.0f, 8.0f, 7.0f),
                    PathNode.MoveTo(18.0f, 9.0f),
                    PathNode.LineTo(14.0f, 9.0f),
                    PathNode.CurveTo(13.447715f, 9.0f, 13.0f, 9.447715f, 13.0f, 10.0f),
                    PathNode.CurveTo(13.0f, 10.552285f, 13.447715f, 11.0f, 14.0f, 11.0f),
                    PathNode.LineTo(18.0f, 11.0f),
                    PathNode.CurveTo(18.552284f, 11.0f, 19.0f, 10.552285f, 19.0f, 10.0f),
                    PathNode.CurveTo(19.0f, 9.447715f, 18.552284f, 9.0f, 18.0f, 9.0f)
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
        return _deviceGamepad2!!
    }

private var _deviceGamepad2: ImageVector? = null
