package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ReplitLogo: ImageVector
    get() {
        if (_replitLogo != null) return _replitLogo!!
        _replitLogo = phosphorLightIcon(
            name = "ReplitLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 90.000 L 150.000 90.000 L 150.000 40.000 C 150.000 32.268 143.732 26.000 136.000 26.000 L 72.000 26.000 C 64.268 26.000 58.000 32.268 58.000 40.000 L 58.000 88.000 C 58.000 95.732 64.268 102.000 72.000 102.000 L 138.000 102.000 L 138.000 154.000 L 72.000 154.000 C 64.268 154.000 58.000 160.268 58.000 168.000 L 58.000 216.000 C 58.000 223.732 64.268 230.000 72.000 230.000 L 136.000 230.000 C 143.732 230.000 150.000 223.732 150.000 216.000 L 150.000 166.000 L 216.000 166.000 C 223.732 166.000 230.000 159.732 230.000 152.000 L 230.000 104.000 C 230.000 96.268 223.732 90.000 216.000 90.000 ZM 138.000 216.000 C 138.000 217.105 137.105 218.000 136.000 218.000 L 72.000 218.000 C 70.895 218.000 70.000 217.105 70.000 216.000 L 70.000 168.000 C 70.000 166.895 70.895 166.000 72.000 166.000 L 138.000 166.000 ZM 138.000 90.000 L 72.000 90.000 C 70.895 90.000 70.000 89.105 70.000 88.000 L 70.000 40.000 C 70.000 38.895 70.895 38.000 72.000 38.000 L 136.000 38.000 C 137.105 38.000 138.000 38.895 138.000 40.000 ZM 218.000 152.000 C 218.000 153.105 217.105 154.000 216.000 154.000 L 150.000 154.000 L 150.000 102.000 L 216.000 102.000 C 217.105 102.000 218.000 102.895 218.000 104.000 Z"),
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
        return _replitLogo!!
    }

private var _replitLogo: ImageVector? = null
