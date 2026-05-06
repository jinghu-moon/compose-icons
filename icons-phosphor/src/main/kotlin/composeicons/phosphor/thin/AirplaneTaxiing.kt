package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AirplaneTaxiing: ImageVector
    get() {
        if (_airplaneTaxiing != null) return _airplaneTaxiing!!
        _airplaneTaxiing = phosphorThinIcon(
            name = "AirplaneTaxiing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 100h-62.34L98.83 53.17C98.079 52.42 97.061 51.999 96 52h-8c-3.854 .005-7.47 1.861-9.722 4.988-2.252 3.127-2.865 7.146-1.648 10.802L87.36 100h-29.7L34.83 77.17C34.079 76.42 33.061 75.999 32 76h-8c-3.791 .004-7.358 1.8-9.619 4.843-2.261 3.043-2.951 6.976-1.861 10.607l14.06 46.89c4.506 15.271 18.559 25.728 34.48 25.66h178.94c2.209 0 4-1.791 4-4v-24c0-19.882-16.118-36-36-36ZM236 156h-174.94c-12.379 .053-23.305-8.077-26.81-19.95L20.18 89.15c-.363-1.209-.134-2.519 .618-3.533C21.551 84.603 22.737 84.004 24 84h6.34l22.83 22.83c.751 .75 1.769 1.171 2.83 1.17h36.91c1.284-.002 2.488-.62 3.239-1.662 .75-1.042 .955-2.38 .551-3.598L84.21 65.26c-.404-1.218-.199-2.557 .551-3.598C85.512 60.62 86.716 60.002 88 60h6.34l46.82 46.83c.753 .752 1.775 1.173 2.84 1.17h64c15.464 0 28 12.536 28 28ZM220 200c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM124 200c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
        return _airplaneTaxiing!!
    }

private var _airplaneTaxiing: ImageVector? = null
