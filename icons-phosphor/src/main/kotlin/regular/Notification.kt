package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Notification: ImageVector
    get() {
        if (_notification != null) return _notification!!
        _notification = phosphorRegularIcon(
            name = "Notification",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 128.000 L 216.000 208.000 C 216.000 216.837 208.837 224.000 200.000 224.000 L 48.000 224.000 C 39.163 224.000 32.000 216.837 32.000 208.000 L 32.000 56.000 C 32.000 47.163 39.163 40.000 48.000 40.000 L 128.000 40.000 C 132.418 40.000 136.000 43.582 136.000 48.000 C 136.000 52.418 132.418 56.000 128.000 56.000 L 48.000 56.000 L 48.000 208.000 L 200.000 208.000 L 200.000 128.000 C 200.000 123.582 203.582 120.000 208.000 120.000 C 212.418 120.000 216.000 123.582 216.000 128.000 ZM 232.000 60.000 C 232.000 79.882 215.882 96.000 196.000 96.000 C 176.118 96.000 160.000 79.882 160.000 60.000 C 160.000 40.118 176.118 24.000 196.000 24.000 C 215.882 24.000 232.000 40.118 232.000 60.000 ZM 216.000 60.000 C 216.000 48.954 207.046 40.000 196.000 40.000 C 184.954 40.000 176.000 48.954 176.000 60.000 C 176.000 71.046 184.954 80.000 196.000 80.000 C 207.046 80.000 216.000 71.046 216.000 60.000 Z"),
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
