package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Dress: ImageVector
    get() {
        if (_dress != null) return _dress!!
        _dress = phosphorFillIcon(
            name = "Dress",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M66.26 80.23C64.03 76.583 63.431 72.169 64.61 68.06c.397-1.687 1.073-3.296 2-4.76L88 32.7v-24.7c-.005-2.217 .91-4.336 2.527-5.853C92.144 .631 94.318-.147 96.53 0c4.275 .367 7.538 3.979 7.47 8.27v24.15L109.25 39c4.632 5.809 11.701 9.135 19.13 9 7.328-.207 14.184-3.663 18.71-9.43L152 32.42v-24.42c-.005-2.217 .91-4.336 2.527-5.853C156.144 .631 158.318-.147 160.53 0c4.275 .367 7.538 3.979 7.47 8.27v24.43l21.42 30.6c.927 1.464 1.603 3.073 2 4.76 1.179 4.109 .58 8.523-1.65 12.17-.04 .058-.077 .118-.11 .18l-13.86 21.74c-.74 1.16-2.024 1.859-3.4 1.85h-88.8c-1.365-.001-2.636-.699-3.37-1.85L66.37 80.41c-.033-.062-.07-.122-.11-.18ZM214.76 209.79c-.042-.117-.092-.23-.15-.34L173.69 122.3c-.66-1.407-2.076-2.304-3.63-2.3h-84.12c-1.554-.004-2.97 .893-3.63 2.3L41.39 209.45c-.058 .109-.108 .223-.15 .34-1.764 4.254-1.633 9.058 .36 13.21 2.681 5.51 8.273 9.005 14.4 9h144c6.124 .001 11.711-3.493 14.39-9 1.997-4.15 2.131-8.954 .37-13.21Z"),
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
        return _dress!!
    }

private var _dress: ImageVector? = null
