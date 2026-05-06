package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Copyleft: ImageVector
    get() {
        if (_copyleft != null) return _copyleft!!
        _copyleft = phosphorThinIcon(
            name = "Copyleft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM128 220C77.19 220 36 178.81 36 128 36 77.19 77.19 36 128 36c50.81 0 92 41.19 92 92-.055 50.787-41.213 91.945-92 92ZM172 128c.004 18.941-12.113 35.759-30.081 41.75-17.968 5.992-37.754-.188-49.119-15.34-1.328-1.767-.972-4.277 .795-5.605 1.767-1.328 4.277-.972 5.605 .795 9.297 12.396 25.484 17.453 40.184 12.553C154.085 157.252 164 143.495 164 128c0-15.495-9.915-29.252-24.616-34.153-14.7-4.9-30.887 .156-40.184 12.553-1.328 1.767-3.838 2.123-5.605 .795-1.767-1.328-2.123-3.838-.795-5.605C104.164 86.437 123.951 80.258 141.919 86.25 159.887 92.241 172.004 109.059 172 128Z"),
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
        return _copyleft!!
    }

private var _copyleft: ImageVector? = null
