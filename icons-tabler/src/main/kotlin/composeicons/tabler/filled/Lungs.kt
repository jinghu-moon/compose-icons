package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Lungs: ImageVector
    get() {
        if (_lungs != null) return _lungs!!
        _lungs = tablerFilledIcon(
            name = "Lungs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 3.0f),
                    PathNode.CurveTo(12.552285f, 3.0f, 13.0f, 3.447715f, 13.0f, 4.0f),
                    PathNode.LineTo(13.0f, 9.0f),
                    PathNode.CurveTo(13.000018f, 9.714513f, 13.381213f, 10.374743f, 14.0f, 10.732f),
                    PathNode.LineTo(14.0f, 7.257f),
                    PathNode.CurveTo(14.0f, 6.015f, 14.995f, 5.0f, 16.233f, 5.0f),
                    PathNode.CurveTo(16.605f, 5.0f, 16.971f, 5.094f, 17.355f, 5.307f),
                    PathNode.LineTo(17.535f, 5.424f),
                    PathNode.CurveTo(19.23f, 6.654f, 20.295f, 8.459f, 21.308f, 11.764f),
                    PathNode.QuadTo(21.982f, 13.968f, 22.0f, 16.824f),
                    PathNode.CurveTo(22.016f, 19.019f, 20.343f, 20.848f, 18.157f, 20.992f),
                    PathNode.LineTo(17.92f, 21.0f),
                    PathNode.CurveTo(15.75f, 21.0f, 14.0f, 19.213f, 14.0f, 17.02f),
                    PathNode.LineTo(14.0f, 12.874f),
                    PathNode.CurveTo(13.277637f, 12.687143f, 12.621937f, 12.301967f, 12.107f, 11.762f),
                    PathNode.LineTo(12.0f, 11.644f),
                    PathNode.LineTo(11.893f, 11.762f),
                    PathNode.CurveTo(11.378338f, 12.301807f, 10.723004f, 12.686972f, 10.001f, 12.874f),
                    PathNode.LineTo(10.0f, 17.02f),
                    PathNode.CurveTo(10.0f, 19.213f, 8.25f, 21.0f, 6.081f, 21.0f),
                    PathNode.LineTo(5.813f, 20.99f),
                    PathNode.CurveTo(3.658f, 20.848f, 1.986f, 19.019f, 2.002f, 16.825f),
                    PathNode.QuadTo(2.02f, 13.967f, 2.694f, 11.765f),
                    PathNode.CurveTo(3.705f, 8.458f, 4.77f, 6.653f, 6.516f, 5.39f),
                    PathNode.LineTo(6.704f, 5.273f),
                    PathNode.CurveTo(7.029878f, 5.093497f, 7.395955f, 4.999569f, 7.768f, 5.0f),
                    PathNode.CurveTo(9.005f, 5.0f, 10.0f, 6.015f, 10.0f, 7.257f),
                    PathNode.LineTo(10.001f, 10.732f),
                    PathNode.CurveTo(10.619402f, 10.37449f, 11.000188f, 9.714307f, 11.0f, 9.0f),
                    PathNode.LineTo(11.0f, 4.0f),
                    PathNode.CurveTo(11.0f, 3.447715f, 11.447715f, 3.0f, 12.0f, 3.0f)
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
        return _lungs!!
    }

private var _lungs: ImageVector? = null
