package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SlidersHorizontal: ImageVector
    get() {
        if (_slidersHorizontal != null) return _slidersHorizontal!!
        _slidersHorizontal = phosphorFillIcon(
            name = "SlidersHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 32.000 80.000 C 32.000 75.582 35.582 72.000 40.000 72.000 L 77.170 72.000 C 80.711 60.138 91.621 52.009 104.000 52.009 C 116.379 52.009 127.289 60.138 130.830 72.000 L 216.000 72.000 C 220.418 72.000 224.000 75.582 224.000 80.000 C 224.000 84.418 220.418 88.000 216.000 88.000 L 130.830 88.000 C 127.289 99.862 116.379 107.991 104.000 107.991 C 91.621 107.991 80.711 99.862 77.170 88.000 L 40.000 88.000 C 35.582 88.000 32.000 84.418 32.000 80.000 ZM 216.000 168.000 L 194.830 168.000 C 191.289 156.138 180.379 148.009 168.000 148.009 C 155.621 148.009 144.711 156.138 141.170 168.000 L 40.000 168.000 C 35.582 168.000 32.000 171.582 32.000 176.000 C 32.000 180.418 35.582 184.000 40.000 184.000 L 141.170 184.000 C 144.711 195.862 155.621 203.991 168.000 203.991 C 180.379 203.991 191.289 195.862 194.830 184.000 L 216.000 184.000 C 220.418 184.000 224.000 180.418 224.000 176.000 C 224.000 171.582 220.418 168.000 216.000 168.000 Z"),
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
        return _slidersHorizontal!!
    }

private var _slidersHorizontal: ImageVector? = null
