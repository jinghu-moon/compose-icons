package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Campfire: ImageVector
    get() {
        if (_campfire != null) return _campfire!!
        _campfire = phosphorThinIcon(
            name = "Campfire",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M219.81 225.21c-.527 1.66-2.068 2.789-3.81 2.79-.411 0-.819-.064-1.21-.19L128 200.2 41.21 227.81c-.391 .126-.799 .19-1.21 .19-1.97-.004-3.643-1.441-3.945-3.388-.302-1.946 .859-3.823 2.735-4.422l76-24.19-76-24.19c-1.409-.393-2.49-1.524-2.821-2.949-.33-1.425 .143-2.916 1.235-3.89 1.092-.973 2.628-1.273 4.005-.781L128 191.8l86.79-27.61c1.378-.491 2.914-.192 4.006 .781 1.092 .973 1.566 2.465 1.235 3.89-.33 1.425-1.412 2.556-2.821 2.949l-76 24.19 76 24.19c2.103 .669 3.267 2.916 2.6 5.02ZM72 108C72 89 81.38 69.15 99.12 50.73c8.051-8.379 17.036-15.808 26.78-22.14 1.287-.794 2.913-.794 4.2 0 9.744 6.332 18.729 13.761 26.78 22.14C174.62 69.15 184 89 184 108c.01 30.374-24.196 55.219-54.56 56-.48 0-1 0-1.44 0-.44 0-1 0-1.44 0C96.196 163.219 71.99 138.374 72 108ZM128 156c11.046 0 20-8.954 20-20 0-17.39-14.37-30.53-20-35-5.63 4.48-20 17.62-20 35 0 11.046 8.954 20 20 20ZM80 108c.005 16.845 8.84 32.455 23.28 41.13C101.123 145.09 99.996 140.58 100 136c0-25.84 24.73-42.63 25.78-43.33 1.344-.897 3.096-.897 4.44 0C131.27 93.37 156 110.16 156 136c.004 4.58-1.123 9.09-3.28 13.13C167.16 140.455 175.995 124.845 176 108 176 71.63 137.51 43.24 128 36.79 118.5 43.25 80 71.68 80 108Z"),
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
        return _campfire!!
    }

private var _campfire: ImageVector? = null
