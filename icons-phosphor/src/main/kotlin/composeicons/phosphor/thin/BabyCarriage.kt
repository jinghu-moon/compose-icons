package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BabyCarriage: ImageVector
    get() {
        if (_babyCarriage != null) return _babyCarriage!!
        _babyCarriage = phosphorThinIcon(
            name = "BabyCarriage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 36h-8c-6.627 0-12 5.373-12 12v60h-88.23C49.733 89.782 34.332 76.004 16 76c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4 15.464 0 28 12.536 28 28 .044 41.955 34.045 75.956 76 76h40c41.974 0 76-34.026 76-76C236 70.026 201.974 36 160 36ZM227.87 108h-72.47L209.11 65c11.174 11.642 17.826 26.89 18.76 43ZM152 44h8c15.768-.014 31.046 5.475 43.2 15.52L148 103.68v-55.68c0-2.209 1.791-4 4-4ZM160 180h-40C84.015 179.959 54.277 151.92 52.12 116h175.76c-2.157 35.92-31.895 63.959-67.88 64ZM100 224c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM204 224c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
        return _babyCarriage!!
    }

private var _babyCarriage: ImageVector? = null
