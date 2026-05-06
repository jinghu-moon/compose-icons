package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PenNib: ImageVector
    get() {
        if (_penNib != null) return _penNib!!
        _penNib = phosphorThinIcon(
            name = "PenNib",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 92.68c.008-3.182-1.256-6.234-3.51-8.48L171.8 15.51c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529L125.78 44.56 66.92 66.63c-4.007 1.513-6.912 5.037-7.63 9.26L36.05 215.34c-.194 1.161 .133 2.349 .894 3.246 .761 .898 1.879 1.415 3.056 1.414 .221-.002 .441-.018 .66-.05L180.1 196.7c4.229-.702 7.763-3.606 9.27-7.62l22.07-58.86 29-29c2.288-2.251 3.572-5.33 3.56-8.54ZM181.88 186.27c-.502 1.338-1.68 2.306-3.09 2.54L51.66 210l58.45-58.45c10.17 7.227 24.181 5.457 32.234-4.072 8.053-9.529 7.462-23.64-1.36-32.462-8.822-8.822-22.932-9.413-32.462-1.36-9.529 8.053-11.299 22.064-4.072 32.234L46 204.35 67.19 77.21c.234-1.41 1.202-2.588 2.54-3.09L127 52.64 203.35 129ZM108 132c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16ZM234.83 95.51 208 122.34 133.66 48 160.48 21.18c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173l68.69 68.69c1.558 1.561 1.558 4.089 0 5.65Z"),
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
        return _penNib!!
    }

private var _penNib: ImageVector? = null
