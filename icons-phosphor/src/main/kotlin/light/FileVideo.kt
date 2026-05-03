package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileVideo: ImageVector
    get() {
        if (_fileVideo != null) return _fileVideo!!
        _fileVideo = phosphorLightIcon(
            name = "FileVideo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.240 83.760 L 156.240 27.760 C 155.116 26.634 153.591 26.001 152.000 26.000 L 56.000 26.000 C 48.268 26.000 42.000 32.268 42.000 40.000 L 42.000 112.000 C 42.000 115.314 44.686 118.000 48.000 118.000 C 51.314 118.000 54.000 115.314 54.000 112.000 L 54.000 40.000 C 54.000 38.895 54.895 38.000 56.000 38.000 L 146.000 38.000 L 146.000 88.000 C 146.000 91.314 148.686 94.000 152.000 94.000 L 202.000 94.000 L 202.000 216.000 C 202.000 217.105 201.105 218.000 200.000 218.000 L 192.000 218.000 C 188.686 218.000 186.000 220.686 186.000 224.000 C 186.000 227.314 188.686 230.000 192.000 230.000 L 200.000 230.000 C 207.732 230.000 214.000 223.732 214.000 216.000 L 214.000 88.000 C 213.999 86.409 213.366 84.884 212.240 83.760 ZM 158.000 46.480 L 193.520 82.000 L 158.000 82.000 ZM 154.910 146.750 C 153.002 145.692 150.670 145.753 148.820 146.910 L 126.000 161.170 L 126.000 160.000 C 126.000 152.268 119.732 146.000 112.000 146.000 L 48.000 146.000 C 40.268 146.000 34.000 152.268 34.000 160.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 112.000 222.000 C 119.732 222.000 126.000 215.732 126.000 208.000 L 126.000 206.830 L 148.820 221.090 C 150.670 222.246 153.002 222.307 154.909 221.249 C 156.817 220.192 158.001 218.182 158.000 216.000 L 158.000 152.000 C 158.001 149.818 156.818 147.808 154.910 146.750 ZM 114.000 208.000 C 114.000 209.105 113.105 210.000 112.000 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 L 46.000 160.000 C 46.000 158.895 46.895 158.000 48.000 158.000 L 112.000 158.000 C 113.105 158.000 114.000 158.895 114.000 160.000 ZM 146.000 205.170 L 126.000 192.670 L 126.000 175.330 L 146.000 162.830 Z"),
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
        return _fileVideo!!
    }

private var _fileVideo: ImageVector? = null
