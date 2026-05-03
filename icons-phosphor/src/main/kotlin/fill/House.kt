package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.House: ImageVector
    get() {
        if (_house != null) return _house!!
        _house = phosphorFillIcon(
            name = "House",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 120.000 L 224.000 216.000 C 224.000 220.418 220.418 224.000 216.000 224.000 L 160.000 224.000 C 155.582 224.000 152.000 220.418 152.000 216.000 L 152.000 164.000 C 152.000 161.791 150.209 160.000 148.000 160.000 L 108.000 160.000 C 105.791 160.000 104.000 161.791 104.000 164.000 L 104.000 216.000 C 104.000 220.418 100.418 224.000 96.000 224.000 L 40.000 224.000 C 35.582 224.000 32.000 220.418 32.000 216.000 L 32.000 120.000 C 32.002 115.757 33.689 111.689 36.690 108.690 L 116.690 28.690 C 122.938 22.447 133.062 22.447 139.310 28.690 L 219.310 108.690 C 222.311 111.689 223.998 115.757 224.000 120.000 Z"),
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
