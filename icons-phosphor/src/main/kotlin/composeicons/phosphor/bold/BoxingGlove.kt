package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BoxingGlove: ImageVector
    get() {
        if (_boxingGlove != null) return _boxingGlove!!
        _boxingGlove = phosphorBoldIcon(
            name = "BoxingGlove",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 12h-48C88.43 12.037 62.274 36.503 60.13 68h-4.13C36.118 68 20 84.118 20 104v29.19c.008 4.541 1.552 8.947 4.38 12.5 .293 .352 .607 .686 .94 1L60 181v35c0 11.046 8.954 20 20 20h112c11.046 0 20-8.954 20-20v-38.32l15.23-53.3c.51-1.789 .769-3.64 .77-5.5v-46.88C227.961 38.879 201.121 12.039 168 12ZM204 118.32l-15.54 54.38c-.303 1.074-.457 2.184-.46 3.3v36h-104v-36c-0-3.205-1.282-6.276-3.56-8.53L44 131.45v-27.45C44 97.373 49.373 92 56 92h4v12c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-32C84 52.118 100.118 36 120 36h48c19.882 0 36 16.118 36 36ZM166.66 162l-9 6 9 6c5.523 3.678 7.018 11.137 3.34 16.66-3.678 5.523-11.137 7.018-16.66 3.34L136 182.42 118.66 194c-5.523 3.678-12.982 2.183-16.66-3.34C98.322 185.137 99.817 177.678 105.34 174l9-6-9-6C99.817 158.322 98.322 150.863 102 145.34c3.678-5.523 11.137-7.018 16.66-3.34L136 153.58 153.34 142c5.523-3.678 12.982-2.183 16.66 3.34 3.678 5.523 2.183 12.982-3.34 16.66Z"),
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
        return _boxingGlove!!
    }

private var _boxingGlove: ImageVector? = null
