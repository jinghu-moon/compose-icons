package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsOut: ImageVector
    get() {
        if (_arrowsOut != null) return _arrowsOut!!
        _arrowsOut = phosphorBoldIcon(
            name = "ArrowsOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.000 48.000 L 220.000 96.000 C 220.000 102.627 214.627 108.000 208.000 108.000 C 201.373 108.000 196.000 102.627 196.000 96.000 L 196.000 77.000 L 160.490 112.520 C 155.796 117.214 148.184 117.214 143.490 112.520 C 138.796 107.826 138.796 100.214 143.490 95.520 L 179.000 60.000 L 160.000 60.000 C 153.373 60.000 148.000 54.627 148.000 48.000 C 148.000 41.373 153.373 36.000 160.000 36.000 L 208.000 36.000 C 214.627 36.000 220.000 41.373 220.000 48.000 ZM 95.510 143.510 L 60.000 179.000 L 60.000 160.000 C 60.000 153.373 54.627 148.000 48.000 148.000 C 41.373 148.000 36.000 153.373 36.000 160.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 96.000 220.000 C 102.627 220.000 108.000 214.627 108.000 208.000 C 108.000 201.373 102.627 196.000 96.000 196.000 L 77.000 196.000 L 112.520 160.490 C 117.214 155.796 117.214 148.184 112.520 143.490 C 107.826 138.796 100.214 138.796 95.520 143.490 ZM 208.000 148.000 C 201.373 148.000 196.000 153.373 196.000 160.000 L 196.000 179.000 L 160.490 143.480 C 155.796 138.786 148.184 138.786 143.490 143.480 C 138.796 148.174 138.796 155.786 143.490 160.480 L 179.000 196.000 L 160.000 196.000 C 153.373 196.000 148.000 201.373 148.000 208.000 C 148.000 214.627 153.373 220.000 160.000 220.000 L 208.000 220.000 C 214.627 220.000 220.000 214.627 220.000 208.000 L 220.000 160.000 C 220.000 153.373 214.627 148.000 208.000 148.000 ZM 77.000 60.000 L 96.000 60.000 C 102.627 60.000 108.000 54.627 108.000 48.000 C 108.000 41.373 102.627 36.000 96.000 36.000 L 48.000 36.000 C 41.373 36.000 36.000 41.373 36.000 48.000 L 36.000 96.000 C 36.000 102.627 41.373 108.000 48.000 108.000 C 54.627 108.000 60.000 102.627 60.000 96.000 L 60.000 77.000 L 95.510 112.520 C 100.204 117.214 107.816 117.214 112.510 112.520 C 117.204 107.826 117.204 100.214 112.510 95.520 Z"),
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
        return _arrowsOut!!
    }

private var _arrowsOut: ImageVector? = null
