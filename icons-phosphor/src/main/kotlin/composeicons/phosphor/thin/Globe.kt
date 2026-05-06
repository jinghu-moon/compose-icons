package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Globe: ImageVector
    get() {
        if (_globe != null) return _globe!!
        _globe = phosphorThinIcon(
            name = "Globe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28h0C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM128 218.61C121.67 212.52 105 194.2 96.73 164h62.54C151 194.2 134.33 212.52 128 218.61ZM94.82 156c-3.76-18.477-3.76-37.523 0-56h66.36c3.76 18.477 3.76 37.523 0 56ZM128 37.39c6.33 6.09 23 24.41 31.27 54.61h-62.54C105 61.8 121.67 43.48 128 37.39ZM169.41 100h46.23c5.813 18.214 5.813 37.786 0 56h-46.23c3.453-18.507 3.453-37.493 0-56ZM212.66 92h-45C162.613 71.422 152.589 52.398 138.47 36.6c32.878 3.82 61.189 24.961 74.19 55.4ZM117.54 36.6C103.421 52.398 93.397 71.422 88.35 92h-45C56.351 61.561 84.662 40.42 117.54 36.6ZM40.36 100h46.23c-3.453 18.507-3.453 37.493 0 56h-46.23c-5.813-18.214-5.813-37.786 0-56ZM43.36 164h45c5.047 20.578 15.071 39.602 29.19 55.4C84.665 215.587 56.344 194.445 43.34 164ZM138.48 219.4C152.592 203.6 162.609 184.576 167.65 164h45c-13.001 30.439-41.312 51.58-74.19 55.4Z"),
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
        return _globe!!
    }

private var _globe: ImageVector? = null
