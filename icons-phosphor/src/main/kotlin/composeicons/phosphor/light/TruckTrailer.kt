package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TruckTrailer: ImageVector
    get() {
        if (_truckTrailer != null) return _truckTrailer!!
        _truckTrailer = phosphorLightIcon(
            name = "TruckTrailer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222 98.47v-2.47C221.967 66.19 197.81 42.033 168 42h-8c-7.732 0-14 6.268-14 14v122h-20v-106c0-3.314-2.686-6-6-6h-104C8.268 66 2 72.268 2 80v104c0 12.913 8.263 24.377 20.513 28.46C34.763 216.544 48.252 212.33 56 202c7.085 9.452 19.057 13.866 30.582 11.276C98.108 210.687 107.04 201.574 109.4 190h85.2c3.067 15.104 17.08 25.427 32.415 23.878C242.35 212.329 254.015 199.413 254 184v-48c-.026-18.662-13.576-34.554-32-37.53ZM158 56c0-1.105 .895-2 2-2h8c23.196 0 42 18.804 42 42v8c0 3.314 2.686 6 6 6 14.359 0 26 11.641 26 26v24c-8.226-6.173-19.041-7.701-28.656-4.05-9.615 3.651-16.689 11.973-18.744 22.05h-36.6ZM16 78h98v100h-4.6C107.04 166.426 98.108 157.313 86.582 154.724 75.057 152.134 63.085 156.548 56 166 46.059 152.745 27.255 150.059 14 160v-80c0-1.105 .895-2 2-2ZM32 202c-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18ZM80 202c-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18ZM224 202c-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18Z"),
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
        return _truckTrailer!!
    }

private var _truckTrailer: ImageVector? = null
