package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Diamond: ImageVector
    get() {
        if (_diamond != null) return _diamond!!
        _diamond = phosphorRegularIcon(
            name = "Diamond",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 235.330 116.720 L 139.280 20.660 C 133.039 14.456 122.961 14.456 116.720 20.660 L 20.720 116.720 C 14.516 122.961 14.516 133.039 20.720 139.280 L 116.770 235.340 L 116.770 235.340 C 123.011 241.544 133.089 241.544 139.330 235.340 L 235.380 139.280 C 241.584 133.039 241.584 122.961 235.380 116.720 ZM 128.000 224.000 L 128.000 224.000 L 32.000 128.000 L 128.000 32.000 L 224.000 128.000 Z"),
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
