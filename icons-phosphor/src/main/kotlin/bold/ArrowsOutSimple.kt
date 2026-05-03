package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsOutSimple: ImageVector
    get() {
        if (_arrowsOutSimple != null) return _arrowsOutSimple!!
        _arrowsOutSimple = phosphorBoldIcon(
            name = "ArrowsOutSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.000 48.000 L 220.000 96.000 C 220.000 102.627 214.627 108.000 208.000 108.000 C 201.373 108.000 196.000 102.627 196.000 96.000 L 196.000 77.000 L 156.490 116.520 C 151.796 121.214 144.184 121.214 139.490 116.520 C 134.796 111.826 134.796 104.214 139.490 99.520 L 179.000 60.000 L 160.000 60.000 C 153.373 60.000 148.000 54.627 148.000 48.000 C 148.000 41.373 153.373 36.000 160.000 36.000 L 208.000 36.000 C 214.627 36.000 220.000 41.373 220.000 48.000 ZM 99.510 139.510 L 60.000 179.000 L 60.000 160.000 C 60.000 153.373 54.627 148.000 48.000 148.000 C 41.373 148.000 36.000 153.373 36.000 160.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 96.000 220.000 C 102.627 220.000 108.000 214.627 108.000 208.000 C 108.000 201.373 102.627 196.000 96.000 196.000 L 77.000 196.000 L 116.520 156.490 C 121.214 151.796 121.214 144.184 116.520 139.490 C 111.826 134.796 104.214 134.796 99.520 139.490 Z"),
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
        return _arrowsOutSimple!!
    }

private var _arrowsOutSimple: ImageVector? = null
