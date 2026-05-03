package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Divide: ImageVector
    get() {
        if (_divide != null) return _divide!!
        _divide = phosphorThinIcon(
            name = "Divide",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.000 128.000 C 220.000 130.209 218.209 132.000 216.000 132.000 L 40.000 132.000 C 37.791 132.000 36.000 130.209 36.000 128.000 C 36.000 125.791 37.791 124.000 40.000 124.000 L 216.000 124.000 C 218.209 124.000 220.000 125.791 220.000 128.000 ZM 128.000 76.000 C 134.627 76.000 140.000 70.627 140.000 64.000 C 140.000 57.373 134.627 52.000 128.000 52.000 C 121.373 52.000 116.000 57.373 116.000 64.000 C 116.000 70.627 121.373 76.000 128.000 76.000 ZM 128.000 180.000 C 121.373 180.000 116.000 185.373 116.000 192.000 C 116.000 198.627 121.373 204.000 128.000 204.000 C 134.627 204.000 140.000 198.627 140.000 192.000 C 140.000 185.373 134.627 180.000 128.000 180.000 Z"),
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
        return _divide!!
    }

private var _divide: ImageVector? = null
