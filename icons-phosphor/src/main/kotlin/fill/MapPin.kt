package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MapPin: ImageVector
    get() {
        if (_mapPin != null) return _mapPin!!
        _mapPin = phosphorFillIcon(
            name = "MapPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 16.000 C 79.422 16.055 40.055 55.422 40.000 104.000 C 40.000 179.300 120.000 236.170 123.410 238.550 C 126.166 240.480 129.834 240.480 132.590 238.550 C 136.000 236.170 216.000 179.300 216.000 104.000 C 215.945 55.422 176.578 16.055 128.000 16.000 ZM 128.000 72.000 C 145.673 72.000 160.000 86.327 160.000 104.000 C 160.000 121.673 145.673 136.000 128.000 136.000 C 110.327 136.000 96.000 121.673 96.000 104.000 C 96.000 86.327 110.327 72.000 128.000 72.000 Z"),
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
        return _mapPin!!
    }

private var _mapPin: ImageVector? = null
