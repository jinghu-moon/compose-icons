package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsSplit: ImageVector
    get() {
        if (_arrowsSplit != null) return _arrowsSplit!!
        _arrowsSplit = phosphorLightIcon(
            name = "ArrowsSplit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.240 188.240 L 196.240 220.240 C 193.897 222.580 190.103 222.580 187.760 220.240 L 155.760 188.240 C 153.557 185.876 153.622 182.192 155.907 179.907 C 158.192 177.622 161.876 177.557 164.240 179.760 L 186.000 201.510 L 186.000 138.510 L 128.000 80.510 L 70.000 138.510 L 70.000 201.510 L 91.760 179.760 C 94.124 177.557 97.808 177.622 100.093 179.907 C 102.378 182.192 102.443 185.876 100.240 188.240 L 68.240 220.240 C 65.897 222.580 62.103 222.580 59.760 220.240 L 27.760 188.240 C 25.557 185.876 25.622 182.192 27.907 179.907 C 30.192 177.622 33.876 177.557 36.240 179.760 L 58.000 201.510 L 58.000 136.000 C 58.001 134.409 58.634 132.884 59.760 131.760 L 122.000 69.510 L 122.000 24.000 C 122.000 20.686 124.686 18.000 128.000 18.000 C 131.314 18.000 134.000 20.686 134.000 24.000 L 134.000 69.510 L 196.240 131.760 C 197.366 132.884 197.999 134.409 198.000 136.000 L 198.000 201.510 L 219.760 179.760 C 222.124 177.557 225.808 177.622 228.093 179.907 C 230.378 182.192 230.443 185.876 228.240 188.240 Z"),
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
        return _arrowsSplit!!
    }

private var _arrowsSplit: ImageVector? = null
