package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FaceMask: ImageVector
    get() {
        if (_faceMask != null) return _faceMask!!
        _faceMask = phosphorLightIcon(
            name = "FaceMask",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M174 104c0 3.314-2.686 6-6 6h-80c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h80c3.314 0 6 2.686 6 6ZM168 130h-80c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h80c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM254 104v24c0 16.569-13.431 30-30 30h-6.5c-6.81 15.88-21.28 29.6-42.82 40.37-14.479 7.101-29.806 12.32-45.61 15.53-.707 .133-1.433 .133-2.14 0C111.126 210.69 95.799 205.471 81.32 198.37 59.78 187.6 45.31 173.88 38.5 158h-6.5C15.431 158 2 144.569 2 128v-24C2 87.431 15.431 74 32 74h2.35c1.05-4.647 4.392-8.441 8.87-10.07l80-29.09c3.088-1.122 6.472-1.122 9.56 0l80 29.09c4.478 1.629 7.82 5.423 8.87 10.07h2.35c16.569 0 30 13.431 30 30ZM34.89 146c-.59-3.301-.888-6.647-.89-10v-50h-2c-9.941 0-18 8.059-18 18v24c0 9.941 8.059 18 18 18ZM210 136v-58.91c-0-.842-.528-1.594-1.32-1.88l-80-29.09c-.439-.159-.921-.159-1.36 0l-80 29.09c-.792 .286-1.32 1.038-1.32 1.88v58.91c0 20.7 13.61 38 40.46 51.52 13.211 6.458 27.161 11.281 41.54 14.36 14.379-3.081 28.328-7.904 41.54-14.36C196.39 174 210 156.7 210 136ZM242 104c0-9.941-8.059-18-18-18h-2v50c-.002 3.353-.3 6.699-.89 10h2.89c9.941 0 18-8.059 18-18Z"),
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
        return _faceMask!!
    }

private var _faceMask: ImageVector? = null
