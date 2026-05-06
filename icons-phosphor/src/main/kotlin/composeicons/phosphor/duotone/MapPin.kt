package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MapPin: ImageVector
    get() {
        if (_mapPin != null) return _mapPin!!
        _mapPin = phosphorDuotoneIcon(
            name = "MapPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C83.817 24 48 59.817 48 104c0 72 80 128 80 128 0 0 80-56 80-128C208 59.817 172.183 24 128 24ZM128 136C110.327 136 96 121.673 96 104 96 86.327 110.327 72 128 72c17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M128 64C105.909 64 88 81.909 88 104c0 22.091 17.909 40 40 40 22.091 0 40-17.909 40-40C168 81.909 150.091 64 128 64ZM128 128c-13.255 0-24-10.745-24-24 0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24ZM128 16C79.422 16.055 40.055 55.422 40 104c0 31.4 14.51 64.68 42 96.25 12.352 14.266 26.255 27.111 41.45 38.3 2.756 1.93 6.424 1.93 9.18 0C147.797 227.357 161.673 214.511 174 200.25 201.45 168.68 216 135.4 216 104 215.945 55.422 176.578 16.055 128 16ZM128 222C111.47 209 56 161.25 56 104 56 64.235 88.235 32 128 32c39.764 0 72 32.235 72 72 0 57.23-55.47 105-72 118Z"),
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
        return _mapPin!!
    }

private var _mapPin: ImageVector? = null
