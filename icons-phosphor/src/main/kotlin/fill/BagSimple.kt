package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BagSimple: ImageVector
    get() {
        if (_bagSimple != null) return _bagSimple!!
        _bagSimple = phosphorFillIcon(
            name = "BagSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 64.000 L 176.000 64.000 C 176.000 37.490 154.510 16.000 128.000 16.000 C 101.490 16.000 80.000 37.490 80.000 64.000 L 40.000 64.000 C 31.163 64.000 24.000 71.163 24.000 80.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 80.000 C 232.000 71.163 224.837 64.000 216.000 64.000 ZM 128.000 32.000 C 145.673 32.000 160.000 46.327 160.000 64.000 L 96.000 64.000 C 96.000 46.327 110.327 32.000 128.000 32.000 Z"),
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
        return _bagSimple!!
    }

private var _bagSimple: ImageVector? = null
