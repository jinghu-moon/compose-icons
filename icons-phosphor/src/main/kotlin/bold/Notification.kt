package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Notification: ImageVector
    get() {
        if (_notification != null) return _notification!!
        _notification = phosphorBoldIcon(
            name = "Notification",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.000 132.000 L 220.000 208.000 C 220.000 219.046 211.046 228.000 200.000 228.000 L 48.000 228.000 C 36.954 228.000 28.000 219.046 28.000 208.000 L 28.000 56.000 C 28.000 44.954 36.954 36.000 48.000 36.000 L 124.000 36.000 C 130.627 36.000 136.000 41.373 136.000 48.000 C 136.000 54.627 130.627 60.000 124.000 60.000 L 52.000 60.000 L 52.000 204.000 L 196.000 204.000 L 196.000 132.000 C 196.000 125.373 201.373 120.000 208.000 120.000 C 214.627 120.000 220.000 125.373 220.000 132.000 ZM 236.000 60.000 C 236.000 82.091 218.091 100.000 196.000 100.000 C 173.909 100.000 156.000 82.091 156.000 60.000 C 156.000 37.909 173.909 20.000 196.000 20.000 C 218.091 20.000 236.000 37.909 236.000 60.000 ZM 212.000 60.000 C 212.000 51.163 204.837 44.000 196.000 44.000 C 187.163 44.000 180.000 51.163 180.000 60.000 C 180.000 68.837 187.163 76.000 196.000 76.000 C 204.837 76.000 212.000 68.837 212.000 60.000 Z"),
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
        return _notification!!
    }

private var _notification: ImageVector? = null
