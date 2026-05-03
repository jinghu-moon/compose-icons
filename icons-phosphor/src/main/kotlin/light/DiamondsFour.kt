package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DiamondsFour: ImageVector
    get() {
        if (_diamondsFour != null) return _diamondsFour!!
        _diamondsFour = phosphorLightIcon(
            name = "DiamondsFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 123.760 108.240 C 126.103 110.580 129.897 110.580 132.240 108.240 L 172.240 68.240 C 174.580 65.897 174.580 62.103 172.240 59.760 L 132.240 19.760 C 129.897 17.420 126.103 17.420 123.760 19.760 L 83.760 59.760 C 81.420 62.103 81.420 65.897 83.760 68.240 ZM 128.000 32.490 L 159.510 64.000 L 128.000 95.510 L 96.490 64.000 ZM 132.240 147.760 C 129.897 145.420 126.103 145.420 123.760 147.760 L 83.760 187.760 C 81.420 190.103 81.420 193.897 83.760 196.240 L 123.760 236.240 C 126.103 238.580 129.897 238.580 132.240 236.240 L 172.240 196.240 C 174.580 193.897 174.580 190.103 172.240 187.760 ZM 128.000 223.510 L 96.490 192.000 L 128.000 160.490 L 159.510 192.000 ZM 236.240 123.760 L 196.240 83.760 C 193.897 81.420 190.103 81.420 187.760 83.760 L 147.760 123.760 C 145.420 126.103 145.420 129.897 147.760 132.240 L 187.760 172.240 C 190.103 174.580 193.897 174.580 196.240 172.240 L 236.240 132.240 C 238.580 129.897 238.580 126.103 236.240 123.760 ZM 192.000 159.510 L 160.490 128.000 L 192.000 96.490 L 223.510 128.000 ZM 108.240 123.760 L 68.240 83.760 C 65.897 81.420 62.103 81.420 59.760 83.760 L 19.760 123.760 C 17.420 126.103 17.420 129.897 19.760 132.240 L 59.760 172.240 C 62.103 174.580 65.897 174.580 68.240 172.240 L 108.240 132.240 C 110.580 129.897 110.580 126.103 108.240 123.760 ZM 64.000 159.510 L 32.490 128.000 L 64.000 96.490 L 95.510 128.000 Z"),
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
        return _diamondsFour!!
    }

private var _diamondsFour: ImageVector? = null
