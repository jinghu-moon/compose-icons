package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PauseCircle: ImageVector
    get() {
        if (_pauseCircle != null) return _pauseCircle!!
        _pauseCircle = phosphorThinIcon(
            name = "PauseCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.810 36.000 220.000 77.190 220.000 128.000 C 219.945 178.787 178.787 219.945 128.000 220.000 ZM 108.000 96.000 L 108.000 160.000 C 108.000 162.209 106.209 164.000 104.000 164.000 C 101.791 164.000 100.000 162.209 100.000 160.000 L 100.000 96.000 C 100.000 93.791 101.791 92.000 104.000 92.000 C 106.209 92.000 108.000 93.791 108.000 96.000 ZM 156.000 96.000 L 156.000 160.000 C 156.000 162.209 154.209 164.000 152.000 164.000 C 149.791 164.000 148.000 162.209 148.000 160.000 L 148.000 96.000 C 148.000 93.791 149.791 92.000 152.000 92.000 C 154.209 92.000 156.000 93.791 156.000 96.000 Z"),
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
        return _pauseCircle!!
    }

private var _pauseCircle: ImageVector? = null
