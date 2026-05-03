package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Presentation: ImageVector
    get() {
        if (_presentation != null) return _presentation!!
        _presentation = phosphorBoldIcon(
            name = "Presentation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 36.000 L 140.000 36.000 L 140.000 24.000 C 140.000 17.373 134.627 12.000 128.000 12.000 C 121.373 12.000 116.000 17.373 116.000 24.000 L 116.000 36.000 L 40.000 36.000 C 28.954 36.000 20.000 44.954 20.000 56.000 L 20.000 176.000 C 20.000 187.046 28.954 196.000 40.000 196.000 L 71.000 196.000 L 54.600 216.500 C 50.458 221.675 51.295 229.228 56.470 233.370 C 61.645 237.512 69.198 236.675 73.340 231.500 L 101.740 196.000 L 154.200 196.000 L 182.600 231.500 C 186.742 236.675 194.295 237.512 199.470 233.370 C 204.645 229.228 205.482 221.675 201.340 216.500 L 185.000 196.000 L 216.000 196.000 C 227.046 196.000 236.000 187.046 236.000 176.000 L 236.000 56.000 C 236.000 44.954 227.046 36.000 216.000 36.000 ZM 212.000 172.000 L 44.000 172.000 L 44.000 60.000 L 212.000 60.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _presentation!!
    }

private var _presentation: ImageVector? = null
