package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CableCar: ImageVector
    get() {
        if (_cableCar != null) return _cableCar!!
        _cableCar = phosphorLightIcon(
            name = "CableCar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(245.91f, 31.0f),
                    PathNode.CurveTo(245.63028f, 29.425814f, 244.73384f, 28.028374f, 243.41963f, 27.117807f),
                    PathNode.CurveTo(242.10541f, 26.207241f, 240.48212f, 25.858868f, 238.91f, 26.15f),
                    PathNode.LineTo(15.0f, 66.1f),
                    PathNode.CurveTo(11.96569f, 66.65919f, 9.850127f, 69.4285f, 10.108494f, 72.50307f),
                    PathNode.CurveTo(10.366861f, 75.57764f, 12.914921f, 77.95505f, 16.0f, 78.0f),
                    PathNode.CurveTo(16.358532f, 77.99943f, 16.71641f, 77.96932f, 17.07f, 77.91f),
                    PathNode.LineTo(122.0f, 59.17f),
                    PathNode.LineTo(122.0f, 98.0f),
                    PathNode.LineTo(64.0f, 98.0f),
                    PathNode.CurveTo(47.431458f, 98.0f, 34.0f, 111.43146f, 34.0f, 128.0f),
                    PathNode.LineTo(34.0f, 192.0f),
                    PathNode.CurveTo(34.0f, 208.56854f, 47.431458f, 222.0f, 64.0f, 222.0f),
                    PathNode.LineTo(192.0f, 222.0f),
                    PathNode.CurveTo(208.56854f, 222.0f, 222.0f, 208.56854f, 222.0f, 192.0f),
                    PathNode.LineTo(222.0f, 128.0f),
                    PathNode.CurveTo(222.0f, 111.43146f, 208.56854f, 98.0f, 192.0f, 98.0f),
                    PathNode.LineTo(134.0f, 98.0f),
                    PathNode.LineTo(134.0f, 57.0f),
                    PathNode.LineTo(241.05f, 37.91f),
                    PathNode.CurveTo(244.2918f, 37.330692f, 246.46082f, 34.246758f, 245.91f, 31.0f),
                    PathNode.Close,
                    PathNode.MoveTo(102.0f, 162.0f),
                    PathNode.LineTo(102.0f, 110.0f),
                    PathNode.LineTo(154.0f, 110.0f),
                    PathNode.LineTo(154.0f, 162.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 110.0f),
                    PathNode.LineTo(90.0f, 110.0f),
                    PathNode.LineTo(90.0f, 162.0f),
                    PathNode.LineTo(46.0f, 162.0f),
                    PathNode.LineTo(46.0f, 128.0f),
                    PathNode.CurveTo(46.0f, 118.05888f, 54.058876f, 110.0f, 64.0f, 110.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 210.0f),
                    PathNode.LineTo(64.0f, 210.0f),
                    PathNode.CurveTo(54.058876f, 210.0f, 46.0f, 201.94113f, 46.0f, 192.0f),
                    PathNode.LineTo(46.0f, 174.0f),
                    PathNode.LineTo(210.0f, 174.0f),
                    PathNode.LineTo(210.0f, 192.0f),
                    PathNode.CurveTo(210.0f, 201.94113f, 201.94113f, 210.0f, 192.0f, 210.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 128.0f),
                    PathNode.LineTo(210.0f, 162.0f),
                    PathNode.LineTo(166.0f, 162.0f),
                    PathNode.LineTo(166.0f, 110.0f),
                    PathNode.LineTo(192.0f, 110.0f),
                    PathNode.CurveTo(201.94113f, 110.0f, 210.0f, 118.05888f, 210.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _cableCar!!
    }

private var _cableCar: ImageVector? = null
