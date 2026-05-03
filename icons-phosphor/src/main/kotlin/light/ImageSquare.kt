package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ImageSquare: ImageVector
    get() {
        if (_imageSquare != null) return _imageSquare!!
        _imageSquare = phosphorLightIcon(
            name = "ImageSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 34.000 L 48.000 34.000 C 40.268 34.000 34.000 40.268 34.000 48.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 208.000 222.000 C 215.732 222.000 222.000 215.732 222.000 208.000 L 222.000 48.000 C 222.000 40.268 215.732 34.000 208.000 34.000 ZM 46.000 208.000 L 46.000 48.000 C 46.000 46.895 46.895 46.000 48.000 46.000 L 208.000 46.000 C 209.105 46.000 210.000 46.895 210.000 48.000 L 210.000 130.200 L 181.900 102.100 C 179.274 99.474 175.713 97.999 172.000 97.999 C 168.287 97.999 164.726 99.474 162.100 102.100 L 54.200 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 ZM 208.000 210.000 L 71.170 210.000 L 170.580 110.590 C 170.955 110.214 171.464 110.003 171.995 110.003 C 172.526 110.003 173.035 110.214 173.410 110.590 L 210.000 147.170 L 210.000 208.000 C 210.000 209.105 209.105 210.000 208.000 210.000 ZM 96.000 118.000 C 108.150 118.000 118.000 108.150 118.000 96.000 C 118.000 83.850 108.150 74.000 96.000 74.000 C 83.850 74.000 74.000 83.850 74.000 96.000 C 74.000 108.150 83.850 118.000 96.000 118.000 ZM 96.000 86.000 C 101.523 86.000 106.000 90.477 106.000 96.000 C 106.000 101.523 101.523 106.000 96.000 106.000 C 90.477 106.000 86.000 101.523 86.000 96.000 C 86.000 90.477 90.477 86.000 96.000 86.000 Z"),
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
        return _imageSquare!!
    }

private var _imageSquare: ImageVector? = null
