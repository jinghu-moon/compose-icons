package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FloppyDisk: ImageVector
    get() {
        if (_floppyDisk != null) return _floppyDisk!!
        _floppyDisk = phosphorLightIcon(
            name = "FloppyDisk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 217.900 73.420 L 182.580 38.100 C 179.963 35.468 176.402 33.991 172.690 34.000 L 48.000 34.000 C 40.268 34.000 34.000 40.268 34.000 48.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 208.000 222.000 C 215.732 222.000 222.000 215.732 222.000 208.000 L 222.000 83.310 C 222.009 79.598 220.532 76.037 217.900 73.420 ZM 170.000 210.000 L 86.000 210.000 L 86.000 152.000 C 86.000 150.895 86.895 150.000 88.000 150.000 L 168.000 150.000 C 169.105 150.000 170.000 150.895 170.000 152.000 ZM 210.000 208.000 C 210.000 209.105 209.105 210.000 208.000 210.000 L 182.000 210.000 L 182.000 152.000 C 182.000 144.268 175.732 138.000 168.000 138.000 L 88.000 138.000 C 80.268 138.000 74.000 144.268 74.000 152.000 L 74.000 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 L 46.000 48.000 C 46.000 46.895 46.895 46.000 48.000 46.000 L 172.690 46.000 C 173.218 46.000 173.725 46.208 174.100 46.580 L 209.420 81.900 C 209.792 82.275 210.000 82.782 210.000 83.310 ZM 158.000 72.000 C 158.000 75.314 155.314 78.000 152.000 78.000 L 96.000 78.000 C 92.686 78.000 90.000 75.314 90.000 72.000 C 90.000 68.686 92.686 66.000 96.000 66.000 L 152.000 66.000 C 155.314 66.000 158.000 68.686 158.000 72.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _floppyDisk!!
    }

private var _floppyDisk: ImageVector? = null
