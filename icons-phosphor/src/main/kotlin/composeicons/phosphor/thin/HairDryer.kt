package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HairDryer: ImageVector
    get() {
        if (_hairDryer != null) return _hairDryer!!
        _hairDryer = phosphorThinIcon(
            name = "HairDryer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M196 88C196 72.536 183.464 60 168 60c-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28 15.464 0 28-12.536 28-28ZM168 108c-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20ZM162.85 212c4.696 .004 8.963-2.731 10.92-7l32-70.39c19.738-16 27.258-42.697 18.773-66.647C216.058 44.014 193.408 28.005 168 28c-.221 .002-.441 .018-.66 .05L30 50.94c-5.777 .976-10.004 5.981-10 11.84v50.44c-.004 5.859 4.223 10.864 10 11.84l102 17v57.94c0 6.627 5.373 12 12 12h4v4c0 19.882 16.118 36 36 36h16c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-16c-15.464 0-28-12.536-28-28v-4ZM28 113.22v-50.44c-.027-1.975 1.392-3.674 3.34-4L168.33 36c28.719 0 52 23.281 52 52 0 28.719-23.281 52-52 52L31.33 117.17c-1.925-.327-3.333-1.997-3.33-3.95ZM140 200v-56.61L167.34 148c.219 .032 .439 .048 .66 .05 8.803 .006 17.497-1.937 25.46-5.69l-27 59.34c-.647 1.43-2.071 2.348-3.64 2.35h-18.82c-1.07 0-2.095-.428-2.846-1.189-.752-.761-1.167-1.791-1.154-2.861Z"),
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
        return _hairDryer!!
    }

private var _hairDryer: ImageVector? = null
