package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MagnetStraight: ImageVector
    get() {
        if (_magnetStraight != null) return _magnetStraight!!
        _magnetStraight = phosphorFillIcon(
            name = "MagnetStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 40.000 L 160.000 40.000 C 151.163 40.000 144.000 47.163 144.000 56.000 L 144.000 144.000 C 144.000 152.837 136.837 160.000 128.000 160.000 C 119.163 160.000 112.000 152.837 112.000 144.000 L 112.000 56.000 C 112.000 47.163 104.837 40.000 96.000 40.000 L 56.000 40.000 C 47.163 40.000 40.000 47.163 40.000 56.000 L 40.000 144.000 C 40.000 192.601 79.399 232.000 128.000 232.000 L 128.670 232.000 C 176.820 231.640 216.000 191.710 216.000 143.000 L 216.000 56.000 C 216.000 47.163 208.837 40.000 200.000 40.000 ZM 200.000 56.000 L 200.000 96.000 L 160.000 96.000 L 160.000 56.000 ZM 96.000 56.000 L 96.000 96.000 L 56.000 96.000 L 56.000 56.000 Z"),
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
        return _magnetStraight!!
    }

private var _magnetStraight: ImageVector? = null
