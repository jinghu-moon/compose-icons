package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ThreeD: ImageVector
    get() {
        if (_threeD != null) return _threeD!!
        _threeD = phosphorFillIcon(
            name = "ThreeD",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 128c0 17.673-14.327 32-32 32h-8v-64h8c17.673 0 32 14.327 32 32ZM232 56v144c0 8.837-7.163 16-16 16h-176c-8.837 0-16-7.163-16-16v-144C24 47.163 31.163 40 40 40h176c8.837 0 16 7.163 16 16ZM112 144c-.001-12.368-7.131-23.629-18.31-28.92L110.4 92.8c1.818-2.424 2.111-5.667 .755-8.378C109.8 81.712 107.03 80 104 80h-40c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h24L73.6 115.2c-1.818 2.424-2.111 5.667-.755 8.378C74.2 126.288 76.97 128 80 128c7.131-.001 13.402 4.717 15.376 11.57 1.975 6.852-.824 14.184-6.862 17.978-6.038 3.794-13.858 3.134-19.175-1.617-3.292-2.949-8.351-2.672-11.3 .62-2.949 3.292-2.672 8.351 .62 11.3 9.405 8.417 22.88 10.519 34.402 5.367C104.584 168.065 112.002 156.622 112 144ZM200 128C199.972 101.502 178.498 80.028 152 80h-16c-4.418 0-8 3.582-8 8v80c0 4.418 3.582 8 8 8h16c26.498-.028 47.972-21.502 48-48Z"),
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
        return _threeD!!
    }

private var _threeD: ImageVector? = null
