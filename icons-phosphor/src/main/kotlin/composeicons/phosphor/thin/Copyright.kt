package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Copyright: ImageVector
    get() {
        if (_copyright != null) return _copyright!!
        _copyright = phosphorThinIcon(
            name = "Copyright",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM128 220C77.19 220 36 178.81 36 128 36 77.19 77.19 36 128 36c50.81 0 92 41.19 92 92-.055 50.787-41.213 91.945-92 92ZM163.2 154.41c-11.366 15.146-31.148 21.321-49.112 15.33C96.124 163.749 84.007 146.937 84.007 128c0-18.937 12.116-35.749 30.08-41.74 17.964-5.991 37.746 .184 49.112 15.33 1.328 1.767 .972 4.277-.795 5.605-1.767 1.328-4.277 .972-5.605-.795C147.503 94.004 131.316 88.947 116.616 93.847 101.915 98.748 92 112.505 92 128c0 15.495 9.915 29.252 24.616 34.153 14.7 4.9 30.887-.156 40.184-12.553 1.328-1.767 3.838-2.123 5.605-.795 1.767 1.328 2.123 3.838 .795 5.605Z"),
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
        return _copyright!!
    }

private var _copyright: ImageVector? = null
