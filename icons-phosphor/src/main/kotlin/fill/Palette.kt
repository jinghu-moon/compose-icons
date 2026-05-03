package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Palette: ImageVector
    get() {
        if (_palette != null) return _palette!!
        _palette = phosphorFillIcon(
            name = "Palette",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.770 53.890 C 181.407 34.716 155.250 23.972 128.000 24.000 L 126.930 24.000 C 69.911 24.587 23.997 70.978 24.000 128.000 C 24.000 171.000 50.580 207.060 93.360 222.170 C 103.151 225.622 114.008 224.109 122.483 218.113 C 130.958 212.117 135.997 202.382 136.000 192.000 C 136.000 183.163 143.163 176.000 152.000 176.000 L 198.210 176.000 C 213.166 176.072 226.152 165.717 229.410 151.120 C 231.198 143.247 232.067 135.193 232.000 127.120 C 231.794 99.517 220.548 73.146 200.770 53.890 ZM 84.000 168.000 C 77.373 168.000 72.000 162.627 72.000 156.000 C 72.000 149.373 77.373 144.000 84.000 144.000 C 90.627 144.000 96.000 149.373 96.000 156.000 C 96.000 162.627 90.627 168.000 84.000 168.000 ZM 84.000 112.000 C 77.373 112.000 72.000 106.627 72.000 100.000 C 72.000 93.373 77.373 88.000 84.000 88.000 C 90.627 88.000 96.000 93.373 96.000 100.000 C 96.000 106.627 90.627 112.000 84.000 112.000 ZM 128.000 88.000 C 121.373 88.000 116.000 82.627 116.000 76.000 C 116.000 69.373 121.373 64.000 128.000 64.000 C 134.627 64.000 140.000 69.373 140.000 76.000 C 140.000 82.627 134.627 88.000 128.000 88.000 ZM 172.000 112.000 C 165.373 112.000 160.000 106.627 160.000 100.000 C 160.000 93.373 165.373 88.000 172.000 88.000 C 178.627 88.000 184.000 93.373 184.000 100.000 C 184.000 106.627 178.627 112.000 172.000 112.000 Z"),
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
        return _palette!!
    }

private var _palette: ImageVector? = null
