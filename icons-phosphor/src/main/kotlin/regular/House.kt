package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.House: ImageVector
    get() {
        if (_house != null) return _house!!
        _house = phosphorRegularIcon(
            name = "House",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 219.310 108.680 L 139.310 28.680 C 133.062 22.437 122.938 22.437 116.690 28.680 L 36.690 108.680 C 33.674 111.673 31.985 115.751 32.000 120.000 L 32.000 216.000 C 32.000 220.418 35.582 224.000 40.000 224.000 L 104.000 224.000 C 108.418 224.000 112.000 220.418 112.000 216.000 L 112.000 160.000 L 144.000 160.000 L 144.000 216.000 C 144.000 220.418 147.582 224.000 152.000 224.000 L 216.000 224.000 C 220.418 224.000 224.000 220.418 224.000 216.000 L 224.000 120.000 C 224.015 115.751 222.326 111.673 219.310 108.680 ZM 208.000 208.000 L 160.000 208.000 L 160.000 152.000 C 160.000 147.582 156.418 144.000 152.000 144.000 L 104.000 144.000 C 99.582 144.000 96.000 147.582 96.000 152.000 L 96.000 208.000 L 48.000 208.000 L 48.000 120.000 L 128.000 40.000 L 208.000 120.000 Z"),
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
        return _house!!
    }

private var _house: ImageVector? = null
