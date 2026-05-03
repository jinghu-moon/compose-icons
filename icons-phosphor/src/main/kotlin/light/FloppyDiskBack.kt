package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FloppyDiskBack: ImageVector
    get() {
        if (_floppyDiskBack != null) return _floppyDiskBack!!
        _floppyDiskBack = phosphorLightIcon(
            name = "FloppyDiskBack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 34.000 L 83.310 34.000 C 79.596 33.993 76.032 35.469 73.410 38.100 L 38.100 73.410 C 35.469 76.032 33.993 79.596 34.000 83.310 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 208.000 222.000 C 215.732 222.000 222.000 215.732 222.000 208.000 L 222.000 48.000 C 222.000 40.268 215.732 34.000 208.000 34.000 ZM 86.000 46.000 L 170.000 46.000 L 170.000 80.000 C 170.000 81.105 169.105 82.000 168.000 82.000 L 88.000 82.000 C 86.895 82.000 86.000 81.105 86.000 80.000 ZM 210.000 208.000 C 210.000 209.105 209.105 210.000 208.000 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 L 46.000 83.310 C 46.002 82.780 46.214 82.273 46.590 81.900 L 74.000 54.480 L 74.000 80.000 C 74.000 87.732 80.268 94.000 88.000 94.000 L 168.000 94.000 C 175.732 94.000 182.000 87.732 182.000 80.000 L 182.000 46.000 L 208.000 46.000 C 209.105 46.000 210.000 46.895 210.000 48.000 ZM 128.000 114.000 C 107.013 114.000 90.000 131.013 90.000 152.000 C 90.000 172.987 107.013 190.000 128.000 190.000 C 148.987 190.000 166.000 172.987 166.000 152.000 C 166.000 131.013 148.987 114.000 128.000 114.000 ZM 128.000 178.000 C 113.641 178.000 102.000 166.359 102.000 152.000 C 102.000 137.641 113.641 126.000 128.000 126.000 C 142.359 126.000 154.000 137.641 154.000 152.000 C 154.000 166.359 142.359 178.000 128.000 178.000 Z"),
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
        return _floppyDiskBack!!
    }

private var _floppyDiskBack: ImageVector? = null
