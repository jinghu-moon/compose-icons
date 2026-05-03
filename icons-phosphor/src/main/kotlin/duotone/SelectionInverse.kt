package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SelectionInverse: ImageVector
    get() {
        if (_selectionInverse != null) return _selectionInverse!!
        _selectionInverse = phosphorDuotoneIcon(
            name = "SelectionInverse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 216.000 48.000 L 216.000 208.000 C 216.002 210.122 215.160 212.158 213.660 213.660 L 42.340 42.340 C 43.842 40.840 45.878 39.998 48.000 40.000 L 208.000 40.000 C 212.418 40.000 216.000 43.582 216.000 48.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 152.000 216.000 C 152.000 220.418 148.418 224.000 144.000 224.000 L 112.000 224.000 C 107.582 224.000 104.000 220.418 104.000 216.000 C 104.000 211.582 107.582 208.000 112.000 208.000 L 144.000 208.000 C 148.418 208.000 152.000 211.582 152.000 216.000 ZM 40.000 152.000 C 44.418 152.000 48.000 148.418 48.000 144.000 L 48.000 112.000 C 48.000 107.582 44.418 104.000 40.000 104.000 C 35.582 104.000 32.000 107.582 32.000 112.000 L 32.000 144.000 C 32.000 148.418 35.582 152.000 40.000 152.000 ZM 72.000 208.000 L 48.000 208.000 L 48.000 184.000 C 48.000 179.582 44.418 176.000 40.000 176.000 C 35.582 176.000 32.000 179.582 32.000 184.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 72.000 224.000 C 76.418 224.000 80.000 220.418 80.000 216.000 C 80.000 211.582 76.418 208.000 72.000 208.000 ZM 224.000 48.000 L 224.000 208.000 C 224.000 216.837 216.837 224.000 208.000 224.000 L 184.000 224.000 C 179.582 224.000 176.000 220.418 176.000 216.000 C 176.000 211.582 179.582 208.000 184.000 208.000 L 196.690 208.000 L 48.000 59.310 L 48.000 72.000 C 48.000 76.418 44.418 80.000 40.000 80.000 C 35.582 80.000 32.000 76.418 32.000 72.000 L 32.000 48.000 C 32.000 39.163 39.163 32.000 48.000 32.000 L 208.000 32.000 C 216.837 32.000 224.000 39.163 224.000 48.000 ZM 208.000 48.000 L 59.310 48.000 L 208.000 196.690 Z"),
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
        return _selectionInverse!!
    }

private var _selectionInverse: ImageVector? = null
