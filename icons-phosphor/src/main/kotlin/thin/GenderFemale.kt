package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GenderFemale: ImageVector
    get() {
        if (_genderFemale != null) return _genderFemale!!
        _genderFemale = phosphorThinIcon(
            name = "GenderFemale",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 204.000 96.000 C 204.003 54.546 170.785 20.736 129.337 20.007 C 87.889 19.278 53.503 51.898 52.047 93.326 C 50.591 134.755 82.603 169.708 124.000 171.890 L 124.000 204.000 L 88.000 204.000 C 85.791 204.000 84.000 205.791 84.000 208.000 C 84.000 210.209 85.791 212.000 88.000 212.000 L 124.000 212.000 L 124.000 240.000 C 124.000 242.209 125.791 244.000 128.000 244.000 C 130.209 244.000 132.000 242.209 132.000 240.000 L 132.000 212.000 L 168.000 212.000 C 170.209 212.000 172.000 210.209 172.000 208.000 C 172.000 205.791 170.209 204.000 168.000 204.000 L 132.000 204.000 L 132.000 171.890 C 172.341 169.718 203.952 136.399 204.000 96.000 ZM 60.000 96.000 C 60.000 58.445 90.445 28.000 128.000 28.000 C 165.555 28.000 196.000 58.445 196.000 96.000 C 196.000 133.555 165.555 164.000 128.000 164.000 C 90.461 163.961 60.039 133.539 60.000 96.000 Z"),
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
        return _genderFemale!!
    }

private var _genderFemale: ImageVector? = null
