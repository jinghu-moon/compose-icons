package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TruckTrailer: ImageVector
    get() {
        if (_truckTrailer != null) return _truckTrailer!!
        _truckTrailer = phosphorDuotoneIcon(
            name = "TruckTrailer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 72h104v112h-16C104 170.745 93.255 160 80 160c-13.255 0-24 10.745-24 24C56 170.745 45.255 160 32 160 18.745 160 8 170.745 8 184v-104c0-4.418 3.582-8 8-8ZM216 104v-8C216 69.49 194.51 48 168 48h-8c-4.418 0-8 3.582-8 8v128h48c0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24v-48c0-17.673-14.327-32-32-32Z"),
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
                pathData = parseSvgPathData("M224 96.8v-.8C223.967 65.086 198.914 40.033 168 40h-8c-8.837 0-16 7.163-16 16v120h-16v-104c0-4.418-3.582-8-8-8h-104C7.163 64 0 71.163 0 80v104c.015 13.302 8.258 25.208 20.703 29.904 12.446 4.696 26.498 1.203 35.297-8.774 7.828 8.892 19.927 12.732 31.45 9.982C98.973 212.361 108.033 203.469 111 192h82c4.003 15.634 19.021 25.841 35.031 23.808C244.041 213.775 256.032 200.139 256 184v-48c-.023-19.001-13.388-35.373-32-39.2ZM160 56h8c22.091 0 40 17.909 40 40v8c0 4.418 3.582 8 8 8 13.255 0 24 10.745 24 24v20.31c-4.857-2.829-10.379-4.317-16-4.31-14.591 .014-27.332 9.878-31 24h-33ZM112 80v96h-1C108.033 164.531 98.973 155.639 87.45 152.888 75.927 150.138 63.828 153.978 56 162.87 45.948 151.405 29.188 148.656 16 156.31v-76.31ZM32 200c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM80 200c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM224 200c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16Z"),
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
