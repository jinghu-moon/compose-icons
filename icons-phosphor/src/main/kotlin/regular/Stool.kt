package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Stool: ImageVector
    get() {
        if (_stool != null) return _stool!!
        _stool = phosphorRegularIcon(
            name = "Stool",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 64.000 L 200.000 40.000 C 200.000 31.163 192.837 24.000 184.000 24.000 L 72.000 24.000 C 63.163 24.000 56.000 31.163 56.000 40.000 L 56.000 64.000 C 56.000 72.837 63.163 80.000 72.000 80.000 L 78.640 80.000 L 56.100 222.750 C 55.411 227.113 58.387 231.209 62.750 231.900 C 63.163 231.967 63.581 232.000 64.000 232.000 C 67.931 231.994 71.276 229.133 71.890 225.250 L 79.680 176.000 L 176.320 176.000 L 184.100 225.250 C 184.715 229.137 188.065 231.999 192.000 232.000 C 192.422 232.001 192.843 231.967 193.260 231.900 C 197.623 231.209 200.599 227.113 199.910 222.750 L 177.360 80.000 L 184.000 80.000 C 192.837 80.000 200.000 72.837 200.000 64.000 ZM 72.000 40.000 L 184.000 40.000 L 184.000 64.000 L 72.000 64.000 ZM 173.790 160.000 L 82.210 160.000 L 94.840 80.000 L 161.160 80.000 Z"),
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
        return _stool!!
    }

private var _stool: ImageVector? = null
