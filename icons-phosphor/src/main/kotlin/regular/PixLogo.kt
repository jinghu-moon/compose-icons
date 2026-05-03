package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PixLogo: ImageVector
    get() {
        if (_pixLogo != null) return _pixLogo!!
        _pixLogo = phosphorRegularIcon(
            name = "PixLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 235.340 116.720 L 139.280 20.660 C 133.039 14.456 122.961 14.456 116.720 20.660 L 20.660 116.720 C 14.456 122.961 14.456 133.039 20.660 139.280 L 116.720 235.340 C 122.961 241.544 133.039 241.544 139.280 235.340 L 235.340 139.280 C 241.544 133.039 241.544 122.961 235.340 116.720 ZM 128.000 32.000 L 184.000 88.000 L 160.000 88.000 C 157.878 87.998 155.842 88.840 154.340 90.340 L 128.000 116.680 L 101.660 90.340 C 100.158 88.840 98.122 87.998 96.000 88.000 L 72.000 88.000 ZM 56.000 104.000 L 92.680 104.000 L 116.680 128.000 L 92.680 152.000 L 56.000 152.000 L 32.000 128.000 ZM 128.000 224.000 L 72.000 168.000 L 96.000 168.000 C 98.122 168.002 100.158 167.160 101.660 165.660 L 128.000 139.310 L 154.340 165.660 C 155.842 167.160 157.878 168.002 160.000 168.000 L 184.000 168.000 ZM 200.000 152.000 L 163.320 152.000 L 139.320 128.000 L 163.320 104.000 L 200.000 104.000 L 224.000 128.000 Z"),
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
        return _pixLogo!!
    }

private var _pixLogo: ImageVector? = null
