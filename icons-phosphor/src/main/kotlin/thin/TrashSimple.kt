package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TrashSimple: ImageVector
    get() {
        if (_trashSimple != null) return _trashSimple!!
        _trashSimple = phosphorThinIcon(
            name = "TrashSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 52.000 L 40.000 52.000 C 37.791 52.000 36.000 53.791 36.000 56.000 C 36.000 58.209 37.791 60.000 40.000 60.000 L 52.000 60.000 L 52.000 208.000 C 52.000 214.627 57.373 220.000 64.000 220.000 L 192.000 220.000 C 198.627 220.000 204.000 214.627 204.000 208.000 L 204.000 60.000 L 216.000 60.000 C 218.209 60.000 220.000 58.209 220.000 56.000 C 220.000 53.791 218.209 52.000 216.000 52.000 ZM 196.000 208.000 C 196.000 210.209 194.209 212.000 192.000 212.000 L 64.000 212.000 C 61.791 212.000 60.000 210.209 60.000 208.000 L 60.000 60.000 L 196.000 60.000 ZM 84.000 24.000 C 84.000 21.791 85.791 20.000 88.000 20.000 L 168.000 20.000 C 170.209 20.000 172.000 21.791 172.000 24.000 C 172.000 26.209 170.209 28.000 168.000 28.000 L 88.000 28.000 C 85.791 28.000 84.000 26.209 84.000 24.000 Z"),
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
        return _trashSimple!!
    }

private var _trashSimple: ImageVector? = null
