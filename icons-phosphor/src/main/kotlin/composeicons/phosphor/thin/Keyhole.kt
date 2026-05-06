package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Keyhole: ImageVector
    get() {
        if (_keyhole != null) return _keyhole!!
        _keyhole = phosphorThinIcon(
            name = "Keyhole",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM128 220C77.19 220 36 178.81 36 128 36 77.19 77.19 36 128 36c50.81 0 92 41.19 92 92-.055 50.787-41.213 91.945-92 92ZM164 112C164.01 94.975 152.092 80.271 135.434 76.755 118.776 73.24 101.932 81.874 95.062 97.451c-6.871 15.577-1.89 33.837 11.938 43.769L92.34 174.39c-.544 1.237-.427 2.664 .312 3.796 .738 1.131 1.997 1.814 3.348 1.814h64c1.351-.001 2.61-.683 3.348-1.814 .738-1.131 .855-2.559 .312-3.796L149 141.22c9.392-6.775 14.969-17.64 15-29.22ZM140.34 141.33 153.86 172h-51.72l13.52-30.67c.819-1.866 .104-4.05-1.66-5.07C103.025 129.924 97.674 117.005 100.954 104.764 104.234 92.523 115.327 84.011 128 84.011c12.673 0 23.766 8.512 27.046 20.753 3.28 12.241-2.071 25.159-13.046 31.496-1.764 1.02-2.479 3.204-1.66 5.07Z"),
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
        return _keyhole!!
    }

private var _keyhole: ImageVector? = null
