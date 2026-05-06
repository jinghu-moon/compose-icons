package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChefHat: ImageVector
    get() {
        if (_chefHat != null) return _chefHat!!
        _chefHat = phosphorBoldIcon(
            name = "ChefHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 112C243.961 78.879 217.121 52.039 184 52c-1 0-1.95 0-2.92 .08C170.699 32.383 150.265 20.053 128 20.053c-22.265 0-42.699 12.329-53.08 32.027C74 52 73 52 72 52 44.468 52.057 20.508 70.845 13.886 97.569 7.264 124.293 19.68 152.094 44 165v43c0 11.046 8.954 20 20 20h128c11.046 0 20-8.954 20-20v-43c19.662-10.374 31.976-30.769 32-53ZM188 204h-120v-32.15c1.32 .09 2.65 .15 4 .15h112c1.35 0 2.68-.06 4-.15ZM184 148h-8.63l4.27-17.09c1.479-6.378-2.428-12.764-8.779-14.352-6.352-1.588-12.804 2.209-14.501 8.532L150.63 148h-10.63v-20c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v20h-10.63L99.64 125.09c-.979-4.224-4.162-7.591-8.324-8.808-4.162-1.216-8.657-.093-11.757 2.939-3.1 3.032-4.323 7.5-3.2 11.689L80.63 148h-8.63C52.876 147.993 37.094 133.034 36.065 113.938 35.035 94.841 49.117 78.273 68.13 76.21 68.05 77.47 68 78.73 68 80c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12C92 60.118 108.118 44 128 44c19.882 0 36 16.118 36 36 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-1.27-.05-2.53-.13-3.79 19.013 2.063 33.095 18.631 32.065 37.728C218.906 133.034 203.124 147.993 184 148Z"),
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
        return _chefHat!!
    }

private var _chefHat: ImageVector? = null
