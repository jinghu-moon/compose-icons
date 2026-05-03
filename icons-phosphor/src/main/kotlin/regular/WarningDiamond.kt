package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.WarningDiamond: ImageVector
    get() {
        if (_warningDiamond != null) return _warningDiamond!!
        _warningDiamond = phosphorRegularIcon(
            name = "WarningDiamond",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 72.000 C 132.418 72.000 136.000 75.582 136.000 80.000 L 136.000 136.000 C 136.000 140.418 132.418 144.000 128.000 144.000 C 123.582 144.000 120.000 140.418 120.000 136.000 L 120.000 80.000 C 120.000 75.582 123.582 72.000 128.000 72.000 ZM 116.000 172.000 C 116.000 178.627 121.373 184.000 128.000 184.000 C 134.627 184.000 140.000 178.627 140.000 172.000 C 140.000 165.373 134.627 160.000 128.000 160.000 C 121.373 160.000 116.000 165.373 116.000 172.000 ZM 240.000 128.000 C 240.012 132.233 238.330 136.294 235.330 139.280 L 139.280 235.340 C 133.039 241.544 122.961 241.544 116.720 235.340 L 116.720 235.340 L 20.720 139.280 C 14.516 133.039 14.516 122.961 20.720 116.720 L 116.770 20.660 C 123.011 14.456 133.089 14.456 139.330 20.660 L 235.380 116.720 C 238.362 119.714 240.025 123.774 240.000 128.000 ZM 224.000 128.000 L 128.000 32.000 L 32.000 128.000 L 128.000 224.000 L 128.000 224.000 Z"),
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
        return _warningDiamond!!
    }

private var _warningDiamond: ImageVector? = null
