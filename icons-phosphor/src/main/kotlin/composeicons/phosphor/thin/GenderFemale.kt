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
                pathData = parseSvgPathData("M204 96C204.003 54.546 170.785 20.736 129.337 20.007 87.889 19.278 53.503 51.898 52.047 93.326c-1.456 41.429 30.556 76.382 71.953 78.564v32.11h-36c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h36v28c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-28h36c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-36v-32.11C172.341 169.718 203.952 136.399 204 96ZM60 96C60 58.445 90.445 28 128 28c37.555 0 68 30.445 68 68 0 37.555-30.445 68-68 68C90.461 163.961 60.039 133.539 60 96Z"),
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
