package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Balloon: ImageVector
    get() {
        if (_balloon != null) return _balloon!!
        _balloon = phosphorThinIcon(
            name = "Balloon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C81.629 20.05 44.05 57.629 44 104c0 22.57 9.08 47.63 24.28 67 12.68 16.17 28 26.81 44.22 31l-12.18 28.4c-.541 1.239-.419 2.667 .323 3.797 .742 1.13 2.005 1.808 3.357 1.803h48c1.346 .002 2.603-.674 3.344-1.798 .741-1.124 .867-2.545 .336-3.782L143.5 202c16.23-4.17 31.54-14.81 44.22-31C202.92 151.59 212 126.53 212 104 211.95 57.629 174.371 20.05 128 20ZM145.93 228h-35.86l10.48-24.46c4.948 .613 9.952 .613 14.9 0ZM128 196C85.9 196 52 145.67 52 104 52 62.026 86.026 28 128 28c41.974 0 76 34.026 76 76 0 41.67-33.9 92-76 92ZM180 95.34c.176 1.048-.071 2.123-.689 2.988-.617 .865-1.553 1.449-2.601 1.622-.22 .015-.44 .015-.66 0-1.956 .002-3.627-1.411-3.95-3.34C168.737 77.905 154.059 63.286 135.34 60c-2.182-.365-3.655-2.428-3.29-4.61 .365-2.182 2.428-3.655 4.61-3.29 22.086 3.896 39.393 21.163 43.34 43.24Z"),
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
        return _balloon!!
    }

private var _balloon: ImageVector? = null
