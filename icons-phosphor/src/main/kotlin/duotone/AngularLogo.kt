package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.AngularLogo: ImageVector
    get() {
        if (_angularLogo != null) return _angularLogo!!
        _angularLogo = phosphorDuotoneIcon(
            name = "AngularLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 224.000 72.000 L 208.000 192.000 L 128.000 232.000 L 48.000 192.000 L 32.000 72.000 L 128.000 32.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 227.080 64.620 L 131.080 24.620 C 129.111 23.790 126.889 23.790 124.920 24.620 L 28.920 64.620 C 25.581 66.013 23.592 69.474 24.070 73.060 L 40.070 193.060 C 40.419 195.689 42.049 197.973 44.420 199.160 L 124.420 239.160 C 126.673 240.288 129.327 240.288 131.580 239.160 L 211.580 199.160 C 213.951 197.973 215.581 195.689 215.930 193.060 L 231.930 73.060 C 232.408 69.474 230.419 66.013 227.080 64.620 ZM 200.630 186.740 L 128.000 223.060 L 55.370 186.740 L 40.740 77.000 L 128.000 40.670 L 215.260 77.000 ZM 121.000 84.120 L 81.000 156.120 C 78.857 159.986 80.254 164.857 84.120 167.000 C 87.986 169.143 92.857 167.746 95.000 163.880 L 106.000 144.000 L 150.000 144.000 L 161.000 163.880 C 163.143 167.746 168.014 169.143 171.880 167.000 C 175.746 164.857 177.143 159.986 175.000 156.120 L 135.000 84.120 C 133.591 81.573 130.910 79.993 128.000 79.993 C 125.090 79.993 122.409 81.573 121.000 84.120 ZM 141.070 128.000 L 114.930 128.000 L 128.000 104.470 Z"),
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
        return _angularLogo!!
    }

private var _angularLogo: ImageVector? = null
