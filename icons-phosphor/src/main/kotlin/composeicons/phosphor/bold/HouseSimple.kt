package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HouseSimple: ImageVector
    get() {
        if (_houseSimple != null) return _houseSimple!!
        _houseSimple = phosphorBoldIcon(
            name = "HouseSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222.14 105.85l-80-80c-7.81-7.808-20.47-7.808-28.28 0l-80 80C30.093 109.593 27.983 114.69 28 120v96c0 6.627 5.373 12 12 12h176c6.627 0 12-5.373 12-12v-96c.017-5.31-2.093-10.407-5.86-14.15ZM204 204h-152v-82.35l76-76 76 76Z"),
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
        return _houseSimple!!
    }

private var _houseSimple: ImageVector? = null
