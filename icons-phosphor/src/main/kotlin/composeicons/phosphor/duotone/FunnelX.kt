package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FunnelX: ImageVector
    get() {
        if (_funnelX != null) return _funnelX!!
        _funnelX = phosphorDuotoneIcon(
            name = "FunnelX",
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
                pathData = parseSvgPathData("M227.82 66.76c4.256-4.684 5.351-11.436 2.794-17.225C228.057 43.746 222.328 40.009 216 40h-176c-6.327 .012-12.052 3.752-14.606 9.54-2.554 5.788-1.458 12.538 2.796 17.22l.08 .09L96 139.17v76.83c-.001 5.9 3.245 11.322 8.446 14.108 5.201 2.786 11.514 2.483 16.424-.788l32-21.34c4.455-2.968 7.131-7.967 7.13-13.32v-55.49L227.73 66.85ZM40 56h0ZM146.19 130.59c-1.385 1.463-2.167 3.395-2.19 5.41v58.66L112 216v-80c-.002-2.028-.774-3.98-2.16-5.46L40 56h176ZM245.68 210.4c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0L216 203.32l-18.34 18.35c-3.126 3.123-8.192 3.121-11.315-.005-3.123-3.126-3.121-8.192 .005-11.315L204.69 192 186.35 173.65c-2.988-3.145-2.925-8.099 .143-11.167 3.068-3.068 8.022-3.131 11.167-.143L216 180.69l18.34-18.34c3.123-3.126 8.189-3.128 11.315-.005 3.126 3.123 3.128 8.189 .005 11.315L227.31 192Z"),
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
        return _funnelX!!
    }

private var _funnelX: ImageVector? = null
