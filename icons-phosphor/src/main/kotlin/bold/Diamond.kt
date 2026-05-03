package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Diamond: ImageVector
    get() {
        if (_diamond != null) return _diamond!!
        _diamond = phosphorBoldIcon(
            name = "Diamond",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 238.160 113.890 L 142.100 17.830 C 134.298 10.069 121.692 10.069 113.890 17.830 L 17.890 113.890 C 10.122 121.693 10.122 134.307 17.890 142.110 L 113.940 238.170 L 113.940 238.170 C 121.742 245.931 134.348 245.931 142.150 238.170 L 238.150 142.110 C 245.918 134.307 245.918 121.693 238.150 113.890 ZM 128.000 218.330 L 37.680 128.000 L 128.000 37.670 L 218.320 128.000 Z"),
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
        return _diamond!!
    }

private var _diamond: ImageVector? = null
