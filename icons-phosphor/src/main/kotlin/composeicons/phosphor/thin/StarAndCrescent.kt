package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.StarAndCrescent: ImageVector
    get() {
        if (_starAndCrescent != null) return _starAndCrescent!!
        _starAndCrescent = phosphorThinIcon(
            name = "StarAndCrescent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M153.82 53.16c1.341-.683 2.186-2.06 2.186-3.565 0-1.505-.845-2.882-2.186-3.565C140.88 39.397 126.541 35.958 112 36 61.19 36 20 77.19 20 128c0 50.81 41.19 92 92 92 14.538 .052 28.878-3.377 41.82-10 1.341-.683 2.186-2.06 2.186-3.565 0-1.505-.845-2.882-2.186-3.565C125.68 188.528 107.964 159.614 107.964 128.03c0-31.584 17.716-60.498 45.856-74.84ZM100 128c-.072 31.727 16.274 61.234 43.21 78-9.921 3.986-20.518 6.023-31.21 6C65.608 212 28 174.392 28 128 28 81.608 65.608 44 112 44c10.692-.023 21.289 2.014 31.21 6C116.274 66.766 99.928 96.273 100 128ZM249.58 124.33 220.87 111.93 218.38 79.69c-.122-1.63-1.224-3.022-2.782-3.515-1.559-.493-3.26 .012-4.298 1.275l-20.19 24.46L161 94.45c-1.563-.387-3.205 .2-4.168 1.49-.963 1.29-1.058 3.032-.242 4.42L172.82 128l-16.27 27.64c-.816 1.388-.72 3.129 .242 4.42 .963 1.29 2.605 1.878 4.168 1.49l30.15-7.46 20.19 24.46c.762 .921 1.895 1.452 3.09 1.45 .408 .001 .813-.063 1.2-.19 1.557-.488 2.661-1.873 2.79-3.5l2.49-32.24 28.71-12.4c1.463-.634 2.409-2.076 2.409-3.67 0-1.594-.947-3.036-2.409-3.67ZM215.48 137.68c-1.361 .589-2.285 1.882-2.4 3.36l-1.92 24.77L195.67 147.05c-.759-.918-1.889-1.449-3.08-1.45-.337-.002-.673 .038-1 .12l-23.36 5.78L180.91 130c.738-1.253 .738-2.807 0-4.06L168.27 104.5l23.36 5.78c1.478 .352 3.027-.163 4-1.33L211.12 90.19 213.08 115c.115 1.478 1.039 2.771 2.4 3.36L237.9 128Z"),
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
        return _starAndCrescent!!
    }

private var _starAndCrescent: ImageVector? = null
