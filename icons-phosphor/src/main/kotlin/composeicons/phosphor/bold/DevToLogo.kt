package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DevToLogo: ImageVector
    get() {
        if (_devToLogo != null) return _devToLogo!!
        _devToLogo = phosphorBoldIcon(
            name = "DevToLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 52h-208C12.954 52 4 60.954 4 72v112c0 11.046 8.954 20 20 20h208c11.046 0 20-8.954 20-20v-112C252 60.954 243.046 52 232 52ZM228 180h-200v-104h200ZM108 156v-56c0-6.627 5.373-12 12-12h20c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-8v4c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12v4h8c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-20c-6.627 0-12-5.373-12-12ZM160.46 103.3c-1.823-6.373 1.867-13.017 8.24-14.84 6.373-1.823 13.017 1.867 14.84 8.24L188 112.32l4.46-15.62c1.823-6.373 8.467-10.063 14.84-8.24 6.373 1.823 10.063 8.467 8.24 14.84l-16 56c-1.47 5.155-6.18 8.709-11.54 8.709-5.36 0-10.07-3.555-11.54-8.709ZM52 168h12c19.882 0 36-16.118 36-36v-8C100 104.118 83.882 88 64 88h-12c-6.627 0-12 5.373-12 12v56c0 6.627 5.373 12 12 12ZM64 112c6.627 0 12 5.373 12 12v8c0 6.627-5.373 12-12 12Z"),
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
        return _devToLogo!!
    }

private var _devToLogo: ImageVector? = null
