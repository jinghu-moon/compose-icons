package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Funnel: ImageVector
    get() {
        if (_funnel != null) return _funnel!!
        _funnel = phosphorDuotoneIcon(
            name = "Funnel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M221.9 61.38 152 136v58.65c.002 2.676-1.334 5.175-3.56 6.66l-32 21.33c-2.452 1.636-5.606 1.791-8.207 .403C105.632 221.655 104.005 218.948 104 216v-80L34.1 61.38C31.973 59.039 31.425 55.666 32.701 52.772 33.977 49.879 36.838 48.008 40 48h176c3.162 .008 6.023 1.879 7.299 4.772 1.276 2.894 .728 6.267-1.399 8.608Z"),
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
                pathData = parseSvgPathData("M230.6 49.53C228.083 43.714 222.337 39.964 216 40h-176c-6.327 .012-12.052 3.752-14.606 9.54-2.554 5.788-1.458 12.538 2.796 17.22l.08 .09L96 139.17v76.83c-.001 5.9 3.245 11.322 8.446 14.108 5.201 2.786 11.514 2.483 16.424-.788l32-21.34c4.455-2.968 7.131-7.967 7.13-13.32v-55.49L227.74 66.85l.08-.09c4.302-4.664 5.397-11.449 2.78-17.23ZM40 56h0ZM146.18 130.58c-1.384 1.467-2.163 3.403-2.18 5.42v58.66L112 216v-80c.001-2.031-.772-3.987-2.16-5.47L40 56h176Z"),
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
        return _funnel!!
    }

private var _funnel: ImageVector? = null
