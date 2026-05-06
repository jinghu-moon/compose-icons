package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.UserGear: ImageVector
    get() {
        if (_userGear != null) return _userGear!!
        _userGear = phosphorThinIcon(
            name = "UserGear",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M133.17 158.84c27.945-11.954 43.628-41.913 37.527-71.689C164.596 57.375 138.394 35.997 108 35.997c-30.394 0-56.596 21.378-62.697 51.154-6.101 29.776 9.582 59.736 37.527 71.689-23.76 5.46-45.18 18.69-61.89 38.59-.995 1.084-1.315 2.626-.833 4.017 .482 1.39 1.689 2.403 3.141 2.638 1.453 .235 2.917-.347 3.812-1.515C48 177.7 76.7 164 108 164c31.3 0 60 13.7 80.94 38.57 1.448 1.576 3.88 1.733 5.518 .357 1.639-1.376 1.904-3.799 .602-5.497C178.35 177.53 156.93 164.3 133.17 158.84ZM52 100C52 69.072 77.072 44 108 44c30.928 0 56 25.072 56 56 0 30.928-25.072 56-56 56C77.086 155.967 52.033 130.914 52 100ZM250.25 146.54 243 142.33c1.387-4.106 1.387-8.554 0-12.66l7.29-4.21c1.302-.681 2.126-2.021 2.146-3.49 .02-1.469-.767-2.831-2.05-3.547-1.283-.716-2.855-.671-4.095 .117l-7.31 4.21c-2.874-3.252-6.728-5.481-10.98-6.35v-8.4c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v8.4c-4.238 .877-8.076 3.106-10.94 6.35l-7.31-4.21c-1.24-.788-2.812-.833-4.095-.117-1.283 .716-2.07 2.078-2.05 3.547 .02 1.469 .844 2.809 2.146 3.49l7.29 4.21c-1.387 4.106-1.387 8.554 0 12.66l-7.29 4.21c-1.564 .907-2.325 2.75-1.856 4.496 .468 1.746 2.049 2.961 3.856 2.964 .703 .003 1.394-.184 2-.54l7.31-4.21c2.864 3.244 6.702 5.473 10.94 6.35v8.4c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-8.4c4.238-.877 8.076-3.106 10.94-6.35l7.31 4.21c.606 .356 1.297 .543 2 .54 1.808-.003 3.388-1.218 3.856-2.964 .468-1.746-.293-3.589-1.856-4.496ZM224 148c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12Z"),
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
        return _userGear!!
    }

private var _userGear: ImageVector? = null
