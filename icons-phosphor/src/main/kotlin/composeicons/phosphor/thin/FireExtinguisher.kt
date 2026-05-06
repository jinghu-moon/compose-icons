package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FireExtinguisher: ImageVector
    get() {
        if (_fireExtinguisher != null) return _fireExtinguisher!!
        _fireExtinguisher = phosphorThinIcon(
            name = "FireExtinguisher",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M217.15 52.17 146.81 31.07l39-19.49c1.977-.989 2.779-3.393 1.79-5.37-.989-1.977-3.393-2.779-5.37-1.79L135 28C93.433 28.585 60.034 62.429 60 104v104c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-36h24v60c0 6.627 5.373 12 12 12h64c6.627 0 12-5.373 12-12v-128C179.968 81.263 162.64 62.285 140 60.19v-22.81l74.85 22.45c.372 .115 .76 .172 1.15 .17 1.983-.002 3.666-1.457 3.954-3.419 .288-1.962-.905-3.839-2.804-4.411ZM68 164v-60C68.046 68.019 96.083 38.286 132 36.13v24.06C109.36 62.285 92.032 81.263 92 104v60ZM168 236h-64c-2.209 0-4-1.791-4-4v-60h72v60c0 2.209-1.791 4-4 4ZM172 104v60h-72v-60c0-19.882 16.118-36 36-36 19.882 0 36 16.118 36 36Z"),
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
        return _fireExtinguisher!!
    }

private var _fireExtinguisher: ImageVector? = null
