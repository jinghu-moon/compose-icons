package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SprayBottle: ImageVector
    get() {
        if (_sprayBottle != null) return _sprayBottle!!
        _sprayBottle = phosphorLightIcon(
            name = "SprayBottle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 78.000 C 203.314 78.000 206.000 75.314 206.000 72.000 C 205.967 42.190 181.810 18.033 152.000 18.000 L 80.000 18.000 C 72.268 18.000 66.000 24.268 66.000 32.000 L 66.000 80.000 C 66.000 94.359 54.359 106.000 40.000 106.000 C 36.686 106.000 34.000 108.686 34.000 112.000 C 34.000 115.314 36.686 118.000 40.000 118.000 C 60.987 118.000 78.000 100.987 78.000 80.000 L 78.000 78.000 L 114.000 78.000 L 114.000 104.620 C 114.018 112.522 110.423 119.999 104.240 124.920 L 88.240 137.710 C 79.212 144.907 73.968 155.835 74.000 167.380 L 74.000 224.000 C 74.000 231.732 80.268 238.000 88.000 238.000 L 192.000 238.000 C 199.732 238.000 206.000 231.732 206.000 224.000 L 206.000 211.470 C 206.009 164.654 193.796 118.648 170.570 78.000 ZM 78.000 32.000 C 78.000 30.895 78.895 30.000 80.000 30.000 L 152.000 30.000 C 172.869 30.025 190.563 45.349 193.570 66.000 L 78.000 66.000 ZM 194.000 211.470 L 194.000 224.000 C 194.000 225.105 193.105 226.000 192.000 226.000 L 88.000 226.000 C 86.895 226.000 86.000 225.105 86.000 224.000 L 86.000 167.380 C 85.982 159.478 89.577 152.001 95.760 147.080 L 111.760 134.290 C 120.788 127.093 126.032 116.165 126.000 104.620 L 126.000 78.000 L 156.640 78.000 C 181.089 118.226 194.013 164.397 194.000 211.470 Z"),
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
        return _sprayBottle!!
    }

private var _sprayBottle: ImageVector? = null
