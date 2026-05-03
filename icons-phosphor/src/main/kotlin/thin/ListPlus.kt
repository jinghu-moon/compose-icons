package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ListPlus: ImageVector
    get() {
        if (_listPlus != null) return _listPlus!!
        _listPlus = phosphorThinIcon(
            name = "ListPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 36.000 64.000 C 36.000 61.791 37.791 60.000 40.000 60.000 L 216.000 60.000 C 218.209 60.000 220.000 61.791 220.000 64.000 C 220.000 66.209 218.209 68.000 216.000 68.000 L 40.000 68.000 C 37.791 68.000 36.000 66.209 36.000 64.000 ZM 40.000 132.000 L 216.000 132.000 C 218.209 132.000 220.000 130.209 220.000 128.000 C 220.000 125.791 218.209 124.000 216.000 124.000 L 40.000 124.000 C 37.791 124.000 36.000 125.791 36.000 128.000 C 36.000 130.209 37.791 132.000 40.000 132.000 ZM 144.000 188.000 L 40.000 188.000 C 37.791 188.000 36.000 189.791 36.000 192.000 C 36.000 194.209 37.791 196.000 40.000 196.000 L 144.000 196.000 C 146.209 196.000 148.000 194.209 148.000 192.000 C 148.000 189.791 146.209 188.000 144.000 188.000 ZM 232.000 188.000 L 212.000 188.000 L 212.000 168.000 C 212.000 165.791 210.209 164.000 208.000 164.000 C 205.791 164.000 204.000 165.791 204.000 168.000 L 204.000 188.000 L 184.000 188.000 C 181.791 188.000 180.000 189.791 180.000 192.000 C 180.000 194.209 181.791 196.000 184.000 196.000 L 204.000 196.000 L 204.000 216.000 C 204.000 218.209 205.791 220.000 208.000 220.000 C 210.209 220.000 212.000 218.209 212.000 216.000 L 212.000 196.000 L 232.000 196.000 C 234.209 196.000 236.000 194.209 236.000 192.000 C 236.000 189.791 234.209 188.000 232.000 188.000 Z"),
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
        return _listPlus!!
    }

private var _listPlus: ImageVector? = null
