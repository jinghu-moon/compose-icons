package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TidalLogo: ImageVector
    get() {
        if (_tidalLogo != null) return _tidalLogo!!
        _tidalLogo = phosphorLightIcon(
            name = "TidalLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 252.240 91.760 L 212.240 51.760 C 209.897 49.420 206.103 49.420 203.760 51.760 L 168.000 87.520 L 132.240 51.760 C 129.897 49.420 126.103 49.420 123.760 51.760 L 88.000 87.520 L 52.240 51.760 C 49.897 49.420 46.103 49.420 43.760 51.760 L 3.760 91.760 C 1.420 94.103 1.420 97.897 3.760 100.240 L 43.760 140.240 C 46.103 142.580 49.897 142.580 52.240 140.240 L 88.000 104.480 L 119.520 136.000 L 83.760 171.760 C 81.420 174.103 81.420 177.897 83.760 180.240 L 123.760 220.240 C 126.103 222.580 129.897 222.580 132.240 220.240 L 172.240 180.240 C 174.580 177.897 174.580 174.103 172.240 171.760 L 136.480 136.000 L 168.000 104.480 L 203.760 140.240 C 206.103 142.580 209.897 142.580 212.240 140.240 L 252.240 100.240 C 254.580 97.897 254.580 94.103 252.240 91.760 ZM 48.000 127.510 L 16.490 96.000 L 48.000 64.490 L 79.510 96.000 ZM 128.000 207.510 L 96.490 176.000 L 128.000 144.490 L 159.510 176.000 ZM 128.000 127.510 L 96.490 96.000 L 128.000 64.490 L 159.510 96.000 ZM 208.000 127.510 L 176.490 96.000 L 208.000 64.490 L 239.510 96.000 Z"),
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
        return _tidalLogo!!
    }

private var _tidalLogo: ImageVector? = null
