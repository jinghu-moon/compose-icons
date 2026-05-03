package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberEight: ImageVector
    get() {
        if (_numberEight != null) return _numberEight!!
        _numberEight = phosphorThinIcon(
            name = "NumberEight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 147.080 119.640 C 165.580 110.737 175.464 90.224 170.898 70.207 C 166.332 50.191 148.531 35.992 128.000 35.992 C 107.469 35.992 89.668 50.191 85.102 70.207 C 80.536 90.224 90.420 110.737 108.920 119.640 C 85.688 128.804 72.251 153.189 76.915 177.724 C 81.579 202.259 103.026 220.013 128.000 220.013 C 152.974 220.013 174.421 202.259 179.085 177.724 C 183.749 153.189 170.312 128.804 147.080 119.640 ZM 92.000 80.000 C 92.000 60.118 108.118 44.000 128.000 44.000 C 147.882 44.000 164.000 60.118 164.000 80.000 C 164.000 99.882 147.882 116.000 128.000 116.000 C 108.118 116.000 92.000 99.882 92.000 80.000 ZM 128.000 212.000 C 103.699 212.000 84.000 192.301 84.000 168.000 C 84.000 143.699 103.699 124.000 128.000 124.000 C 152.301 124.000 172.000 143.699 172.000 168.000 C 171.972 192.289 152.289 211.972 128.000 212.000 Z"),
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
        return _numberEight!!
    }

private var _numberEight: ImageVector? = null
