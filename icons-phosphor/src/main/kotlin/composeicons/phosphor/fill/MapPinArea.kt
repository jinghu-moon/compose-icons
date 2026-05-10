package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MapPinArea: ImageVector
    get() {
        if (_mapPinArea != null) return _mapPinArea!!
        _mapPinArea = phosphorFillIcon(
            name = "MapPinArea",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M124 175c2.46 1.406 5.48 1.406 7.94 0 2.45-1.41 60-35 60-94.95C190.895 45.482 162.578 17.998 127.994 17.984 93.411 17.971 65.072 45.433 64 80c0 60 57.58 93.54 60 95ZM128 56c13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24C114.745 104 104 93.255 104 80c0-13.255 10.745-24 24-24ZM240 184c0 31.18-57.71 48-112 48C73.71 232 16 215.18 16 184c0-14.59 13.22-27.51 37.23-36.37 4.093-1.352 8.521 .781 10.014 4.825 1.493 4.043-.485 8.543-4.474 10.175C42.26 168.74 32 176.92 32 184c0 13.36 36.52 32 96 32 59.48 0 96-18.64 96-32 0-7.08-10.26-15.26-26.77-21.36-3.989-1.633-5.967-6.132-4.474-10.175 1.493-4.043 5.921-6.177 10.014-4.825C226.78 156.49 240 169.41 240 184Z"),
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
        return _mapPinArea!!
    }

private var _mapPinArea: ImageVector? = null
