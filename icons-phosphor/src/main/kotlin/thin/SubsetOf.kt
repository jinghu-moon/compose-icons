package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SubsetOf: ImageVector
    get() {
        if (_subsetOf != null) return _subsetOf!!
        _subsetOf = phosphorThinIcon(
            name = "SubsetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 204.000 208.000 C 204.000 210.209 202.209 212.000 200.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 C 44.000 205.791 45.791 204.000 48.000 204.000 L 200.000 204.000 C 202.209 204.000 204.000 205.791 204.000 208.000 ZM 200.000 164.000 L 104.000 164.000 C 75.281 164.000 52.000 140.719 52.000 112.000 C 52.000 83.281 75.281 60.000 104.000 60.000 L 200.000 60.000 C 202.209 60.000 204.000 58.209 204.000 56.000 C 204.000 53.791 202.209 52.000 200.000 52.000 L 104.000 52.000 C 70.863 52.000 44.000 78.863 44.000 112.000 C 44.000 145.137 70.863 172.000 104.000 172.000 L 200.000 172.000 C 202.209 172.000 204.000 170.209 204.000 168.000 C 204.000 165.791 202.209 164.000 200.000 164.000 Z"),
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
        return _subsetOf!!
    }

private var _subsetOf: ImageVector? = null
