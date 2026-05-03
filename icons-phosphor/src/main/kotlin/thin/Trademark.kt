package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Trademark: ImageVector
    get() {
        if (_trademark != null) return _trademark!!
        _trademark = phosphorThinIcon(
            name = "Trademark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.810 36.000 220.000 77.190 220.000 128.000 C 219.945 178.787 178.787 219.945 128.000 220.000 ZM 108.000 104.000 C 108.000 106.209 106.209 108.000 104.000 108.000 L 92.000 108.000 L 92.000 152.000 C 92.000 154.209 90.209 156.000 88.000 156.000 C 85.791 156.000 84.000 154.209 84.000 152.000 L 84.000 108.000 L 72.000 108.000 C 69.791 108.000 68.000 106.209 68.000 104.000 C 68.000 101.791 69.791 100.000 72.000 100.000 L 104.000 100.000 C 106.209 100.000 108.000 101.791 108.000 104.000 ZM 188.000 104.000 L 188.000 152.000 C 188.000 154.209 186.209 156.000 184.000 156.000 C 181.791 156.000 180.000 154.209 180.000 152.000 L 180.000 114.650 L 159.000 138.650 C 158.241 139.511 157.148 140.004 156.000 140.004 C 154.852 140.004 153.759 139.511 153.000 138.650 L 132.000 114.650 L 132.000 152.000 C 132.000 154.209 130.209 156.000 128.000 156.000 C 125.791 156.000 124.000 154.209 124.000 152.000 L 124.000 104.000 C 124.007 102.339 125.039 100.855 126.593 100.271 C 128.148 99.687 129.902 100.124 131.000 101.370 L 156.000 129.930 L 181.000 101.370 C 182.098 100.124 183.852 99.687 185.407 100.271 C 186.961 100.855 187.993 102.339 188.000 104.000 Z"),
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
        return _trademark!!
    }

private var _trademark: ImageVector? = null
