package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsInSimple: ImageVector
    get() {
        if (_arrowsInSimple != null) return _arrowsInSimple!!
        _arrowsInSimple = phosphorBoldIcon(
            name = "ArrowsInSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.490 56.480 L 177.000 96.000 L 196.000 96.000 C 202.627 96.000 208.000 101.373 208.000 108.000 C 208.000 114.627 202.627 120.000 196.000 120.000 L 148.000 120.000 C 141.373 120.000 136.000 114.627 136.000 108.000 L 136.000 60.000 C 136.000 53.373 141.373 48.000 148.000 48.000 C 154.627 48.000 160.000 53.373 160.000 60.000 L 160.000 79.000 L 199.510 39.480 C 204.204 34.786 211.816 34.786 216.510 39.480 C 221.204 44.174 221.204 51.786 216.510 56.480 ZM 108.000 136.000 L 60.000 136.000 C 53.373 136.000 48.000 141.373 48.000 148.000 C 48.000 154.627 53.373 160.000 60.000 160.000 L 79.000 160.000 L 39.510 199.510 C 34.816 204.204 34.816 211.816 39.510 216.510 C 44.204 221.204 51.816 221.204 56.510 216.510 L 96.000 177.000 L 96.000 196.000 C 96.000 202.627 101.373 208.000 108.000 208.000 C 114.627 208.000 120.000 202.627 120.000 196.000 L 120.000 148.000 C 120.000 141.373 114.627 136.000 108.000 136.000 Z"),
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
        return _arrowsInSimple!!
    }

private var _arrowsInSimple: ImageVector? = null
