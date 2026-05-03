package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SuitcaseSimple: ImageVector
    get() {
        if (_suitcaseSimple != null) return _suitcaseSimple!!
        _suitcaseSimple = phosphorBoldIcon(
            name = "SuitcaseSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 48.000 L 180.000 48.000 L 180.000 40.000 C 180.000 24.536 167.464 12.000 152.000 12.000 L 104.000 12.000 C 88.536 12.000 76.000 24.536 76.000 40.000 L 76.000 48.000 L 40.000 48.000 C 28.954 48.000 20.000 56.954 20.000 68.000 L 20.000 196.000 C 20.000 207.046 28.954 216.000 40.000 216.000 L 216.000 216.000 C 227.046 216.000 236.000 207.046 236.000 196.000 L 236.000 68.000 C 236.000 56.954 227.046 48.000 216.000 48.000 ZM 100.000 40.000 C 100.000 37.791 101.791 36.000 104.000 36.000 L 152.000 36.000 C 154.209 36.000 156.000 37.791 156.000 40.000 L 156.000 48.000 L 100.000 48.000 ZM 212.000 72.000 L 212.000 136.000 L 44.000 136.000 L 44.000 72.000 ZM 44.000 192.000 L 44.000 160.000 L 212.000 160.000 L 212.000 192.000 Z"),
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
        return _suitcaseSimple!!
    }

private var _suitcaseSimple: ImageVector? = null
