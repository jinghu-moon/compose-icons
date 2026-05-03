package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Record: ImageVector
    get() {
        if (_record != null) return _record!!
        _record = phosphorThinIcon(
            name = "Record",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.810 36.000 220.000 77.190 220.000 128.000 C 219.945 178.787 178.787 219.945 128.000 220.000 ZM 128.000 60.000 C 90.445 60.000 60.000 90.445 60.000 128.000 C 60.000 165.555 90.445 196.000 128.000 196.000 C 165.555 196.000 196.000 165.555 196.000 128.000 C 195.961 90.461 165.539 60.039 128.000 60.000 ZM 128.000 188.000 C 94.863 188.000 68.000 161.137 68.000 128.000 C 68.000 94.863 94.863 68.000 128.000 68.000 C 161.137 68.000 188.000 94.863 188.000 128.000 C 187.961 161.121 161.121 187.961 128.000 188.000 Z"),
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
        return _record!!
    }

private var _record: ImageVector? = null
