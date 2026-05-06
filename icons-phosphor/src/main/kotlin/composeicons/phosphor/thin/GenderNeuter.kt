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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204 104C204.003 62.546 170.785 28.736 129.337 28.007 87.889 27.278 53.503 59.898 52.047 101.326c-1.456 41.429 30.556 76.382 71.953 78.564v52.11c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-52.11c40.341-2.172 71.952-35.491 72-75.89ZM128 172C90.445 172 60 141.555 60 104 60 66.445 90.445 36 128 36c37.555 0 68 30.445 68 68-.039 37.539-30.461 67.961-68 68Z"),
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
        return _genderNeuter!!
    }

private var _genderNeuter: ImageVector? = null
