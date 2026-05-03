package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HandGrabbing: ImageVector
    get() {
        if (_handGrabbing != null) return _handGrabbing!!
        _handGrabbing = phosphorLightIcon(
            name = "HandGrabbing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 188.000 82.000 C 182.796 81.994 177.710 83.559 173.410 86.490 C 171.296 76.775 163.827 69.116 154.168 66.759 C 144.508 64.402 134.351 67.760 128.000 75.410 C 121.003 66.987 109.480 63.850 99.179 67.565 C 88.879 71.280 82.010 81.050 82.000 92.000 L 82.000 114.000 L 68.000 114.000 C 53.641 114.000 42.000 125.641 42.000 140.000 L 42.000 152.000 C 42.000 199.496 80.504 238.000 128.000 238.000 C 175.496 238.000 214.000 199.496 214.000 152.000 L 214.000 108.000 C 214.000 93.641 202.359 82.000 188.000 82.000 ZM 202.000 152.000 C 202.000 192.869 168.869 226.000 128.000 226.000 C 87.131 226.000 54.000 192.869 54.000 152.000 L 54.000 140.000 C 54.000 132.268 60.268 126.000 68.000 126.000 L 82.000 126.000 L 82.000 152.000 C 82.000 155.314 84.686 158.000 88.000 158.000 C 91.314 158.000 94.000 155.314 94.000 152.000 L 94.000 92.000 C 94.000 84.268 100.268 78.000 108.000 78.000 C 115.732 78.000 122.000 84.268 122.000 92.000 L 122.000 120.000 C 122.000 123.314 124.686 126.000 128.000 126.000 C 131.314 126.000 134.000 123.314 134.000 120.000 L 134.000 92.000 C 134.000 84.268 140.268 78.000 148.000 78.000 C 155.732 78.000 162.000 84.268 162.000 92.000 L 162.000 120.000 C 162.000 123.314 164.686 126.000 168.000 126.000 C 171.314 126.000 174.000 123.314 174.000 120.000 L 174.000 108.000 C 174.000 100.268 180.268 94.000 188.000 94.000 C 195.732 94.000 202.000 100.268 202.000 108.000 Z"),
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
        return _handGrabbing!!
    }

private var _handGrabbing: ImageVector? = null
