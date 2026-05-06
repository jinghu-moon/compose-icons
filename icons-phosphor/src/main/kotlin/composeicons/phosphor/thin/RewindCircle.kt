package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.RewindCircle: ImageVector
    get() {
        if (_rewindCircle != null) return _rewindCircle!!
        _rewindCircle = phosphorThinIcon(
            name = "RewindCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM128 220C77.19 220 36 178.81 36 128 36 77.19 77.19 36 128 36c50.81 0 92 41.19 92 92-.055 50.787-41.213 91.945-92 92ZM117.79 88.42c-1.356-.677-2.978-.53-4.19 .38l-48 36C64.593 125.555 64 126.741 64 128c0 1.259 .593 2.445 1.6 3.2l48 36c.692 .519 1.535 .8 2.4 .8 .621-.001 1.233-.145 1.79-.42 1.355-.678 2.211-2.064 2.21-3.58v-72c.001-1.516-.855-2.902-2.21-3.58ZM112 156 74.67 128 112 100ZM173.79 88.42c-1.356-.677-2.978-.53-4.19 .38l-48 36c-1.007 .755-1.6 1.941-1.6 3.2 0 1.259 .593 2.445 1.6 3.2l48 36c.692 .519 1.535 .8 2.4 .8 .621-.001 1.233-.145 1.79-.42 1.355-.678 2.211-2.064 2.21-3.58v-72c.001-1.516-.855-2.902-2.21-3.58ZM168 156 130.67 128 168 100Z"),
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
        return _rewindCircle!!
    }

private var _rewindCircle: ImageVector? = null
