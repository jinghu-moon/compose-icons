package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.YinYang: ImageVector
    get() {
        if (_yinYang != null) return _yinYang!!
        _yinYang = phosphorBoldIcon(
            name = "YinYang",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM44 128C44.05 81.629 81.629 44.05 128 44c19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36-18-.001-35.049 8.08-46.445 22.012C70.159 151.945 65.62 170.258 69.19 187.9 53.072 172.139 43.99 150.544 44 128ZM128 212C108.118 212 92 195.882 92 176c0-19.882 16.118-36 36-36 18 .001 35.049-8.08 46.445-22.012 11.396-13.933 15.935-32.245 12.365-49.888 24.372 23.877 31.866 60.132 18.959 91.716C192.861 191.399 162.12 212.027 128 212ZM144 176c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM112 80c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16Z"),
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
        return _yinYang!!
    }

private var _yinYang: ImageVector? = null
