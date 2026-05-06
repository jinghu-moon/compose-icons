package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MapPinArea: ImageVector
    get() {
        if (_mapPinArea != null) return _mapPinArea!!
        _mapPinArea = phosphorDuotoneIcon(
            name = "MapPinArea",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 80c0 56-56 88-56 88 0 0-56-32-56-88C72 49.072 97.072 24 128 24c30.928 0 56 25.072 56 56Z"),
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
                pathData = parseSvgPathData("M112 80c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16ZM64 80C64 44.654 92.654 16 128 16c35.346 0 64 28.654 64 64 0 59.95-57.58 93.54-60 94.95-2.46 1.406-5.48 1.406-7.94 0C121.58 173.54 64 140 64 80ZM80 80c0 42.2 35.84 70.21 48 78.5C140.15 150.22 176 122.2 176 80 176 53.49 154.51 32 128 32 101.49 32 80 53.49 80 80ZM202.77 147.63c-4.093-1.352-8.521 .781-10.014 4.825-1.493 4.043 .485 8.543 4.474 10.175C213.74 168.74 224 176.92 224 184c0 13.36-36.52 32-96 32C68.52 216 32 197.36 32 184c0-7.08 10.26-15.26 26.77-21.36 3.989-1.633 5.967-6.132 4.474-10.175-1.493-4.043-5.921-6.177-10.014-4.825C29.22 156.49 16 169.41 16 184c0 31.18 57.71 48 112 48 54.29 0 112-16.82 112-48 0-14.59-13.22-27.51-37.23-36.37Z"),
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
