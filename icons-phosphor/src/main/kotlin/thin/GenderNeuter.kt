package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GenderNeuter: ImageVector
    get() {
        if (_genderNeuter != null) return _genderNeuter!!
        _genderNeuter = phosphorThinIcon(
            name = "GenderNeuter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 204.000 104.000 C 204.003 62.546 170.785 28.736 129.337 28.007 C 87.889 27.278 53.503 59.898 52.047 101.326 C 50.591 142.755 82.603 177.708 124.000 179.890 L 124.000 232.000 C 124.000 234.209 125.791 236.000 128.000 236.000 C 130.209 236.000 132.000 234.209 132.000 232.000 L 132.000 179.890 C 172.341 177.718 203.952 144.399 204.000 104.000 ZM 128.000 172.000 C 90.445 172.000 60.000 141.555 60.000 104.000 C 60.000 66.445 90.445 36.000 128.000 36.000 C 165.555 36.000 196.000 66.445 196.000 104.000 C 195.961 141.539 165.539 171.961 128.000 172.000 Z"),
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
        return _genderNeuter!!
    }

private var _genderNeuter: ImageVector? = null
