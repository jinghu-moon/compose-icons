package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Robot: ImageVector
    get() {
        if (_robot != null) return _robot!!
        _robot = phosphorLightIcon(
            name = "Robot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 50.000 L 134.000 50.000 L 134.000 16.000 C 134.000 12.686 131.314 10.000 128.000 10.000 C 124.686 10.000 122.000 12.686 122.000 16.000 L 122.000 50.000 L 56.000 50.000 C 39.431 50.000 26.000 63.431 26.000 80.000 L 26.000 192.000 C 26.000 208.569 39.431 222.000 56.000 222.000 L 200.000 222.000 C 216.569 222.000 230.000 208.569 230.000 192.000 L 230.000 80.000 C 230.000 63.431 216.569 50.000 200.000 50.000 ZM 218.000 192.000 C 218.000 201.941 209.941 210.000 200.000 210.000 L 56.000 210.000 C 46.059 210.000 38.000 201.941 38.000 192.000 L 38.000 80.000 C 38.000 70.059 46.059 62.000 56.000 62.000 L 200.000 62.000 C 209.941 62.000 218.000 70.059 218.000 80.000 ZM 74.000 108.000 C 74.000 102.477 78.477 98.000 84.000 98.000 C 89.523 98.000 94.000 102.477 94.000 108.000 C 94.000 113.523 89.523 118.000 84.000 118.000 C 78.477 118.000 74.000 113.523 74.000 108.000 ZM 162.000 108.000 C 162.000 102.477 166.477 98.000 172.000 98.000 C 177.523 98.000 182.000 102.477 182.000 108.000 C 182.000 113.523 177.523 118.000 172.000 118.000 C 166.477 118.000 162.000 113.523 162.000 108.000 ZM 164.000 138.000 L 92.000 138.000 C 77.641 138.000 66.000 149.641 66.000 164.000 C 66.000 178.359 77.641 190.000 92.000 190.000 L 164.000 190.000 C 178.359 190.000 190.000 178.359 190.000 164.000 C 190.000 149.641 178.359 138.000 164.000 138.000 ZM 142.000 150.000 L 142.000 178.000 L 114.000 178.000 L 114.000 150.000 ZM 78.000 164.000 C 78.000 156.268 84.268 150.000 92.000 150.000 L 102.000 150.000 L 102.000 178.000 L 92.000 178.000 C 84.268 178.000 78.000 171.732 78.000 164.000 ZM 164.000 178.000 L 154.000 178.000 L 154.000 150.000 L 164.000 150.000 C 171.732 150.000 178.000 156.268 178.000 164.000 C 178.000 171.732 171.732 178.000 164.000 178.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _robot!!
    }

private var _robot: ImageVector? = null
