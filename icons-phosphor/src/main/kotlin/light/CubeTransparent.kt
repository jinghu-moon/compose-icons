package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CubeTransparent: ImageVector
    get() {
        if (_cubeTransparent != null) return _cubeTransparent!!
        _cubeTransparent = phosphorLightIcon(
            name = "CubeTransparent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.240 91.750 L 164.000 35.560 C 162.908 34.559 161.481 34.002 160.000 34.000 L 40.000 34.000 C 36.686 34.000 34.000 36.686 34.000 40.000 L 34.000 160.000 C 33.999 161.594 34.632 163.123 35.760 164.250 L 91.760 220.250 C 92.886 221.372 94.411 222.001 96.000 222.000 L 216.000 222.000 C 219.314 222.000 222.000 219.314 222.000 216.000 L 222.000 96.000 C 222.001 94.406 221.368 92.877 220.240 91.750 ZM 166.000 54.480 L 201.520 90.000 L 166.000 90.000 ZM 90.000 201.480 L 54.480 166.000 L 90.000 166.000 ZM 90.000 154.000 L 46.000 154.000 L 46.000 54.480 L 90.000 98.480 ZM 54.480 46.000 L 154.000 46.000 L 154.000 90.000 L 98.480 90.000 ZM 154.000 102.000 L 154.000 154.000 L 102.000 154.000 L 102.000 102.000 ZM 102.000 210.000 L 102.000 166.000 L 157.520 166.000 L 201.520 210.000 ZM 210.000 201.520 L 166.000 157.520 L 166.000 102.000 L 210.000 102.000 Z"),
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
        return _cubeTransparent!!
    }

private var _cubeTransparent: ImageVector? = null
