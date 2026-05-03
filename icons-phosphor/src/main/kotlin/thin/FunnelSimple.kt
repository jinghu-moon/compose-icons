package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FunnelSimple: ImageVector
    get() {
        if (_funnelSimple != null) return _funnelSimple!!
        _funnelSimple = phosphorThinIcon(
            name = "FunnelSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 196.000 136.000 C 196.000 138.209 194.209 140.000 192.000 140.000 L 64.000 140.000 C 61.791 140.000 60.000 138.209 60.000 136.000 C 60.000 133.791 61.791 132.000 64.000 132.000 L 192.000 132.000 C 194.209 132.000 196.000 133.791 196.000 136.000 ZM 232.000 84.000 L 24.000 84.000 C 21.791 84.000 20.000 85.791 20.000 88.000 C 20.000 90.209 21.791 92.000 24.000 92.000 L 232.000 92.000 C 234.209 92.000 236.000 90.209 236.000 88.000 C 236.000 85.791 234.209 84.000 232.000 84.000 ZM 152.000 180.000 L 104.000 180.000 C 101.791 180.000 100.000 181.791 100.000 184.000 C 100.000 186.209 101.791 188.000 104.000 188.000 L 152.000 188.000 C 154.209 188.000 156.000 186.209 156.000 184.000 C 156.000 181.791 154.209 180.000 152.000 180.000 Z"),
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
        return _funnelSimple!!
    }

private var _funnelSimple: ImageVector? = null
